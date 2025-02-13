package com.sqlanalyzer.api;

import com.sqlanalyzer.model.AnalysisResult;

/**
 * Add description here.
 *
 * @author Yang Xin
 */
public interface SQLAnalyzer {
    /**
     * 分析SQL语句并提供优化建议
     * @param sql 要分析的SQL语句
     * @return 分析结果，包含建议和优化后的SQL
     */
    AnalysisResult analyze(String sql);
}
