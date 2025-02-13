package com.sqlanalyzer.model;

/**
 * SQL优化建议类型枚举
 *
 * @author SeekWinds
 * @version 1.0
 * @date 2025-02-11 09:37:18
 */
public enum SuggestionType {
    /**
     * 数据格式优化建议
     */
    DATA_FORMAT("数据格式优化"),

    /**
     * 分区策略优化建议
     */
    PARTITION_STRATEGY("分区策略优化"),

    /**
     * 分桶策略优化建议
     */
    BUCKET_STRATEGY("分桶策略优化"),

    /**
     * 存储格式优化建议
     */
    STORAGE_FORMAT("存储格式优化"),

    /**
     * Join优化建议
     */
    JOIN_OPTIMIZATION("Join优化"),

    /**
     * 分组和排序优化建议
     */
    GROUP_SORT("分组排序优化"),

    /**
     * Where条件优化建议
     */
    WHERE_CLAUSE("Where条件优化"),

    /**
     * 查询性能优化建议
     */
    QUERY_PERFORMANCE("查询性能优化"),

    /**
     * 数据倾斜优化建议
     */
    DATA_SKEW("数据倾斜优化"),

    /**
     * 资源配置优化建议
     */
    RESOURCE_CONFIG("资源配置优化"),

    /**
     * 缓存优化建议
     */
    CACHE_OPTIMIZATION("缓存优化"),

    /**
     * 并行度优化建议
     */
    PARALLELISM("并行度优化"),

    /**
     * 数据压缩优化建议
     */
    COMPRESSION("数据压缩优化"),

    /**
     * 索引优化建议
     */
    INDEX_OPTIMIZATION("索引优化");

    private final String description;

    SuggestionType(String description) {
        this.description = description;
    }

    /**
     * 获取优化建议类型的描述
     *
     * @return 优化建议类型描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 根据描述获取优化建议类型
     *
     * @param description 描述
     * @return 优化建议类型
     * @throws IllegalArgumentException 如果找不到对应的类型
     */
    public static SuggestionType fromDescription(String description) {
        for (SuggestionType type : values()) {
            if (type.getDescription().equals(description)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown suggestion type description: " + description);
    }

    @Override
    public String toString() {
        return description;
    }
}