package com.sqlanalyzer;

import com.sqlanalyzer.dialect.SQLDialect;
import com.sqlanalyzer.dialect.SQLDialectAdapter;
import com.sqlanalyzer.model.AnalysisResult;
import com.sqlanalyzer.model.SQLType;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.tools.Frameworks;

/**
 * Add description here.
 *
 * @author Yang Xin
 */
public class test {

    public static void main(String[] args) {
        final SqlParser.Config parserConfig;

        parserConfig = SqlParser.config()
                    .withCaseSensitive(false);

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

        SQLDialectAdapter adapter = com.sqlanalyzer.factory.SQLDialectAdapterFactory.createAdapter(SQLDialect.HIVE);
        AnalysisResult result = adapter.analyzeSql(createSQL);

        SqlParser parser = SqlParser.create(createSQL, parserConfig);
        SqlNode sqlNode = null;
        try {
            sqlNode = parser.parseQuery();
        } catch (SqlParseException e) {
            throw new RuntimeException(e);
        }

        result.setSqlType(SQLType.fromSqlKind(sqlNode.getKind()));

    }
}
