package com.sqlanalyzer;

import com.sqlanalyzer.analyzer.CalciteSQLAnalyzer;
import com.sqlanalyzer.dialect.SQLDialect;
import com.sqlanalyzer.dialect.SQLDialectAdapter;
import com.sqlanalyzer.factory.SQLDialectAdapterFactory;
import com.sqlanalyzer.model.AnalysisResult;
import com.sqlanalyzer.model.Suggestion;

/**
 * SQL分析器示例
 *
 * @author SeekWinds
 * @date 2025-02-11 09:52:26
 */
public class Example {
    public static void main(String[] args) {
        // 创建分析器实例
        CalciteSQLAnalyzer analyzer = new CalciteSQLAnalyzer();
        SQLDialectAdapter adapter = SQLDialectAdapterFactory.createAdapter(SQLDialect.HIVE);

        // 建表语句示例 - 包含分区和存储格式
        String createSQL = "CREATE TABLE orders (\n" +
                "    order_id BIGINT COMMENT '订单ID',\n" +
                "    user_id BIGINT COMMENT '用户ID',\n" +
                "    order_date DATE COMMENT '订单日期',\n" +
                "    status STRING COMMENT '订单状态',\n" +
                "    total_amount DECIMAL(10,2) COMMENT '订单总额',\n" +
                "    create_time TIMESTAMP COMMENT '创建时间'\n" +
                ") COMMENT '订单表'\n" +
                "PARTITIONED BY (dt STRING COMMENT '分区日期')\n" +
                "CLUSTERED BY (user_id) INTO 32 BUCKETS\n" +
                "STORED AS ORC\n" +
                "TBLPROPERTIES ('orc.compress'='SNAPPY')";

        // 复杂查询语句示例 - 包含JOIN、子查询和窗口函数
        String selectSQL = "WITH user_stats AS (\n" +
                "    SELECT user_id,\n" +
                "           COUNT(*) as order_count,\n" +
                "           SUM(total_amount) as total_spent,\n" +
                "           ROW_NUMBER() OVER (ORDER BY SUM(total_amount) DESC) as rank\n" +
                "    FROM orders\n" +
                "    WHERE dt >= '20250101'\n" +
                "    GROUP BY user_id\n" +
                ")\n" +
                "SELECT o.order_id,\n" +
                "       u.username,\n" +
                "       o.total_amount,\n" +
                "       us.order_count,\n" +
                "       us.total_spent,\n" +
                "       us.rank as user_rank\n" +
                "FROM orders o\n" +
                "JOIN users u ON o.user_id = u.id\n" +
                "JOIN user_stats us ON o.user_id = us.user_id\n" +
                "WHERE o.dt = '20250211'\n" +
                "  AND o.status = 'COMPLETED'\n" +
                "ORDER BY o.total_amount DESC\n" +
                "LIMIT 100";

        // INSERT语句示例
        String insertSQL = "INSERT INTO TABLE orders PARTITION (dt='20250211')\n" +
                "SELECT t.order_id,\n" +
                "       t.user_id,\n" +
                "       t.order_date,\n" +
                "       t.status,\n" +
                "       t.total_amount,\n" +
                "       t.create_time\n" +
                "FROM temp_orders t\n" +
                "WHERE t.create_date = '20250211'";

        // 分析并打印结果
        System.out.println("=== 建表语句分析结果 ===");
        printAnalysisResult(analyzer.analyze(createSQL, SQLDialect.HIVE));

        System.out.println("\n=== 查询语句分析结果 ===");
        printAnalysisResult(analyzer.analyze(selectSQL, SQLDialect.HIVE));

        System.out.println("\n=== 插入语句分析结果 ===");
        printAnalysisResult(analyzer.analyze(insertSQL, SQLDialect.HIVE));

        // 验证语法
        System.out.println("\n=== 语法验证 ===");
        System.out.println("建表语句语法是否正确: " + analyzer.validateSyntax(createSQL, SQLDialect.HIVE));
        System.out.println("查询语句语法是否正确: " + analyzer.validateSyntax(selectSQL, SQLDialect.HIVE));
        System.out.println("插入语句语法是否正确: " + analyzer.validateSyntax(insertSQL, SQLDialect.HIVE));
    }

    private static void printAnalysisResult(AnalysisResult result) {
        if (!result.isValid()) {
            System.out.println("错误: " + result.getErrorMessage());
            return;
        }

        System.out.println("SQL类型: " + result.getSqlType().getDescription());
        System.out.println("优化建议:");

        if (result.getSuggestions().isEmpty()) {
            System.out.println("  无优化建议");
            return;
        }

        // 按优先级排序显示建议
        result.getSuggestions().stream()
                .sorted((s1, s2) -> Integer.compare(s2.getPriority(), s1.getPriority()))
                .forEach(suggestion -> {
                    System.out.println("\n- 优化类型: " + suggestion.getType().getDescription());
                    System.out.println("  说明: " + suggestion.getTitle());
                    System.out.println("  建议: \n" + formatRecommendation(suggestion.getRecommendation()));
                    System.out.println("  优先级: " + getPriorityDescription(suggestion.getPriority()));
                });
    }

    private static String formatRecommendation(String recommendation) {
        String[] lines = recommendation.split("\n");
        StringBuilder formatted = new StringBuilder();
        for (String line : lines) {
            formatted.append("    ").append(line).append("\n");
        }
        return formatted.toString().trim();
    }

    private static String getPriorityDescription(int priority) {
        switch (priority) {
            case 5:
                return "严重问题，必须修复";
            case 4:
                return "重要优化，建议修复";
            case 3:
                return "一般优化，可以改进";
            case 2:
                return "低优先级，供参考";
            case 1:
                return "提示信息";
            default:
                return "未知优先级";
        }
    }
}