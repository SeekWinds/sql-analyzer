package com.sqlanalyzer.parser;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * SQL解析结果
 */
public class SQLParseResult {
    private final ParseTree parseTree;
    private final String sql;
    private boolean success;
    private String errorMessage;

    public SQLParseResult(ParseTree parseTree, String sql) {
        this.parseTree = parseTree;
        this.sql = sql;
        this.success = true;
    }

    public SQLParseResult(String sql, String errorMessage) {
        this.parseTree = null;
        this.sql = sql;
        this.success = false;
        this.errorMessage = errorMessage;
    }

    public ParseTree getParseTree() {
        return parseTree;
    }

    public String getSql() {
        return sql;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}