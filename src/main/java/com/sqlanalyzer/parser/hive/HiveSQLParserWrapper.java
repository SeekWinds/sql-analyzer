package com.sqlanalyzer.parser.hive;

import com.sqlanalyzer.parser.BaseSQLParser;
import com.sqlanalyzer.parser.SQLParseResult;

/**
 * Hive SQL解析器包装类
 */
public class HiveSQLParserWrapper extends BaseSQLParser {

    @Override
    protected String getStartRuleName() {
        return "parse"; // 对应grammar文件中的入口规则名
    }

    public SQLParseResult parse(String sql) {
        return parse(sql, HiveSQLLexer.class, HiveSQLParser.class);
    }

    /**
     * 使用访问者模式分析SQL
     */
    public void accept(String sql, HiveSQLBaseVisitor<?> visitor) {
        SQLParseResult result = parse(sql);
        if (result.isSuccess()) {
            visitor.visit(result.getParseTree());
        }
    }
}