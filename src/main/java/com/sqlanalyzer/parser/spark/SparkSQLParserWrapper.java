package com.sqlanalyzer.parser.spark;

import com.sqlanalyzer.parser.BaseSQLParser;
import com.sqlanalyzer.parser.SQLParseResult;

/**
 * Spark SQL解析器包装类
 */
public class SparkSQLParserWrapper extends BaseSQLParser {

    @Override
    protected String getStartRuleName() {
        return "prog"; // 对应grammar文件中的入口规则名
    }

    public SQLParseResult parse(String sql) {
        return parse(sql, SparkSQLLexer.class, SparkSQLParser.class);
    }

    /**
     * 使用访问者模式分析SQL
     */
    public void accept(String sql, SparkSQLBaseVisitor<?> visitor) {
        SQLParseResult result = parse(sql);
        if (result.isSuccess()) {
            visitor.visit(result.getParseTree());
        }
    }
}