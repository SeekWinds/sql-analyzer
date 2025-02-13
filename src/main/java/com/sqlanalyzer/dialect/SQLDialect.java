package com.sqlanalyzer.dialect;

/**
 * SQL方言类型枚举
 *
 * @author SeekWinds
 * @date 2025-02-11 09:32:39
 */
public enum SQLDialect {
    /**
     * Hive SQL
     */
    HIVE("Hive"),

    /**
     * Spark SQL
     */
    SPARK("Spark"),

    /**
     * 标准SQL
     */
    STANDARD("Standard");

    private final String name;

    SQLDialect(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}