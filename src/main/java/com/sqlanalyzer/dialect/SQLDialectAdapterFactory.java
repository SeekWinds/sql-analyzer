package com.sqlanalyzer.factory;

import com.sqlanalyzer.config.ParserConfig;
import com.sqlanalyzer.dialect.*;

/**
 * SQL方言适配器工厂类
 * 用于创建不同类型的SQL方言适配器
 *
 * @author SeekWinds
 * @date 2025-02-11 09:45:29
 */
public class SQLDialectAdapterFactory {

    /**
     * 创建SQL方言适配器
     *
     * @param dialect SQL方言类型
     * @return SQL方言适配器实例
     * @throws IllegalArgumentException 如果不支持该方言类型
     */
    public static SQLDialectAdapter createAdapter(SQLDialect dialect) {
        switch (dialect) {
            case HIVE:
                return new HiveSQLAdapter();
            case SPARK:
                return new SparkSQLAdapter();
            default:
                throw new IllegalArgumentException("Unsupported SQL dialect: " + dialect);
        }
    }

    /**
     * 根据SQL语句特征自动识别并创建适配器
     *
     * @param sql SQL语句
     * @return 最适合的SQL方言适配器
     */
    public static SQLDialectAdapter detectAndCreateAdapter(String sql) {
        sql = sql.trim().toLowerCase();

        // 检查Hive特有语法
        if (sql.contains("clustered by") ||
                sql.contains("stored as parquet") ||
                sql.contains("stored as orc") ||
                sql.contains("distribute by")) {
            return new HiveSQLAdapter();
        }

        // 检查Spark特有语法
        if (sql.contains("using parquet") ||
                sql.contains("using delta") ||
                sql.contains("using json") ||
                sql.contains("broadcast hint")) {
            return new SparkSQLAdapter();
        }

        // 默认使用Spark SQL适配器（因为其功能更丰富）
        return new SparkSQLAdapter();
    }

    /**
     * 检查给定的SQL方言是否支持特定特性
     *
     * @param dialect SQL方言类型
     * @param feature SQL特性
     * @return 如果支持返回true，否则返回false
     */
    public static boolean supportsFeature(SQLDialect dialect, SQLFeature feature) {
        SQLDialectAdapter adapter = createAdapter(dialect);
        return adapter.supportsFeature(feature);
    }

    /**
     * 获取SQL方言的配置信息
     *
     * @param dialect SQL方言类型
     * @return 解析器配置对象
     */
    public static ParserConfig getDialectConfig(SQLDialect dialect) {
        return createAdapter(dialect).getParserConfig();
    }
}