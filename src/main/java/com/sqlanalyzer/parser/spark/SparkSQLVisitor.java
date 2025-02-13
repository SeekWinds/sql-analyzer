// Generated from /Users/yangxin/project/java-project/sql-analyzer/src/main/java/com/sqlanalyzer/parser/spark/SparkSQL.g4 by ANTLR 4.13.2

package com.sqlanalyzer.parser.spark;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparkSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SparkSQLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(SparkSQLParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(SparkSQLParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(SparkSQLParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(SparkSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#partitionColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionColumns(SparkSQLParser.PartitionColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#transformExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformExpr(SparkSQLParser.TransformExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(SparkSQLParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#tableOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptions(SparkSQLParser.TableOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOption(SparkSQLParser.TableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#tableProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperties(SparkSQLParser.TablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(SparkSQLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SparkSQLParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(SparkSQLParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(SparkSQLParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SparkSQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SparkSQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SparkSQLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SparkSQLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SparkSQLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SparkSQLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(SparkSQLParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinPart(SparkSQLParser.JoinPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSource(SparkSQLParser.TableSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SparkSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SparkSQLParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SparkSQLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(SparkSQLParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(SparkSQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(SparkSQLParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#structField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructField(SparkSQLParser.StructFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileFormat(SparkSQLParser.FileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SparkSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SparkSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SparkSQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SparkSQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SparkSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(SparkSQLParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSQLParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(SparkSQLParser.GroupByItemContext ctx);
}