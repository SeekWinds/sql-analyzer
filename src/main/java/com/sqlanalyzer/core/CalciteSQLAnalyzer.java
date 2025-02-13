package com.sqlanalyzer.analyzer;

import com.sqlanalyzer.model.AnalysisResult;
import com.sqlanalyzer.model.SQLType;
import com.sqlanalyzer.model.Suggestion;
import com.sqlanalyzer.model.SuggestionType;
import com.sqlanalyzer.dialect.SQLDialect;
import com.sqlanalyzer.dialect.SQLDialectAdapter;
import com.sqlanalyzer.factory.SQLDialectAdapterFactory;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.tools.FrameworkConfig;
import org.apache.calcite.tools.Frameworks;

/**
 * 基于Calcite的SQL分析器
 * 用于提供跨方言的SQL分析功能
 *
 * @author SeekWinds
 * @date 2025-02-11 09:50:54
 */
public class CalciteSQLAnalyzer {

    private final FrameworkConfig config;
    private final SqlParser.Config parserConfig;

    public CalciteSQLAnalyzer() {
        this.config = Frameworks.newConfigBuilder()
                .defaultSchema(null)
                .build();
        this.parserConfig = SqlParser.config()
                .withCaseSensitive(false);
    }

    /**
     * 分析SQL语句
     *
     * @param sql SQL语句
     * @param dialect SQL方言类型
     * @return 分析结果
     */
    public AnalysisResult analyze(String sql, SQLDialect dialect) {
        // 首先使用特定方言的适配器分析
        SQLDialectAdapter adapter = SQLDialectAdapterFactory.createAdapter(dialect);
        AnalysisResult result = adapter.analyzeSql(sql);

        try {
            // 使用Calcite进行通用分析
            SqlParser parser = SqlParser.create(sql, parserConfig);
            SqlNode sqlNode = parser.parseQuery();

            // 设置SQL类型
            result.setSqlType(SQLType.fromSqlKind(sqlNode.getKind()));

            // 添加通用优化建议
            addGeneralOptimizations(result, sqlNode);

        } catch (Exception e) {
            // 如果Calcite分析失败，不影响方言特定的分析结果
            result.addSuggestion(new Suggestion(
                    SuggestionType.QUERY_PERFORMANCE,
                    "SQL语法分析警告",
                    "SQL语句可能存在语法问题，建议检查: " + e.getMessage(),
                    2
            ));
        }

        return result;
    }

    /**
     * 添加通用的SQL优化建议
     *
     * @param result 分析结果
     * @param sqlNode 解析后的SQL节点
     */
    private void addGeneralOptimizations(AnalysisResult result, SqlNode sqlNode) {
        // 添加查询性能优化建议
        result.addSuggestion(new Suggestion(
                SuggestionType.QUERY_PERFORMANCE,
                "通用查询优化建议",
                "1. 确保查询条件使用了合适的索引\n" +
                        "2. 避免大表JOIN操作产生数据倾斜\n" +
                        "3. 合理使用分区和分桶优化",
                3
        ));

        // 添加资源配置建议
        result.addSuggestion(new Suggestion(
                SuggestionType.RESOURCE_CONFIG,
                "资源配置建议",
                "1. 根据数据量调整执行内存配置\n" +
                        "2. 设置合适的并行度\n" +
                        "3. 优化数据本地性",
                3
        ));
    }

    /**
     * 验证SQL语句的语法
     *
     * @param sql SQL语句
     * @param dialect SQL方言类型
     * @return 如果语法正确返回true，否则返回false
     */
    public boolean validateSyntax(String sql, SQLDialect dialect) {
        try {
            SqlParser parser = SqlParser.create(sql, parserConfig);
            parser.parseQuery();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 获取SQL语句的类型
     *
     * @param sql SQL语句
     * @return SQL类型
     */
    public SQLType getSqlType(String sql) {
        try {
            SqlParser parser = SqlParser.create(sql, parserConfig);
            SqlNode sqlNode = parser.parseQuery();
            return SQLType.fromSqlKind(sqlNode.getKind());
        } catch (Exception e) {
            return SQLType.UNKNOWN;
        }
    }
}