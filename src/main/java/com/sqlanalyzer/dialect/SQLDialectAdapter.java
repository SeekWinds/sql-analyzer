package com.sqlanalyzer.dialect;

import com.sqlanalyzer.model.AnalysisResult;
import com.sqlanalyzer.config.ParserConfig;

/**
 * SQL方言适配器接口
 * 用于支持不同的SQL方言（如Hive、Spark等）的分析
 *
 * @author SeekWinds
 * @date 2025-02-11 09:32:39
 */
public interface SQLDialectAdapter {

    /**
     * 获取SQL方言类型
     *
     * @return SQL方言类型
     */
    SQLDialect getDialectType();

    /**
     * 分析SQL语句
     *
     * @param sql SQL语句
     * @return 分析结果
     */
    AnalysisResult analyzeSql(String sql);

    /**
     * 获取解析器配置
     * 包含解析器的各种设置，如最大解析深度、超时时间等
     *
     * @return 解析器配置对象
     */
    ParserConfig getParserConfig();

    /**
     * 重置解析器配置为默认值
     */
    default void resetConfig() {
        // 默认实现为空，子类可以根据需要重写
    }

    /**
     * 验证SQL语句的语法
     *
     * @param sql SQL语句
     * @return 如果语法正确返回true，否则返回false
     */
    default boolean validateSyntax(String sql) {
        try {
            analyzeSql(sql);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 检查是否支持特定的SQL特性
     *
     * @param feature SQL特性
     * @return 如果支持返回true，否则返回false
     */
    default boolean supportsFeature(SQLFeature feature) {
        return false;
    }
}