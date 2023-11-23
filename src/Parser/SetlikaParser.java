package Parser;
// Generated from Setlika.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SetlikaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, NUMBER=43, ID=44, SCOL=45, WS=46;
	public static final int
		RULE_stmt = 0, RULE_sql_stmt_list = 1, RULE_stmt_line = 2, RULE_vacuum_stmt = 3, 
		RULE_create_stmt = 4, RULE_drop_stmt = 5, RULE_insert_stmt = 6, RULE_select_stmt = 7, 
		RULE_result_columns = 8, RULE_result_column = 9, RULE_from_body = 10, 
		RULE_join_clauses = 11, RULE_join_clause = 12, RULE_cross_join = 13, RULE_inner_join = 14, 
		RULE_existence = 15, RULE_table_name = 16, RULE_columns_def = 17, RULE_column_def = 18, 
		RULE_column_name = 19, RULE_type = 20, RULE_primary_key = 21, RULE_values = 22, 
		RULE_value = 23, RULE_expr = 24, RULE_where_clause = 25, RULE_binary_operator = 26, 
		RULE_literal = 27, RULE_integer = 28, RULE_float = 29, RULE_text = 30, 
		RULE_bool = 31, RULE_identifier = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"stmt", "sql_stmt_list", "stmt_line", "vacuum_stmt", "create_stmt", "drop_stmt", 
			"insert_stmt", "select_stmt", "result_columns", "result_column", "from_body", 
			"join_clauses", "join_clause", "cross_join", "inner_join", "existence", 
			"table_name", "columns_def", "column_def", "column_name", "type", "primary_key", 
			"values", "value", "expr", "where_clause", "binary_operator", "literal", 
			"integer", "float", "text", "bool", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'VACUUM'", "'CREATE'", "'TABLE'", "'('", "')'", "'DROP'", "'INSERT'", 
			"'INTO'", "'VALUES'", "'SELECT'", "'FROM'", "','", "'*'", "'JOIN'", "'ON'", 
			"'IF'", "'NOT'", "'EXISTS'", "':'", "'int'", "'float'", "'str'", "'bool'", 
			"'PRIMARY'", "'KEY'", "'PK'", "'WHERE'", "'/'", "'+'", "'-'", "'<='", 
			"'<'", "'>='", "'>'", "'='", "'!='", "'AND'", "'OR'", "'.'", "'''", "'True'", 
			"'False'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NUMBER", "ID", "SCOL", "WS"
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
	public String getGrammarFileName() { return "Setlika.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SetlikaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SetlikaParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372090054L) != 0)) {
				{
				{
				setState(66);
				sql_stmt_list();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Stmt_lineContext> stmt_line() {
			return getRuleContexts(Stmt_lineContext.class);
		}
		public Stmt_lineContext stmt_line(int i) {
			return getRuleContext(Stmt_lineContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SetlikaParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SetlikaParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(74);
				match(SCOL);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			stmt_line();
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(81);
						match(SCOL);
						}
						}
						setState(84); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(86);
					stmt_line();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(92);
			match(SCOL);
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
	public static class Stmt_lineContext extends ParserRuleContext {
		public Create_stmtContext create_stmt() {
			return getRuleContext(Create_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public Stmt_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterStmt_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitStmt_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitStmt_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_lineContext stmt_line() throws RecognitionException {
		Stmt_lineContext _localctx = new Stmt_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt_line);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				create_stmt();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				drop_stmt();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				insert_stmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				select_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				vacuum_stmt();
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
	public static class Vacuum_stmtContext extends ParserRuleContext {
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
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
	public static class Create_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Columns_defContext columns_def() {
			return getRuleContext(Columns_defContext.class,0);
		}
		public ExistenceContext existence() {
			return getRuleContext(ExistenceContext.class,0);
		}
		public Create_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterCreate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitCreate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitCreate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_stmtContext create_stmt() throws RecognitionException {
		Create_stmtContext _localctx = new Create_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__1);
			setState(104);
			match(T__2);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(105);
				existence();
				}
			}

			setState(108);
			table_name();
			setState(109);
			match(T__3);
			setState(110);
			columns_def();
			setState(111);
			match(T__4);
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
	public static class Drop_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExistenceContext existence() {
			return getRuleContext(ExistenceContext.class,0);
		}
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitDrop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__5);
			setState(114);
			match(T__2);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(115);
				existence();
				}
			}

			setState(118);
			table_name();
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
	public static class Insert_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__6);
			setState(121);
			match(T__7);
			setState(122);
			table_name();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(123);
				match(T__8);
				}
			}

			setState(126);
			values();
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
	public static class Select_stmtContext extends ParserRuleContext {
		public Result_columnsContext result_columns() {
			return getRuleContext(Result_columnsContext.class,0);
		}
		public From_bodyContext from_body() {
			return getRuleContext(From_bodyContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__9);
			setState(129);
			result_columns(0);
			setState(130);
			match(T__10);
			setState(131);
			from_body();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(132);
				where_clause();
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
	public static class Result_columnsContext extends ParserRuleContext {
		public Result_columnContext result_column() {
			return getRuleContext(Result_columnContext.class,0);
		}
		public Result_columnsContext result_columns() {
			return getRuleContext(Result_columnsContext.class,0);
		}
		public Result_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterResult_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitResult_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitResult_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnsContext result_columns() throws RecognitionException {
		return result_columns(0);
	}

	private Result_columnsContext result_columns(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Result_columnsContext _localctx = new Result_columnsContext(_ctx, _parentState);
		Result_columnsContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_result_columns, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			result_column();
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Result_columnsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_result_columns);
					setState(138);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(139);
					match(T__11);
					setState(140);
					result_column();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class Result_columnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_result_column);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__12);
				}
				break;
			case T__3:
			case T__39:
			case T__40:
			case T__41:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				expr(0);
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
	public static class From_bodyContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Join_clausesContext join_clauses() {
			return getRuleContext(Join_clausesContext.class,0);
		}
		public From_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterFrom_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitFrom_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitFrom_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_bodyContext from_body() throws RecognitionException {
		From_bodyContext _localctx = new From_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_from_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			table_name();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__13) {
				{
				setState(151);
				join_clauses(0);
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
	public static class Join_clausesContext extends ParserRuleContext {
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Join_clausesContext join_clauses() {
			return getRuleContext(Join_clausesContext.class,0);
		}
		public Join_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterJoin_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitJoin_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitJoin_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clausesContext join_clauses() throws RecognitionException {
		return join_clauses(0);
	}

	private Join_clausesContext join_clauses(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Join_clausesContext _localctx = new Join_clausesContext(_ctx, _parentState);
		Join_clausesContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_join_clauses, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(155);
			join_clause();
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Join_clausesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_join_clauses);
					setState(157);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(158);
					join_clause();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class Join_clauseContext extends ParserRuleContext {
		public Cross_joinContext cross_join() {
			return getRuleContext(Cross_joinContext.class,0);
		}
		public Inner_joinContext inner_join() {
			return getRuleContext(Inner_joinContext.class,0);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_join_clause);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				cross_join();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				inner_join();
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
	public static class Cross_joinContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Cross_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cross_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterCross_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitCross_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitCross_join(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cross_joinContext cross_join() throws RecognitionException {
		Cross_joinContext _localctx = new Cross_joinContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cross_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__11);
			setState(169);
			table_name();
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
	public static class Inner_joinContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Inner_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterInner_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitInner_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitInner_join(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_joinContext inner_join() throws RecognitionException {
		Inner_joinContext _localctx = new Inner_joinContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inner_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__13);
			setState(172);
			table_name();
			setState(173);
			match(T__14);
			setState(174);
			expr(0);
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
	public static class ExistenceContext extends ParserRuleContext {
		public ExistenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterExistence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitExistence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitExistence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistenceContext existence() throws RecognitionException {
		ExistenceContext _localctx = new ExistenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_existence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__15);
			setState(177);
			match(T__16);
			setState(178);
			match(T__17);
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
	public static class Table_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
	public static class Columns_defContext extends ParserRuleContext {
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public Columns_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterColumns_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitColumns_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitColumns_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Columns_defContext columns_def() throws RecognitionException {
		Columns_defContext _localctx = new Columns_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_columns_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			column_def();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(183);
				match(T__11);
				setState(184);
				column_def();
				}
				}
				setState(189);
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
	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Primary_keyContext primary_key() {
			return getRuleContext(Primary_keyContext.class,0);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			column_name();
			setState(191);
			match(T__18);
			setState(192);
			type();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23 || _la==T__25) {
				{
				setState(193);
				primary_key();
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
	public static class Column_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
	public static class TypeContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__21);
				setState(201);
				match(T__3);
				setState(202);
				integer();
				setState(203);
				match(T__4);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__22);
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
	public static class Primary_keyContext extends ParserRuleContext {
		public Primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterPrimary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitPrimary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitPrimary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_keyContext primary_key() throws RecognitionException {
		Primary_keyContext _localctx = new Primary_keyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primary_key);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__23);
				setState(209);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__25);
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
	public static class ValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			value();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(214);
				match(T__11);
				setState(215);
				value();
				}
				}
				setState(220);
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
	public static class ValueContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__3);
			setState(222);
			literal();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(223);
				match(T__11);
				setState(224);
				literal();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(T__4);
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
	public static class ExprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case NUMBER:
				{
				setState(233);
				literal();
				}
				break;
			case ID:
				{
				setState(234);
				column_name();
				}
				break;
			case T__3:
				{
				setState(235);
				match(T__3);
				setState(236);
				expr(0);
				setState(237);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(241);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(242);
					binary_operator();
					setState(243);
					expr(2);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	public static class Where_clauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__26);
			setState(251);
			expr(0);
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
	public static class Binary_operatorContext extends ParserRuleContext {
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_binary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 549487386624L) != 0)) ) {
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
	public static class LiteralContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				float_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				text();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				bool();
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
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SetlikaParser.NUMBER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
	public static class FloatContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SetlikaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SetlikaParser.NUMBER, i);
		}
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(NUMBER);
			setState(264);
			match(T__38);
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
	public static class TextContext extends ParserRuleContext {
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__39);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(268);
					matchWildcard();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(274);
			match(T__39);
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
	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
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
		public TerminalNode ID() { return getToken(SetlikaParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SetlikaListener ) ((SetlikaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SetlikaVisitor ) return ((SetlikaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ID);
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
		case 8:
			return result_columns_sempred((Result_columnsContext)_localctx, predIndex);
		case 11:
			return join_clauses_sempred((Join_clausesContext)_localctx, predIndex);
		case 24:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean result_columns_sempred(Result_columnsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean join_clauses_sempred(Join_clausesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0119\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"L\b\u0001\n\u0001\f\u0001O\t\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"S\b\u0001\u000b\u0001\f\u0001T\u0001\u0001\u0005\u0001X\b\u0001\n\u0001"+
		"\f\u0001[\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002d\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004k\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0086\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u008e\b\b\n\b\f\b\u0091\t\b\u0001\t\u0001\t\u0003\t"+
		"\u0095\b\t\u0001\n\u0001\n\u0003\n\u0099\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a0\b\u000b\n\u000b\f\u000b"+
		"\u00a3\t\u000b\u0001\f\u0001\f\u0003\f\u00a7\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00ba\b\u0011\n\u0011\f\u0011\u00bd"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c3"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00cf"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00d4\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00d9\b\u0016\n\u0016"+
		"\f\u0016\u00dc\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00e2\b\u0017\n\u0017\f\u0017\u00e5\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u00f0\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u00f6\b\u0018\n\u0018\f\u0018\u00f9\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0104\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u010e\b\u001e\n\u001e\f\u001e\u0111\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"\u010f\u0003\u0010\u00160!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0002\u0002"+
		"\u0000\r\r\u001c&\u0001\u0000)*\u0117\u0000E\u0001\u0000\u0000\u0000\u0002"+
		"M\u0001\u0000\u0000\u0000\u0004c\u0001\u0000\u0000\u0000\u0006e\u0001"+
		"\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000"+
		"\fx\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000\u0010"+
		"\u0087\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000\u0000\u0000\u0014"+
		"\u0096\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018"+
		"\u00a6\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000\u0000\u0000\u001c"+
		"\u00ab\u0001\u0000\u0000\u0000\u001e\u00b0\u0001\u0000\u0000\u0000 \u00b4"+
		"\u0001\u0000\u0000\u0000\"\u00b6\u0001\u0000\u0000\u0000$\u00be\u0001"+
		"\u0000\u0000\u0000&\u00c4\u0001\u0000\u0000\u0000(\u00ce\u0001\u0000\u0000"+
		"\u0000*\u00d3\u0001\u0000\u0000\u0000,\u00d5\u0001\u0000\u0000\u0000."+
		"\u00dd\u0001\u0000\u0000\u00000\u00ef\u0001\u0000\u0000\u00002\u00fa\u0001"+
		"\u0000\u0000\u00004\u00fd\u0001\u0000\u0000\u00006\u0103\u0001\u0000\u0000"+
		"\u00008\u0105\u0001\u0000\u0000\u0000:\u0107\u0001\u0000\u0000\u0000<"+
		"\u010b\u0001\u0000\u0000\u0000>\u0114\u0001\u0000\u0000\u0000@\u0116\u0001"+
		"\u0000\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0000"+
		"\u0000\u0001I\u0001\u0001\u0000\u0000\u0000JL\u0005-\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000PY\u0003\u0004\u0002\u0000QS\u0005-\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0003\u0004\u0002\u0000WR\u0001"+
		"\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\]\u0005-\u0000\u0000]\u0003\u0001\u0000\u0000\u0000^d\u0003\b"+
		"\u0004\u0000_d\u0003\n\u0005\u0000`d\u0003\f\u0006\u0000ad\u0003\u000e"+
		"\u0007\u0000bd\u0003\u0006\u0003\u0000c^\u0001\u0000\u0000\u0000c_\u0001"+
		"\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000d\u0005\u0001\u0000\u0000\u0000ef\u0005\u0001"+
		"\u0000\u0000f\u0007\u0001\u0000\u0000\u0000gh\u0005\u0002\u0000\u0000"+
		"hj\u0005\u0003\u0000\u0000ik\u0003\u001e\u000f\u0000ji\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0003 \u0010"+
		"\u0000mn\u0005\u0004\u0000\u0000no\u0003\"\u0011\u0000op\u0005\u0005\u0000"+
		"\u0000p\t\u0001\u0000\u0000\u0000qr\u0005\u0006\u0000\u0000rt\u0005\u0003"+
		"\u0000\u0000su\u0003\u001e\u000f\u0000ts\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0003 \u0010\u0000w\u000b"+
		"\u0001\u0000\u0000\u0000xy\u0005\u0007\u0000\u0000yz\u0005\b\u0000\u0000"+
		"z|\u0003 \u0010\u0000{}\u0005\t\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0003,\u0016"+
		"\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080\u0081\u0005\n\u0000\u0000"+
		"\u0081\u0082\u0003\u0010\b\u0000\u0082\u0083\u0005\u000b\u0000\u0000\u0083"+
		"\u0085\u0003\u0014\n\u0000\u0084\u0086\u00032\u0019\u0000\u0085\u0084"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u000f"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0006\b\uffff\uffff\u0000\u0088\u0089"+
		"\u0003\u0012\t\u0000\u0089\u008f\u0001\u0000\u0000\u0000\u008a\u008b\n"+
		"\u0001\u0000\u0000\u008b\u008c\u0005\f\u0000\u0000\u008c\u008e\u0003\u0012"+
		"\t\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0005\r\u0000\u0000\u0093\u0095\u00030\u0018\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u0098\u0003 \u0010\u0000\u0097"+
		"\u0099\u0003\u0016\u000b\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0006\u000b\uffff\uffff\u0000\u009b\u009c\u0003\u0018\f\u0000\u009c"+
		"\u00a1\u0001\u0000\u0000\u0000\u009d\u009e\n\u0002\u0000\u0000\u009e\u00a0"+
		"\u0003\u0018\f\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0003\u001a\r\u0000\u00a5\u00a7\u0003\u001c"+
		"\u000e\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u0019\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\f\u0000"+
		"\u0000\u00a9\u00aa\u0003 \u0010\u0000\u00aa\u001b\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005\u000e\u0000\u0000\u00ac\u00ad\u0003 \u0010\u0000\u00ad"+
		"\u00ae\u0005\u000f\u0000\u0000\u00ae\u00af\u00030\u0018\u0000\u00af\u001d"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0010\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0011\u0000\u0000\u00b2\u00b3\u0005\u0012\u0000\u0000\u00b3\u001f"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003@ \u0000\u00b5!\u0001\u0000"+
		"\u0000\u0000\u00b6\u00bb\u0003$\u0012\u0000\u00b7\u00b8\u0005\f\u0000"+
		"\u0000\u00b8\u00ba\u0003$\u0012\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc#\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0003&\u0013\u0000\u00bf\u00c0"+
		"\u0005\u0013\u0000\u0000\u00c0\u00c2\u0003(\u0014\u0000\u00c1\u00c3\u0003"+
		"*\u0015\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3%\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003@ \u0000"+
		"\u00c5\'\u0001\u0000\u0000\u0000\u00c6\u00cf\u0005\u0014\u0000\u0000\u00c7"+
		"\u00cf\u0005\u0015\u0000\u0000\u00c8\u00c9\u0005\u0016\u0000\u0000\u00c9"+
		"\u00ca\u0005\u0004\u0000\u0000\u00ca\u00cb\u00038\u001c\u0000\u00cb\u00cc"+
		"\u0005\u0005\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cf"+
		"\u0005\u0017\u0000\u0000\u00ce\u00c6\u0001\u0000\u0000\u0000\u00ce\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf)\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0018\u0000\u0000\u00d1\u00d4\u0005\u0019\u0000\u0000\u00d2\u00d4\u0005"+
		"\u001a\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4+\u0001\u0000\u0000\u0000\u00d5\u00da\u0003.\u0017"+
		"\u0000\u00d6\u00d7\u0005\f\u0000\u0000\u00d7\u00d9\u0003.\u0017\u0000"+
		"\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db-\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005\u0004\u0000\u0000\u00de\u00e3\u00036\u001b\u0000\u00df\u00e0"+
		"\u0005\f\u0000\u0000\u00e0\u00e2\u00036\u001b\u0000\u00e1\u00df\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0005\u0000\u0000\u00e7/\u0001\u0000\u0000\u0000\u00e8\u00e9\u0006\u0018"+
		"\uffff\uffff\u0000\u00e9\u00f0\u00036\u001b\u0000\u00ea\u00f0\u0003&\u0013"+
		"\u0000\u00eb\u00ec\u0005\u0004\u0000\u0000\u00ec\u00ed\u00030\u0018\u0000"+
		"\u00ed\u00ee\u0005\u0005\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ef\u00e8\u0001\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ef\u00eb\u0001\u0000\u0000\u0000\u00f0\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\n\u0001\u0000\u0000\u00f2\u00f3\u00034\u001a\u0000\u00f3"+
		"\u00f4\u00030\u0018\u0002\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f81\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u001b\u0000\u0000\u00fb\u00fc\u00030\u0018\u0000\u00fc3\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0007\u0000\u0000\u0000\u00fe5\u0001\u0000\u0000\u0000"+
		"\u00ff\u0104\u00038\u001c\u0000\u0100\u0104\u0003:\u001d\u0000\u0101\u0104"+
		"\u0003<\u001e\u0000\u0102\u0104\u0003>\u001f\u0000\u0103\u00ff\u0001\u0000"+
		"\u0000\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u01047\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0005+\u0000\u0000\u01069\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0005+\u0000\u0000\u0108\u0109\u0005\'\u0000\u0000\u0109\u010a"+
		"\u0005+\u0000\u0000\u010a;\u0001\u0000\u0000\u0000\u010b\u010f\u0005("+
		"\u0000\u0000\u010c\u010e\t\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005(\u0000\u0000"+
		"\u0113=\u0001\u0000\u0000\u0000\u0114\u0115\u0007\u0001\u0000\u0000\u0115"+
		"?\u0001\u0000\u0000\u0000\u0116\u0117\u0005,\u0000\u0000\u0117A\u0001"+
		"\u0000\u0000\u0000\u0018EMTYcjt|\u0085\u008f\u0094\u0098\u00a1\u00a6\u00bb"+
		"\u00c2\u00ce\u00d3\u00da\u00e3\u00ef\u00f7\u0103\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}