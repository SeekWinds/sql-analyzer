// Generated from /Users/yangxin/project/java-project/sql-analyzer/src/main/java/com/sqlanalyzer/parser/hive/HiveSQL.g4 by ANTLR 4.13.2
package com.sqlanalyzer.parser.hive;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HiveSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HiveSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(HiveSQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(HiveSQLParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(HiveSQLParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(HiveSQLParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(HiveSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#columnSortSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnSortSpec(HiveSQLParser.ColumnSortSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#tableProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperties(HiveSQLParser.TablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(HiveSQLParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(HiveSQLParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(HiveSQLParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(HiveSQLParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(HiveSQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(HiveSQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(HiveSQLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(HiveSQLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(HiveSQLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(HiveSQLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(HiveSQLParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinPart(HiveSQLParser.JoinPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSource(HiveSQLParser.TableSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HiveSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(HiveSQLParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HiveSQLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(HiveSQLParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(HiveSQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileFormat(HiveSQLParser.FileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(HiveSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(HiveSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(HiveSQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(HiveSQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HiveSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(HiveSQLParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveSQLParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(HiveSQLParser.GroupByItemContext ctx);
}