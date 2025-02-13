package com.sqlanalyzer.dialect;

import com.sqlanalyzer.config.ParserConfig;
import com.sqlanalyzer.model.AnalysisResult;
import com.sqlanalyzer.model.SQLType;
import com.sqlanalyzer.model.Suggestion;
import com.sqlanalyzer.model.SuggestionType;
import com.sqlanalyzer.parser.SQLParseResult;
import com.sqlanalyzer.parser.hive.HiveSQLBaseVisitor;
import com.sqlanalyzer.parser.hive.HiveSQLParser;
import com.sqlanalyzer.parser.hive.HiveSQLParserWrapper;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Hive SQL 适配器
 * @author SeekWinds
 * @date 2025-02-11
 */
public class HiveSQLAdapter implements SQLDialectAdapter {
    private final HiveSQLParserWrapper parser;
    private final ParserConfig config;

    public HiveSQLAdapter() {
        this.parser = new HiveSQLParserWrapper();
        this.config = new ParserConfig.Builder()
                .maxParseDepth(100)   // Hive SQL 一般复杂度较低
                .cacheEnabled(true)    // 启用缓存
                .cacheSize(1000)       // 设置默认缓存大小
                .build();
    }

    @Override
    public SQLDialect getDialectType() {
        return SQLDialect.HIVE;
    }

    @Override
    public ParserConfig getParserConfig() {
        return this.config;
    }

    @Override
    public boolean supportsFeature(SQLFeature feature) {
        switch (feature) {
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
            // 检查SQL长度
            if (sql.length() > config.getMaxSqlLength()) {
                result.setErrorMessage("SQL语句超过最大长度限制：" + config.getMaxSqlLength());
                return result;
            }

            // 解析SQL
            SQLParseResult parseResult = parser.parse(sql);
            if (!parseResult.isSuccess()) {
                result.setErrorMessage(parseResult.getErrorMessage());
                return result;
            }

            // 使用访问者模式分析SQL
            HiveSQLAnalyzer analyzer = new HiveSQLAnalyzer(result);
            analyzer.visit(parseResult.getParseTree());

        } catch (Exception e) {
            result.setErrorMessage("解析错误: " + e.getMessage());
        }

        return result;
    }

    /**
     * Hive SQL分析器
     */
    private static class HiveSQLAnalyzer extends HiveSQLBaseVisitor<Void> {
        private final AnalysisResult result;

        public HiveSQLAnalyzer(AnalysisResult result) {
            this.result = result;
        }

        @Override
        public Void visitCreateTableStatement(HiveSQLParser.CreateTableStatementContext ctx) {
            result.setSqlType(SQLType.CREATE);

            // 分析分区策略
            if (ctx.PARTITIONED() != null) {
                analyzePartitionedBy(ctx);
            }

            // 分析分桶策略
            if (ctx.CLUSTERED() != null) {
                analyzeClusteredBy(ctx);
            }

            // 分析存储格式
            if (ctx.STORED() != null) {
                analyzeStorageFormat(ctx);
            }

            return null;
        }

        @Override
        public Void visitSelectStatement(HiveSQLParser.SelectStatementContext ctx) {
            result.setSqlType(SQLType.SELECT);

            // 分析查询性能
            analyzeQueryPerformance(ctx);

            // 分析Join操作
            if (ctx.fromClause() != null && ctx.fromClause().joinPart() != null) {
                analyzeJoins(ctx);
            }

            // 分析where条件
            if (ctx.whereClause() != null) {
                analyzeWhereClause(ctx);
            }

            // 分析分组和排序
            if (ctx.groupByClause() != null || ctx.orderByClause() != null) {
                analyzeGroupingAndSorting(ctx);
            }

            return null;
        }

        private void analyzePartitionedBy(HiveSQLParser.CreateTableStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.PARTITION_STRATEGY,
                    "分区策略分析",
                    "1. 建议使用日期类型作为分区键\n" +
                            "2. 控制分区数量，避免产生过多小文件\n" +
                            "3. 分区字段应该是查询条件中经常用到的字段",
                    4
            ));
        }

        private void analyzeClusteredBy(HiveSQLParser.CreateTableStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.BUCKET_STRATEGY,
                    "分桶策略分析",
                    "1. 分桶数应为2的幂次方\n" +
                            "2. 分桶字段应选择基数适中且分布均匀的列\n" +
                            "3. 建议对频繁进行Join操作的字段进行分桶",
                    3
            ));
        }

        private void analyzeStorageFormat(HiveSQLParser.CreateTableStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.STORAGE_FORMAT,
                    "存储格式分析",
                    "1. 建议使用ORC或Parquet列式存储格式\n" +
                            "2. 对于查询性能要求高的场景，建议启用数据压缩\n" +
                            "3. 根据数据特点选择合适的压缩算法",
                    3
            ));
        }

        private void analyzeQueryPerformance(HiveSQLParser.SelectStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.QUERY_PERFORMANCE,
                    "查询性能分析",
                    "1. 避免使用SELECT *\n" +
                            "2. 只查询需要的字段\n" +
                            "3. 合理使用分区裁剪和分桶优化",
                    4
            ));
        }

        private void analyzeJoins(HiveSQLParser.SelectStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.JOIN_OPTIMIZATION,
                    "Join优化建议",
                    "1. 小表放在左边（内存中）\n" +
                            "2. 使用相同的连接键类型\n" +
                            "3. 考虑使用Map Join优化",
                    4
            ));
        }

        private void analyzeWhereClause(HiveSQLParser.SelectStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.WHERE_CLAUSE,
                    "Where条件分析",
                    "1. 优先使用分区过滤\n" +
                            "2. 避免在WHERE子句中使用函数或运算符\n" +
                            "3. 合理使用索引和统计信息",
                    3
            ));
        }

        private void analyzeGroupingAndSorting(HiveSQLParser.SelectStatementContext ctx) {
            result.addSuggestion(new Suggestion(
                    SuggestionType.GROUP_SORT,
                    "分组和排序分析",
                    "1. 注意Group By的数据倾斜问题\n" +
                            "2. 考虑使用Distribute By和Sort By代替Order By\n" +
                            "3. 合理设置相关参数以优化性能",
                    3
            ));
        }
    }
}