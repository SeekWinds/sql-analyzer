package com.sqlanalyzer.model;

import java.util.List;
import java.util.ArrayList;
/**
 * SQL分析结果
 *
 * @author Yang Xin
 */
public class AnalysisResult {
    private String originalSql; // 原始SQL
    private String optimizedSql; // 优化后的SQL
    private SQLType sqlType; // SQL类型
    private List<Suggestion> suggestions; // 优化建议列表
    private boolean isValid; // SQL是否有效
    private String errorMessage; // 错误信息

    public AnalysisResult(String originalSql) {
        this.originalSql = originalSql;
        this.suggestions = new ArrayList<>();
        this.isValid = true;
    }

    // Getter和Setter方法
    public String getOriginalSql() {
        return originalSql;
    }

    public String getOptimizedSql() {
        return optimizedSql;
    }

    public void setOptimizedSql(String optimizedSql) {
        this.optimizedSql = optimizedSql;
    }

    public SQLType getSqlType() {
        return sqlType;
    }

    public void setSqlType(SQLType sqlType) {
        this.sqlType = sqlType;
    }

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    public void addSuggestion(Suggestion suggestion) {
        this.suggestions.add(suggestion);
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        this.isValid = false;
    }
}
