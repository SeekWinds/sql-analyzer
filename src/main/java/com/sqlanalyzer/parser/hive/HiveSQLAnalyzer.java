package com.sqlanalyzer.parser.hive;

import com.sqlanalyzer.model.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class HiveSQLAnalyzer extends HiveSQLBaseVisitor<Void> {
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

    private void analyzePartitionedBy(HiveSQLParser.CreateTableStatementContext ctx) {
        result.addSuggestion(new Suggestion(
                SuggestionType.PARTITION_STRATEGY,
                "分区策略分析",
                "建议使用日期类型作为分区键，并控制分区数量",
                4
        ));
    }

    private void analyzeClusteredBy(HiveSQLParser.CreateTableStatementContext ctx) {
        result.addSuggestion(new Suggestion(
                SuggestionType.BUCKET_STRATEGY,
                "分桶策略分析",
                "建议对频繁JOIN的列进行分桶，使用2的幂次数作为分桶数",
                3
        ));
    }

    private void analyzeStorageFormat(HiveSQLParser.CreateTableStatementContext ctx) {
        result.addSuggestion(new Suggestion(
                SuggestionType.STORAGE_FORMAT,
                "存储格式分析",
                "建议使用Parquet或ORC格式以获得更好的查询性能",
                3
        ));
    }
}