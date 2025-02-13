package com.sqlanalyzer.dialect;

/**
 * SQL特性枚举
 * 用于描述不同SQL方言支持的特性
 *
 * @author SeekWinds
 * @date 2025-02-11 09:32:39
 */
public enum SQLFeature {
    /**
     * 窗口函数
     */
    WINDOW_FUNCTIONS,

    /**
     * 分区表
     */
    PARTITIONING,

    /**
     * 分桶表
     */
    BUCKETING,

    /**
     * 物化视图
     */
    MATERIALIZED_VIEWS,

    /**
     * 存储过程
     */
    STORED_PROCEDURES,

    /**
     * 递归查询
     */
    RECURSIVE_QUERIES,

    /**
     * JSON操作
     */
    JSON_OPERATIONS,

    /**
     * 全文索引
     */
    FULL_TEXT_SEARCH,

    /**
     * 列式存储
     */
    COLUMNAR_STORAGE,

    /**
     * 动态分区
     */
    DYNAMIC_PARTITIONING,

    /**
     * 向量化查询
     */
    VECTORIZED_QUERY,

    /**
     * 自适应查询执行
     */
    ADAPTIVE_QUERY_EXECUTION,

    /**
     * 数据压缩
     */
    COMPRESSION,

    /**
     * 数据加密
     */
    ENCRYPTION;
}