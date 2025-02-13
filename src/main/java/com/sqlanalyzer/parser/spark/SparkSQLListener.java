// Generated from /Users/yangxin/project/java-project/sql-analyzer/src/main/java/com/sqlanalyzer/parser/spark/SparkSQL.g4 by ANTLR 4.13.2

package com.sqlanalyzer.parser.spark;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkSQLParser}.
 */
public interface SparkSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SparkSQLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SparkSQLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(SparkSQLParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(SparkSQLParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(SparkSQLParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(SparkSQLParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(SparkSQLParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(SparkSQLParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SparkSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SparkSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#partitionColumns}.
	 * @param ctx the parse tree
	 */
	void enterPartitionColumns(SparkSQLParser.PartitionColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#partitionColumns}.
	 * @param ctx the parse tree
	 */
	void exitPartitionColumns(SparkSQLParser.PartitionColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#transformExpr}.
	 * @param ctx the parse tree
	 */
	void enterTransformExpr(SparkSQLParser.TransformExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#transformExpr}.
	 * @param ctx the parse tree
	 */
	void exitTransformExpr(SparkSQLParser.TransformExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(SparkSQLParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(SparkSQLParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions(SparkSQLParser.TableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions(SparkSQLParser.TableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOption(SparkSQLParser.TableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOption(SparkSQLParser.TableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#tableProperties}.
	 * @param ctx the parse tree
	 */
	void enterTableProperties(SparkSQLParser.TablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#tableProperties}.
	 * @param ctx the parse tree
	 */
	void exitTableProperties(SparkSQLParser.TablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(SparkSQLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(SparkSQLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SparkSQLParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SparkSQLParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SparkSQLParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SparkSQLParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(SparkSQLParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(SparkSQLParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SparkSQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SparkSQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SparkSQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SparkSQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SparkSQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SparkSQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SparkSQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SparkSQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SparkSQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SparkSQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SparkSQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SparkSQLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(SparkSQLParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(SparkSQLParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterJoinPart(SparkSQLParser.JoinPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitJoinPart(SparkSQLParser.JoinPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSource(SparkSQLParser.TableSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSource(SparkSQLParser.TableSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SparkSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SparkSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SparkSQLParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SparkSQLParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SparkSQLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SparkSQLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(SparkSQLParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(SparkSQLParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(SparkSQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(SparkSQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(SparkSQLParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(SparkSQLParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(SparkSQLParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(SparkSQLParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterFileFormat(SparkSQLParser.FileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitFileFormat(SparkSQLParser.FileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SparkSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SparkSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SparkSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SparkSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SparkSQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SparkSQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SparkSQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SparkSQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SparkSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SparkSQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(SparkSQLParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(SparkSQLParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSQLParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(SparkSQLParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSQLParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(SparkSQLParser.GroupByItemContext ctx);
}