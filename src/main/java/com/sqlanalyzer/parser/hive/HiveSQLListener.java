// Generated from /Users/yangxin/project/java-project/sql-analyzer/src/main/java/com/sqlanalyzer/parser/hive/HiveSQL.g4 by ANTLR 4.13.2
package com.sqlanalyzer.parser.hive;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HiveSQLParser}.
 */
public interface HiveSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(HiveSQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(HiveSQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(HiveSQLParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(HiveSQLParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(HiveSQLParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(HiveSQLParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(HiveSQLParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(HiveSQLParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(HiveSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(HiveSQLParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#columnSortSpec}.
	 * @param ctx the parse tree
	 */
	void enterColumnSortSpec(HiveSQLParser.ColumnSortSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#columnSortSpec}.
	 * @param ctx the parse tree
	 */
	void exitColumnSortSpec(HiveSQLParser.ColumnSortSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#tableProperties}.
	 * @param ctx the parse tree
	 */
	void enterTableProperties(HiveSQLParser.TablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#tableProperties}.
	 * @param ctx the parse tree
	 */
	void exitTableProperties(HiveSQLParser.TablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(HiveSQLParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(HiveSQLParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(HiveSQLParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(HiveSQLParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(HiveSQLParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(HiveSQLParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(HiveSQLParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(HiveSQLParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(HiveSQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(HiveSQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(HiveSQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(HiveSQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(HiveSQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(HiveSQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(HiveSQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(HiveSQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(HiveSQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(HiveSQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(HiveSQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(HiveSQLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(HiveSQLParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(HiveSQLParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterJoinPart(HiveSQLParser.JoinPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitJoinPart(HiveSQLParser.JoinPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSource(HiveSQLParser.TableSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSource(HiveSQLParser.TableSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HiveSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HiveSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(HiveSQLParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(HiveSQLParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HiveSQLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HiveSQLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(HiveSQLParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(HiveSQLParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(HiveSQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(HiveSQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterFileFormat(HiveSQLParser.FileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitFileFormat(HiveSQLParser.FileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(HiveSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(HiveSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(HiveSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(HiveSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(HiveSQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(HiveSQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(HiveSQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(HiveSQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HiveSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HiveSQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(HiveSQLParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(HiveSQLParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveSQLParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(HiveSQLParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveSQLParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(HiveSQLParser.GroupByItemContext ctx);
}