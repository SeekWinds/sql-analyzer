// Generated from /Users/yangxin/project/java-project/sql-analyzer/src/main/java/com/sqlanalyzer/parser/hive/HiveSQL.g4 by ANTLR 4.13.2
package com.sqlanalyzer.parser.hive;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HiveSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, IF=3, NOT=4, EXISTS=5, PARTITIONED=6, BY=7, CLUSTERED=8, 
		SORTED=9, INTO=10, BUCKETS=11, STORED=12, AS=13, LOCATION=14, TBLPROPERTIES=15, 
		SELECT=16, FROM=17, WHERE=18, GROUP=19, HAVING=20, ORDER=21, LIMIT=22, 
		JOIN=23, INNER=24, LEFT=25, RIGHT=26, FULL=27, OUTER=28, CROSS=29, ON=30, 
		USING=31, AND=32, OR=33, IN=34, LIKE=35, ASC=36, DESC=37, COMMENT=38, 
		STRING=39, INT=40, BIGINT=41, DOUBLE=42, DATE=43, TIMESTAMP=44, BOOLEAN=45, 
		DECIMAL=46, VARCHAR=47, TEXTFILE=48, SEQUENCEFILE=49, ORC=50, PARQUET=51, 
		AVRO=52, RCFILE=53, JSONFILE=54, TRUE=55, FALSE=56, NULL=57, EQUAL=58, 
		NOT_EQUAL=59, LESS_THAN=60, LESS_THAN_EQUAL=61, GREATER_THAN=62, GREATER_THAN_EQUAL=63, 
		DOT=64, COMMA=65, SEMICOLON=66, LPAREN=67, RPAREN=68, STAR=69, IDENTIFIER=70, 
		BACK_QUOTED_IDENTIFIER=71, STRING_LITERAL=72, DATE_LITERAL=73, NUMBER=74, 
		WS=75, LINE_COMMENT=76, MULTILINE_COMMENT=77;
	public static final int
		RULE_parse = 0, RULE_sqlStatements = 1, RULE_sqlStatement = 2, RULE_createTableStatement = 3, 
		RULE_columnDefinition = 4, RULE_columnSortSpec = 5, RULE_tableProperties = 6, 
		RULE_tableProperty = 7, RULE_selectStatement = 8, RULE_selectElements = 9, 
		RULE_selectElement = 10, RULE_fromClause = 11, RULE_whereClause = 12, 
		RULE_groupByClause = 13, RULE_havingClause = 14, RULE_orderByClause = 15, 
		RULE_limitClause = 16, RULE_orderByExpression = 17, RULE_joinPart = 18, 
		RULE_tableSource = 19, RULE_expression = 20, RULE_primary = 21, RULE_function = 22, 
		RULE_functionArg = 23, RULE_dataType = 24, RULE_fileFormat = 25, RULE_comparisonOperator = 26, 
		RULE_identifier = 27, RULE_tableName = 28, RULE_alias = 29, RULE_literal = 30, 
		RULE_star = 31, RULE_groupByItem = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sqlStatements", "sqlStatement", "createTableStatement", "columnDefinition", 
			"columnSortSpec", "tableProperties", "tableProperty", "selectStatement", 
			"selectElements", "selectElement", "fromClause", "whereClause", "groupByClause", 
			"havingClause", "orderByClause", "limitClause", "orderByExpression", 
			"joinPart", "tableSource", "expression", "primary", "function", "functionArg", 
			"dataType", "fileFormat", "comparisonOperator", "identifier", "tableName", 
			"alias", "literal", "star", "groupByItem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'TABLE'", "'IF'", "'NOT'", "'EXISTS'", "'PARTITIONED'", 
			"'BY'", "'CLUSTERED'", "'SORTED'", "'INTO'", "'BUCKETS'", "'STORED'", 
			"'AS'", "'LOCATION'", "'TBLPROPERTIES'", "'SELECT'", "'FROM'", "'WHERE'", 
			"'GROUP'", "'HAVING'", "'ORDER'", "'LIMIT'", "'JOIN'", "'INNER'", "'LEFT'", 
			"'RIGHT'", "'FULL'", "'OUTER'", "'CROSS'", "'ON'", "'USING'", "'AND'", 
			"'OR'", "'IN'", "'LIKE'", "'ASC'", "'DESC'", "'COMMENT'", "'STRING'", 
			"'INT'", "'BIGINT'", "'DOUBLE'", "'DATE'", "'TIMESTAMP'", "'BOOLEAN'", 
			"'DECIMAL'", "'VARCHAR'", "'TEXTFILE'", "'SEQUENCEFILE'", "'ORC'", "'PARQUET'", 
			"'AVRO'", "'RCFILE'", "'JSONFILE'", "'TRUE'", "'FALSE'", "'NULL'", "'='", 
			null, "'<'", "'<='", "'>'", "'>='", "'.'", "','", "';'", "'('", "')'", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "TABLE", "IF", "NOT", "EXISTS", "PARTITIONED", "BY", 
			"CLUSTERED", "SORTED", "INTO", "BUCKETS", "STORED", "AS", "LOCATION", 
			"TBLPROPERTIES", "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "ORDER", 
			"LIMIT", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "OUTER", "CROSS", 
			"ON", "USING", "AND", "OR", "IN", "LIKE", "ASC", "DESC", "COMMENT", "STRING", 
			"INT", "BIGINT", "DOUBLE", "DATE", "TIMESTAMP", "BOOLEAN", "DECIMAL", 
			"VARCHAR", "TEXTFILE", "SEQUENCEFILE", "ORC", "PARQUET", "AVRO", "RCFILE", 
			"JSONFILE", "TRUE", "FALSE", "NULL", "EQUAL", "NOT_EQUAL", "LESS_THAN", 
			"LESS_THAN_EQUAL", "GREATER_THAN", "GREATER_THAN_EQUAL", "DOT", "COMMA", 
			"SEMICOLON", "LPAREN", "RPAREN", "STAR", "IDENTIFIER", "BACK_QUOTED_IDENTIFIER", 
			"STRING_LITERAL", "DATE_LITERAL", "NUMBER", "WS", "LINE_COMMENT", "MULTILINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HiveSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HiveSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public SqlStatementsContext sqlStatements() {
			return getRuleContext(SqlStatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HiveSQLParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			sqlStatements();
			setState(67);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqlStatementsContext extends ParserRuleContext {
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(HiveSQLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(HiveSQLParser.SEMICOLON, i);
		}
		public SqlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterSqlStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitSqlStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitSqlStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementsContext sqlStatements() throws RecognitionException {
		SqlStatementsContext _localctx = new SqlStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			sqlStatement();
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					match(SEMICOLON);
					setState(71);
					sqlStatement();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(77);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqlStatementContext extends ParserRuleContext {
		public CreateTableStatementContext createTableStatement() {
			return getRuleContext(CreateTableStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sqlStatement);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				createTableStatement();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				selectStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(HiveSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(HiveSQLParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HiveSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HiveSQLParser.LPAREN, i);
		}
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HiveSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HiveSQLParser.RPAREN, i);
		}
		public TerminalNode IF() { return getToken(HiveSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(HiveSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(HiveSQLParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveSQLParser.COMMA, i);
		}
		public TerminalNode COMMENT() { return getToken(HiveSQLParser.COMMENT, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(HiveSQLParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(HiveSQLParser.STRING_LITERAL, i);
		}
		public TerminalNode PARTITIONED() { return getToken(HiveSQLParser.PARTITIONED, 0); }
		public List<TerminalNode> BY() { return getTokens(HiveSQLParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(HiveSQLParser.BY, i);
		}
		public TerminalNode CLUSTERED() { return getToken(HiveSQLParser.CLUSTERED, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode INTO() { return getToken(HiveSQLParser.INTO, 0); }
		public TerminalNode NUMBER() { return getToken(HiveSQLParser.NUMBER, 0); }
		public TerminalNode BUCKETS() { return getToken(HiveSQLParser.BUCKETS, 0); }
		public TerminalNode STORED() { return getToken(HiveSQLParser.STORED, 0); }
		public TerminalNode AS() { return getToken(HiveSQLParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode LOCATION() { return getToken(HiveSQLParser.LOCATION, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(HiveSQLParser.TBLPROPERTIES, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode SORTED() { return getToken(HiveSQLParser.SORTED, 0); }
		public List<ColumnSortSpecContext> columnSortSpec() {
			return getRuleContexts(ColumnSortSpecContext.class);
		}
		public ColumnSortSpecContext columnSortSpec(int i) {
			return getRuleContext(ColumnSortSpecContext.class,i);
		}
		public CreateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterCreateTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitCreateTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitCreateTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableStatementContext createTableStatement() throws RecognitionException {
		CreateTableStatementContext _localctx = new CreateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(CREATE);
			setState(85);
			match(TABLE);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(86);
				match(IF);
				setState(87);
				match(NOT);
				setState(88);
				match(EXISTS);
				}
			}

			setState(91);
			tableName();
			setState(92);
			match(LPAREN);
			setState(93);
			columnDefinition();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				columnDefinition();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(RPAREN);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(102);
				match(COMMENT);
				setState(103);
				match(STRING_LITERAL);
				}
			}

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITIONED) {
				{
				setState(106);
				match(PARTITIONED);
				setState(107);
				match(BY);
				setState(108);
				match(LPAREN);
				setState(109);
				columnDefinition();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(110);
					match(COMMA);
					setState(111);
					columnDefinition();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(RPAREN);
				}
			}

			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED) {
				{
				setState(121);
				match(CLUSTERED);
				setState(122);
				match(BY);
				setState(123);
				match(LPAREN);
				setState(124);
				identifier();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(125);
					match(COMMA);
					setState(126);
					identifier();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(RPAREN);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SORTED) {
					{
					setState(133);
					match(SORTED);
					setState(134);
					match(BY);
					setState(135);
					match(LPAREN);
					setState(136);
					columnSortSpec();
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(137);
						match(COMMA);
						setState(138);
						columnSortSpec();
						}
						}
						setState(143);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(144);
					match(RPAREN);
					}
				}

				setState(148);
				match(INTO);
				setState(149);
				match(NUMBER);
				setState(150);
				match(BUCKETS);
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORED) {
				{
				setState(154);
				match(STORED);
				setState(155);
				match(AS);
				setState(156);
				fileFormat();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(159);
				match(LOCATION);
				setState(160);
				match(STRING_LITERAL);
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TBLPROPERTIES) {
				{
				setState(163);
				match(TBLPROPERTIES);
				setState(164);
				match(LPAREN);
				setState(165);
				tableProperties();
				setState(166);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(HiveSQLParser.COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(HiveSQLParser.STRING_LITERAL, 0); }
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			identifier();
			setState(171);
			dataType();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(172);
				match(COMMENT);
				setState(173);
				match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnSortSpecContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(HiveSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(HiveSQLParser.DESC, 0); }
		public ColumnSortSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterColumnSortSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitColumnSortSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitColumnSortSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnSortSpecContext columnSortSpec() throws RecognitionException {
		ColumnSortSpecContext _localctx = new ColumnSortSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnSortSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			identifier();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertiesContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveSQLParser.COMMA, i);
		}
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			tableProperty();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(181);
				match(COMMA);
				setState(182);
				tableProperty();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(HiveSQLParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(HiveSQLParser.STRING_LITERAL, i);
		}
		public TerminalNode EQUAL() { return getToken(HiveSQLParser.EQUAL, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(STRING_LITERAL);
			setState(189);
			match(EQUAL);
			setState(190);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(HiveSQLParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(SELECT);
			setState(193);
			selectElements();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(194);
				fromClause();
				}
			}

			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(197);
				whereClause();
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(200);
				groupByClause();
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(203);
				havingClause();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(206);
				orderByClause();
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(209);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementsContext extends ParserRuleContext {
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveSQLParser.COMMA, i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitSelectElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(212);
				star();
				}
				break;
			case NOT:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case IDENTIFIER:
			case BACK_QUOTED_IDENTIFIER:
			case STRING_LITERAL:
			case DATE_LITERAL:
			case NUMBER:
				{
				setState(213);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				selectElement();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(HiveSQLParser.AS, 0); }
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterSelectElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitSelectElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitSelectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expression(0);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 432345564227567617L) != 0)) {
				{
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(224);
					match(AS);
					}
				}

				setState(227);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(HiveSQLParser.FROM, 0); }
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public List<JoinPartContext> joinPart() {
			return getRuleContexts(JoinPartContext.class);
		}
		public JoinPartContext joinPart(int i) {
			return getRuleContext(JoinPartContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(FROM);
			setState(231);
			tableSource();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 796917760L) != 0)) {
				{
				{
				setState(232);
				joinPart();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(HiveSQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(WHERE);
			setState(239);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(HiveSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(HiveSQLParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveSQLParser.COMMA, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(GROUP);
			setState(242);
			match(BY);
			setState(243);
			groupByItem();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				groupByItem();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(HiveSQLParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(HAVING);
			setState(252);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(HiveSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(HiveSQLParser.BY, 0); }
		public List<OrderByExpressionContext> orderByExpression() {
			return getRuleContexts(OrderByExpressionContext.class);
		}
		public OrderByExpressionContext orderByExpression(int i) {
			return getRuleContext(OrderByExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveSQLParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ORDER);
			setState(255);
			match(BY);
			setState(256);
			orderByExpression();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257);
				match(COMMA);
				setState(258);
				orderByExpression();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(HiveSQLParser.LIMIT, 0); }
		public TerminalNode NUMBER() { return getToken(HiveSQLParser.NUMBER, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LIMIT);
			setState(265);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(HiveSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(HiveSQLParser.DESC, 0); }
		public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterOrderByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitOrderByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitOrderByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExpressionContext orderByExpression() throws RecognitionException {
		OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_orderByExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expression(0);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(268);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinPartContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(HiveSQLParser.JOIN, 0); }
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public TerminalNode INNER() { return getToken(HiveSQLParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(HiveSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(HiveSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(HiveSQLParser.FULL, 0); }
		public TerminalNode CROSS() { return getToken(HiveSQLParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(HiveSQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(HiveSQLParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(HiveSQLParser.LPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HiveSQLParser.RPAREN, 0); }
		public TerminalNode OUTER() { return getToken(HiveSQLParser.OUTER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveSQLParser.COMMA, i);
		}
		public JoinPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterJoinPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitJoinPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitJoinPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinPartContext joinPart() throws RecognitionException {
		JoinPartContext _localctx = new JoinPartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_joinPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				{
				setState(271);
				match(INNER);
				}
				break;
			case LEFT:
				{
				setState(272);
				match(LEFT);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(273);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				{
				setState(276);
				match(RIGHT);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(277);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				{
				setState(280);
				match(FULL);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(281);
					match(OUTER);
					}
				}

				}
				break;
			case CROSS:
				{
				setState(284);
				match(CROSS);
				}
				break;
			case JOIN:
				break;
			default:
				break;
			}
			setState(287);
			match(JOIN);
			setState(288);
			tableSource();
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(289);
				match(ON);
				setState(290);
				expression(0);
				}
				break;
			case USING:
				{
				setState(291);
				match(USING);
				setState(292);
				match(LPAREN);
				setState(293);
				identifier();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(294);
					match(COMMA);
					setState(295);
					identifier();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
				match(RPAREN);
				}
				break;
			case EOF:
			case WHERE:
			case GROUP:
			case HAVING:
			case ORDER:
			case LIMIT:
			case JOIN:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case CROSS:
			case SEMICOLON:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableSourceContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(HiveSQLParser.AS, 0); }
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterTableSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitTableSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitTableSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		TableSourceContext _localctx = new TableSourceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			tableName();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 432345564227567617L) != 0)) {
				{
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(306);
					match(AS);
					}
				}

				setState(309);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(HiveSQLParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(HiveSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HiveSQLParser.RPAREN, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode AND() { return getToken(HiveSQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(HiveSQLParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NULL:
			case IDENTIFIER:
			case BACK_QUOTED_IDENTIFIER:
			case STRING_LITERAL:
			case DATE_LITERAL:
			case NUMBER:
				{
				setState(313);
				primary();
				}
				break;
			case NOT:
				{
				setState(314);
				match(NOT);
				setState(315);
				expression(2);
				}
				break;
			case LPAREN:
				{
				setState(316);
				match(LPAREN);
				setState(317);
				expression(0);
				setState(318);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(332);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(323);
						comparisonOperator();
						setState(324);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(327);
						match(AND);
						setState(328);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(330);
						match(OR);
						setState(331);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primary);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveSQLParser.LPAREN, 0); }
		public List<FunctionArgContext> functionArg() {
			return getRuleContexts(FunctionArgContext.class);
		}
		public FunctionArgContext functionArg(int i) {
			return getRuleContext(FunctionArgContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HiveSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveSQLParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			identifier();
			setState(343);
			match(LPAREN);
			setState(344);
			functionArg();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(345);
				match(COMMA);
				setState(346);
				functionArg();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(HiveSQLParser.STAR, 0); }
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionArg);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case IDENTIFIER:
			case BACK_QUOTED_IDENTIFIER:
			case STRING_LITERAL:
			case DATE_LITERAL:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				expression(0);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HiveSQLParser.STRING, 0); }
		public TerminalNode INT() { return getToken(HiveSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(HiveSQLParser.BIGINT, 0); }
		public TerminalNode DOUBLE() { return getToken(HiveSQLParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(HiveSQLParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(HiveSQLParser.TIMESTAMP, 0); }
		public TerminalNode BOOLEAN() { return getToken(HiveSQLParser.BOOLEAN, 0); }
		public TerminalNode DECIMAL() { return getToken(HiveSQLParser.DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(HiveSQLParser.LPAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(HiveSQLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(HiveSQLParser.NUMBER, i);
		}
		public TerminalNode RPAREN() { return getToken(HiveSQLParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(HiveSQLParser.COMMA, 0); }
		public TerminalNode VARCHAR() { return getToken(HiveSQLParser.VARCHAR, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dataType);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(STRING);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(INT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(BIGINT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				match(DOUBLE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(363);
				match(TIMESTAMP);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(364);
				match(BOOLEAN);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(365);
				match(DECIMAL);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(366);
					match(LPAREN);
					setState(367);
					match(NUMBER);
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(368);
						match(COMMA);
						setState(369);
						match(NUMBER);
						}
					}

					setState(372);
					match(RPAREN);
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(375);
				match(VARCHAR);
				setState(376);
				match(LPAREN);
				setState(377);
				match(NUMBER);
				setState(378);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileFormatContext extends ParserRuleContext {
		public TerminalNode TEXTFILE() { return getToken(HiveSQLParser.TEXTFILE, 0); }
		public TerminalNode SEQUENCEFILE() { return getToken(HiveSQLParser.SEQUENCEFILE, 0); }
		public TerminalNode ORC() { return getToken(HiveSQLParser.ORC, 0); }
		public TerminalNode PARQUET() { return getToken(HiveSQLParser.PARQUET, 0); }
		public TerminalNode AVRO() { return getToken(HiveSQLParser.AVRO, 0); }
		public TerminalNode RCFILE() { return getToken(HiveSQLParser.RCFILE, 0); }
		public TerminalNode JSONFILE() { return getToken(HiveSQLParser.JSONFILE, 0); }
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fileFormat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35747322042253312L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(HiveSQLParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(HiveSQLParser.NOT_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(HiveSQLParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(HiveSQLParser.LESS_THAN_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(HiveSQLParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(HiveSQLParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode LIKE() { return getToken(HiveSQLParser.LIKE, 0); }
		public TerminalNode IN() { return getToken(HiveSQLParser.IN, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -288230324612104192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HiveSQLParser.IDENTIFIER, 0); }
		public TerminalNode BACK_QUOTED_IDENTIFIER() { return getToken(HiveSQLParser.BACK_QUOTED_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==BACK_QUOTED_IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(HiveSQLParser.DOT, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			identifier();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(388);
				match(DOT);
				setState(389);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(HiveSQLParser.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(HiveSQLParser.NUMBER, 0); }
		public TerminalNode DATE_LITERAL() { return getToken(HiveSQLParser.DATE_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(HiveSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HiveSQLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(HiveSQLParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 917511L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(HiveSQLParser.STAR, 0); }
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).enterGroupByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSQLListener ) ((HiveSQLListener)listener).exitGroupByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSQLVisitor ) return ((HiveSQLVisitor<? extends T>)visitor).visitGroupByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByItemContext groupByItem() throws RecognitionException {
		GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_groupByItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001M\u0191\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001I\b\u0001\n\u0001\f\u0001"+
		"L\t\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002S\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003Z\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003a\b\u0003\n\u0003\f\u0003d\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003q\b"+
		"\u0003\n\u0003\f\u0003t\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003x\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0080\b\u0003\n\u0003\f\u0003\u0083\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u008c\b\u0003\n\u0003\f\u0003\u008f\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0093\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0099\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u009e\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a2\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00a9\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00af\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00b3\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b8\b\u0006\n\u0006\f\u0006"+
		"\u00bb\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00c4\b\b\u0001\b\u0003\b\u00c7\b\b\u0001\b\u0003"+
		"\b\u00ca\b\b\u0001\b\u0003\b\u00cd\b\b\u0001\b\u0003\b\u00d0\b\b\u0001"+
		"\b\u0003\b\u00d3\b\b\u0001\t\u0001\t\u0003\t\u00d7\b\t\u0001\t\u0001\t"+
		"\u0005\t\u00db\b\t\n\t\f\t\u00de\t\t\u0001\n\u0001\n\u0003\n\u00e2\b\n"+
		"\u0001\n\u0003\n\u00e5\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00ea\b\u000b\n\u000b\f\u000b\u00ed\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f7\b\r\n\r\f\r\u00fa\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0104\b\u000f\n\u000f\f\u000f\u0107"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u010e\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0113"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0117\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u011b\b\u0012\u0001\u0012\u0003\u0012\u011e\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0129\b\u0012\n"+
		"\u0012\f\u0012\u012c\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0130"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0134\b\u0013\u0001\u0013"+
		"\u0003\u0013\u0137\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0141\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u014d\b\u0014"+
		"\n\u0014\f\u0014\u0150\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0155\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u015c\b\u0016\n\u0016\f\u0016\u015f\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0165\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0173\b\u0018\u0001\u0018\u0003\u0018\u0176\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u017c\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0187\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0000"+
		"\u0001(!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0005\u0001\u0000$%\u0001\u0000"+
		"06\u0002\u0000\"#:?\u0001\u0000FG\u0002\u000079HJ\u01b0\u0000B\u0001\u0000"+
		"\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000"+
		"\u0006T\u0001\u0000\u0000\u0000\b\u00aa\u0001\u0000\u0000\u0000\n\u00b0"+
		"\u0001\u0000\u0000\u0000\f\u00b4\u0001\u0000\u0000\u0000\u000e\u00bc\u0001"+
		"\u0000\u0000\u0000\u0010\u00c0\u0001\u0000\u0000\u0000\u0012\u00d6\u0001"+
		"\u0000\u0000\u0000\u0014\u00df\u0001\u0000\u0000\u0000\u0016\u00e6\u0001"+
		"\u0000\u0000\u0000\u0018\u00ee\u0001\u0000\u0000\u0000\u001a\u00f1\u0001"+
		"\u0000\u0000\u0000\u001c\u00fb\u0001\u0000\u0000\u0000\u001e\u00fe\u0001"+
		"\u0000\u0000\u0000 \u0108\u0001\u0000\u0000\u0000\"\u010b\u0001\u0000"+
		"\u0000\u0000$\u011d\u0001\u0000\u0000\u0000&\u0131\u0001\u0000\u0000\u0000"+
		"(\u0140\u0001\u0000\u0000\u0000*\u0154\u0001\u0000\u0000\u0000,\u0156"+
		"\u0001\u0000\u0000\u0000.\u0164\u0001\u0000\u0000\u00000\u017b\u0001\u0000"+
		"\u0000\u00002\u017d\u0001\u0000\u0000\u00004\u017f\u0001\u0000\u0000\u0000"+
		"6\u0181\u0001\u0000\u0000\u00008\u0183\u0001\u0000\u0000\u0000:\u0188"+
		"\u0001\u0000\u0000\u0000<\u018a\u0001\u0000\u0000\u0000>\u018c\u0001\u0000"+
		"\u0000\u0000@\u018e\u0001\u0000\u0000\u0000BC\u0003\u0002\u0001\u0000"+
		"CD\u0005\u0000\u0000\u0001D\u0001\u0001\u0000\u0000\u0000EJ\u0003\u0004"+
		"\u0002\u0000FG\u0005B\u0000\u0000GI\u0003\u0004\u0002\u0000HF\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MO\u0005B\u0000\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"O\u0003\u0001\u0000\u0000\u0000PS\u0003\u0006\u0003\u0000QS\u0003\u0010"+
		"\b\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u0005\u0001"+
		"\u0000\u0000\u0000TU\u0005\u0001\u0000\u0000UY\u0005\u0002\u0000\u0000"+
		"VW\u0005\u0003\u0000\u0000WX\u0005\u0004\u0000\u0000XZ\u0005\u0005\u0000"+
		"\u0000YV\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\\\u00038\u001c\u0000\\]\u0005C\u0000\u0000]b\u0003\b\u0004"+
		"\u0000^_\u0005A\u0000\u0000_a\u0003\b\u0004\u0000`^\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eh\u0005"+
		"D\u0000\u0000fg\u0005&\u0000\u0000gi\u0005H\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000iw\u0001\u0000\u0000\u0000jk\u0005"+
		"\u0006\u0000\u0000kl\u0005\u0007\u0000\u0000lm\u0005C\u0000\u0000mr\u0003"+
		"\b\u0004\u0000no\u0005A\u0000\u0000oq\u0003\b\u0004\u0000pn\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uv\u0005D\u0000\u0000vx\u0001\u0000\u0000\u0000wj\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x\u0098\u0001\u0000\u0000\u0000yz\u0005\b\u0000"+
		"\u0000z{\u0005\u0007\u0000\u0000{|\u0005C\u0000\u0000|\u0081\u00036\u001b"+
		"\u0000}~\u0005A\u0000\u0000~\u0080\u00036\u001b\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0092\u0005D\u0000"+
		"\u0000\u0085\u0086\u0005\t\u0000\u0000\u0086\u0087\u0005\u0007\u0000\u0000"+
		"\u0087\u0088\u0005C\u0000\u0000\u0088\u008d\u0003\n\u0005\u0000\u0089"+
		"\u008a\u0005A\u0000\u0000\u008a\u008c\u0003\n\u0005\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005D\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0085\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095\u0096\u0005J"+
		"\u0000\u0000\u0096\u0097\u0005\u000b\u0000\u0000\u0097\u0099\u0001\u0000"+
		"\u0000\u0000\u0098y\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009d\u0001\u0000\u0000\u0000\u009a\u009b\u0005\f\u0000\u0000"+
		"\u009b\u009c\u0005\r\u0000\u0000\u009c\u009e\u00032\u0019\u0000\u009d"+
		"\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000e\u0000\u0000\u00a0"+
		"\u00a2\u0005H\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a8\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\u000f\u0000\u0000\u00a4\u00a5\u0005C\u0000\u0000\u00a5\u00a6\u0003"+
		"\f\u0006\u0000\u00a6\u00a7\u0005D\u0000\u0000\u00a7\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u0007\u0001\u0000\u0000\u0000\u00aa\u00ab\u00036\u001b"+
		"\u0000\u00ab\u00ae\u00030\u0018\u0000\u00ac\u00ad\u0005&\u0000\u0000\u00ad"+
		"\u00af\u0005H\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\t\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003"+
		"6\u001b\u0000\u00b1\u00b3\u0007\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u000b\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b9\u0003\u000e\u0007\u0000\u00b5\u00b6\u0005A\u0000"+
		"\u0000\u00b6\u00b8\u0003\u000e\u0007\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\r\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005H\u0000\u0000\u00bd"+
		"\u00be\u0005:\u0000\u0000\u00be\u00bf\u0005H\u0000\u0000\u00bf\u000f\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005\u0010\u0000\u0000\u00c1\u00c3\u0003"+
		"\u0012\t\u0000\u00c2\u00c4\u0003\u0016\u000b\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0003\u0018\f\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c8\u00ca\u0003\u001a\r\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0003\u001c\u000e\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d0\u0003\u001e\u000f\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d3\u0003 \u0010\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3\u0011\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d7\u0003>\u001f\u0000\u00d5\u00d7\u0003\u0014\n\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00dc"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005A\u0000\u0000\u00d9\u00db\u0003"+
		"\u0014\n\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u0013\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e4\u0003(\u0014\u0000\u00e0\u00e2\u0005\r\u0000"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003:\u001d\u0000"+
		"\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u0015\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0011\u0000\u0000"+
		"\u00e7\u00eb\u0003&\u0013\u0000\u00e8\u00ea\u0003$\u0012\u0000\u00e9\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u0017"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005\u0012\u0000\u0000\u00ef\u00f0\u0003(\u0014\u0000\u00f0\u0019\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\u0013\u0000\u0000\u00f2\u00f3\u0005"+
		"\u0007\u0000\u0000\u00f3\u00f8\u0003@ \u0000\u00f4\u00f5\u0005A\u0000"+
		"\u0000\u00f5\u00f7\u0003@ \u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0014\u0000\u0000\u00fc"+
		"\u00fd\u0003(\u0014\u0000\u00fd\u001d\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0015\u0000\u0000\u00ff\u0100\u0005\u0007\u0000\u0000\u0100\u0105"+
		"\u0003\"\u0011\u0000\u0101\u0102\u0005A\u0000\u0000\u0102\u0104\u0003"+
		"\"\u0011\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u001f\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0005\u0016\u0000\u0000\u0109\u010a\u0005J\u0000"+
		"\u0000\u010a!\u0001\u0000\u0000\u0000\u010b\u010d\u0003(\u0014\u0000\u010c"+
		"\u010e\u0007\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e#\u0001\u0000\u0000\u0000\u010f\u011e"+
		"\u0005\u0018\u0000\u0000\u0110\u0112\u0005\u0019\u0000\u0000\u0111\u0113"+
		"\u0005\u001c\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u011e\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u0005\u001a\u0000\u0000\u0115\u0117\u0005\u001c\u0000\u0000\u0116\u0115"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011e"+
		"\u0001\u0000\u0000\u0000\u0118\u011a\u0005\u001b\u0000\u0000\u0119\u011b"+
		"\u0005\u001c\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011e"+
		"\u0005\u001d\u0000\u0000\u011d\u010f\u0001\u0000\u0000\u0000\u011d\u0110"+
		"\u0001\u0000\u0000\u0000\u011d\u0114\u0001\u0000\u0000\u0000\u011d\u0118"+
		"\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0005\u0017\u0000\u0000\u0120\u012f\u0003&\u0013\u0000\u0121\u0122\u0005"+
		"\u001e\u0000\u0000\u0122\u0130\u0003(\u0014\u0000\u0123\u0124\u0005\u001f"+
		"\u0000\u0000\u0124\u0125\u0005C\u0000\u0000\u0125\u012a\u00036\u001b\u0000"+
		"\u0126\u0127\u0005A\u0000\u0000\u0127\u0129\u00036\u001b\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d"+
		"\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005D\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0121\u0001"+
		"\u0000\u0000\u0000\u012f\u0123\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130%\u0001\u0000\u0000\u0000\u0131\u0136\u00038\u001c"+
		"\u0000\u0132\u0134\u0005\r\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0003:\u001d\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\'\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0006\u0014\uffff\uffff\u0000\u0139\u0141\u0003*\u0015\u0000\u013a\u013b"+
		"\u0005\u0004\u0000\u0000\u013b\u0141\u0003(\u0014\u0002\u013c\u013d\u0005"+
		"C\u0000\u0000\u013d\u013e\u0003(\u0014\u0000\u013e\u013f\u0005D\u0000"+
		"\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u0138\u0001\u0000\u0000"+
		"\u0000\u0140\u013a\u0001\u0000\u0000\u0000\u0140\u013c\u0001\u0000\u0000"+
		"\u0000\u0141\u014e\u0001\u0000\u0000\u0000\u0142\u0143\n\u0005\u0000\u0000"+
		"\u0143\u0144\u00034\u001a\u0000\u0144\u0145\u0003(\u0014\u0006\u0145\u014d"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\n\u0004\u0000\u0000\u0147\u0148\u0005"+
		" \u0000\u0000\u0148\u014d\u0003(\u0014\u0005\u0149\u014a\n\u0003\u0000"+
		"\u0000\u014a\u014b\u0005!\u0000\u0000\u014b\u014d\u0003(\u0014\u0004\u014c"+
		"\u0142\u0001\u0000\u0000\u0000\u014c\u0146\u0001\u0000\u0000\u0000\u014c"+
		"\u0149\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e"+
		"\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		")\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0155"+
		"\u0003<\u001e\u0000\u0152\u0155\u00036\u001b\u0000\u0153\u0155\u0003,"+
		"\u0016\u0000\u0154\u0151\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155+\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u00036\u001b\u0000\u0157\u0158\u0005C\u0000\u0000\u0158"+
		"\u015d\u0003.\u0017\u0000\u0159\u015a\u0005A\u0000\u0000\u015a\u015c\u0003"+
		".\u0017\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0005D\u0000\u0000\u0161-\u0001\u0000\u0000\u0000"+
		"\u0162\u0165\u0003(\u0014\u0000\u0163\u0165\u0005E\u0000\u0000\u0164\u0162"+
		"\u0001\u0000\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165/\u0001"+
		"\u0000\u0000\u0000\u0166\u017c\u0005\'\u0000\u0000\u0167\u017c\u0005("+
		"\u0000\u0000\u0168\u017c\u0005)\u0000\u0000\u0169\u017c\u0005*\u0000\u0000"+
		"\u016a\u017c\u0005+\u0000\u0000\u016b\u017c\u0005,\u0000\u0000\u016c\u017c"+
		"\u0005-\u0000\u0000\u016d\u0175\u0005.\u0000\u0000\u016e\u016f\u0005C"+
		"\u0000\u0000\u016f\u0172\u0005J\u0000\u0000\u0170\u0171\u0005A\u0000\u0000"+
		"\u0171\u0173\u0005J\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174"+
		"\u0176\u0005D\u0000\u0000\u0175\u016e\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u017c\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0005/\u0000\u0000\u0178\u0179\u0005C\u0000\u0000\u0179\u017a\u0005J"+
		"\u0000\u0000\u017a\u017c\u0005D\u0000\u0000\u017b\u0166\u0001\u0000\u0000"+
		"\u0000\u017b\u0167\u0001\u0000\u0000\u0000\u017b\u0168\u0001\u0000\u0000"+
		"\u0000\u017b\u0169\u0001\u0000\u0000\u0000\u017b\u016a\u0001\u0000\u0000"+
		"\u0000\u017b\u016b\u0001\u0000\u0000\u0000\u017b\u016c\u0001\u0000\u0000"+
		"\u0000\u017b\u016d\u0001\u0000\u0000\u0000\u017b\u0177\u0001\u0000\u0000"+
		"\u0000\u017c1\u0001\u0000\u0000\u0000\u017d\u017e\u0007\u0001\u0000\u0000"+
		"\u017e3\u0001\u0000\u0000\u0000\u017f\u0180\u0007\u0002\u0000\u0000\u0180"+
		"5\u0001\u0000\u0000\u0000\u0181\u0182\u0007\u0003\u0000\u0000\u01827\u0001"+
		"\u0000\u0000\u0000\u0183\u0186\u00036\u001b\u0000\u0184\u0185\u0005@\u0000"+
		"\u0000\u0185\u0187\u00036\u001b\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0001\u0000\u0000\u0000\u01879\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u00036\u001b\u0000\u0189;\u0001\u0000\u0000\u0000\u018a\u018b\u0007"+
		"\u0004\u0000\u0000\u018b=\u0001\u0000\u0000\u0000\u018c\u018d\u0005E\u0000"+
		"\u0000\u018d?\u0001\u0000\u0000\u0000\u018e\u018f\u0003(\u0014\u0000\u018f"+
		"A\u0001\u0000\u0000\u00002JNRYbhrw\u0081\u008d\u0092\u0098\u009d\u00a1"+
		"\u00a8\u00ae\u00b2\u00b9\u00c3\u00c6\u00c9\u00cc\u00cf\u00d2\u00d6\u00dc"+
		"\u00e1\u00e4\u00eb\u00f8\u0105\u010d\u0112\u0116\u011a\u011d\u012a\u012f"+
		"\u0133\u0136\u0140\u014c\u014e\u0154\u015d\u0164\u0172\u0175\u017b\u0186";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}