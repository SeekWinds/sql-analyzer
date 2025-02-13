package com.sqlanalyzer.model;

import org.apache.calcite.sql.SqlKind;

/**
 * SQL语句类型枚举
 *
 * @author SeekWinds
 * @date 2025-02-11 09:50:54
 */
public enum SQLType {
    SELECT("查询语句"),
    CREATE("建表语句"),
    INSERT("插入语句"),
    UPDATE("更新语句"),
    DELETE("删除语句"),
    DROP("删除对象语句"),
    ALTER("修改语句"),
    UNKNOWN("未知类型");

    private final String description;

    SQLType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 将Calcite的SqlKind转换为SQLType
     *
     * @param kind Calcite的SQL类型
     * @return 对应的SQLType
     */
    public static SQLType fromSqlKind(SqlKind kind) {
        if (kind == null) {
            return UNKNOWN;
        }

        switch (kind) {
            case SELECT:
                return SELECT;
            case INSERT:
                return INSERT;
            case UPDATE:
                return UPDATE;
            case DELETE:
                return DELETE;
            case CREATE_TABLE:
            case CREATE_VIEW:
            case CREATE_SCHEMA:
                return CREATE;
            case DROP_TABLE:
            case DROP_VIEW:
            case DROP_SCHEMA:
                return DROP;
            case ALTER_TABLE:
            case ALTER_VIEW:
            default:
                return UNKNOWN;
        }
    }

    @Override
    public String toString() {
        return description;
    }
}