package com.sqlanalyzer.dialect;

import com.sqlanalyzer.config.ParserConfig;
import com.sqlanalyzer.model.AnalysisResult;
import com.sqlanalyzer.model.SQLType;
import com.sqlanalyzer.model.Suggestion;
import com.sqlanalyzer.model.SuggestionType;
import com.sqlanalyzer.parser.SQLParseResult;
import com.sqlanalyzer.parser.spark.SparkSQLBaseVisitor;
import com.sqlanalyzer.parser.spark.SparkSQLParser;
import com.sqlanalyzer.parser.spark.SparkSQLParserWrapper;

import java.time.LocalDateTime;

/**
 * Spark SQL 适配器
 * @author SeekWinds
 * @date 2025-02-11
 */
public class SparkSQLAdapter implements SQLDialectAdapter {
    private final SparkSQLParserWrapper parser;
    private final ParserConfig config;

    public SparkSQLAdapter() {
        this.parser = new SparkSQLParserWrapper();
        this.config = new ParserConfig.Builder()
                .maxParseDepth(150)  // Spark SQL通常比Hive SQL复杂，增加解析深度
                .cacheEnabled(true)   // 启用缓存以提高性能
                .cacheSize(2000)      // 设置较大的缓存大小
                .build();
    }

    @Override
    public SQLDialect getDialectType() {
        return SQLDialect.SPARK;
    }

    @Override
    public ParserConfig getParserConfig() {
        return this.config;
    }

    @Override
    public boolean supportsFeature(SQLFeature feature) {
        switch (feature) {
            case ADAPTIVE_QUERY_EXECUTION:
            case VECTORIZED_QUERY:
            case PARTITIONING:
            case BUCKETING:
            case COLUMNAR_STORAGE:
            case DYNAMIC_PARTITIONING:
            case COMPRESSION:
                return true;
            default:
                return false;
        }
    }

    @Override
    public AnalysisResult analyzeSql(String sql) {
        AnalysisResult result = new AnalysisResult(sql);

        try {
            // 解析SQL
            SQLParseResult parseResult = parser.parse(sql);
            if (!parseResult.isSuccess()) {
                result.setErrorMessage(parseResult.getErrorMessage());
                return result;
            }

            // 使用访问者模式分析SQL
            SparkSQLAnalyzer analyzer = new SparkSQLAnalyzer(result);
            analyzer.visit(parseResult.getParseTree());

        } catch (Exception e) {
            result.setErrorMessage("解析错误: " + e.getMessage());
        }

        return result;
    }

    /**
     * Spark SQL分析器
     */
    private static class SparkSQLAnalyzer extends SparkSQLBaseVisitor<Void> {
        private final AnalysisResult result;

        public SparkSQLAnalyzer(AnalysisResult result) {
            this.result = result;
        }

        @Override
        public Void visitCreateTableStatement(SparkSQLParser.CreateTableStatementContext ctx) {
            result.setSqlType(SQLType.CREATE);

            // 分析数据格式
            if (ctx.USING() != null) {
                analyzeDataFormat(ctx);
            }

            // 分析分区策略
            if (ctx.PARTITIONED() != null) {
                analyzePartitioning(ctx);
            }

            // 分析分桶策略
            if (ctx.CLUSTERED() != null) {
                analyzeBucketing(ctx);
            }

            return null;
        }

        @Override
        public Void visitSelectStatement(SparkSQLParser.SelectStatementContext ctx) {
            result.setSqlType(SQLType.SELECT);

            // 分析查询优化
            analyzeQueryOptimization(ctx);

            // 分析Join操作
            if (ctx.fromClause() != null && ctx.fromClause().joinPart() != null) {
                analyzeJoins(ctx);
            }

            // 分析过滤条件
            if (ctx.whereClause() != null) {
                analyzeFilters(ctx);
            }

            // 分析聚合和排序
            if (ctx.groupByClause() != null || ctx.orderByClause() != null) {
                analyzeAggregationAndSorting(ctx);
            }

            return null;
        }

        private void analyzeDataFormat(SparkSQLParser.CreateTableStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.DATA_FORMAT,
                    "数据格式分析",
                    "1. 建议使用Parquet或Delta Lake格式\n" +
                            "2. 启用数据压缩以节省存储空间\n" +
                            "3. 考虑使用Schema Evolution功能",
                    4
            ));
        }

        private void analyzePartitioning(SparkSQLParser.CreateTableStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.PARTITION_STRATEGY,
                    "分区策略分析",
                    "1. 选择基数适中的列作为分区键\n" +
                            "2. 避免产生过多小文件\n" +
                            "3. 考虑使用动态分区",
                    4
            ));
        }

        private void analyzeBucketing(SparkSQLParser.CreateTableStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.BUCKET_STRATEGY,
                    "分桶策略分析",
                    "1. 分桶数量要适中，建议为CPU核心数的倍数\n" +
                            "2. 分桶列应选择具有良好基数分布的列\n" +
                            "3. 分桶可以优化Join和聚合操作",
                    3
            ));
        }

        private void analyzeQueryOptimization(SparkSQLParser.SelectStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.QUERY_PERFORMANCE,
                    "查询优化建议",
                    "1. 使用Catalyst优化器提示\n" +
                            "2. 合理设置并行度\n" +
                            "3. 避免不必要的Shuffle操作",
                    4
            ));
        }

        private void analyzeJoins(SparkSQLParser.SelectStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.JOIN_OPTIMIZATION,
                    "Join优化建议",
                    "1. 使用Broadcast Join处理小表\n" +
                            "2. 合理设置广播阈值\n" +
                            "3. 考虑使用AQE动态优化",
                    4
            ));
        }

        private void analyzeFilters(SparkSQLParser.SelectStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.WHERE_CLAUSE,
                    "过滤条件分析",
                    "1. 尽早执行过滤操作\n" +
                            "2. 利用分区裁剪\n" +
                            "3. 使用合适的索引",
                    3
            ));
        }

        private void analyzeAggregationAndSorting(SparkSQLParser.SelectStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.GROUP_SORT,
                    "聚合和排序优化",
                    "1. 使用窗口函数优化复杂聚合\n" +
                            "2. 注意数据倾斜问题\n" +
                            "3. 合理使用AQE优化",
                    3
            ));
        }
    }
}