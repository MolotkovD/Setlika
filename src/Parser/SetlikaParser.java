package Parser;// Generated from c://Users//user//Desktop//antlr//Setlika.g4 by ANTLR 4.13.1
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
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, ABORT_=25, 
		ACTION_=26, ADD_=27, AFTER_=28, ALL_=29, ALTER_=30, ANALYZE_=31, AND_=32, 
		AS_=33, ASC_=34, ATTACH_=35, AUTOINCREMENT_=36, BEFORE_=37, BEGIN_=38, 
		BETWEEN_=39, BY_=40, CASCADE_=41, CASE_=42, CAST_=43, CHECK_=44, COLLATE_=45, 
		COLUMN_=46, COMMIT_=47, CONFLICT_=48, CONSTRAINT_=49, CREATE_=50, CROSS_=51, 
		CURRENT_DATE_=52, CURRENT_TIME_=53, CURRENT_TIMESTAMP_=54, DATABASE_=55, 
		DEFAULT_=56, DEFERRABLE_=57, DEFERRED_=58, DELETE_=59, DESC_=60, DETACH_=61, 
		DISTINCT_=62, DROP_=63, EACH_=64, ELSE_=65, END_=66, ESCAPE_=67, EXCEPT_=68, 
		EXCLUSIVE_=69, EXISTS_=70, EXPLAIN_=71, FAIL_=72, FOR_=73, FOREIGN_=74, 
		FROM_=75, FULL_=76, GLOB_=77, GROUP_=78, HAVING_=79, IF_=80, IGNORE_=81, 
		IMMEDIATE_=82, IN_=83, INDEX_=84, INDEXED_=85, INITIALLY_=86, INNER_=87, 
		INSERT_=88, INSTEAD_=89, INTERSECT_=90, INTO_=91, IS_=92, ISNULL_=93, 
		JOIN_=94, KEY_=95, LEFT_=96, LIKE_=97, LIMIT_=98, MATCH_=99, NATURAL_=100, 
		NO_=101, NOT_=102, NOTNULL_=103, NULL_=104, OF_=105, OFFSET_=106, ON_=107, 
		OR_=108, ORDER_=109, OUTER_=110, PLAN_=111, PRAGMA_=112, PRIMARY_=113, 
		QUERY_=114, RAISE_=115, RECURSIVE_=116, REFERENCES_=117, REGEXP_=118, 
		REINDEX_=119, RELEASE_=120, RENAME_=121, REPLACE_=122, RESTRICT_=123, 
		RETURNING_=124, RIGHT_=125, ROLLBACK_=126, ROW_=127, ROWS_=128, SAVEPOINT_=129, 
		SELECT_=130, SET_=131, TABLE_=132, TEMP_=133, TEMPORARY_=134, THEN_=135, 
		TO_=136, TRANSACTION_=137, TRIGGER_=138, UNION_=139, UNIQUE_=140, UPDATE_=141, 
		USING_=142, VACUUM_=143, VALUES_=144, VIEW_=145, VIRTUAL_=146, WHEN_=147, 
		WHERE_=148, WITH_=149, WITHOUT_=150, FIRST_VALUE_=151, OVER_=152, PARTITION_=153, 
		RANGE_=154, PRECEDING_=155, UNBOUNDED_=156, CURRENT_=157, FOLLOWING_=158, 
		CUME_DIST_=159, DENSE_RANK_=160, LAG_=161, LAST_VALUE_=162, LEAD_=163, 
		NTH_VALUE_=164, NTILE_=165, PERCENT_RANK_=166, RANK_=167, ROW_NUMBER_=168, 
		GENERATED_=169, ALWAYS_=170, STORED_=171, TRUE_=172, FALSE_=173, WINDOW_=174, 
		NULLS_=175, FIRST_=176, LAST_=177, FILTER_=178, GROUPS_=179, EXCLUDE_=180, 
		TIES_=181, OTHERS_=182, DO_=183, NOTHING_=184, IDENTIFIER=185, NUMERIC_LITERAL=186, 
		BIND_PARAMETER=187, STRING_LITERAL=188, BLOB_LITERAL=189, SINGLE_LINE_COMMENT=190, 
		MULTILINE_COMMENT=191, SPACES=192, UNEXPECTED_CHAR=193;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_sql_stmt = 2, RULE_alter_table_stmt = 3, 
		RULE_indexed_column = 4, RULE_create_table_stmt = 5, RULE_column_def = 6, 
		RULE_type_name = 7, RULE_column_constraint = 8, RULE_signed_number = 9, 
		RULE_table_constraint = 10, RULE_foreign_key_clause = 11, RULE_conflict_clause = 12, 
		RULE_with_clause = 13, RULE_cte_table_name = 14, RULE_recursive_cte = 15, 
		RULE_common_table_expression = 16, RULE_delete_stmt = 17, RULE_drop_stmt = 18, 
		RULE_expr = 19, RULE_raise_function = 20, RULE_literal_value = 21, RULE_value_row = 22, 
		RULE_values_clause = 23, RULE_insert_stmt = 24, RULE_returning_clause = 25, 
		RULE_upsert_clause = 26, RULE_pragma_value = 27, RULE_select_stmt = 28, 
		RULE_join_clause = 29, RULE_select_core = 30, RULE_table_or_subquery = 31, 
		RULE_result_column = 32, RULE_join_operator = 33, RULE_join_constraint = 34, 
		RULE_compound_operator = 35, RULE_update_stmt = 36, RULE_column_name_list = 37, 
		RULE_qualified_table_name = 38, RULE_vacuum_stmt = 39, RULE_filter_clause = 40, 
		RULE_window_defn = 41, RULE_over_clause = 42, RULE_frame_spec = 43, RULE_frame_clause = 44, 
		RULE_simple_function_invocation = 45, RULE_aggregate_function_invocation = 46, 
		RULE_window_function_invocation = 47, RULE_common_table_stmt = 48, RULE_order_by_stmt = 49, 
		RULE_limit_stmt = 50, RULE_ordering_term = 51, RULE_asc_desc = 52, RULE_frame_left = 53, 
		RULE_frame_right = 54, RULE_frame_single = 55, RULE_window_function = 56, 
		RULE_offset = 57, RULE_default_value = 58, RULE_partition_by = 59, RULE_order_by_expr = 60, 
		RULE_order_by_expr_asc_desc = 61, RULE_expr_asc_desc = 62, RULE_initial_select = 63, 
		RULE_recursive_select = 64, RULE_unary_operator = 65, RULE_error_message = 66, 
		RULE_module_argument = 67, RULE_column_alias = 68, RULE_keyword = 69, 
		RULE_name = 70, RULE_function_name = 71, RULE_schema_name = 72, RULE_table_name = 73, 
		RULE_table_or_index_name = 74, RULE_column_name = 75, RULE_collation_name = 76, 
		RULE_foreign_table = 77, RULE_index_name = 78, RULE_trigger_name = 79, 
		RULE_view_name = 80, RULE_module_name = 81, RULE_pragma_name = 82, RULE_savepoint_name = 83, 
		RULE_table_alias = 84, RULE_transaction_name = 85, RULE_window_name = 86, 
		RULE_alias = 87, RULE_filename = 88, RULE_base_window_name = 89, RULE_simple_func = 90, 
		RULE_aggregate_func = 91, RULE_table_function_name = 92, RULE_any_name = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "indexed_column", 
			"create_table_stmt", "column_def", "type_name", "column_constraint", 
			"signed_number", "table_constraint", "foreign_key_clause", "conflict_clause", 
			"with_clause", "cte_table_name", "recursive_cte", "common_table_expression", 
			"delete_stmt", "drop_stmt", "expr", "raise_function", "literal_value", 
			"value_row", "values_clause", "insert_stmt", "returning_clause", "upsert_clause", 
			"pragma_value", "select_stmt", "join_clause", "select_core", "table_or_subquery", 
			"result_column", "join_operator", "join_constraint", "compound_operator", 
			"update_stmt", "column_name_list", "qualified_table_name", "vacuum_stmt", 
			"filter_clause", "window_defn", "over_clause", "frame_spec", "frame_clause", 
			"simple_function_invocation", "aggregate_function_invocation", "window_function_invocation", 
			"common_table_stmt", "order_by_stmt", "limit_stmt", "ordering_term", 
			"asc_desc", "frame_left", "frame_right", "frame_single", "window_function", 
			"offset", "default_value", "partition_by", "order_by_expr", "order_by_expr_asc_desc", 
			"expr_asc_desc", "initial_select", "recursive_select", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "name", 
			"function_name", "schema_name", "table_name", "table_or_index_name", 
			"column_name", "collation_name", "foreign_table", "index_name", "trigger_name", 
			"view_name", "module_name", "pragma_name", "savepoint_name", "table_alias", 
			"transaction_name", "window_name", "alias", "filename", "base_window_name", 
			"simple_func", "aggregate_func", "table_function_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'", "'ABORT'", "'ACTION'", "'ADD'", 
			"'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'AS'", "'ASC'", 
			"'ATTACH'", "'AUTOINCREMENT'", "'BEFORE'", "'BEGIN'", "'BETWEEN'", "'BY'", 
			"'CASCADE'", "'CASE'", "'CAST'", "'CHECK'", "'COLLATE'", "'COLUMN'", 
			"'COMMIT'", "'CONFLICT'", "'CONSTRAINT'", "'CREATE'", "'CROSS'", "'CURRENT_DATE'", 
			"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'DATABASE'", "'DEFAULT'", "'DEFERRABLE'", 
			"'DEFERRED'", "'DELETE'", "'DESC'", "'DETACH'", "'DISTINCT'", "'DROP'", 
			"'EACH'", "'ELSE'", "'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUSIVE'", "'EXISTS'", 
			"'EXPLAIN'", "'FAIL'", "'FOR'", "'FOREIGN'", "'FROM'", "'FULL'", "'GLOB'", 
			"'GROUP'", "'HAVING'", "'IF'", "'IGNORE'", "'IMMEDIATE'", "'IN'", "'INDEX'", 
			"'INDEXED'", "'INITIALLY'", "'INNER'", "'INSERT'", "'INSTEAD'", "'INTERSECT'", 
			"'INTO'", "'IS'", "'ISNULL'", "'JOIN'", "'KEY'", "'LEFT'", "'LIKE'", 
			"'LIMIT'", "'MATCH'", "'NATURAL'", "'NO'", "'NOT'", "'NOTNULL'", "'NULL'", 
			"'OF'", "'OFFSET'", "'ON'", "'OR'", "'ORDER'", "'OUTER'", "'PLAN'", "'PRAGMA'", 
			"'PRIMARY'", "'QUERY'", "'RAISE'", "'RECURSIVE'", "'REFERENCES'", "'REGEXP'", 
			"'REINDEX'", "'RELEASE'", "'RENAME'", "'REPLACE'", "'RESTRICT'", "'RETURNING'", 
			"'RIGHT'", "'ROLLBACK'", "'ROW'", "'ROWS'", "'SAVEPOINT'", "'SELECT'", 
			"'SET'", "'TABLE'", "'TEMP'", "'TEMPORARY'", "'THEN'", "'TO'", "'TRANSACTION'", 
			"'TRIGGER'", "'UNION'", "'UNIQUE'", "'UPDATE'", "'USING'", "'VACUUM'", 
			"'VALUES'", "'VIEW'", "'VIRTUAL'", "'WHEN'", "'WHERE'", "'WITH'", "'WITHOUT'", 
			"'FIRST_VALUE'", "'OVER'", "'PARTITION'", "'RANGE'", "'PRECEDING'", "'UNBOUNDED'", 
			"'CURRENT'", "'FOLLOWING'", "'CUME_DIST'", "'DENSE_RANK'", "'LAG'", "'LAST_VALUE'", 
			"'LEAD'", "'NTH_VALUE'", "'NTILE'", "'PERCENT_RANK'", "'RANK'", "'ROW_NUMBER'", 
			"'GENERATED'", "'ALWAYS'", "'STORED'", "'TRUE'", "'FALSE'", "'WINDOW'", 
			"'NULLS'", "'FIRST'", "'LAST'", "'FILTER'", "'GROUPS'", "'EXCLUDE'", 
			"'TIES'", "'OTHERS'", "'DO'", "'NOTHING'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "ABORT_", 
			"ACTION_", "ADD_", "AFTER_", "ALL_", "ALTER_", "ANALYZE_", "AND_", "AS_", 
			"ASC_", "ATTACH_", "AUTOINCREMENT_", "BEFORE_", "BEGIN_", "BETWEEN_", 
			"BY_", "CASCADE_", "CASE_", "CAST_", "CHECK_", "COLLATE_", "COLUMN_", 
			"COMMIT_", "CONFLICT_", "CONSTRAINT_", "CREATE_", "CROSS_", "CURRENT_DATE_", 
			"CURRENT_TIME_", "CURRENT_TIMESTAMP_", "DATABASE_", "DEFAULT_", "DEFERRABLE_", 
			"DEFERRED_", "DELETE_", "DESC_", "DETACH_", "DISTINCT_", "DROP_", "EACH_", 
			"ELSE_", "END_", "ESCAPE_", "EXCEPT_", "EXCLUSIVE_", "EXISTS_", "EXPLAIN_", 
			"FAIL_", "FOR_", "FOREIGN_", "FROM_", "FULL_", "GLOB_", "GROUP_", "HAVING_", 
			"IF_", "IGNORE_", "IMMEDIATE_", "IN_", "INDEX_", "INDEXED_", "INITIALLY_", 
			"INNER_", "INSERT_", "INSTEAD_", "INTERSECT_", "INTO_", "IS_", "ISNULL_", 
			"JOIN_", "KEY_", "LEFT_", "LIKE_", "LIMIT_", "MATCH_", "NATURAL_", "NO_", 
			"NOT_", "NOTNULL_", "NULL_", "OF_", "OFFSET_", "ON_", "OR_", "ORDER_", 
			"OUTER_", "PLAN_", "PRAGMA_", "PRIMARY_", "QUERY_", "RAISE_", "RECURSIVE_", 
			"REFERENCES_", "REGEXP_", "REINDEX_", "RELEASE_", "RENAME_", "REPLACE_", 
			"RESTRICT_", "RETURNING_", "RIGHT_", "ROLLBACK_", "ROW_", "ROWS_", "SAVEPOINT_", 
			"SELECT_", "SET_", "TABLE_", "TEMP_", "TEMPORARY_", "THEN_", "TO_", "TRANSACTION_", 
			"TRIGGER_", "UNION_", "UNIQUE_", "UPDATE_", "USING_", "VACUUM_", "VALUES_", 
			"VIEW_", "VIRTUAL_", "WHEN_", "WHERE_", "WITH_", "WITHOUT_", "FIRST_VALUE_", 
			"OVER_", "PARTITION_", "RANGE_", "PRECEDING_", "UNBOUNDED_", "CURRENT_", 
			"FOLLOWING_", "CUME_DIST_", "DENSE_RANK_", "LAG_", "LAST_VALUE_", "LEAD_", 
			"NTH_VALUE_", "NTILE_", "PERCENT_RANK_", "RANK_", "ROW_NUMBER_", "GENERATED_", 
			"ALWAYS_", "STORED_", "TRUE_", "FALSE_", "WINDOW_", "NULLS_", "FIRST_", 
			"LAST_", "FILTER_", "GROUPS_", "EXCLUDE_", "TIES_", "OTHERS_", "DO_", 
			"NOTHING_", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
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
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SetlikaParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8645785383570767870L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 578712552117239809L) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & 269L) != 0)) {
				{
				{
				setState(188);
				sql_stmt_list();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
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
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SetlikaParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SetlikaParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(196);
				match(SCOL);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			sql_stmt();
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(203);
						match(SCOL);
						}
						}
						setState(206); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(208);
					sql_stmt();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					match(SCOL);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
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
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode EXPLAIN_() { return getToken(SetlikaParser.EXPLAIN_, 0); }
		public TerminalNode QUERY_() { return getToken(SetlikaParser.QUERY_, 0); }
		public TerminalNode PLAN_() { return getToken(SetlikaParser.PLAN_, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPLAIN_) {
				{
				setState(220);
				match(EXPLAIN_);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY_) {
					{
					setState(221);
					match(QUERY_);
					setState(222);
					match(PLAN_);
					}
				}

				}
			}

			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(227);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(228);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(229);
				delete_stmt();
				}
				break;
			case 4:
				{
				setState(230);
				drop_stmt();
				}
				break;
			case 5:
				{
				setState(231);
				insert_stmt();
				}
				break;
			case 6:
				{
				setState(232);
				select_stmt();
				}
				break;
			case 7:
				{
				setState(233);
				update_stmt();
				}
				break;
			case 8:
				{
				setState(234);
				vacuum_stmt();
				}
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
	public static class Alter_table_stmtContext extends ParserRuleContext {
		public Table_nameContext new_table_name;
		public Column_nameContext old_column_name;
		public Column_nameContext new_column_name;
		public TerminalNode ALTER_() { return getToken(SetlikaParser.ALTER_, 0); }
		public TerminalNode TABLE_() { return getToken(SetlikaParser.TABLE_, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode RENAME_() { return getToken(SetlikaParser.RENAME_, 0); }
		public TerminalNode ADD_() { return getToken(SetlikaParser.ADD_, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode DROP_() { return getToken(SetlikaParser.DROP_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode TO_() { return getToken(SetlikaParser.TO_, 0); }
		public TerminalNode COLUMN_() { return getToken(SetlikaParser.COLUMN_, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ALTER_);
			setState(238);
			match(TABLE_);
			setState(239);
			table_name();
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME_:
				{
				setState(240);
				match(RENAME_);
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(241);
					match(TO_);
					setState(242);
					((Alter_table_stmtContext)_localctx).new_table_name = table_name();
					}
					break;
				case 2:
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(243);
						match(COLUMN_);
						}
						break;
					}
					setState(246);
					((Alter_table_stmtContext)_localctx).old_column_name = column_name();
					setState(247);
					match(TO_);
					setState(248);
					((Alter_table_stmtContext)_localctx).new_column_name = column_name();
					}
					break;
				}
				}
				break;
			case ADD_:
				{
				setState(252);
				match(ADD_);
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(253);
					match(COLUMN_);
					}
					break;
				}
				setState(256);
				column_def();
				}
				break;
			case DROP_:
				{
				setState(257);
				match(DROP_);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(258);
					match(COLUMN_);
					}
					break;
				}
				setState(261);
				column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SetlikaParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(264);
				column_name();
				}
				break;
			case 2:
				{
				setState(265);
				expr(0);
				}
				break;
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(268);
				match(COLLATE_);
				setState(269);
				collation_name();
				}
			}

			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(272);
				asc_desc();
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
	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SetlikaParser.CREATE_, 0); }
		public TerminalNode TABLE_() { return getToken(SetlikaParser.TABLE_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public TerminalNode IF_() { return getToken(SetlikaParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SetlikaParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SetlikaParser.EXISTS_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(CREATE_);
			setState(276);
			match(TABLE_);
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(277);
				match(IF_);
				setState(278);
				match(NOT_);
				setState(279);
				match(EXISTS_);
				}
				break;
			}
			setState(282);
			table_name();
			setState(283);
			match(OPEN_PAR);
			setState(284);
			column_def();
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(285);
					match(COMMA);
					setState(286);
					column_def();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292);
				match(COMMA);
				setState(293);
				table_constraint();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(CLOSE_PAR);
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
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			column_name();
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(302);
				type_name();
				}
				break;
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72673329139417088L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 274877941765L) != 0) || _la==GENERATED_) {
				{
				{
				setState(305);
				column_constraint();
				}
				}
				setState(310);
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
	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SetlikaParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(311);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(314); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(316);
				match(OPEN_PAR);
				setState(317);
				signed_number();
				setState(318);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(320);
				match(OPEN_PAR);
				setState(321);
				signed_number();
				setState(322);
				match(COMMA);
				setState(323);
				signed_number();
				setState(324);
				match(CLOSE_PAR);
				}
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
	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK_() { return getToken(SetlikaParser.CHECK_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public TerminalNode DEFAULT_() { return getToken(SetlikaParser.DEFAULT_, 0); }
		public TerminalNode COLLATE_() { return getToken(SetlikaParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SetlikaParser.AS_, 0); }
		public TerminalNode CONSTRAINT_() { return getToken(SetlikaParser.CONSTRAINT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(SetlikaParser.PRIMARY_, 0); }
		public TerminalNode KEY_() { return getToken(SetlikaParser.KEY_, 0); }
		public TerminalNode NULL_() { return getToken(SetlikaParser.NULL_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SetlikaParser.UNIQUE_, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode GENERATED_() { return getToken(SetlikaParser.GENERATED_, 0); }
		public TerminalNode ALWAYS_() { return getToken(SetlikaParser.ALWAYS_, 0); }
		public TerminalNode STORED_() { return getToken(SetlikaParser.STORED_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SetlikaParser.VIRTUAL_, 0); }
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode AUTOINCREMENT_() { return getToken(SetlikaParser.AUTOINCREMENT_, 0); }
		public TerminalNode NOT_() { return getToken(SetlikaParser.NOT_, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(328);
				match(CONSTRAINT_);
				setState(329);
				name();
				}
			}

			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
				{
				{
				setState(332);
				match(PRIMARY_);
				setState(333);
				match(KEY_);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC_ || _la==DESC_) {
					{
					setState(334);
					asc_desc();
					}
				}

				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(337);
					conflict_clause();
					}
				}

				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTOINCREMENT_) {
					{
					setState(340);
					match(AUTOINCREMENT_);
					}
				}

				}
				}
				break;
			case NOT_:
			case NULL_:
			case UNIQUE_:
				{
				setState(348);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT_:
				case NULL_:
					{
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(343);
						match(NOT_);
						}
					}

					setState(346);
					match(NULL_);
					}
					break;
				case UNIQUE_:
					{
					setState(347);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(350);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(353);
				match(CHECK_);
				setState(354);
				match(OPEN_PAR);
				setState(355);
				expr(0);
				setState(356);
				match(CLOSE_PAR);
				}
				break;
			case DEFAULT_:
				{
				setState(358);
				match(DEFAULT_);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(359);
					signed_number();
					}
					break;
				case 2:
					{
					setState(360);
					literal_value();
					}
					break;
				case 3:
					{
					setState(361);
					match(OPEN_PAR);
					setState(362);
					expr(0);
					setState(363);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case COLLATE_:
				{
				setState(367);
				match(COLLATE_);
				setState(368);
				collation_name();
				}
				break;
			case REFERENCES_:
				{
				setState(369);
				foreign_key_clause();
				}
				break;
			case AS_:
			case GENERATED_:
				{
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERATED_) {
					{
					setState(370);
					match(GENERATED_);
					setState(371);
					match(ALWAYS_);
					}
				}

				setState(374);
				match(AS_);
				setState(375);
				match(OPEN_PAR);
				setState(376);
				expr(0);
				setState(377);
				match(CLOSE_PAR);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRTUAL_ || _la==STORED_) {
					{
					setState(378);
					_la = _input.LA(1);
					if ( !(_la==VIRTUAL_ || _la==STORED_) ) {
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
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SetlikaParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SetlikaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SetlikaParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(383);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(386);
			match(NUMERIC_LITERAL);
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
	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public TerminalNode CHECK_() { return getToken(SetlikaParser.CHECK_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FOREIGN_() { return getToken(SetlikaParser.FOREIGN_, 0); }
		public TerminalNode KEY_() { return getToken(SetlikaParser.KEY_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode CONSTRAINT_() { return getToken(SetlikaParser.CONSTRAINT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(SetlikaParser.PRIMARY_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SetlikaParser.UNIQUE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(388);
				match(CONSTRAINT_);
				setState(389);
				name();
				}
			}

			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
			case UNIQUE_:
				{
				setState(395);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY_:
					{
					setState(392);
					match(PRIMARY_);
					setState(393);
					match(KEY_);
					}
					break;
				case UNIQUE_:
					{
					setState(394);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(397);
				match(OPEN_PAR);
				setState(398);
				indexed_column();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(399);
					match(COMMA);
					setState(400);
					indexed_column();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(CLOSE_PAR);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(407);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(410);
				match(CHECK_);
				setState(411);
				match(OPEN_PAR);
				setState(412);
				expr(0);
				setState(413);
				match(CLOSE_PAR);
				}
				break;
			case FOREIGN_:
				{
				setState(415);
				match(FOREIGN_);
				setState(416);
				match(KEY_);
				setState(417);
				match(OPEN_PAR);
				setState(418);
				column_name();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(419);
					match(COMMA);
					setState(420);
					column_name();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426);
				match(CLOSE_PAR);
				setState(427);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES_() { return getToken(SetlikaParser.REFERENCES_, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ON_() { return getTokens(SetlikaParser.ON_); }
		public TerminalNode ON_(int i) {
			return getToken(SetlikaParser.ON_, i);
		}
		public List<TerminalNode> MATCH_() { return getTokens(SetlikaParser.MATCH_); }
		public TerminalNode MATCH_(int i) {
			return getToken(SetlikaParser.MATCH_, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode DEFERRABLE_() { return getToken(SetlikaParser.DEFERRABLE_, 0); }
		public List<TerminalNode> DELETE_() { return getTokens(SetlikaParser.DELETE_); }
		public TerminalNode DELETE_(int i) {
			return getToken(SetlikaParser.DELETE_, i);
		}
		public List<TerminalNode> UPDATE_() { return getTokens(SetlikaParser.UPDATE_); }
		public TerminalNode UPDATE_(int i) {
			return getToken(SetlikaParser.UPDATE_, i);
		}
		public List<TerminalNode> SET_() { return getTokens(SetlikaParser.SET_); }
		public TerminalNode SET_(int i) {
			return getToken(SetlikaParser.SET_, i);
		}
		public List<TerminalNode> CASCADE_() { return getTokens(SetlikaParser.CASCADE_); }
		public TerminalNode CASCADE_(int i) {
			return getToken(SetlikaParser.CASCADE_, i);
		}
		public List<TerminalNode> RESTRICT_() { return getTokens(SetlikaParser.RESTRICT_); }
		public TerminalNode RESTRICT_(int i) {
			return getToken(SetlikaParser.RESTRICT_, i);
		}
		public List<TerminalNode> NO_() { return getTokens(SetlikaParser.NO_); }
		public TerminalNode NO_(int i) {
			return getToken(SetlikaParser.NO_, i);
		}
		public List<TerminalNode> ACTION_() { return getTokens(SetlikaParser.ACTION_); }
		public TerminalNode ACTION_(int i) {
			return getToken(SetlikaParser.ACTION_, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public List<TerminalNode> NULL_() { return getTokens(SetlikaParser.NULL_); }
		public TerminalNode NULL_(int i) {
			return getToken(SetlikaParser.NULL_, i);
		}
		public List<TerminalNode> DEFAULT_() { return getTokens(SetlikaParser.DEFAULT_); }
		public TerminalNode DEFAULT_(int i) {
			return getToken(SetlikaParser.DEFAULT_, i);
		}
		public TerminalNode NOT_() { return getToken(SetlikaParser.NOT_, 0); }
		public TerminalNode INITIALLY_() { return getToken(SetlikaParser.INITIALLY_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SetlikaParser.DEFERRED_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SetlikaParser.IMMEDIATE_, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(REFERENCES_);
			setState(432);
			foreign_table();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(433);
				match(OPEN_PAR);
				setState(434);
				column_name();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(435);
					match(COMMA);
					setState(436);
					column_name();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
				match(CLOSE_PAR);
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCH_ || _la==ON_) {
				{
				setState(458);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON_:
					{
					setState(446);
					match(ON_);
					setState(447);
					_la = _input.LA(1);
					if ( !(_la==DELETE_ || _la==UPDATE_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(454);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SET_:
						{
						setState(448);
						match(SET_);
						setState(449);
						_la = _input.LA(1);
						if ( !(_la==DEFAULT_ || _la==NULL_) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case CASCADE_:
						{
						setState(450);
						match(CASCADE_);
						}
						break;
					case RESTRICT_:
						{
						setState(451);
						match(RESTRICT_);
						}
						break;
					case NO_:
						{
						setState(452);
						match(NO_);
						setState(453);
						match(ACTION_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case MATCH_:
					{
					setState(456);
					match(MATCH_);
					setState(457);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_) {
					{
					setState(463);
					match(NOT_);
					}
				}

				setState(466);
				match(DEFERRABLE_);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIALLY_) {
					{
					setState(467);
					match(INITIALLY_);
					setState(468);
					_la = _input.LA(1);
					if ( !(_la==DEFERRED_ || _la==IMMEDIATE_) ) {
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
	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SetlikaParser.ON_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SetlikaParser.CONFLICT_, 0); }
		public TerminalNode ROLLBACK_() { return getToken(SetlikaParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SetlikaParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SetlikaParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SetlikaParser.IGNORE_, 0); }
		public TerminalNode REPLACE_() { return getToken(SetlikaParser.REPLACE_, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(ON_);
			setState(474);
			match(CONFLICT_);
			setState(475);
			_la = _input.LA(1);
			if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
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
	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode WITH_() { return getToken(SetlikaParser.WITH_, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> AS_() { return getTokens(SetlikaParser.AS_); }
		public TerminalNode AS_(int i) {
			return getToken(SetlikaParser.AS_, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SetlikaParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SetlikaParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SetlikaParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SetlikaParser.CLOSE_PAR, i);
		}
		public TerminalNode RECURSIVE_() { return getToken(SetlikaParser.RECURSIVE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(WITH_);
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(478);
				match(RECURSIVE_);
				}
				break;
			}
			setState(481);
			cte_table_name();
			setState(482);
			match(AS_);
			setState(483);
			match(OPEN_PAR);
			setState(484);
			select_stmt();
			setState(485);
			match(CLOSE_PAR);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(486);
				match(COMMA);
				setState(487);
				cte_table_name();
				setState(488);
				match(AS_);
				setState(489);
				match(OPEN_PAR);
				setState(490);
				select_stmt();
				setState(491);
				match(CLOSE_PAR);
				}
				}
				setState(497);
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
	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			table_name();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(499);
				match(OPEN_PAR);
				setState(500);
				column_name();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(501);
					match(COMMA);
					setState(502);
					column_name();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(508);
				match(CLOSE_PAR);
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
	public static class Recursive_cteContext extends ParserRuleContext {
		public Cte_table_nameContext cte_table_name() {
			return getRuleContext(Cte_table_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SetlikaParser.AS_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public Initial_selectContext initial_select() {
			return getRuleContext(Initial_selectContext.class,0);
		}
		public TerminalNode UNION_() { return getToken(SetlikaParser.UNION_, 0); }
		public Recursive_selectContext recursive_select() {
			return getRuleContext(Recursive_selectContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public TerminalNode ALL_() { return getToken(SetlikaParser.ALL_, 0); }
		public Recursive_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_cte; }
	}

	public final Recursive_cteContext recursive_cte() throws RecognitionException {
		Recursive_cteContext _localctx = new Recursive_cteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_recursive_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			cte_table_name();
			setState(513);
			match(AS_);
			setState(514);
			match(OPEN_PAR);
			setState(515);
			initial_select();
			setState(516);
			match(UNION_);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL_) {
				{
				setState(517);
				match(ALL_);
				}
			}

			setState(520);
			recursive_select();
			setState(521);
			match(CLOSE_PAR);
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
	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SetlikaParser.AS_, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SetlikaParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SetlikaParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SetlikaParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SetlikaParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			table_name();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(524);
				match(OPEN_PAR);
				setState(525);
				column_name();
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(526);
					match(COMMA);
					setState(527);
					column_name();
					}
					}
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(533);
				match(CLOSE_PAR);
				}
			}

			setState(537);
			match(AS_);
			setState(538);
			match(OPEN_PAR);
			setState(539);
			select_stmt();
			setState(540);
			match(CLOSE_PAR);
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
	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode DELETE_() { return getToken(SetlikaParser.DELETE_, 0); }
		public TerminalNode FROM_() { return getToken(SetlikaParser.FROM_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode WHERE_() { return getToken(SetlikaParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(542);
				with_clause();
				}
			}

			setState(545);
			match(DELETE_);
			setState(546);
			match(FROM_);
			setState(547);
			qualified_table_name();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(548);
				match(WHERE_);
				setState(549);
				expr(0);
				}
			}

			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(552);
				returning_clause();
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
	public static class Drop_stmtContext extends ParserRuleContext {
		public Token object;
		public TerminalNode DROP_() { return getToken(SetlikaParser.DROP_, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode INDEX_() { return getToken(SetlikaParser.INDEX_, 0); }
		public TerminalNode TABLE_() { return getToken(SetlikaParser.TABLE_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SetlikaParser.TRIGGER_, 0); }
		public TerminalNode VIEW_() { return getToken(SetlikaParser.VIEW_, 0); }
		public TerminalNode IF_() { return getToken(SetlikaParser.IF_, 0); }
		public TerminalNode EXISTS_() { return getToken(SetlikaParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SetlikaParser.DOT, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(DROP_);
			setState(556);
			((Drop_stmtContext)_localctx).object = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2324138882699886593L) != 0)) ) {
				((Drop_stmtContext)_localctx).object = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(557);
				match(IF_);
				setState(558);
				match(EXISTS_);
				}
				break;
			}
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(561);
				schema_name();
				setState(562);
				match(DOT);
				}
				break;
			}
			setState(566);
			any_name();
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
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SetlikaParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SetlikaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SetlikaParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SetlikaParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SetlikaParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public TerminalNode CAST_() { return getToken(SetlikaParser.CAST_, 0); }
		public TerminalNode AS_() { return getToken(SetlikaParser.AS_, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode EXISTS_() { return getToken(SetlikaParser.EXISTS_, 0); }
		public TerminalNode NOT_() { return getToken(SetlikaParser.NOT_, 0); }
		public TerminalNode CASE_() { return getToken(SetlikaParser.CASE_, 0); }
		public TerminalNode END_() { return getToken(SetlikaParser.END_, 0); }
		public List<TerminalNode> WHEN_() { return getTokens(SetlikaParser.WHEN_); }
		public TerminalNode WHEN_(int i) {
			return getToken(SetlikaParser.WHEN_, i);
		}
		public List<TerminalNode> THEN_() { return getTokens(SetlikaParser.THEN_); }
		public TerminalNode THEN_(int i) {
			return getToken(SetlikaParser.THEN_, i);
		}
		public TerminalNode ELSE_() { return getToken(SetlikaParser.ELSE_, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SetlikaParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SetlikaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SetlikaParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SetlikaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SetlikaParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SetlikaParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SetlikaParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SetlikaParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SetlikaParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SetlikaParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SetlikaParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SetlikaParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SetlikaParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SetlikaParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SetlikaParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SetlikaParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SetlikaParser.NOT_EQ2, 0); }
		public TerminalNode IS_() { return getToken(SetlikaParser.IS_, 0); }
		public TerminalNode IN_() { return getToken(SetlikaParser.IN_, 0); }
		public TerminalNode LIKE_() { return getToken(SetlikaParser.LIKE_, 0); }
		public TerminalNode GLOB_() { return getToken(SetlikaParser.GLOB_, 0); }
		public TerminalNode MATCH_() { return getToken(SetlikaParser.MATCH_, 0); }
		public TerminalNode REGEXP_() { return getToken(SetlikaParser.REGEXP_, 0); }
		public TerminalNode AND_() { return getToken(SetlikaParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(SetlikaParser.OR_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SetlikaParser.BETWEEN_, 0); }
		public TerminalNode COLLATE_() { return getToken(SetlikaParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode ESCAPE_() { return getToken(SetlikaParser.ESCAPE_, 0); }
		public TerminalNode ISNULL_() { return getToken(SetlikaParser.ISNULL_, 0); }
		public TerminalNode NOTNULL_() { return getToken(SetlikaParser.NOTNULL_, 0); }
		public TerminalNode NULL_() { return getToken(SetlikaParser.NULL_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(569);
				literal_value();
				}
				break;
			case 2:
				{
				setState(570);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(574);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(571);
						schema_name();
						setState(572);
						match(DOT);
						}
						break;
					}
					setState(576);
					table_name();
					setState(577);
					match(DOT);
					}
					break;
				}
				setState(581);
				column_name();
				}
				break;
			case 4:
				{
				setState(582);
				unary_operator();
				setState(583);
				expr(21);
				}
				break;
			case 5:
				{
				setState(585);
				function_name();
				setState(586);
				match(OPEN_PAR);
				setState(599);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case ABORT_:
				case ACTION_:
				case ADD_:
				case AFTER_:
				case ALL_:
				case ALTER_:
				case ANALYZE_:
				case AND_:
				case AS_:
				case ASC_:
				case ATTACH_:
				case AUTOINCREMENT_:
				case BEFORE_:
				case BEGIN_:
				case BETWEEN_:
				case BY_:
				case CASCADE_:
				case CASE_:
				case CAST_:
				case CHECK_:
				case COLLATE_:
				case COLUMN_:
				case COMMIT_:
				case CONFLICT_:
				case CONSTRAINT_:
				case CREATE_:
				case CROSS_:
				case CURRENT_DATE_:
				case CURRENT_TIME_:
				case CURRENT_TIMESTAMP_:
				case DATABASE_:
				case DEFAULT_:
				case DEFERRABLE_:
				case DEFERRED_:
				case DELETE_:
				case DESC_:
				case DETACH_:
				case DISTINCT_:
				case DROP_:
				case EACH_:
				case ELSE_:
				case END_:
				case ESCAPE_:
				case EXCEPT_:
				case EXCLUSIVE_:
				case EXISTS_:
				case EXPLAIN_:
				case FAIL_:
				case FOR_:
				case FOREIGN_:
				case FROM_:
				case FULL_:
				case GLOB_:
				case GROUP_:
				case HAVING_:
				case IF_:
				case IGNORE_:
				case IMMEDIATE_:
				case IN_:
				case INDEX_:
				case INDEXED_:
				case INITIALLY_:
				case INNER_:
				case INSERT_:
				case INSTEAD_:
				case INTERSECT_:
				case INTO_:
				case IS_:
				case ISNULL_:
				case JOIN_:
				case KEY_:
				case LEFT_:
				case LIKE_:
				case LIMIT_:
				case MATCH_:
				case NATURAL_:
				case NO_:
				case NOT_:
				case NOTNULL_:
				case NULL_:
				case OF_:
				case OFFSET_:
				case ON_:
				case OR_:
				case ORDER_:
				case OUTER_:
				case PLAN_:
				case PRAGMA_:
				case PRIMARY_:
				case QUERY_:
				case RAISE_:
				case RECURSIVE_:
				case REFERENCES_:
				case REGEXP_:
				case REINDEX_:
				case RELEASE_:
				case RENAME_:
				case REPLACE_:
				case RESTRICT_:
				case RIGHT_:
				case ROLLBACK_:
				case ROW_:
				case ROWS_:
				case SAVEPOINT_:
				case SELECT_:
				case SET_:
				case TABLE_:
				case TEMP_:
				case TEMPORARY_:
				case THEN_:
				case TO_:
				case TRANSACTION_:
				case TRIGGER_:
				case UNION_:
				case UNIQUE_:
				case UPDATE_:
				case USING_:
				case VACUUM_:
				case VALUES_:
				case VIEW_:
				case VIRTUAL_:
				case WHEN_:
				case WHERE_:
				case WITH_:
				case WITHOUT_:
				case FIRST_VALUE_:
				case OVER_:
				case PARTITION_:
				case RANGE_:
				case PRECEDING_:
				case UNBOUNDED_:
				case CURRENT_:
				case FOLLOWING_:
				case CUME_DIST_:
				case DENSE_RANK_:
				case LAG_:
				case LAST_VALUE_:
				case LEAD_:
				case NTH_VALUE_:
				case NTILE_:
				case PERCENT_RANK_:
				case RANK_:
				case ROW_NUMBER_:
				case GENERATED_:
				case ALWAYS_:
				case STORED_:
				case TRUE_:
				case FALSE_:
				case WINDOW_:
				case NULLS_:
				case FIRST_:
				case LAST_:
				case FILTER_:
				case GROUPS_:
				case EXCLUDE_:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					{
					setState(588);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(587);
						match(DISTINCT_);
						}
						break;
					}
					setState(590);
					expr(0);
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(591);
						match(COMMA);
						setState(592);
						expr(0);
						}
						}
						setState(597);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case STAR:
					{
					setState(598);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(601);
				match(CLOSE_PAR);
				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(602);
					filter_clause();
					}
					break;
				}
				setState(606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(605);
					over_clause();
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(608);
				match(OPEN_PAR);
				setState(609);
				expr(0);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(610);
					match(COMMA);
					setState(611);
					expr(0);
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(619);
				match(CAST_);
				setState(620);
				match(OPEN_PAR);
				setState(621);
				expr(0);
				setState(622);
				match(AS_);
				setState(623);
				type_name();
				setState(624);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS_ || _la==NOT_) {
					{
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(626);
						match(NOT_);
						}
					}

					setState(629);
					match(EXISTS_);
					}
				}

				setState(632);
				match(OPEN_PAR);
				setState(633);
				select_stmt();
				setState(634);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(636);
				match(CASE_);
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(637);
					expr(0);
					}
					break;
				}
				setState(645); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(640);
					match(WHEN_);
					setState(641);
					expr(0);
					setState(642);
					match(THEN_);
					setState(643);
					expr(0);
					}
					}
					setState(647); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN_ );
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE_) {
					{
					setState(649);
					match(ELSE_);
					setState(650);
					expr(0);
					}
				}

				setState(653);
				match(END_);
				}
				break;
			case 10:
				{
				setState(655);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(775);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(658);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(659);
						match(PIPE2);
						setState(660);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(661);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(662);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12416L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(663);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(664);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(665);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(666);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(667);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(668);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(669);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(670);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(671);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(672);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(673);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(686);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(674);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(675);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(676);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(677);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(678);
							match(IS_);
							}
							break;
						case 6:
							{
							setState(679);
							match(IS_);
							setState(680);
							match(NOT_);
							}
							break;
						case 7:
							{
							setState(681);
							match(IN_);
							}
							break;
						case 8:
							{
							setState(682);
							match(LIKE_);
							}
							break;
						case 9:
							{
							setState(683);
							match(GLOB_);
							}
							break;
						case 10:
							{
							setState(684);
							match(MATCH_);
							}
							break;
						case 11:
							{
							setState(685);
							match(REGEXP_);
							}
							break;
						}
						setState(688);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(689);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(690);
						match(AND_);
						setState(691);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(692);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(693);
						match(OR_);
						setState(694);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(695);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(696);
						match(IS_);
						setState(698);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
						case 1:
							{
							setState(697);
							match(NOT_);
							}
							break;
						}
						setState(700);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(701);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(703);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(702);
							match(NOT_);
							}
						}

						setState(705);
						match(BETWEEN_);
						setState(706);
						expr(0);
						setState(707);
						match(AND_);
						setState(708);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(710);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(711);
						match(COLLATE_);
						setState(712);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(713);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(715);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(714);
							match(NOT_);
							}
						}

						setState(717);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 2199028498433L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(718);
						expr(0);
						setState(721);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
						case 1:
							{
							setState(719);
							match(ESCAPE_);
							setState(720);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(723);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(728);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ISNULL_:
							{
							setState(724);
							match(ISNULL_);
							}
							break;
						case NOTNULL_:
							{
							setState(725);
							match(NOTNULL_);
							}
							break;
						case NOT_:
							{
							setState(726);
							match(NOT_);
							setState(727);
							match(NULL_);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(730);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(732);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(731);
							match(NOT_);
							}
						}

						setState(734);
						match(IN_);
						setState(773);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(735);
							match(OPEN_PAR);
							setState(745);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
							case 1:
								{
								setState(736);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(737);
								expr(0);
								setState(742);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(738);
									match(COMMA);
									setState(739);
									expr(0);
									}
									}
									setState(744);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(747);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(751);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
							case 1:
								{
								setState(748);
								schema_name();
								setState(749);
								match(DOT);
								}
								break;
							}
							setState(753);
							table_name();
							}
							break;
						case 3:
							{
							setState(757);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
							case 1:
								{
								setState(754);
								schema_name();
								setState(755);
								match(DOT);
								}
								break;
							}
							setState(759);
							table_function_name();
							setState(760);
							match(OPEN_PAR);
							setState(769);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33552632L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1152921504606846977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 4476578029606273023L) != 0)) {
								{
								setState(761);
								expr(0);
								setState(766);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(762);
									match(COMMA);
									setState(763);
									expr(0);
									}
									}
									setState(768);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
							}

							setState(771);
							match(CLOSE_PAR);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode RAISE_() { return getToken(SetlikaParser.RAISE_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public TerminalNode IGNORE_() { return getToken(SetlikaParser.IGNORE_, 0); }
		public TerminalNode COMMA() { return getToken(SetlikaParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SetlikaParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SetlikaParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SetlikaParser.FAIL_, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(RAISE_);
			setState(781);
			match(OPEN_PAR);
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE_:
				{
				setState(782);
				match(IGNORE_);
				}
				break;
			case ABORT_:
			case FAIL_:
			case ROLLBACK_:
				{
				setState(783);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || _la==FAIL_ || _la==ROLLBACK_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(784);
				match(COMMA);
				setState(785);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(788);
			match(CLOSE_PAR);
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
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SetlikaParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SetlikaParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SetlikaParser.BLOB_LITERAL, 0); }
		public TerminalNode NULL_() { return getToken(SetlikaParser.NULL_, 0); }
		public TerminalNode TRUE_() { return getToken(SetlikaParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SetlikaParser.FALSE_, 0); }
		public TerminalNode CURRENT_TIME_() { return getToken(SetlikaParser.CURRENT_TIME_, 0); }
		public TerminalNode CURRENT_DATE_() { return getToken(SetlikaParser.CURRENT_DATE_, 0); }
		public TerminalNode CURRENT_TIMESTAMP_() { return getToken(SetlikaParser.CURRENT_TIMESTAMP_, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 4503599627370503L) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & 212995L) != 0)) ) {
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
	public static class Value_rowContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Value_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_row; }
	}

	public final Value_rowContext value_row() throws RecognitionException {
		Value_rowContext _localctx = new Value_rowContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(OPEN_PAR);
			setState(793);
			expr(0);
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(794);
				match(COMMA);
				setState(795);
				expr(0);
				}
				}
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(801);
			match(CLOSE_PAR);
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
	public static class Values_clauseContext extends ParserRuleContext {
		public TerminalNode VALUES_() { return getToken(SetlikaParser.VALUES_, 0); }
		public List<Value_rowContext> value_row() {
			return getRuleContexts(Value_rowContext.class);
		}
		public Value_rowContext value_row(int i) {
			return getRuleContext(Value_rowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_clause; }
	}

	public final Values_clauseContext values_clause() throws RecognitionException {
		Values_clauseContext _localctx = new Values_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(VALUES_);
			setState(804);
			value_row();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(805);
				match(COMMA);
				setState(806);
				value_row();
				}
				}
				setState(811);
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
	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode INTO_() { return getToken(SetlikaParser.INTO_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode INSERT_() { return getToken(SetlikaParser.INSERT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SetlikaParser.REPLACE_, 0); }
		public TerminalNode OR_() { return getToken(SetlikaParser.OR_, 0); }
		public TerminalNode DEFAULT_() { return getToken(SetlikaParser.DEFAULT_, 0); }
		public TerminalNode VALUES_() { return getToken(SetlikaParser.VALUES_, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SetlikaParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SetlikaParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SetlikaParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SetlikaParser.IGNORE_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SetlikaParser.DOT, 0); }
		public TerminalNode AS_() { return getToken(SetlikaParser.AS_, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Values_clauseContext values_clause() {
			return getRuleContext(Values_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Upsert_clauseContext upsert_clause() {
			return getRuleContext(Upsert_clauseContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(812);
				with_clause();
				}
			}

			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(815);
				match(INSERT_);
				}
				break;
			case 2:
				{
				setState(816);
				match(REPLACE_);
				}
				break;
			case 3:
				{
				setState(817);
				match(INSERT_);
				setState(818);
				match(OR_);
				setState(819);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(822);
			match(INTO_);
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(823);
				schema_name();
				setState(824);
				match(DOT);
				}
				break;
			}
			setState(828);
			table_name();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_) {
				{
				setState(829);
				match(AS_);
				setState(830);
				table_alias();
				}
			}

			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(833);
				match(OPEN_PAR);
				setState(834);
				column_name();
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(835);
					match(COMMA);
					setState(836);
					column_name();
					}
					}
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(842);
				match(CLOSE_PAR);
				}
			}

			setState(855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_:
			case VALUES_:
			case WITH_:
				{
				{
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(846);
					values_clause();
					}
					break;
				case 2:
					{
					setState(847);
					select_stmt();
					}
					break;
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(850);
					upsert_clause();
					}
				}

				}
				}
				break;
			case DEFAULT_:
				{
				setState(853);
				match(DEFAULT_);
				setState(854);
				match(VALUES_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(857);
				returning_clause();
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
	public static class Returning_clauseContext extends ParserRuleContext {
		public TerminalNode RETURNING_() { return getToken(SetlikaParser.RETURNING_, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Returning_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning_clause; }
	}

	public final Returning_clauseContext returning_clause() throws RecognitionException {
		Returning_clauseContext _localctx = new Returning_clauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returning_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(RETURNING_);
			setState(861);
			result_column();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(862);
				match(COMMA);
				setState(863);
				result_column();
				}
				}
				setState(868);
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
	public static class Upsert_clauseContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SetlikaParser.ON_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SetlikaParser.CONFLICT_, 0); }
		public TerminalNode DO_() { return getToken(SetlikaParser.DO_, 0); }
		public TerminalNode NOTHING_() { return getToken(SetlikaParser.NOTHING_, 0); }
		public TerminalNode UPDATE_() { return getToken(SetlikaParser.UPDATE_, 0); }
		public TerminalNode SET_() { return getToken(SetlikaParser.SET_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SetlikaParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SetlikaParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public List<TerminalNode> WHERE_() { return getTokens(SetlikaParser.WHERE_); }
		public TerminalNode WHERE_(int i) {
			return getToken(SetlikaParser.WHERE_, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public Upsert_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upsert_clause; }
	}

	public final Upsert_clauseContext upsert_clause() throws RecognitionException {
		Upsert_clauseContext _localctx = new Upsert_clauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_upsert_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(ON_);
			setState(870);
			match(CONFLICT_);
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(871);
				match(OPEN_PAR);
				setState(872);
				indexed_column();
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(873);
					match(COMMA);
					setState(874);
					indexed_column();
					}
					}
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(880);
				match(CLOSE_PAR);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(881);
					match(WHERE_);
					setState(882);
					expr(0);
					}
				}

				}
			}

			setState(887);
			match(DO_);
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTHING_:
				{
				setState(888);
				match(NOTHING_);
				}
				break;
			case UPDATE_:
				{
				setState(889);
				match(UPDATE_);
				setState(890);
				match(SET_);
				{
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(891);
					column_name();
					}
					break;
				case 2:
					{
					setState(892);
					column_name_list();
					}
					break;
				}
				setState(895);
				match(ASSIGN);
				setState(896);
				expr(0);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(897);
					match(COMMA);
					setState(900);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						setState(898);
						column_name();
						}
						break;
					case 2:
						{
						setState(899);
						column_name_list();
						}
						break;
					}
					setState(902);
					match(ASSIGN);
					setState(903);
					expr(0);
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(910);
					match(WHERE_);
					setState(911);
					expr(0);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SetlikaParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pragma_value);
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				match(STRING_LITERAL);
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
	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(921);
				common_table_stmt();
				}
			}

			setState(924);
			select_core();
			setState(930);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(925);
					compound_operator();
					setState(926);
					select_core();
					}
					} 
				}
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(933);
				order_by_stmt();
				}
			}

			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(936);
				limit_stmt();
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
	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			table_or_subquery();
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==CROSS_ || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 8833L) != 0)) {
				{
				{
				setState(940);
				join_operator();
				setState(941);
				table_or_subquery();
				setState(943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(942);
					join_constraint();
					}
					break;
				}
				}
				}
				setState(949);
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
	public static class Select_coreContext extends ParserRuleContext {
		public ExprContext whereExpr;
		public ExprContext expr;
		public List<ExprContext> groupByExpr = new ArrayList<ExprContext>();
		public ExprContext havingExpr;
		public TerminalNode SELECT_() { return getToken(SetlikaParser.SELECT_, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SetlikaParser.FROM_, 0); }
		public TerminalNode WHERE_() { return getToken(SetlikaParser.WHERE_, 0); }
		public TerminalNode GROUP_() { return getToken(SetlikaParser.GROUP_, 0); }
		public TerminalNode BY_() { return getToken(SetlikaParser.BY_, 0); }
		public TerminalNode WINDOW_() { return getToken(SetlikaParser.WINDOW_, 0); }
		public List<Window_nameContext> window_name() {
			return getRuleContexts(Window_nameContext.class);
		}
		public Window_nameContext window_name(int i) {
			return getRuleContext(Window_nameContext.class,i);
		}
		public List<TerminalNode> AS_() { return getTokens(SetlikaParser.AS_); }
		public TerminalNode AS_(int i) {
			return getToken(SetlikaParser.AS_, i);
		}
		public List<Window_defnContext> window_defn() {
			return getRuleContexts(Window_defnContext.class);
		}
		public Window_defnContext window_defn(int i) {
			return getRuleContext(Window_defnContext.class,i);
		}
		public TerminalNode DISTINCT_() { return getToken(SetlikaParser.DISTINCT_, 0); }
		public TerminalNode ALL_() { return getToken(SetlikaParser.ALL_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode HAVING_() { return getToken(SetlikaParser.HAVING_, 0); }
		public Values_clauseContext values_clause() {
			return getRuleContext(Values_clauseContext.class,0);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_select_core);
		int _la;
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(950);
				match(SELECT_);
				setState(952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(951);
					_la = _input.LA(1);
					if ( !(_la==ALL_ || _la==DISTINCT_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(954);
				result_column();
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(955);
					match(COMMA);
					setState(956);
					result_column();
					}
					}
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM_) {
					{
					setState(962);
					match(FROM_);
					setState(972);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						setState(963);
						table_or_subquery();
						setState(968);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(964);
							match(COMMA);
							setState(965);
							table_or_subquery();
							}
							}
							setState(970);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(971);
						join_clause();
						}
						break;
					}
					}
				}

				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(976);
					match(WHERE_);
					setState(977);
					((Select_coreContext)_localctx).whereExpr = expr(0);
					}
				}

				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP_) {
					{
					setState(980);
					match(GROUP_);
					setState(981);
					match(BY_);
					setState(982);
					((Select_coreContext)_localctx).expr = expr(0);
					((Select_coreContext)_localctx).groupByExpr.add(((Select_coreContext)_localctx).expr);
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(983);
						match(COMMA);
						setState(984);
						((Select_coreContext)_localctx).expr = expr(0);
						((Select_coreContext)_localctx).groupByExpr.add(((Select_coreContext)_localctx).expr);
						}
						}
						setState(989);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(992);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==HAVING_) {
						{
						setState(990);
						match(HAVING_);
						setState(991);
						((Select_coreContext)_localctx).havingExpr = expr(0);
						}
					}

					}
				}

				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WINDOW_) {
					{
					setState(996);
					match(WINDOW_);
					setState(997);
					window_name();
					setState(998);
					match(AS_);
					setState(999);
					window_defn();
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1000);
						match(COMMA);
						setState(1001);
						window_name();
						setState(1002);
						match(AS_);
						setState(1003);
						window_defn();
						}
						}
						setState(1009);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				}
				break;
			case VALUES_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				values_clause();
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
	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SetlikaParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode INDEXED_() { return getToken(SetlikaParser.INDEXED_, 0); }
		public TerminalNode BY_() { return getToken(SetlikaParser.BY_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SetlikaParser.NOT_, 0); }
		public TerminalNode AS_() { return getToken(SetlikaParser.AS_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_table_or_subquery);
		int _la;
		try {
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1018);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1015);
					schema_name();
					setState(1016);
					match(DOT);
					}
					break;
				}
				setState(1020);
				table_name();
				setState(1025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1022);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						setState(1021);
						match(AS_);
						}
						break;
					}
					setState(1024);
					table_alias();
					}
					break;
				}
				setState(1032);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEXED_:
					{
					setState(1027);
					match(INDEXED_);
					setState(1028);
					match(BY_);
					setState(1029);
					index_name();
					}
					break;
				case NOT_:
					{
					setState(1030);
					match(NOT_);
					setState(1031);
					match(INDEXED_);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case ALTER_:
				case CREATE_:
				case CROSS_:
				case DELETE_:
				case DROP_:
				case EXCEPT_:
				case EXPLAIN_:
				case GROUP_:
				case INNER_:
				case INSERT_:
				case INTERSECT_:
				case JOIN_:
				case LEFT_:
				case LIMIT_:
				case NATURAL_:
				case ON_:
				case ORDER_:
				case REPLACE_:
				case RETURNING_:
				case SELECT_:
				case UNION_:
				case UPDATE_:
				case USING_:
				case VACUUM_:
				case VALUES_:
				case WHERE_:
				case WITH_:
				case WINDOW_:
					break;
				default:
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1034);
					schema_name();
					setState(1035);
					match(DOT);
					}
					break;
				}
				setState(1039);
				table_function_name();
				setState(1040);
				match(OPEN_PAR);
				setState(1041);
				expr(0);
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1042);
					match(COMMA);
					setState(1043);
					expr(0);
					}
					}
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1049);
				match(CLOSE_PAR);
				setState(1054);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1051);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
					case 1:
						{
						setState(1050);
						match(AS_);
						}
						break;
					}
					setState(1053);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1056);
				match(OPEN_PAR);
				setState(1066);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1057);
					table_or_subquery();
					setState(1062);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1058);
						match(COMMA);
						setState(1059);
						table_or_subquery();
						}
						}
						setState(1064);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1065);
					join_clause();
					}
					break;
				}
				setState(1068);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1070);
				match(OPEN_PAR);
				setState(1071);
				select_stmt();
				setState(1072);
				match(CLOSE_PAR);
				setState(1077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1074);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						setState(1073);
						match(AS_);
						}
						break;
					}
					setState(1076);
					table_alias();
					}
					break;
				}
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
	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SetlikaParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SetlikaParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SetlikaParser.AS_, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_result_column);
		int _la;
		try {
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				table_name();
				setState(1083);
				match(DOT);
				setState(1084);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1086);
				expr(0);
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS_ || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1088);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS_) {
						{
						setState(1087);
						match(AS_);
						}
					}

					setState(1090);
					column_alias();
					}
				}

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
	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SetlikaParser.COMMA, 0); }
		public TerminalNode JOIN_() { return getToken(SetlikaParser.JOIN_, 0); }
		public TerminalNode NATURAL_() { return getToken(SetlikaParser.NATURAL_, 0); }
		public TerminalNode LEFT_() { return getToken(SetlikaParser.LEFT_, 0); }
		public TerminalNode INNER_() { return getToken(SetlikaParser.INNER_, 0); }
		public TerminalNode CROSS_() { return getToken(SetlikaParser.CROSS_, 0); }
		public TerminalNode OUTER_() { return getToken(SetlikaParser.OUTER_, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_join_operator);
		int _la;
		try {
			setState(1108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				match(COMMA);
				}
				break;
			case CROSS_:
			case INNER_:
			case JOIN_:
			case LEFT_:
			case NATURAL_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL_) {
					{
					setState(1096);
					match(NATURAL_);
					}
				}

				setState(1105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_:
					{
					setState(1099);
					match(LEFT_);
					setState(1101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER_) {
						{
						setState(1100);
						match(OUTER_);
						}
					}

					}
					break;
				case INNER_:
					{
					setState(1103);
					match(INNER_);
					}
					break;
				case CROSS_:
					{
					setState(1104);
					match(CROSS_);
					}
					break;
				case JOIN_:
					break;
				default:
					break;
				}
				setState(1107);
				match(JOIN_);
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
	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SetlikaParser.ON_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING_() { return getToken(SetlikaParser.USING_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_join_constraint);
		int _la;
		try {
			setState(1124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				match(ON_);
				setState(1111);
				expr(0);
				}
				break;
			case USING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				match(USING_);
				setState(1113);
				match(OPEN_PAR);
				setState(1114);
				column_name();
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1115);
					match(COMMA);
					setState(1116);
					column_name();
					}
					}
					setState(1121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1122);
				match(CLOSE_PAR);
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
	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode UNION_() { return getToken(SetlikaParser.UNION_, 0); }
		public TerminalNode ALL_() { return getToken(SetlikaParser.ALL_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SetlikaParser.INTERSECT_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SetlikaParser.EXCEPT_, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_compound_operator);
		int _la;
		try {
			setState(1132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				match(UNION_);
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL_) {
					{
					setState(1127);
					match(ALL_);
					}
				}

				}
				break;
			case INTERSECT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				match(INTERSECT_);
				}
				break;
			case EXCEPT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
				match(EXCEPT_);
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
	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode UPDATE_() { return getToken(SetlikaParser.UPDATE_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode SET_() { return getToken(SetlikaParser.SET_, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SetlikaParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SetlikaParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SetlikaParser.OR_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SetlikaParser.FROM_, 0); }
		public TerminalNode WHERE_() { return getToken(SetlikaParser.WHERE_, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SetlikaParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SetlikaParser.ABORT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SetlikaParser.REPLACE_, 0); }
		public TerminalNode FAIL_() { return getToken(SetlikaParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SetlikaParser.IGNORE_, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1134);
				with_clause();
				}
			}

			setState(1137);
			match(UPDATE_);
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1138);
				match(OR_);
				setState(1139);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1142);
			qualified_table_name();
			setState(1143);
			match(SET_);
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1144);
				column_name();
				}
				break;
			case 2:
				{
				setState(1145);
				column_name_list();
				}
				break;
			}
			setState(1148);
			match(ASSIGN);
			setState(1149);
			expr(0);
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1150);
				match(COMMA);
				setState(1153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1151);
					column_name();
					}
					break;
				case 2:
					{
					setState(1152);
					column_name_list();
					}
					break;
				}
				setState(1155);
				match(ASSIGN);
				setState(1156);
				expr(0);
				}
				}
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM_) {
				{
				setState(1163);
				match(FROM_);
				setState(1173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1164);
					table_or_subquery();
					setState(1169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1165);
						match(COMMA);
						setState(1166);
						table_or_subquery();
						}
						}
						setState(1171);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1172);
					join_clause();
					}
					break;
				}
				}
			}

			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(1177);
				match(WHERE_);
				setState(1178);
				expr(0);
				}
			}

			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1181);
				returning_clause();
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
	public static class Column_name_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(OPEN_PAR);
			setState(1185);
			column_name();
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1186);
				match(COMMA);
				setState(1187);
				column_name();
				}
				}
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1193);
			match(CLOSE_PAR);
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
	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SetlikaParser.DOT, 0); }
		public TerminalNode AS_() { return getToken(SetlikaParser.AS_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode INDEXED_() { return getToken(SetlikaParser.INDEXED_, 0); }
		public TerminalNode BY_() { return getToken(SetlikaParser.BY_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SetlikaParser.NOT_, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_qualified_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1195);
				schema_name();
				setState(1196);
				match(DOT);
				}
				break;
			}
			setState(1200);
			table_name();
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_) {
				{
				setState(1201);
				match(AS_);
				setState(1202);
				alias();
				}
			}

			setState(1210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEXED_:
				{
				setState(1205);
				match(INDEXED_);
				setState(1206);
				match(BY_);
				setState(1207);
				index_name();
				}
				break;
			case NOT_:
				{
				setState(1208);
				match(NOT_);
				setState(1209);
				match(INDEXED_);
				}
				break;
			case EOF:
			case SCOL:
			case ALTER_:
			case CREATE_:
			case DELETE_:
			case DROP_:
			case EXPLAIN_:
			case INSERT_:
			case REPLACE_:
			case RETURNING_:
			case SELECT_:
			case SET_:
			case UPDATE_:
			case VACUUM_:
			case VALUES_:
			case WHERE_:
			case WITH_:
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
	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode VACUUM_() { return getToken(SetlikaParser.VACUUM_, 0); }
		public TerminalNode INTO_() { return getToken(SetlikaParser.INTO_, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_vacuum_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(VACUUM_);
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO_) {
				{
				setState(1213);
				match(INTO_);
				setState(1214);
				filename();
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
	public static class Filter_clauseContext extends ParserRuleContext {
		public TerminalNode FILTER_() { return getToken(SetlikaParser.FILTER_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public TerminalNode WHERE_() { return getToken(SetlikaParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public Filter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_clause; }
	}

	public final Filter_clauseContext filter_clause() throws RecognitionException {
		Filter_clauseContext _localctx = new Filter_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_filter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(FILTER_);
			setState(1218);
			match(OPEN_PAR);
			setState(1219);
			match(WHERE_);
			setState(1220);
			expr(0);
			setState(1221);
			match(CLOSE_PAR);
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
	public static class Window_defnContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public TerminalNode ORDER_() { return getToken(SetlikaParser.ORDER_, 0); }
		public List<TerminalNode> BY_() { return getTokens(SetlikaParser.BY_); }
		public TerminalNode BY_(int i) {
			return getToken(SetlikaParser.BY_, i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Base_window_nameContext base_window_name() {
			return getRuleContext(Base_window_nameContext.class,0);
		}
		public TerminalNode PARTITION_() { return getToken(SetlikaParser.PARTITION_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Frame_specContext frame_spec() {
			return getRuleContext(Frame_specContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Window_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_defn; }
	}

	public final Window_defnContext window_defn() throws RecognitionException {
		Window_defnContext _localctx = new Window_defnContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_window_defn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(OPEN_PAR);
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1224);
				base_window_name();
				}
				break;
			}
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION_) {
				{
				setState(1227);
				match(PARTITION_);
				setState(1228);
				match(BY_);
				setState(1229);
				expr(0);
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1230);
					match(COMMA);
					setState(1231);
					expr(0);
					}
					}
					setState(1236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(1239);
			match(ORDER_);
			setState(1240);
			match(BY_);
			setState(1241);
			ordering_term();
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1242);
				match(COMMA);
				setState(1243);
				ordering_term();
				}
				}
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
				{
				setState(1249);
				frame_spec();
				}
			}

			setState(1252);
			match(CLOSE_PAR);
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
	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER_() { return getToken(SetlikaParser.OVER_, 0); }
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public Base_window_nameContext base_window_name() {
			return getRuleContext(Base_window_nameContext.class,0);
		}
		public TerminalNode PARTITION_() { return getToken(SetlikaParser.PARTITION_, 0); }
		public List<TerminalNode> BY_() { return getTokens(SetlikaParser.BY_); }
		public TerminalNode BY_(int i) {
			return getToken(SetlikaParser.BY_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ORDER_() { return getToken(SetlikaParser.ORDER_, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Frame_specContext frame_spec() {
			return getRuleContext(Frame_specContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(OVER_);
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1255);
				window_name();
				}
				break;
			case 2:
				{
				setState(1256);
				match(OPEN_PAR);
				setState(1258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1257);
					base_window_name();
					}
					break;
				}
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1260);
					match(PARTITION_);
					setState(1261);
					match(BY_);
					setState(1262);
					expr(0);
					setState(1267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1263);
						match(COMMA);
						setState(1264);
						expr(0);
						}
						}
						setState(1269);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1272);
					match(ORDER_);
					setState(1273);
					match(BY_);
					setState(1274);
					ordering_term();
					setState(1279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1275);
						match(COMMA);
						setState(1276);
						ordering_term();
						}
						}
						setState(1281);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
					{
					setState(1284);
					frame_spec();
					}
				}

				setState(1287);
				match(CLOSE_PAR);
				}
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
	public static class Frame_specContext extends ParserRuleContext {
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public TerminalNode EXCLUDE_() { return getToken(SetlikaParser.EXCLUDE_, 0); }
		public TerminalNode NO_() { return getToken(SetlikaParser.NO_, 0); }
		public TerminalNode OTHERS_() { return getToken(SetlikaParser.OTHERS_, 0); }
		public TerminalNode CURRENT_() { return getToken(SetlikaParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SetlikaParser.ROW_, 0); }
		public TerminalNode GROUP_() { return getToken(SetlikaParser.GROUP_, 0); }
		public TerminalNode TIES_() { return getToken(SetlikaParser.TIES_, 0); }
		public Frame_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_spec; }
	}

	public final Frame_specContext frame_spec() throws RecognitionException {
		Frame_specContext _localctx = new Frame_specContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_frame_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			frame_clause();
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDE_) {
				{
				setState(1291);
				match(EXCLUDE_);
				setState(1298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO_:
					{
					setState(1292);
					match(NO_);
					setState(1293);
					match(OTHERS_);
					}
					break;
				case CURRENT_:
					{
					setState(1294);
					match(CURRENT_);
					setState(1295);
					match(ROW_);
					}
					break;
				case GROUP_:
					{
					setState(1296);
					match(GROUP_);
					}
					break;
				case TIES_:
					{
					setState(1297);
					match(TIES_);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class Frame_clauseContext extends ParserRuleContext {
		public TerminalNode RANGE_() { return getToken(SetlikaParser.RANGE_, 0); }
		public TerminalNode ROWS_() { return getToken(SetlikaParser.ROWS_, 0); }
		public TerminalNode GROUPS_() { return getToken(SetlikaParser.GROUPS_, 0); }
		public Frame_singleContext frame_single() {
			return getRuleContext(Frame_singleContext.class,0);
		}
		public TerminalNode BETWEEN_() { return getToken(SetlikaParser.BETWEEN_, 0); }
		public Frame_leftContext frame_left() {
			return getRuleContext(Frame_leftContext.class,0);
		}
		public TerminalNode AND_() { return getToken(SetlikaParser.AND_, 0); }
		public Frame_rightContext frame_right() {
			return getRuleContext(Frame_rightContext.class,0);
		}
		public Frame_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_clause; }
	}

	public final Frame_clauseContext frame_clause() throws RecognitionException {
		Frame_clauseContext _localctx = new Frame_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1303);
				frame_single();
				}
				break;
			case 2:
				{
				setState(1304);
				match(BETWEEN_);
				setState(1305);
				frame_left();
				setState(1306);
				match(AND_);
				setState(1307);
				frame_right();
				}
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
	public static class Simple_function_invocationContext extends ParserRuleContext {
		public Simple_funcContext simple_func() {
			return getRuleContext(Simple_funcContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SetlikaParser.STAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Simple_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_function_invocation; }
	}

	public final Simple_function_invocationContext simple_function_invocation() throws RecognitionException {
		Simple_function_invocationContext _localctx = new Simple_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_simple_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			simple_func();
			setState(1312);
			match(OPEN_PAR);
			setState(1322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1313);
				expr(0);
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1314);
					match(COMMA);
					setState(1315);
					expr(0);
					}
					}
					setState(1320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1321);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1324);
			match(CLOSE_PAR);
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
	public static class Aggregate_function_invocationContext extends ParserRuleContext {
		public Aggregate_funcContext aggregate_func() {
			return getRuleContext(Aggregate_funcContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SetlikaParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SetlikaParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Aggregate_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function_invocation; }
	}

	public final Aggregate_function_invocationContext aggregate_function_invocation() throws RecognitionException {
		Aggregate_function_invocationContext _localctx = new Aggregate_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_aggregate_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			aggregate_func();
			setState(1327);
			match(OPEN_PAR);
			setState(1340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1328);
					match(DISTINCT_);
					}
					break;
				}
				setState(1331);
				expr(0);
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1332);
					match(COMMA);
					setState(1333);
					expr(0);
					}
					}
					setState(1338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1339);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1342);
			match(CLOSE_PAR);
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_) {
				{
				setState(1343);
				filter_clause();
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
	public static class Window_function_invocationContext extends ParserRuleContext {
		public Window_functionContext window_function() {
			return getRuleContext(Window_functionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public TerminalNode OVER_() { return getToken(SetlikaParser.OVER_, 0); }
		public Window_defnContext window_defn() {
			return getRuleContext(Window_defnContext.class,0);
		}
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SetlikaParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Window_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function_invocation; }
	}

	public final Window_function_invocationContext window_function_invocation() throws RecognitionException {
		Window_function_invocationContext _localctx = new Window_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_window_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			window_function();
			setState(1347);
			match(OPEN_PAR);
			setState(1357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1348);
				expr(0);
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1349);
					match(COMMA);
					setState(1350);
					expr(0);
					}
					}
					setState(1355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1356);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1359);
			match(CLOSE_PAR);
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_) {
				{
				setState(1360);
				filter_clause();
				}
			}

			setState(1363);
			match(OVER_);
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1364);
				window_defn();
				}
				break;
			case 2:
				{
				setState(1365);
				window_name();
				}
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
	public static class Common_table_stmtContext extends ParserRuleContext {
		public TerminalNode WITH_() { return getToken(SetlikaParser.WITH_, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode RECURSIVE_() { return getToken(SetlikaParser.RECURSIVE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Common_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_stmt; }
	}

	public final Common_table_stmtContext common_table_stmt() throws RecognitionException {
		Common_table_stmtContext _localctx = new Common_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_common_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(WITH_);
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1369);
				match(RECURSIVE_);
				}
				break;
			}
			setState(1372);
			common_table_expression();
			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1373);
				match(COMMA);
				setState(1374);
				common_table_expression();
				}
				}
				setState(1379);
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
	public static class Order_by_stmtContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SetlikaParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SetlikaParser.BY_, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Order_by_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_stmt; }
	}

	public final Order_by_stmtContext order_by_stmt() throws RecognitionException {
		Order_by_stmtContext _localctx = new Order_by_stmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_order_by_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(ORDER_);
			setState(1381);
			match(BY_);
			setState(1382);
			ordering_term();
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1383);
				match(COMMA);
				setState(1384);
				ordering_term();
				}
				}
				setState(1389);
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
	public static class Limit_stmtContext extends ParserRuleContext {
		public TerminalNode LIMIT_() { return getToken(SetlikaParser.LIMIT_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OFFSET_() { return getToken(SetlikaParser.OFFSET_, 0); }
		public TerminalNode COMMA() { return getToken(SetlikaParser.COMMA, 0); }
		public Limit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_stmt; }
	}

	public final Limit_stmtContext limit_stmt() throws RecognitionException {
		Limit_stmtContext _localctx = new Limit_stmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_limit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(LIMIT_);
			setState(1391);
			expr(0);
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==OFFSET_) {
				{
				setState(1392);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==OFFSET_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1393);
				expr(0);
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
	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SetlikaParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode NULLS_() { return getToken(SetlikaParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SetlikaParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SetlikaParser.LAST_, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			expr(0);
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(1397);
				match(COLLATE_);
				setState(1398);
				collation_name();
				}
			}

			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(1401);
				asc_desc();
				}
			}

			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS_) {
				{
				setState(1404);
				match(NULLS_);
				setState(1405);
				_la = _input.LA(1);
				if ( !(_la==FIRST_ || _la==LAST_) ) {
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
	public static class Asc_descContext extends ParserRuleContext {
		public TerminalNode ASC_() { return getToken(SetlikaParser.ASC_, 0); }
		public TerminalNode DESC_() { return getToken(SetlikaParser.DESC_, 0); }
		public Asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc_desc; }
	}

	public final Asc_descContext asc_desc() throws RecognitionException {
		Asc_descContext _localctx = new Asc_descContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_la = _input.LA(1);
			if ( !(_la==ASC_ || _la==DESC_) ) {
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
	public static class Frame_leftContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SetlikaParser.PRECEDING_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SetlikaParser.FOLLOWING_, 0); }
		public TerminalNode CURRENT_() { return getToken(SetlikaParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SetlikaParser.ROW_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SetlikaParser.UNBOUNDED_, 0); }
		public Frame_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_left; }
	}

	public final Frame_leftContext frame_left() throws RecognitionException {
		Frame_leftContext _localctx = new Frame_leftContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_frame_left);
		try {
			setState(1420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1410);
				expr(0);
				setState(1411);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				expr(0);
				setState(1414);
				match(FOLLOWING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1416);
				match(CURRENT_);
				setState(1417);
				match(ROW_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1418);
				match(UNBOUNDED_);
				setState(1419);
				match(PRECEDING_);
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
	public static class Frame_rightContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SetlikaParser.PRECEDING_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SetlikaParser.FOLLOWING_, 0); }
		public TerminalNode CURRENT_() { return getToken(SetlikaParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SetlikaParser.ROW_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SetlikaParser.UNBOUNDED_, 0); }
		public Frame_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_right; }
	}

	public final Frame_rightContext frame_right() throws RecognitionException {
		Frame_rightContext _localctx = new Frame_rightContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_frame_right);
		try {
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				expr(0);
				setState(1423);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				expr(0);
				setState(1426);
				match(FOLLOWING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1428);
				match(CURRENT_);
				setState(1429);
				match(ROW_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1430);
				match(UNBOUNDED_);
				setState(1431);
				match(FOLLOWING_);
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
	public static class Frame_singleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SetlikaParser.PRECEDING_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SetlikaParser.UNBOUNDED_, 0); }
		public TerminalNode CURRENT_() { return getToken(SetlikaParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SetlikaParser.ROW_, 0); }
		public Frame_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_single; }
	}

	public final Frame_singleContext frame_single() throws RecognitionException {
		Frame_singleContext _localctx = new Frame_singleContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_frame_single);
		try {
			setState(1441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				expr(0);
				setState(1435);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1437);
				match(UNBOUNDED_);
				setState(1438);
				match(PRECEDING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1439);
				match(CURRENT_);
				setState(1440);
				match(ROW_);
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
	public static class Window_functionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(SetlikaParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SetlikaParser.OPEN_PAR, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SetlikaParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SetlikaParser.CLOSE_PAR, i);
		}
		public TerminalNode OVER_() { return getToken(SetlikaParser.OVER_, 0); }
		public Order_by_expr_asc_descContext order_by_expr_asc_desc() {
			return getRuleContext(Order_by_expr_asc_descContext.class,0);
		}
		public TerminalNode FIRST_VALUE_() { return getToken(SetlikaParser.FIRST_VALUE_, 0); }
		public TerminalNode LAST_VALUE_() { return getToken(SetlikaParser.LAST_VALUE_, 0); }
		public Partition_byContext partition_by() {
			return getRuleContext(Partition_byContext.class,0);
		}
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public TerminalNode CUME_DIST_() { return getToken(SetlikaParser.CUME_DIST_, 0); }
		public TerminalNode PERCENT_RANK_() { return getToken(SetlikaParser.PERCENT_RANK_, 0); }
		public Order_by_exprContext order_by_expr() {
			return getRuleContext(Order_by_exprContext.class,0);
		}
		public TerminalNode DENSE_RANK_() { return getToken(SetlikaParser.DENSE_RANK_, 0); }
		public TerminalNode RANK_() { return getToken(SetlikaParser.RANK_, 0); }
		public TerminalNode ROW_NUMBER_() { return getToken(SetlikaParser.ROW_NUMBER_, 0); }
		public TerminalNode LAG_() { return getToken(SetlikaParser.LAG_, 0); }
		public TerminalNode LEAD_() { return getToken(SetlikaParser.LEAD_, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public TerminalNode NTH_VALUE_() { return getToken(SetlikaParser.NTH_VALUE_, 0); }
		public TerminalNode COMMA() { return getToken(SetlikaParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode NTILE_() { return getToken(SetlikaParser.NTILE_, 0); }
		public Window_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function; }
	}

	public final Window_functionContext window_function() throws RecognitionException {
		Window_functionContext _localctx = new Window_functionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_window_function);
		int _la;
		try {
			setState(1528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST_VALUE_:
			case LAST_VALUE_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443);
				_la = _input.LA(1);
				if ( !(_la==FIRST_VALUE_ || _la==LAST_VALUE_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1444);
				match(OPEN_PAR);
				setState(1445);
				expr(0);
				setState(1446);
				match(CLOSE_PAR);
				setState(1447);
				match(OVER_);
				setState(1448);
				match(OPEN_PAR);
				setState(1450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1449);
					partition_by();
					}
				}

				setState(1452);
				order_by_expr_asc_desc();
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
					{
					setState(1453);
					frame_clause();
					}
				}

				setState(1456);
				match(CLOSE_PAR);
				}
				break;
			case CUME_DIST_:
			case PERCENT_RANK_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1458);
				_la = _input.LA(1);
				if ( !(_la==CUME_DIST_ || _la==PERCENT_RANK_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1459);
				match(OPEN_PAR);
				setState(1460);
				match(CLOSE_PAR);
				setState(1461);
				match(OVER_);
				setState(1462);
				match(OPEN_PAR);
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1463);
					partition_by();
					}
				}

				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1466);
					order_by_expr();
					}
				}

				setState(1469);
				match(CLOSE_PAR);
				}
				break;
			case DENSE_RANK_:
			case RANK_:
			case ROW_NUMBER_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1470);
				_la = _input.LA(1);
				if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 385L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1471);
				match(OPEN_PAR);
				setState(1472);
				match(CLOSE_PAR);
				setState(1473);
				match(OVER_);
				setState(1474);
				match(OPEN_PAR);
				setState(1476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1475);
					partition_by();
					}
				}

				setState(1478);
				order_by_expr_asc_desc();
				setState(1479);
				match(CLOSE_PAR);
				}
				break;
			case LAG_:
			case LEAD_:
				enterOuterAlt(_localctx, 4);
				{
				setState(1481);
				_la = _input.LA(1);
				if ( !(_la==LAG_ || _la==LEAD_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1482);
				match(OPEN_PAR);
				setState(1483);
				expr(0);
				setState(1485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1484);
					offset();
					}
					break;
				}
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1487);
					default_value();
					}
				}

				setState(1490);
				match(CLOSE_PAR);
				setState(1491);
				match(OVER_);
				setState(1492);
				match(OPEN_PAR);
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1493);
					partition_by();
					}
				}

				setState(1496);
				order_by_expr_asc_desc();
				setState(1497);
				match(CLOSE_PAR);
				}
				break;
			case NTH_VALUE_:
				enterOuterAlt(_localctx, 5);
				{
				setState(1499);
				match(NTH_VALUE_);
				setState(1500);
				match(OPEN_PAR);
				setState(1501);
				expr(0);
				setState(1502);
				match(COMMA);
				setState(1503);
				signed_number();
				setState(1504);
				match(CLOSE_PAR);
				setState(1505);
				match(OVER_);
				setState(1506);
				match(OPEN_PAR);
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1507);
					partition_by();
					}
				}

				setState(1510);
				order_by_expr_asc_desc();
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
					{
					setState(1511);
					frame_clause();
					}
				}

				setState(1514);
				match(CLOSE_PAR);
				}
				break;
			case NTILE_:
				enterOuterAlt(_localctx, 6);
				{
				setState(1516);
				match(NTILE_);
				setState(1517);
				match(OPEN_PAR);
				setState(1518);
				expr(0);
				setState(1519);
				match(CLOSE_PAR);
				setState(1520);
				match(OVER_);
				setState(1521);
				match(OPEN_PAR);
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1522);
					partition_by();
					}
				}

				setState(1525);
				order_by_expr_asc_desc();
				setState(1526);
				match(CLOSE_PAR);
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
	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SetlikaParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(COMMA);
			setState(1531);
			signed_number();
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
	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SetlikaParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(COMMA);
			setState(1534);
			signed_number();
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
	public static class Partition_byContext extends ParserRuleContext {
		public TerminalNode PARTITION_() { return getToken(SetlikaParser.PARTITION_, 0); }
		public TerminalNode BY_() { return getToken(SetlikaParser.BY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Partition_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by; }
	}

	public final Partition_byContext partition_by() throws RecognitionException {
		Partition_byContext _localctx = new Partition_byContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_partition_by);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(PARTITION_);
			setState(1537);
			match(BY_);
			setState(1539); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1538);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1541); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
	public static class Order_by_exprContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SetlikaParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SetlikaParser.BY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Order_by_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr; }
	}

	public final Order_by_exprContext order_by_expr() throws RecognitionException {
		Order_by_exprContext _localctx = new Order_by_exprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_order_by_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(ORDER_);
			setState(1544);
			match(BY_);
			setState(1546); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1545);
				expr(0);
				}
				}
				setState(1548); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -33552632L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1152921504606846977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 4476578029606273023L) != 0) );
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
	public static class Order_by_expr_asc_descContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SetlikaParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SetlikaParser.BY_, 0); }
		public Expr_asc_descContext expr_asc_desc() {
			return getRuleContext(Expr_asc_descContext.class,0);
		}
		public Order_by_expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr_asc_desc; }
	}

	public final Order_by_expr_asc_descContext order_by_expr_asc_desc() throws RecognitionException {
		Order_by_expr_asc_descContext _localctx = new Order_by_expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_order_by_expr_asc_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			match(ORDER_);
			setState(1551);
			match(BY_);
			setState(1552);
			expr_asc_desc();
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
	public static class Expr_asc_descContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Asc_descContext> asc_desc() {
			return getRuleContexts(Asc_descContext.class);
		}
		public Asc_descContext asc_desc(int i) {
			return getRuleContext(Asc_descContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SetlikaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SetlikaParser.COMMA, i);
		}
		public Expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_asc_desc; }
	}

	public final Expr_asc_descContext expr_asc_desc() throws RecognitionException {
		Expr_asc_descContext _localctx = new Expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expr_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			expr(0);
			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(1555);
				asc_desc();
				}
			}

			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1558);
				match(COMMA);
				setState(1559);
				expr(0);
				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC_ || _la==DESC_) {
					{
					setState(1560);
					asc_desc();
					}
				}

				}
				}
				setState(1567);
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
	public static class Initial_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Initial_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_select; }
	}

	public final Initial_selectContext initial_select() throws RecognitionException {
		Initial_selectContext _localctx = new Initial_selectContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_initial_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			select_stmt();
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
	public static class Recursive_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Recursive_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_select; }
	}

	public final Recursive_selectContext recursive_select() throws RecognitionException {
		Recursive_selectContext _localctx = new Recursive_selectContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_recursive_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			select_stmt();
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
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SetlikaParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SetlikaParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SetlikaParser.TILDE, 0); }
		public TerminalNode NOT_() { return getToken(SetlikaParser.NOT_, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0) || _la==NOT_) ) {
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
	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SetlikaParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
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
	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_module_argument);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577);
				column_def();
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
	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SetlikaParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SetlikaParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABORT_() { return getToken(SetlikaParser.ABORT_, 0); }
		public TerminalNode ACTION_() { return getToken(SetlikaParser.ACTION_, 0); }
		public TerminalNode ADD_() { return getToken(SetlikaParser.ADD_, 0); }
		public TerminalNode AFTER_() { return getToken(SetlikaParser.AFTER_, 0); }
		public TerminalNode ALL_() { return getToken(SetlikaParser.ALL_, 0); }
		public TerminalNode ALTER_() { return getToken(SetlikaParser.ALTER_, 0); }
		public TerminalNode ANALYZE_() { return getToken(SetlikaParser.ANALYZE_, 0); }
		public TerminalNode AND_() { return getToken(SetlikaParser.AND_, 0); }
		public TerminalNode AS_() { return getToken(SetlikaParser.AS_, 0); }
		public TerminalNode ASC_() { return getToken(SetlikaParser.ASC_, 0); }
		public TerminalNode ATTACH_() { return getToken(SetlikaParser.ATTACH_, 0); }
		public TerminalNode AUTOINCREMENT_() { return getToken(SetlikaParser.AUTOINCREMENT_, 0); }
		public TerminalNode BEFORE_() { return getToken(SetlikaParser.BEFORE_, 0); }
		public TerminalNode BEGIN_() { return getToken(SetlikaParser.BEGIN_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SetlikaParser.BETWEEN_, 0); }
		public TerminalNode BY_() { return getToken(SetlikaParser.BY_, 0); }
		public TerminalNode CASCADE_() { return getToken(SetlikaParser.CASCADE_, 0); }
		public TerminalNode CASE_() { return getToken(SetlikaParser.CASE_, 0); }
		public TerminalNode CAST_() { return getToken(SetlikaParser.CAST_, 0); }
		public TerminalNode CHECK_() { return getToken(SetlikaParser.CHECK_, 0); }
		public TerminalNode COLLATE_() { return getToken(SetlikaParser.COLLATE_, 0); }
		public TerminalNode COLUMN_() { return getToken(SetlikaParser.COLUMN_, 0); }
		public TerminalNode COMMIT_() { return getToken(SetlikaParser.COMMIT_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SetlikaParser.CONFLICT_, 0); }
		public TerminalNode CONSTRAINT_() { return getToken(SetlikaParser.CONSTRAINT_, 0); }
		public TerminalNode CREATE_() { return getToken(SetlikaParser.CREATE_, 0); }
		public TerminalNode CROSS_() { return getToken(SetlikaParser.CROSS_, 0); }
		public TerminalNode CURRENT_DATE_() { return getToken(SetlikaParser.CURRENT_DATE_, 0); }
		public TerminalNode CURRENT_TIME_() { return getToken(SetlikaParser.CURRENT_TIME_, 0); }
		public TerminalNode CURRENT_TIMESTAMP_() { return getToken(SetlikaParser.CURRENT_TIMESTAMP_, 0); }
		public TerminalNode DATABASE_() { return getToken(SetlikaParser.DATABASE_, 0); }
		public TerminalNode DEFAULT_() { return getToken(SetlikaParser.DEFAULT_, 0); }
		public TerminalNode DEFERRABLE_() { return getToken(SetlikaParser.DEFERRABLE_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SetlikaParser.DEFERRED_, 0); }
		public TerminalNode DELETE_() { return getToken(SetlikaParser.DELETE_, 0); }
		public TerminalNode DESC_() { return getToken(SetlikaParser.DESC_, 0); }
		public TerminalNode DETACH_() { return getToken(SetlikaParser.DETACH_, 0); }
		public TerminalNode DISTINCT_() { return getToken(SetlikaParser.DISTINCT_, 0); }
		public TerminalNode DROP_() { return getToken(SetlikaParser.DROP_, 0); }
		public TerminalNode EACH_() { return getToken(SetlikaParser.EACH_, 0); }
		public TerminalNode ELSE_() { return getToken(SetlikaParser.ELSE_, 0); }
		public TerminalNode END_() { return getToken(SetlikaParser.END_, 0); }
		public TerminalNode ESCAPE_() { return getToken(SetlikaParser.ESCAPE_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SetlikaParser.EXCEPT_, 0); }
		public TerminalNode EXCLUSIVE_() { return getToken(SetlikaParser.EXCLUSIVE_, 0); }
		public TerminalNode EXISTS_() { return getToken(SetlikaParser.EXISTS_, 0); }
		public TerminalNode EXPLAIN_() { return getToken(SetlikaParser.EXPLAIN_, 0); }
		public TerminalNode FAIL_() { return getToken(SetlikaParser.FAIL_, 0); }
		public TerminalNode FOR_() { return getToken(SetlikaParser.FOR_, 0); }
		public TerminalNode FOREIGN_() { return getToken(SetlikaParser.FOREIGN_, 0); }
		public TerminalNode FROM_() { return getToken(SetlikaParser.FROM_, 0); }
		public TerminalNode FULL_() { return getToken(SetlikaParser.FULL_, 0); }
		public TerminalNode GLOB_() { return getToken(SetlikaParser.GLOB_, 0); }
		public TerminalNode GROUP_() { return getToken(SetlikaParser.GROUP_, 0); }
		public TerminalNode HAVING_() { return getToken(SetlikaParser.HAVING_, 0); }
		public TerminalNode IF_() { return getToken(SetlikaParser.IF_, 0); }
		public TerminalNode IGNORE_() { return getToken(SetlikaParser.IGNORE_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SetlikaParser.IMMEDIATE_, 0); }
		public TerminalNode IN_() { return getToken(SetlikaParser.IN_, 0); }
		public TerminalNode INDEX_() { return getToken(SetlikaParser.INDEX_, 0); }
		public TerminalNode INDEXED_() { return getToken(SetlikaParser.INDEXED_, 0); }
		public TerminalNode INITIALLY_() { return getToken(SetlikaParser.INITIALLY_, 0); }
		public TerminalNode INNER_() { return getToken(SetlikaParser.INNER_, 0); }
		public TerminalNode INSERT_() { return getToken(SetlikaParser.INSERT_, 0); }
		public TerminalNode INSTEAD_() { return getToken(SetlikaParser.INSTEAD_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SetlikaParser.INTERSECT_, 0); }
		public TerminalNode INTO_() { return getToken(SetlikaParser.INTO_, 0); }
		public TerminalNode IS_() { return getToken(SetlikaParser.IS_, 0); }
		public TerminalNode ISNULL_() { return getToken(SetlikaParser.ISNULL_, 0); }
		public TerminalNode JOIN_() { return getToken(SetlikaParser.JOIN_, 0); }
		public TerminalNode KEY_() { return getToken(SetlikaParser.KEY_, 0); }
		public TerminalNode LEFT_() { return getToken(SetlikaParser.LEFT_, 0); }
		public TerminalNode LIKE_() { return getToken(SetlikaParser.LIKE_, 0); }
		public TerminalNode LIMIT_() { return getToken(SetlikaParser.LIMIT_, 0); }
		public TerminalNode MATCH_() { return getToken(SetlikaParser.MATCH_, 0); }
		public TerminalNode NATURAL_() { return getToken(SetlikaParser.NATURAL_, 0); }
		public TerminalNode NO_() { return getToken(SetlikaParser.NO_, 0); }
		public TerminalNode NOT_() { return getToken(SetlikaParser.NOT_, 0); }
		public TerminalNode NOTNULL_() { return getToken(SetlikaParser.NOTNULL_, 0); }
		public TerminalNode NULL_() { return getToken(SetlikaParser.NULL_, 0); }
		public TerminalNode OF_() { return getToken(SetlikaParser.OF_, 0); }
		public TerminalNode OFFSET_() { return getToken(SetlikaParser.OFFSET_, 0); }
		public TerminalNode ON_() { return getToken(SetlikaParser.ON_, 0); }
		public TerminalNode OR_() { return getToken(SetlikaParser.OR_, 0); }
		public TerminalNode ORDER_() { return getToken(SetlikaParser.ORDER_, 0); }
		public TerminalNode OUTER_() { return getToken(SetlikaParser.OUTER_, 0); }
		public TerminalNode PLAN_() { return getToken(SetlikaParser.PLAN_, 0); }
		public TerminalNode PRAGMA_() { return getToken(SetlikaParser.PRAGMA_, 0); }
		public TerminalNode PRIMARY_() { return getToken(SetlikaParser.PRIMARY_, 0); }
		public TerminalNode QUERY_() { return getToken(SetlikaParser.QUERY_, 0); }
		public TerminalNode RAISE_() { return getToken(SetlikaParser.RAISE_, 0); }
		public TerminalNode RECURSIVE_() { return getToken(SetlikaParser.RECURSIVE_, 0); }
		public TerminalNode REFERENCES_() { return getToken(SetlikaParser.REFERENCES_, 0); }
		public TerminalNode REGEXP_() { return getToken(SetlikaParser.REGEXP_, 0); }
		public TerminalNode REINDEX_() { return getToken(SetlikaParser.REINDEX_, 0); }
		public TerminalNode RELEASE_() { return getToken(SetlikaParser.RELEASE_, 0); }
		public TerminalNode RENAME_() { return getToken(SetlikaParser.RENAME_, 0); }
		public TerminalNode REPLACE_() { return getToken(SetlikaParser.REPLACE_, 0); }
		public TerminalNode RESTRICT_() { return getToken(SetlikaParser.RESTRICT_, 0); }
		public TerminalNode RIGHT_() { return getToken(SetlikaParser.RIGHT_, 0); }
		public TerminalNode ROLLBACK_() { return getToken(SetlikaParser.ROLLBACK_, 0); }
		public TerminalNode ROW_() { return getToken(SetlikaParser.ROW_, 0); }
		public TerminalNode ROWS_() { return getToken(SetlikaParser.ROWS_, 0); }
		public TerminalNode SAVEPOINT_() { return getToken(SetlikaParser.SAVEPOINT_, 0); }
		public TerminalNode SELECT_() { return getToken(SetlikaParser.SELECT_, 0); }
		public TerminalNode SET_() { return getToken(SetlikaParser.SET_, 0); }
		public TerminalNode TABLE_() { return getToken(SetlikaParser.TABLE_, 0); }
		public TerminalNode TEMP_() { return getToken(SetlikaParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SetlikaParser.TEMPORARY_, 0); }
		public TerminalNode THEN_() { return getToken(SetlikaParser.THEN_, 0); }
		public TerminalNode TO_() { return getToken(SetlikaParser.TO_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SetlikaParser.TRANSACTION_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SetlikaParser.TRIGGER_, 0); }
		public TerminalNode UNION_() { return getToken(SetlikaParser.UNION_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SetlikaParser.UNIQUE_, 0); }
		public TerminalNode UPDATE_() { return getToken(SetlikaParser.UPDATE_, 0); }
		public TerminalNode USING_() { return getToken(SetlikaParser.USING_, 0); }
		public TerminalNode VACUUM_() { return getToken(SetlikaParser.VACUUM_, 0); }
		public TerminalNode VALUES_() { return getToken(SetlikaParser.VALUES_, 0); }
		public TerminalNode VIEW_() { return getToken(SetlikaParser.VIEW_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SetlikaParser.VIRTUAL_, 0); }
		public TerminalNode WHEN_() { return getToken(SetlikaParser.WHEN_, 0); }
		public TerminalNode WHERE_() { return getToken(SetlikaParser.WHERE_, 0); }
		public TerminalNode WITH_() { return getToken(SetlikaParser.WITH_, 0); }
		public TerminalNode WITHOUT_() { return getToken(SetlikaParser.WITHOUT_, 0); }
		public TerminalNode FIRST_VALUE_() { return getToken(SetlikaParser.FIRST_VALUE_, 0); }
		public TerminalNode OVER_() { return getToken(SetlikaParser.OVER_, 0); }
		public TerminalNode PARTITION_() { return getToken(SetlikaParser.PARTITION_, 0); }
		public TerminalNode RANGE_() { return getToken(SetlikaParser.RANGE_, 0); }
		public TerminalNode PRECEDING_() { return getToken(SetlikaParser.PRECEDING_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SetlikaParser.UNBOUNDED_, 0); }
		public TerminalNode CURRENT_() { return getToken(SetlikaParser.CURRENT_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SetlikaParser.FOLLOWING_, 0); }
		public TerminalNode CUME_DIST_() { return getToken(SetlikaParser.CUME_DIST_, 0); }
		public TerminalNode DENSE_RANK_() { return getToken(SetlikaParser.DENSE_RANK_, 0); }
		public TerminalNode LAG_() { return getToken(SetlikaParser.LAG_, 0); }
		public TerminalNode LAST_VALUE_() { return getToken(SetlikaParser.LAST_VALUE_, 0); }
		public TerminalNode LEAD_() { return getToken(SetlikaParser.LEAD_, 0); }
		public TerminalNode NTH_VALUE_() { return getToken(SetlikaParser.NTH_VALUE_, 0); }
		public TerminalNode NTILE_() { return getToken(SetlikaParser.NTILE_, 0); }
		public TerminalNode PERCENT_RANK_() { return getToken(SetlikaParser.PERCENT_RANK_, 0); }
		public TerminalNode RANK_() { return getToken(SetlikaParser.RANK_, 0); }
		public TerminalNode ROW_NUMBER_() { return getToken(SetlikaParser.ROW_NUMBER_, 0); }
		public TerminalNode GENERATED_() { return getToken(SetlikaParser.GENERATED_, 0); }
		public TerminalNode ALWAYS_() { return getToken(SetlikaParser.ALWAYS_, 0); }
		public TerminalNode STORED_() { return getToken(SetlikaParser.STORED_, 0); }
		public TerminalNode TRUE_() { return getToken(SetlikaParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SetlikaParser.FALSE_, 0); }
		public TerminalNode WINDOW_() { return getToken(SetlikaParser.WINDOW_, 0); }
		public TerminalNode NULLS_() { return getToken(SetlikaParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SetlikaParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SetlikaParser.LAST_, 0); }
		public TerminalNode FILTER_() { return getToken(SetlikaParser.FILTER_, 0); }
		public TerminalNode GROUPS_() { return getToken(SetlikaParser.GROUPS_, 0); }
		public TerminalNode EXCLUDE_() { return getToken(SetlikaParser.EXCLUDE_, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -33554432L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1152921504606846977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 9007199254740991L) != 0)) ) {
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
	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			any_name();
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
	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			any_name();
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
	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			any_name();
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			any_name();
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
	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			any_name();
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			any_name();
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
	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			any_name();
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
	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			any_name();
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
	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			any_name();
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
	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			any_name();
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
	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			any_name();
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
	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			any_name();
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
	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			any_name();
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
	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			any_name();
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
	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			any_name();
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
	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			any_name();
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
	public static class Window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name; }
	}

	public final Window_nameContext window_name() throws RecognitionException {
		Window_nameContext _localctx = new Window_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			any_name();
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			any_name();
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
	public static class FilenameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			any_name();
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
	public static class Base_window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Base_window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_window_name; }
	}

	public final Base_window_nameContext base_window_name() throws RecognitionException {
		Base_window_nameContext _localctx = new Base_window_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_base_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			any_name();
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
	public static class Simple_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Simple_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_func; }
	}

	public final Simple_funcContext simple_func() throws RecognitionException {
		Simple_funcContext _localctx = new Simple_funcContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simple_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			any_name();
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
	public static class Aggregate_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Aggregate_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_func; }
	}

	public final Aggregate_funcContext aggregate_func() throws RecognitionException {
		Aggregate_funcContext _localctx = new Aggregate_funcContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_aggregate_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			any_name();
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
	public static class Table_function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_function_name; }
	}

	public final Table_function_nameContext table_function_name() throws RecognitionException {
		Table_function_nameContext _localctx = new Table_function_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_table_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			any_name();
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
	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SetlikaParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SetlikaParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SetlikaParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SetlikaParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_any_name);
		try {
			setState(1637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1630);
				match(IDENTIFIER);
				}
				break;
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1631);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1632);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1633);
				match(OPEN_PAR);
				setState(1634);
				any_name();
				setState(1635);
				match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00c1\u0668\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0001\u0000"+
		"\u0005\u0000\u00be\b\u0000\n\u0000\f\u0000\u00c1\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0005\u0001\u00c6\b\u0001\n\u0001\f\u0001\u00c9\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u00cd\b\u0001\u000b\u0001\f\u0001"+
		"\u00ce\u0001\u0001\u0005\u0001\u00d2\b\u0001\n\u0001\f\u0001\u00d5\t\u0001"+
		"\u0001\u0001\u0005\u0001\u00d8\b\u0001\n\u0001\f\u0001\u00db\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00e0\b\u0002\u0003\u0002\u00e2"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ec\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00f5\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00fb\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ff\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0104\b\u0003\u0001\u0003"+
		"\u0003\u0003\u0107\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u010b\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u010f\b\u0004\u0001\u0004\u0003"+
		"\u0004\u0112\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0119\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0120\b\u0005\n\u0005\f\u0005\u0123\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0127\b\u0005\n\u0005\f\u0005\u012a"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0130"+
		"\b\u0006\u0001\u0006\u0005\u0006\u0133\b\u0006\n\u0006\f\u0006\u0136\t"+
		"\u0006\u0001\u0007\u0004\u0007\u0139\b\u0007\u000b\u0007\f\u0007\u013a"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0147\b\u0007"+
		"\u0001\b\u0001\b\u0003\b\u014b\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0150"+
		"\b\b\u0001\b\u0003\b\u0153\b\b\u0001\b\u0003\b\u0156\b\b\u0001\b\u0003"+
		"\b\u0159\b\b\u0001\b\u0001\b\u0003\b\u015d\b\b\u0001\b\u0003\b\u0160\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u016e\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0175\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u017c\b\b\u0003\b\u017e\b\b\u0001\t\u0003\t\u0181\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0003\n\u0187\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u018c"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0192\b\n\n\n\f\n\u0195\t"+
		"\n\u0001\n\u0001\n\u0003\n\u0199\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u01a6\b\n\n"+
		"\n\f\n\u01a9\t\n\u0001\n\u0001\n\u0001\n\u0003\n\u01ae\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u01b6\b\u000b\n\u000b\f\u000b\u01b9\t\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u01bd\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01c7\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u01cb\b\u000b\n\u000b\f\u000b\u01ce\t\u000b"+
		"\u0001\u000b\u0003\u000b\u01d1\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u01d6\b\u000b\u0003\u000b\u01d8\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0003\r\u01e0\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u01ee\b\r\n\r\f\r\u01f1\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u01f8\b\u000e\n\u000e\f\u000e\u01fb\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01ff\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0207\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0211\b\u0010\n\u0010\f\u0010\u0214"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0218\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011"+
		"\u0220\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0227\b\u0011\u0001\u0011\u0003\u0011\u022a\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0230\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0235\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u023f\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0244\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u024d\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0252\b\u0013\n\u0013\f\u0013\u0255\t\u0013"+
		"\u0001\u0013\u0003\u0013\u0258\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u025c\b\u0013\u0001\u0013\u0003\u0013\u025f\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0265\b\u0013\n\u0013\f\u0013"+
		"\u0268\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0274\b\u0013\u0001\u0013\u0003\u0013\u0277\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u027f"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004"+
		"\u0013\u0286\b\u0013\u000b\u0013\f\u0013\u0287\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u028c\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0291\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u02af\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u02bb\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u02c0\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u02cc"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u02d2"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u02d9\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u02dd\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u02e5\b\u0013\n\u0013\f\u0013\u02e8\t\u0013\u0003\u0013\u02ea"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u02f0"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u02f6"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u02fd\b\u0013\n\u0013\f\u0013\u0300\t\u0013\u0003\u0013\u0302\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0306\b\u0013\u0005\u0013\u0308"+
		"\b\u0013\n\u0013\f\u0013\u030b\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0313\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u031d\b\u0016\n\u0016\f\u0016\u0320\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0328\b\u0017\n\u0017\f\u0017\u032b\t\u0017\u0001\u0018\u0003\u0018"+
		"\u032e\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0335\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u033b\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0340\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0346\b\u0018\n\u0018\f\u0018\u0349\t\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u034d\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0351\b\u0018"+
		"\u0001\u0018\u0003\u0018\u0354\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0358\b\u0018\u0001\u0018\u0003\u0018\u035b\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0361\b\u0019\n\u0019\f\u0019"+
		"\u0364\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u036c\b\u001a\n\u001a\f\u001a\u036f\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0374\b\u001a\u0003\u001a\u0376"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u037e\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0385\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u038a\b\u001a\n\u001a\f\u001a\u038d\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0391\b\u001a\u0003\u001a\u0393\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0398\b\u001b\u0001\u001c\u0003"+
		"\u001c\u039b\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u03a1\b\u001c\n\u001c\f\u001c\u03a4\t\u001c\u0001\u001c\u0003\u001c"+
		"\u03a7\b\u001c\u0001\u001c\u0003\u001c\u03aa\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u03b0\b\u001d\u0005\u001d\u03b2"+
		"\b\u001d\n\u001d\f\u001d\u03b5\t\u001d\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u03b9\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u03be\b"+
		"\u001e\n\u001e\f\u001e\u03c1\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u03c7\b\u001e\n\u001e\f\u001e\u03ca\t\u001e\u0001"+
		"\u001e\u0003\u001e\u03cd\b\u001e\u0003\u001e\u03cf\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u03d3\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u03da\b\u001e\n\u001e\f\u001e\u03dd"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u03e1\b\u001e\u0003\u001e"+
		"\u03e3\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u03ee\b\u001e"+
		"\n\u001e\f\u001e\u03f1\t\u001e\u0003\u001e\u03f3\b\u001e\u0001\u001e\u0003"+
		"\u001e\u03f6\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u03fb"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u03ff\b\u001f\u0001\u001f"+
		"\u0003\u001f\u0402\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0409\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u040e\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0415\b\u001f\n\u001f\f\u001f\u0418\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u041c\b\u001f\u0001\u001f\u0003\u001f\u041f"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0425"+
		"\b\u001f\n\u001f\f\u001f\u0428\t\u001f\u0001\u001f\u0003\u001f\u042b\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0433\b\u001f\u0001\u001f\u0003\u001f\u0436\b\u001f"+
		"\u0003\u001f\u0438\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0441\b \u0001 \u0003 \u0444\b \u0003 \u0446\b \u0001!\u0001"+
		"!\u0003!\u044a\b!\u0001!\u0001!\u0003!\u044e\b!\u0001!\u0001!\u0003!\u0452"+
		"\b!\u0001!\u0003!\u0455\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u045e\b\"\n\"\f\"\u0461\t\"\u0001\"\u0001\"\u0003\""+
		"\u0465\b\"\u0001#\u0001#\u0003#\u0469\b#\u0001#\u0001#\u0003#\u046d\b"+
		"#\u0001$\u0003$\u0470\b$\u0001$\u0001$\u0001$\u0003$\u0475\b$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u047b\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u0482\b$\u0001$\u0001$\u0001$\u0005$\u0487\b$\n$\f$\u048a\t$\u0001$"+
		"\u0001$\u0001$\u0001$\u0005$\u0490\b$\n$\f$\u0493\t$\u0001$\u0003$\u0496"+
		"\b$\u0003$\u0498\b$\u0001$\u0001$\u0003$\u049c\b$\u0001$\u0003$\u049f"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0005%\u04a5\b%\n%\f%\u04a8\t%\u0001%"+
		"\u0001%\u0001&\u0001&\u0001&\u0003&\u04af\b&\u0001&\u0001&\u0001&\u0003"+
		"&\u04b4\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u04bb\b&\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u04c0\b\'\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001)\u0001)\u0003)\u04ca\b)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u04d1\b)\n)\f)\u04d4\t)\u0003)\u04d6\b)\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0005)\u04dd\b)\n)\f)\u04e0\t)\u0001)\u0003)\u04e3\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0003*\u04eb\b*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u04f2\b*\n*\f*\u04f5\t*\u0003*\u04f7\b*\u0001*"+
		"\u0001*\u0001*\u0001*\u0001*\u0005*\u04fe\b*\n*\f*\u0501\t*\u0003*\u0503"+
		"\b*\u0001*\u0003*\u0506\b*\u0001*\u0003*\u0509\b*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0513\b+\u0003+\u0515\b+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u051e\b,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0005-\u0525\b-\n-\f-\u0528\t-\u0001-\u0003-\u052b"+
		"\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0003.\u0532\b.\u0001.\u0001.\u0001"+
		".\u0005.\u0537\b.\n.\f.\u053a\t.\u0001.\u0003.\u053d\b.\u0001.\u0001."+
		"\u0003.\u0541\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0548\b/\n"+
		"/\f/\u054b\t/\u0001/\u0003/\u054e\b/\u0001/\u0001/\u0003/\u0552\b/\u0001"+
		"/\u0001/\u0001/\u0003/\u0557\b/\u00010\u00010\u00030\u055b\b0\u00010\u0001"+
		"0\u00010\u00050\u0560\b0\n0\f0\u0563\t0\u00011\u00011\u00011\u00011\u0001"+
		"1\u00051\u056a\b1\n1\f1\u056d\t1\u00012\u00012\u00012\u00012\u00032\u0573"+
		"\b2\u00013\u00013\u00013\u00033\u0578\b3\u00013\u00033\u057b\b3\u0001"+
		"3\u00013\u00033\u057f\b3\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00035\u058d\b5\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u0599\b6\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u05a2\b7\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00038\u05ab\b8\u00018\u00018\u0003"+
		"8\u05af\b8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u05b9\b8\u00018\u00038\u05bc\b8\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00038\u05c5\b8\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00038\u05ce\b8\u00018\u00038\u05d1\b8\u00018\u00018\u00018\u00018\u0003"+
		"8\u05d7\b8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u05e5\b8\u00018\u00018\u00038\u05e9\b8\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u05f4"+
		"\b8\u00018\u00018\u00018\u00038\u05f9\b8\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0004;\u0604\b;\u000b;\f;\u0605\u0001<\u0001"+
		"<\u0001<\u0004<\u060b\b<\u000b<\f<\u060c\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0003>\u0615\b>\u0001>\u0001>\u0001>\u0003>\u061a\b>\u0005>\u061c"+
		"\b>\n>\f>\u061f\t>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001"+
		"B\u0001C\u0001C\u0003C\u062b\bC\u0001D\u0001D\u0001E\u0001E\u0001F\u0001"+
		"F\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001K\u0001"+
		"K\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001P\u0001"+
		"P\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0001T\u0001T\u0001U\u0001"+
		"U\u0001V\u0001V\u0001W\u0001W\u0001X\u0001X\u0001Y\u0001Y\u0001Z\u0001"+
		"Z\u0001[\u0001[\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0003]\u0666\b]\u0001]\u0002\u0121\u013a\u0001&^\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u0000\u0019\u0002\u0000\u0092\u0092\u00ab\u00ab\u0001\u0000"+
		"\b\t\u0002\u0000;;\u008d\u008d\u0002\u000088hh\u0002\u0000::RR\u0005\u0000"+
		"\u0019\u0019HHQQzz~~\u0004\u0000TT\u0084\u0084\u008a\u008a\u0091\u0091"+
		"\u0002\u0000\u0007\u0007\f\r\u0001\u0000\u000e\u0011\u0001\u0000\u0012"+
		"\u0015\u0004\u0000MMaaccvv\u0003\u0000\u0019\u0019HH~~\u0005\u000046h"+
		"h\u00ac\u00ad\u00ba\u00ba\u00bc\u00bd\u0002\u0000\u001d\u001d>>\u0003"+
		"\u0000\u0080\u0080\u009a\u009a\u00b3\u00b3\u0002\u0000\u0005\u0005jj\u0001"+
		"\u0000\u00b0\u00b1\u0002\u0000\"\"<<\u0002\u0000\u0097\u0097\u00a2\u00a2"+
		"\u0002\u0000\u009f\u009f\u00a6\u00a6\u0002\u0000\u00a0\u00a0\u00a7\u00a8"+
		"\u0002\u0000\u00a1\u00a1\u00a3\u00a3\u0002\u0000\b\nff\u0002\u0000\u00b9"+
		"\u00b9\u00bc\u00bc\u0002\u0000\u0019{}\u00b4\u0735\u0000\u00bf\u0001\u0000"+
		"\u0000\u0000\u0002\u00c7\u0001\u0000\u0000\u0000\u0004\u00e1\u0001\u0000"+
		"\u0000\u0000\u0006\u00ed\u0001\u0000\u0000\u0000\b\u010a\u0001\u0000\u0000"+
		"\u0000\n\u0113\u0001\u0000\u0000\u0000\f\u012d\u0001\u0000\u0000\u0000"+
		"\u000e\u0138\u0001\u0000\u0000\u0000\u0010\u014a\u0001\u0000\u0000\u0000"+
		"\u0012\u0180\u0001\u0000\u0000\u0000\u0014\u0186\u0001\u0000\u0000\u0000"+
		"\u0016\u01af\u0001\u0000\u0000\u0000\u0018\u01d9\u0001\u0000\u0000\u0000"+
		"\u001a\u01dd\u0001\u0000\u0000\u0000\u001c\u01f2\u0001\u0000\u0000\u0000"+
		"\u001e\u0200\u0001\u0000\u0000\u0000 \u020b\u0001\u0000\u0000\u0000\""+
		"\u021f\u0001\u0000\u0000\u0000$\u022b\u0001\u0000\u0000\u0000&\u0290\u0001"+
		"\u0000\u0000\u0000(\u030c\u0001\u0000\u0000\u0000*\u0316\u0001\u0000\u0000"+
		"\u0000,\u0318\u0001\u0000\u0000\u0000.\u0323\u0001\u0000\u0000\u00000"+
		"\u032d\u0001\u0000\u0000\u00002\u035c\u0001\u0000\u0000\u00004\u0365\u0001"+
		"\u0000\u0000\u00006\u0397\u0001\u0000\u0000\u00008\u039a\u0001\u0000\u0000"+
		"\u0000:\u03ab\u0001\u0000\u0000\u0000<\u03f5\u0001\u0000\u0000\u0000>"+
		"\u0437\u0001\u0000\u0000\u0000@\u0445\u0001\u0000\u0000\u0000B\u0454\u0001"+
		"\u0000\u0000\u0000D\u0464\u0001\u0000\u0000\u0000F\u046c\u0001\u0000\u0000"+
		"\u0000H\u046f\u0001\u0000\u0000\u0000J\u04a0\u0001\u0000\u0000\u0000L"+
		"\u04ae\u0001\u0000\u0000\u0000N\u04bc\u0001\u0000\u0000\u0000P\u04c1\u0001"+
		"\u0000\u0000\u0000R\u04c7\u0001\u0000\u0000\u0000T\u04e6\u0001\u0000\u0000"+
		"\u0000V\u050a\u0001\u0000\u0000\u0000X\u0516\u0001\u0000\u0000\u0000Z"+
		"\u051f\u0001\u0000\u0000\u0000\\\u052e\u0001\u0000\u0000\u0000^\u0542"+
		"\u0001\u0000\u0000\u0000`\u0558\u0001\u0000\u0000\u0000b\u0564\u0001\u0000"+
		"\u0000\u0000d\u056e\u0001\u0000\u0000\u0000f\u0574\u0001\u0000\u0000\u0000"+
		"h\u0580\u0001\u0000\u0000\u0000j\u058c\u0001\u0000\u0000\u0000l\u0598"+
		"\u0001\u0000\u0000\u0000n\u05a1\u0001\u0000\u0000\u0000p\u05f8\u0001\u0000"+
		"\u0000\u0000r\u05fa\u0001\u0000\u0000\u0000t\u05fd\u0001\u0000\u0000\u0000"+
		"v\u0600\u0001\u0000\u0000\u0000x\u0607\u0001\u0000\u0000\u0000z\u060e"+
		"\u0001\u0000\u0000\u0000|\u0612\u0001\u0000\u0000\u0000~\u0620\u0001\u0000"+
		"\u0000\u0000\u0080\u0622\u0001\u0000\u0000\u0000\u0082\u0624\u0001\u0000"+
		"\u0000\u0000\u0084\u0626\u0001\u0000\u0000\u0000\u0086\u062a\u0001\u0000"+
		"\u0000\u0000\u0088\u062c\u0001\u0000\u0000\u0000\u008a\u062e\u0001\u0000"+
		"\u0000\u0000\u008c\u0630\u0001\u0000\u0000\u0000\u008e\u0632\u0001\u0000"+
		"\u0000\u0000\u0090\u0634\u0001\u0000\u0000\u0000\u0092\u0636\u0001\u0000"+
		"\u0000\u0000\u0094\u0638\u0001\u0000\u0000\u0000\u0096\u063a\u0001\u0000"+
		"\u0000\u0000\u0098\u063c\u0001\u0000\u0000\u0000\u009a\u063e\u0001\u0000"+
		"\u0000\u0000\u009c\u0640\u0001\u0000\u0000\u0000\u009e\u0642\u0001\u0000"+
		"\u0000\u0000\u00a0\u0644\u0001\u0000\u0000\u0000\u00a2\u0646\u0001\u0000"+
		"\u0000\u0000\u00a4\u0648\u0001\u0000\u0000\u0000\u00a6\u064a\u0001\u0000"+
		"\u0000\u0000\u00a8\u064c\u0001\u0000\u0000\u0000\u00aa\u064e\u0001\u0000"+
		"\u0000\u0000\u00ac\u0650\u0001\u0000\u0000\u0000\u00ae\u0652\u0001\u0000"+
		"\u0000\u0000\u00b0\u0654\u0001\u0000\u0000\u0000\u00b2\u0656\u0001\u0000"+
		"\u0000\u0000\u00b4\u0658\u0001\u0000\u0000\u0000\u00b6\u065a\u0001\u0000"+
		"\u0000\u0000\u00b8\u065c\u0001\u0000\u0000\u0000\u00ba\u0665\u0001\u0000"+
		"\u0000\u0000\u00bc\u00be\u0003\u0002\u0001\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0000"+
		"\u0000\u0001\u00c3\u0001\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005\u0001"+
		"\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00d3\u0003\u0004\u0002\u0000\u00cb\u00cd\u0005\u0001"+
		"\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003\u0004"+
		"\u0002\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d9\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0005\u0001\u0000\u0000\u00d7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u0003\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0005G\u0000"+
		"\u0000\u00dd\u00de\u0005r\u0000\u0000\u00de\u00e0\u0005o\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00eb\u0001\u0000\u0000\u0000\u00e3"+
		"\u00ec\u0003\u0006\u0003\u0000\u00e4\u00ec\u0003\n\u0005\u0000\u00e5\u00ec"+
		"\u0003\"\u0011\u0000\u00e6\u00ec\u0003$\u0012\u0000\u00e7\u00ec\u0003"+
		"0\u0018\u0000\u00e8\u00ec\u00038\u001c\u0000\u00e9\u00ec\u0003H$\u0000"+
		"\u00ea\u00ec\u0003N\'\u0000\u00eb\u00e3\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e4\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e6\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u0005\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\u001e\u0000\u0000\u00ee\u00ef\u0005\u0084\u0000\u0000\u00ef"+
		"\u0106\u0003\u0092I\u0000\u00f0\u00fa\u0005y\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0088\u0000\u0000\u00f2\u00fb\u0003\u0092I\u0000\u00f3\u00f5\u0005.\u0000"+
		"\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003\u0096K\u0000"+
		"\u00f7\u00f8\u0005\u0088\u0000\u0000\u00f8\u00f9\u0003\u0096K\u0000\u00f9"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f1\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f4\u0001\u0000\u0000\u0000\u00fb\u0107\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fe\u0005\u001b\u0000\u0000\u00fd\u00ff\u0005.\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0107\u0003\f\u0006\u0000\u0101\u0103\u0005"+
		"?\u0000\u0000\u0102\u0104\u0005.\u0000\u0000\u0103\u0102\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0107\u0003\u0096K\u0000\u0106\u00f0\u0001\u0000\u0000\u0000"+
		"\u0106\u00fc\u0001\u0000\u0000\u0000\u0106\u0101\u0001\u0000\u0000\u0000"+
		"\u0107\u0007\u0001\u0000\u0000\u0000\u0108\u010b\u0003\u0096K\u0000\u0109"+
		"\u010b\u0003&\u0013\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0005-\u0000\u0000\u010d\u010f\u0003\u0098L\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000"+
		"\u0000\u0000\u0110\u0112\u0003h4\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\t\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u00052\u0000\u0000\u0114\u0118\u0005\u0084\u0000\u0000\u0115\u0116"+
		"\u0005P\u0000\u0000\u0116\u0117\u0005f\u0000\u0000\u0117\u0119\u0005F"+
		"\u0000\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0003\u0092"+
		"I\u0000\u011b\u011c\u0005\u0003\u0000\u0000\u011c\u0121\u0003\f\u0006"+
		"\u0000\u011d\u011e\u0005\u0005\u0000\u0000\u011e\u0120\u0003\f\u0006\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u0128\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0005\u0005\u0000\u0000\u0125\u0127\u0003\u0014\n\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012b\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0005\u0004\u0000\u0000\u012c\u000b\u0001\u0000\u0000\u0000\u012d"+
		"\u012f\u0003\u0096K\u0000\u012e\u0130\u0003\u000e\u0007\u0000\u012f\u012e"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0134"+
		"\u0001\u0000\u0000\u0000\u0131\u0133\u0003\u0010\b\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\r\u0001\u0000"+
		"\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0139\u0003\u008c"+
		"F\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013b\u0146\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0003\u0000"+
		"\u0000\u013d\u013e\u0003\u0012\t\u0000\u013e\u013f\u0005\u0004\u0000\u0000"+
		"\u013f\u0147\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0003\u0000\u0000"+
		"\u0141\u0142\u0003\u0012\t\u0000\u0142\u0143\u0005\u0005\u0000\u0000\u0143"+
		"\u0144\u0003\u0012\t\u0000\u0144\u0145\u0005\u0004\u0000\u0000\u0145\u0147"+
		"\u0001\u0000\u0000\u0000\u0146\u013c\u0001\u0000\u0000\u0000\u0146\u0140"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u000f"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u00051\u0000\u0000\u0149\u014b\u0003"+
		"\u008cF\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b\u017d\u0001\u0000\u0000\u0000\u014c\u014d\u0005q\u0000"+
		"\u0000\u014d\u014f\u0005_\u0000\u0000\u014e\u0150\u0003h4\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150"+
		"\u0152\u0001\u0000\u0000\u0000\u0151\u0153\u0003\u0018\f\u0000\u0152\u0151"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155"+
		"\u0001\u0000\u0000\u0000\u0154\u0156\u0005$\u0000\u0000\u0155\u0154\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u017e\u0001"+
		"\u0000\u0000\u0000\u0157\u0159\u0005f\u0000\u0000\u0158\u0157\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015d\u0005h\u0000\u0000\u015b\u015d\u0005\u008c\u0000"+
		"\u0000\u015c\u0158\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u0160\u0003\u0018\f\u0000"+
		"\u015f\u015e\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000"+
		"\u0160\u017e\u0001\u0000\u0000\u0000\u0161\u0162\u0005,\u0000\u0000\u0162"+
		"\u0163\u0005\u0003\u0000\u0000\u0163\u0164\u0003&\u0013\u0000\u0164\u0165"+
		"\u0005\u0004\u0000\u0000\u0165\u017e\u0001\u0000\u0000\u0000\u0166\u016d"+
		"\u00058\u0000\u0000\u0167\u016e\u0003\u0012\t\u0000\u0168\u016e\u0003"+
		"*\u0015\u0000\u0169\u016a\u0005\u0003\u0000\u0000\u016a\u016b\u0003&\u0013"+
		"\u0000\u016b\u016c\u0005\u0004\u0000\u0000\u016c\u016e\u0001\u0000\u0000"+
		"\u0000\u016d\u0167\u0001\u0000\u0000\u0000\u016d\u0168\u0001\u0000\u0000"+
		"\u0000\u016d\u0169\u0001\u0000\u0000\u0000\u016e\u017e\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0005-\u0000\u0000\u0170\u017e\u0003\u0098L\u0000\u0171"+
		"\u017e\u0003\u0016\u000b\u0000\u0172\u0173\u0005\u00a9\u0000\u0000\u0173"+
		"\u0175\u0005\u00aa\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0005!\u0000\u0000\u0177\u0178\u0005\u0003\u0000\u0000\u0178\u0179"+
		"\u0003&\u0013\u0000\u0179\u017b\u0005\u0004\u0000\u0000\u017a\u017c\u0007"+
		"\u0000\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u014c\u0001"+
		"\u0000\u0000\u0000\u017d\u015c\u0001\u0000\u0000\u0000\u017d\u0161\u0001"+
		"\u0000\u0000\u0000\u017d\u0166\u0001\u0000\u0000\u0000\u017d\u016f\u0001"+
		"\u0000\u0000\u0000\u017d\u0171\u0001\u0000\u0000\u0000\u017d\u0174\u0001"+
		"\u0000\u0000\u0000\u017e\u0011\u0001\u0000\u0000\u0000\u017f\u0181\u0007"+
		"\u0001\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0005"+
		"\u00ba\u0000\u0000\u0183\u0013\u0001\u0000\u0000\u0000\u0184\u0185\u0005"+
		"1\u0000\u0000\u0185\u0187\u0003\u008cF\u0000\u0186\u0184\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u01ad\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0005q\u0000\u0000\u0189\u018c\u0005_\u0000\u0000\u018a"+
		"\u018c\u0005\u008c\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018b"+
		"\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0005\u0003\u0000\u0000\u018e\u0193\u0003\b\u0004\u0000\u018f\u0190"+
		"\u0005\u0005\u0000\u0000\u0190\u0192\u0003\b\u0004\u0000\u0191\u018f\u0001"+
		"\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0196\u0001"+
		"\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0198\u0005"+
		"\u0004\u0000\u0000\u0197\u0199\u0003\u0018\f\u0000\u0198\u0197\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u01ae\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0005,\u0000\u0000\u019b\u019c\u0005\u0003\u0000"+
		"\u0000\u019c\u019d\u0003&\u0013\u0000\u019d\u019e\u0005\u0004\u0000\u0000"+
		"\u019e\u01ae\u0001\u0000\u0000\u0000\u019f\u01a0\u0005J\u0000\u0000\u01a0"+
		"\u01a1\u0005_\u0000\u0000\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a2\u01a7"+
		"\u0003\u0096K\u0000\u01a3\u01a4\u0005\u0005\u0000\u0000\u01a4\u01a6\u0003"+
		"\u0096K\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0005\u0004\u0000\u0000\u01ab\u01ac\u0003\u0016"+
		"\u000b\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u018b\u0001\u0000"+
		"\u0000\u0000\u01ad\u019a\u0001\u0000\u0000\u0000\u01ad\u019f\u0001\u0000"+
		"\u0000\u0000\u01ae\u0015\u0001\u0000\u0000\u0000\u01af\u01b0\u0005u\u0000"+
		"\u0000\u01b0\u01bc\u0003\u009aM\u0000\u01b1\u01b2\u0005\u0003\u0000\u0000"+
		"\u01b2\u01b7\u0003\u0096K\u0000\u01b3\u01b4\u0005\u0005\u0000\u0000\u01b4"+
		"\u01b6\u0003\u0096K\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u0004\u0000\u0000\u01bb\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bc\u01b1\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd\u01cc\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0005k\u0000\u0000\u01bf\u01c6\u0007\u0002\u0000\u0000\u01c0\u01c1\u0005"+
		"\u0083\u0000\u0000\u01c1\u01c7\u0007\u0003\u0000\u0000\u01c2\u01c7\u0005"+
		")\u0000\u0000\u01c3\u01c7\u0005{\u0000\u0000\u01c4\u01c5\u0005e\u0000"+
		"\u0000\u01c5\u01c7\u0005\u001a\u0000\u0000\u01c6\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c2\u0001\u0000\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01cb\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0005c\u0000\u0000\u01c9\u01cb\u0003\u008cF\u0000\u01ca"+
		"\u01be\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb"+
		"\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cd\u01d7\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d1\u0005f\u0000\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d5\u00059\u0000\u0000\u01d3\u01d4\u0005"+
		"V\u0000\u0000\u01d4\u01d6\u0007\u0004\u0000\u0000\u01d5\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d0\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u0017\u0001\u0000\u0000\u0000\u01d9\u01da\u0005k\u0000"+
		"\u0000\u01da\u01db\u00050\u0000\u0000\u01db\u01dc\u0007\u0005\u0000\u0000"+
		"\u01dc\u0019\u0001\u0000\u0000\u0000\u01dd\u01df\u0005\u0095\u0000\u0000"+
		"\u01de\u01e0\u0005t\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e2\u0003\u001c\u000e\u0000\u01e2\u01e3\u0005!\u0000\u0000\u01e3\u01e4"+
		"\u0005\u0003\u0000\u0000\u01e4\u01e5\u00038\u001c\u0000\u01e5\u01ef\u0005"+
		"\u0004\u0000\u0000\u01e6\u01e7\u0005\u0005\u0000\u0000\u01e7\u01e8\u0003"+
		"\u001c\u000e\u0000\u01e8\u01e9\u0005!\u0000\u0000\u01e9\u01ea\u0005\u0003"+
		"\u0000\u0000\u01ea\u01eb\u00038\u001c\u0000\u01eb\u01ec\u0005\u0004\u0000"+
		"\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01e6\u0001\u0000\u0000"+
		"\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u001b\u0001\u0000\u0000"+
		"\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01fe\u0003\u0092I\u0000"+
		"\u01f3\u01f4\u0005\u0003\u0000\u0000\u01f4\u01f9\u0003\u0096K\u0000\u01f5"+
		"\u01f6\u0005\u0005\u0000\u0000\u01f6\u01f8\u0003\u0096K\u0000\u01f7\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0005\u0004\u0000\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01f3"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u001d"+
		"\u0001\u0000\u0000\u0000\u0200\u0201\u0003\u001c\u000e\u0000\u0201\u0202"+
		"\u0005!\u0000\u0000\u0202\u0203\u0005\u0003\u0000\u0000\u0203\u0204\u0003"+
		"~?\u0000\u0204\u0206\u0005\u008b\u0000\u0000\u0205\u0207\u0005\u001d\u0000"+
		"\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000"+
		"\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0003\u0080@\u0000"+
		"\u0209\u020a\u0005\u0004\u0000\u0000\u020a\u001f\u0001\u0000\u0000\u0000"+
		"\u020b\u0217\u0003\u0092I\u0000\u020c\u020d\u0005\u0003\u0000\u0000\u020d"+
		"\u0212\u0003\u0096K\u0000\u020e\u020f\u0005\u0005\u0000\u0000\u020f\u0211"+
		"\u0003\u0096K\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0214\u0001"+
		"\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0213\u0001"+
		"\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u0212\u0001"+
		"\u0000\u0000\u0000\u0215\u0216\u0005\u0004\u0000\u0000\u0216\u0218\u0001"+
		"\u0000\u0000\u0000\u0217\u020c\u0001\u0000\u0000\u0000\u0217\u0218\u0001"+
		"\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0005"+
		"!\u0000\u0000\u021a\u021b\u0005\u0003\u0000\u0000\u021b\u021c\u00038\u001c"+
		"\u0000\u021c\u021d\u0005\u0004\u0000\u0000\u021d!\u0001\u0000\u0000\u0000"+
		"\u021e\u0220\u0003\u001a\r\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u0005;\u0000\u0000\u0222\u0223\u0005K\u0000\u0000\u0223\u0226\u0003"+
		"L&\u0000\u0224\u0225\u0005\u0094\u0000\u0000\u0225\u0227\u0003&\u0013"+
		"\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000"+
		"\u0000\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u022a\u00032\u0019\u0000"+
		"\u0229\u0228\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000"+
		"\u022a#\u0001\u0000\u0000\u0000\u022b\u022c\u0005?\u0000\u0000\u022c\u022f"+
		"\u0007\u0006\u0000\u0000\u022d\u022e\u0005P\u0000\u0000\u022e\u0230\u0005"+
		"F\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000"+
		"\u0000\u0000\u0230\u0234\u0001\u0000\u0000\u0000\u0231\u0232\u0003\u0090"+
		"H\u0000\u0232\u0233\u0005\u0002\u0000\u0000\u0233\u0235\u0001\u0000\u0000"+
		"\u0000\u0234\u0231\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0003\u00ba]\u0000"+
		"\u0237%\u0001\u0000\u0000\u0000\u0238\u0239\u0006\u0013\uffff\uffff\u0000"+
		"\u0239\u0291\u0003*\u0015\u0000\u023a\u0291\u0005\u00bb\u0000\u0000\u023b"+
		"\u023c\u0003\u0090H\u0000\u023c\u023d\u0005\u0002\u0000\u0000\u023d\u023f"+
		"\u0001\u0000\u0000\u0000\u023e\u023b\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\u0003\u0092I\u0000\u0241\u0242\u0005\u0002\u0000\u0000\u0242\u0244\u0001"+
		"\u0000\u0000\u0000\u0243\u023e\u0001\u0000\u0000\u0000\u0243\u0244\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0291\u0003"+
		"\u0096K\u0000\u0246\u0247\u0003\u0082A\u0000\u0247\u0248\u0003&\u0013"+
		"\u0015\u0248\u0291\u0001\u0000\u0000\u0000\u0249\u024a\u0003\u008eG\u0000"+
		"\u024a\u0257\u0005\u0003\u0000\u0000\u024b\u024d\u0005>\u0000\u0000\u024c"+
		"\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d"+
		"\u024e\u0001\u0000\u0000\u0000\u024e\u0253\u0003&\u0013\u0000\u024f\u0250"+
		"\u0005\u0005\u0000\u0000\u0250\u0252\u0003&\u0013\u0000\u0251\u024f\u0001"+
		"\u0000\u0000\u0000\u0252\u0255\u0001\u0000\u0000\u0000\u0253\u0251\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0258\u0001"+
		"\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0256\u0258\u0005"+
		"\u0007\u0000\u0000\u0257\u024c\u0001\u0000\u0000\u0000\u0257\u0256\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259\u0001"+
		"\u0000\u0000\u0000\u0259\u025b\u0005\u0004\u0000\u0000\u025a\u025c\u0003"+
		"P(\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000"+
		"\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u025f\u0003T*\u0000\u025e"+
		"\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"+
		"\u0291\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261"+
		"\u0266\u0003&\u0013\u0000\u0262\u0263\u0005\u0005\u0000\u0000\u0263\u0265"+
		"\u0003&\u0013\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0268\u0001"+
		"\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001"+
		"\u0000\u0000\u0000\u0267\u0269\u0001\u0000\u0000\u0000\u0268\u0266\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u0005\u0004\u0000\u0000\u026a\u0291\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0005+\u0000\u0000\u026c\u026d\u0005\u0003"+
		"\u0000\u0000\u026d\u026e\u0003&\u0013\u0000\u026e\u026f\u0005!\u0000\u0000"+
		"\u026f\u0270\u0003\u000e\u0007\u0000\u0270\u0271\u0005\u0004\u0000\u0000"+
		"\u0271\u0291\u0001\u0000\u0000\u0000\u0272\u0274\u0005f\u0000\u0000\u0273"+
		"\u0272\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274"+
		"\u0275\u0001\u0000\u0000\u0000\u0275\u0277\u0005F\u0000\u0000\u0276\u0273"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0005\u0003\u0000\u0000\u0279\u027a"+
		"\u00038\u001c\u0000\u027a\u027b\u0005\u0004\u0000\u0000\u027b\u0291\u0001"+
		"\u0000\u0000\u0000\u027c\u027e\u0005*\u0000\u0000\u027d\u027f\u0003&\u0013"+
		"\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000"+
		"\u0000\u027f\u0285\u0001\u0000\u0000\u0000\u0280\u0281\u0005\u0093\u0000"+
		"\u0000\u0281\u0282\u0003&\u0013\u0000\u0282\u0283\u0005\u0087\u0000\u0000"+
		"\u0283\u0284\u0003&\u0013\u0000\u0284\u0286\u0001\u0000\u0000\u0000\u0285"+
		"\u0280\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287"+
		"\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288"+
		"\u028b\u0001\u0000\u0000\u0000\u0289\u028a\u0005A\u0000\u0000\u028a\u028c"+
		"\u0003&\u0013\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001"+
		"\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028e\u0005"+
		"B\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u0291\u0003(\u0014"+
		"\u0000\u0290\u0238\u0001\u0000\u0000\u0000\u0290\u023a\u0001\u0000\u0000"+
		"\u0000\u0290\u0243\u0001\u0000\u0000\u0000\u0290\u0246\u0001\u0000\u0000"+
		"\u0000\u0290\u0249\u0001\u0000\u0000\u0000\u0290\u0260\u0001\u0000\u0000"+
		"\u0000\u0290\u026b\u0001\u0000\u0000\u0000\u0290\u0276\u0001\u0000\u0000"+
		"\u0000\u0290\u027c\u0001\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000"+
		"\u0000\u0291\u0309\u0001\u0000\u0000\u0000\u0292\u0293\n\u0014\u0000\u0000"+
		"\u0293\u0294\u0005\u000b\u0000\u0000\u0294\u0308\u0003&\u0013\u0015\u0295"+
		"\u0296\n\u0013\u0000\u0000\u0296\u0297\u0007\u0007\u0000\u0000\u0297\u0308"+
		"\u0003&\u0013\u0014\u0298\u0299\n\u0012\u0000\u0000\u0299\u029a\u0007"+
		"\u0001\u0000\u0000\u029a\u0308\u0003&\u0013\u0013\u029b\u029c\n\u0011"+
		"\u0000\u0000\u029c\u029d\u0007\b\u0000\u0000\u029d\u0308\u0003&\u0013"+
		"\u0012\u029e\u029f\n\u0010\u0000\u0000\u029f\u02a0\u0007\t\u0000\u0000"+
		"\u02a0\u0308\u0003&\u0013\u0011\u02a1\u02ae\n\u000f\u0000\u0000\u02a2"+
		"\u02af\u0005\u0006\u0000\u0000\u02a3\u02af\u0005\u0016\u0000\u0000\u02a4"+
		"\u02af\u0005\u0017\u0000\u0000\u02a5\u02af\u0005\u0018\u0000\u0000\u02a6"+
		"\u02af\u0005\\\u0000\u0000\u02a7\u02a8\u0005\\\u0000\u0000\u02a8\u02af"+
		"\u0005f\u0000\u0000\u02a9\u02af\u0005S\u0000\u0000\u02aa\u02af\u0005a"+
		"\u0000\u0000\u02ab\u02af\u0005M\u0000\u0000\u02ac\u02af\u0005c\u0000\u0000"+
		"\u02ad\u02af\u0005v\u0000\u0000\u02ae\u02a2\u0001\u0000\u0000\u0000\u02ae"+
		"\u02a3\u0001\u0000\u0000\u0000\u02ae\u02a4\u0001\u0000\u0000\u0000\u02ae"+
		"\u02a5\u0001\u0000\u0000\u0000\u02ae\u02a6\u0001\u0000\u0000\u0000\u02ae"+
		"\u02a7\u0001\u0000\u0000\u0000\u02ae\u02a9\u0001\u0000\u0000\u0000\u02ae"+
		"\u02aa\u0001\u0000\u0000\u0000\u02ae\u02ab\u0001\u0000\u0000\u0000\u02ae"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b0\u0308\u0003&\u0013\u0010\u02b1\u02b2"+
		"\n\u000e\u0000\u0000\u02b2\u02b3\u0005 \u0000\u0000\u02b3\u0308\u0003"+
		"&\u0013\u000f\u02b4\u02b5\n\r\u0000\u0000\u02b5\u02b6\u0005l\u0000\u0000"+
		"\u02b6\u0308\u0003&\u0013\u000e\u02b7\u02b8\n\u0006\u0000\u0000\u02b8"+
		"\u02ba\u0005\\\u0000\u0000\u02b9\u02bb\u0005f\u0000\u0000\u02ba\u02b9"+
		"\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bc\u0308\u0003&\u0013\u0007\u02bd\u02bf\n"+
		"\u0005\u0000\u0000\u02be\u02c0\u0005f\u0000\u0000\u02bf\u02be\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0005\'\u0000\u0000\u02c2\u02c3\u0003&\u0013"+
		"\u0000\u02c3\u02c4\u0005 \u0000\u0000\u02c4\u02c5\u0003&\u0013\u0006\u02c5"+
		"\u0308\u0001\u0000\u0000\u0000\u02c6\u02c7\n\t\u0000\u0000\u02c7\u02c8"+
		"\u0005-\u0000\u0000\u02c8\u0308\u0003\u0098L\u0000\u02c9\u02cb\n\b\u0000"+
		"\u0000\u02ca\u02cc\u0005f\u0000\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cd\u02ce\u0007\n\u0000\u0000\u02ce\u02d1\u0003&\u0013\u0000\u02cf"+
		"\u02d0\u0005C\u0000\u0000\u02d0\u02d2\u0003&\u0013\u0000\u02d1\u02cf\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u0308\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d8\n\u0007\u0000\u0000\u02d4\u02d9\u0005]"+
		"\u0000\u0000\u02d5\u02d9\u0005g\u0000\u0000\u02d6\u02d7\u0005f\u0000\u0000"+
		"\u02d7\u02d9\u0005h\u0000\u0000\u02d8\u02d4\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d9"+
		"\u0308\u0001\u0000\u0000\u0000\u02da\u02dc\n\u0004\u0000\u0000\u02db\u02dd"+
		"\u0005f\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001"+
		"\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u0305\u0005"+
		"S\u0000\u0000\u02df\u02e9\u0005\u0003\u0000\u0000\u02e0\u02ea\u00038\u001c"+
		"\u0000\u02e1\u02e6\u0003&\u0013\u0000\u02e2\u02e3\u0005\u0005\u0000\u0000"+
		"\u02e3\u02e5\u0003&\u0013\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e7\u0001\u0000\u0000\u0000\u02e7\u02ea\u0001\u0000\u0000\u0000\u02e8"+
		"\u02e6\u0001\u0000\u0000\u0000\u02e9\u02e0\u0001\u0000\u0000\u0000\u02e9"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea"+
		"\u02eb\u0001\u0000\u0000\u0000\u02eb\u0306\u0005\u0004\u0000\u0000\u02ec"+
		"\u02ed\u0003\u0090H\u0000\u02ed\u02ee\u0005\u0002\u0000\u0000\u02ee\u02f0"+
		"\u0001\u0000\u0000\u0000\u02ef\u02ec\u0001\u0000\u0000\u0000\u02ef\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u0306"+
		"\u0003\u0092I\u0000\u02f2\u02f3\u0003\u0090H\u0000\u02f3\u02f4\u0005\u0002"+
		"\u0000\u0000\u02f4\u02f6\u0001\u0000\u0000\u0000\u02f5\u02f2\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f8\u0003\u00b8\\\u0000\u02f8\u0301\u0005\u0003\u0000"+
		"\u0000\u02f9\u02fe\u0003&\u0013\u0000\u02fa\u02fb\u0005\u0005\u0000\u0000"+
		"\u02fb\u02fd\u0003&\u0013\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fd"+
		"\u0300\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02fe"+
		"\u02ff\u0001\u0000\u0000\u0000\u02ff\u0302\u0001\u0000\u0000\u0000\u0300"+
		"\u02fe\u0001\u0000\u0000\u0000\u0301\u02f9\u0001\u0000\u0000\u0000\u0301"+
		"\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303"+
		"\u0304\u0005\u0004\u0000\u0000\u0304\u0306\u0001\u0000\u0000\u0000\u0305"+
		"\u02df\u0001\u0000\u0000\u0000\u0305\u02ef\u0001\u0000\u0000\u0000\u0305"+
		"\u02f5\u0001\u0000\u0000\u0000\u0306\u0308\u0001\u0000\u0000\u0000\u0307"+
		"\u0292\u0001\u0000\u0000\u0000\u0307\u0295\u0001\u0000\u0000\u0000\u0307"+
		"\u0298\u0001\u0000\u0000\u0000\u0307\u029b\u0001\u0000\u0000\u0000\u0307"+
		"\u029e\u0001\u0000\u0000\u0000\u0307\u02a1\u0001\u0000\u0000\u0000\u0307"+
		"\u02b1\u0001\u0000\u0000\u0000\u0307\u02b4\u0001\u0000\u0000\u0000\u0307"+
		"\u02b7\u0001\u0000\u0000\u0000\u0307\u02bd\u0001\u0000\u0000\u0000\u0307"+
		"\u02c6\u0001\u0000\u0000\u0000\u0307\u02c9\u0001\u0000\u0000\u0000\u0307"+
		"\u02d3\u0001\u0000\u0000\u0000\u0307\u02da\u0001\u0000\u0000\u0000\u0308"+
		"\u030b\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u0309"+
		"\u030a\u0001\u0000\u0000\u0000\u030a\'\u0001\u0000\u0000\u0000\u030b\u0309"+
		"\u0001\u0000\u0000\u0000\u030c\u030d\u0005s\u0000\u0000\u030d\u0312\u0005"+
		"\u0003\u0000\u0000\u030e\u0313\u0005Q\u0000\u0000\u030f\u0310\u0007\u000b"+
		"\u0000\u0000\u0310\u0311\u0005\u0005\u0000\u0000\u0311\u0313\u0003\u0084"+
		"B\u0000\u0312\u030e\u0001\u0000\u0000\u0000\u0312\u030f\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0315\u0005\u0004\u0000"+
		"\u0000\u0315)\u0001\u0000\u0000\u0000\u0316\u0317\u0007\f\u0000\u0000"+
		"\u0317+\u0001\u0000\u0000\u0000\u0318\u0319\u0005\u0003\u0000\u0000\u0319"+
		"\u031e\u0003&\u0013\u0000\u031a\u031b\u0005\u0005\u0000\u0000\u031b\u031d"+
		"\u0003&\u0013\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031d\u0320\u0001"+
		"\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031e\u031f\u0001"+
		"\u0000\u0000\u0000\u031f\u0321\u0001\u0000\u0000\u0000\u0320\u031e\u0001"+
		"\u0000\u0000\u0000\u0321\u0322\u0005\u0004\u0000\u0000\u0322-\u0001\u0000"+
		"\u0000\u0000\u0323\u0324\u0005\u0090\u0000\u0000\u0324\u0329\u0003,\u0016"+
		"\u0000\u0325\u0326\u0005\u0005\u0000\u0000\u0326\u0328\u0003,\u0016\u0000"+
		"\u0327\u0325\u0001\u0000\u0000\u0000\u0328\u032b\u0001\u0000\u0000\u0000"+
		"\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000"+
		"\u032a/\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032c"+
		"\u032e\u0003\u001a\r\u0000\u032d\u032c\u0001\u0000\u0000\u0000\u032d\u032e"+
		"\u0001\u0000\u0000\u0000\u032e\u0334\u0001\u0000\u0000\u0000\u032f\u0335"+
		"\u0005X\u0000\u0000\u0330\u0335\u0005z\u0000\u0000\u0331\u0332\u0005X"+
		"\u0000\u0000\u0332\u0333\u0005l\u0000\u0000\u0333\u0335\u0007\u0005\u0000"+
		"\u0000\u0334\u032f\u0001\u0000\u0000\u0000\u0334\u0330\u0001\u0000\u0000"+
		"\u0000\u0334\u0331\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000"+
		"\u0000\u0336\u033a\u0005[\u0000\u0000\u0337\u0338\u0003\u0090H\u0000\u0338"+
		"\u0339\u0005\u0002\u0000\u0000\u0339\u033b\u0001\u0000\u0000\u0000\u033a"+
		"\u0337\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\u0001\u0000\u0000\u0000\u033c\u033f\u0003\u0092I\u0000\u033d\u033e"+
		"\u0005!\u0000\u0000\u033e\u0340\u0003\u00a8T\u0000\u033f\u033d\u0001\u0000"+
		"\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u034c\u0001\u0000"+
		"\u0000\u0000\u0341\u0342\u0005\u0003\u0000\u0000\u0342\u0347\u0003\u0096"+
		"K\u0000\u0343\u0344\u0005\u0005\u0000\u0000\u0344\u0346\u0003\u0096K\u0000"+
		"\u0345\u0343\u0001\u0000\u0000\u0000\u0346\u0349\u0001\u0000\u0000\u0000"+
		"\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000"+
		"\u0348\u034a\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000"+
		"\u034a\u034b\u0005\u0004\u0000\u0000\u034b\u034d\u0001\u0000\u0000\u0000"+
		"\u034c\u0341\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000"+
		"\u034d\u0357\u0001\u0000\u0000\u0000\u034e\u0351\u0003.\u0017\u0000\u034f"+
		"\u0351\u00038\u001c\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0350\u034f"+
		"\u0001\u0000\u0000\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352\u0354"+
		"\u00034\u001a\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0353\u0354\u0001"+
		"\u0000\u0000\u0000\u0354\u0358\u0001\u0000\u0000\u0000\u0355\u0356\u0005"+
		"8\u0000\u0000\u0356\u0358\u0005\u0090\u0000\u0000\u0357\u0350\u0001\u0000"+
		"\u0000\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0358\u035a\u0001\u0000"+
		"\u0000\u0000\u0359\u035b\u00032\u0019\u0000\u035a\u0359\u0001\u0000\u0000"+
		"\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b1\u0001\u0000\u0000\u0000"+
		"\u035c\u035d\u0005|\u0000\u0000\u035d\u0362\u0003@ \u0000\u035e\u035f"+
		"\u0005\u0005\u0000\u0000\u035f\u0361\u0003@ \u0000\u0360\u035e\u0001\u0000"+
		"\u0000\u0000\u0361\u0364\u0001\u0000\u0000\u0000\u0362\u0360\u0001\u0000"+
		"\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u03633\u0001\u0000\u0000"+
		"\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0365\u0366\u0005k\u0000\u0000"+
		"\u0366\u0375\u00050\u0000\u0000\u0367\u0368\u0005\u0003\u0000\u0000\u0368"+
		"\u036d\u0003\b\u0004\u0000\u0369\u036a\u0005\u0005\u0000\u0000\u036a\u036c"+
		"\u0003\b\u0004\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036c\u036f\u0001"+
		"\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036e\u0001"+
		"\u0000\u0000\u0000\u036e\u0370\u0001\u0000\u0000\u0000\u036f\u036d\u0001"+
		"\u0000\u0000\u0000\u0370\u0373\u0005\u0004\u0000\u0000\u0371\u0372\u0005"+
		"\u0094\u0000\u0000\u0372\u0374\u0003&\u0013\u0000\u0373\u0371\u0001\u0000"+
		"\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0376\u0001\u0000"+
		"\u0000\u0000\u0375\u0367\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0392\u0005\u00b7"+
		"\u0000\u0000\u0378\u0393\u0005\u00b8\u0000\u0000\u0379\u037a\u0005\u008d"+
		"\u0000\u0000\u037a\u037d\u0005\u0083\u0000\u0000\u037b\u037e\u0003\u0096"+
		"K\u0000\u037c\u037e\u0003J%\u0000\u037d\u037b\u0001\u0000\u0000\u0000"+
		"\u037d\u037c\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000"+
		"\u037f\u0380\u0005\u0006\u0000\u0000\u0380\u038b\u0003&\u0013\u0000\u0381"+
		"\u0384\u0005\u0005\u0000\u0000\u0382\u0385\u0003\u0096K\u0000\u0383\u0385"+
		"\u0003J%\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0384\u0383\u0001\u0000"+
		"\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0387\u0005\u0006"+
		"\u0000\u0000\u0387\u0388\u0003&\u0013\u0000\u0388\u038a\u0001\u0000\u0000"+
		"\u0000\u0389\u0381\u0001\u0000\u0000\u0000\u038a\u038d\u0001\u0000\u0000"+
		"\u0000\u038b\u0389\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000"+
		"\u0000\u038c\u0390\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000"+
		"\u0000\u038e\u038f\u0005\u0094\u0000\u0000\u038f\u0391\u0003&\u0013\u0000"+
		"\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000"+
		"\u0391\u0393\u0001\u0000\u0000\u0000\u0392\u0378\u0001\u0000\u0000\u0000"+
		"\u0392\u0379\u0001\u0000\u0000\u0000\u03935\u0001\u0000\u0000\u0000\u0394"+
		"\u0398\u0003\u0012\t\u0000\u0395\u0398\u0003\u008cF\u0000\u0396\u0398"+
		"\u0005\u00bc\u0000\u0000\u0397\u0394\u0001\u0000\u0000\u0000\u0397\u0395"+
		"\u0001\u0000\u0000\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u03987\u0001"+
		"\u0000\u0000\u0000\u0399\u039b\u0003`0\u0000\u039a\u0399\u0001\u0000\u0000"+
		"\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000"+
		"\u0000\u039c\u03a2\u0003<\u001e\u0000\u039d\u039e\u0003F#\u0000\u039e"+
		"\u039f\u0003<\u001e\u0000\u039f\u03a1\u0001\u0000\u0000\u0000\u03a0\u039d"+
		"\u0001\u0000\u0000\u0000\u03a1\u03a4\u0001\u0000\u0000\u0000\u03a2\u03a0"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a7"+
		"\u0003b1\u0000\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000"+
		"\u0000\u0000\u03a7\u03a9\u0001\u0000\u0000\u0000\u03a8\u03aa\u0003d2\u0000"+
		"\u03a9\u03a8\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000"+
		"\u03aa9\u0001\u0000\u0000\u0000\u03ab\u03b3\u0003>\u001f\u0000\u03ac\u03ad"+
		"\u0003B!\u0000\u03ad\u03af\u0003>\u001f\u0000\u03ae\u03b0\u0003D\"\u0000"+
		"\u03af\u03ae\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1\u03ac\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b5\u0001\u0000\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000"+
		"\u03b3\u03b4\u0001\u0000\u0000\u0000\u03b4;\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b6\u03b8\u0005\u0082\u0000\u0000\u03b7"+
		"\u03b9\u0007\r\u0000\u0000\u03b8\u03b7\u0001\u0000\u0000\u0000\u03b8\u03b9"+
		"\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba\u03bf"+
		"\u0003@ \u0000\u03bb\u03bc\u0005\u0005\u0000\u0000\u03bc\u03be\u0003@"+
		" \u0000\u03bd\u03bb\u0001\u0000\u0000\u0000\u03be\u03c1\u0001\u0000\u0000"+
		"\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000"+
		"\u0000\u03c0\u03ce\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000"+
		"\u0000\u03c2\u03cc\u0005K\u0000\u0000\u03c3\u03c8\u0003>\u001f\u0000\u03c4"+
		"\u03c5\u0005\u0005\u0000\u0000\u03c5\u03c7\u0003>\u001f\u0000\u03c6\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c7\u03ca\u0001\u0000\u0000\u0000\u03c8\u03c6"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cd"+
		"\u0001\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03cb\u03cd"+
		"\u0003:\u001d\u0000\u03cc\u03c3\u0001\u0000\u0000\u0000\u03cc\u03cb\u0001"+
		"\u0000\u0000\u0000\u03cd\u03cf\u0001\u0000\u0000\u0000\u03ce\u03c2\u0001"+
		"\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d0\u03d1\u0005\u0094\u0000\u0000\u03d1\u03d3\u0003"+
		"&\u0013\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d3\u03e2\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005N\u0000"+
		"\u0000\u03d5\u03d6\u0005(\u0000\u0000\u03d6\u03db\u0003&\u0013\u0000\u03d7"+
		"\u03d8\u0005\u0005\u0000\u0000\u03d8\u03da\u0003&\u0013\u0000\u03d9\u03d7"+
		"\u0001\u0000\u0000\u0000\u03da\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9"+
		"\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03e0"+
		"\u0001\u0000\u0000\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03de\u03df"+
		"\u0005O\u0000\u0000\u03df\u03e1\u0003&\u0013\u0000\u03e0\u03de\u0001\u0000"+
		"\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e2\u03d4\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e3\u03f2\u0001\u0000\u0000\u0000\u03e4\u03e5\u0005\u00ae"+
		"\u0000\u0000\u03e5\u03e6\u0003\u00acV\u0000\u03e6\u03e7\u0005!\u0000\u0000"+
		"\u03e7\u03ef\u0003R)\u0000\u03e8\u03e9\u0005\u0005\u0000\u0000\u03e9\u03ea"+
		"\u0003\u00acV\u0000\u03ea\u03eb\u0005!\u0000\u0000\u03eb\u03ec\u0003R"+
		")\u0000\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed\u03e8\u0001\u0000\u0000"+
		"\u0000\u03ee\u03f1\u0001\u0000\u0000\u0000\u03ef\u03ed\u0001\u0000\u0000"+
		"\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u03f3\u0001\u0000\u0000"+
		"\u0000\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f2\u03e4\u0001\u0000\u0000"+
		"\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f6\u0003.\u0017\u0000\u03f5\u03b6\u0001\u0000\u0000\u0000"+
		"\u03f5\u03f4\u0001\u0000\u0000\u0000\u03f6=\u0001\u0000\u0000\u0000\u03f7"+
		"\u03f8\u0003\u0090H\u0000\u03f8\u03f9\u0005\u0002\u0000\u0000\u03f9\u03fb"+
		"\u0001\u0000\u0000\u0000\u03fa\u03f7\u0001\u0000\u0000\u0000\u03fa\u03fb"+
		"\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u0401"+
		"\u0003\u0092I\u0000\u03fd\u03ff\u0005!\u0000\u0000\u03fe\u03fd\u0001\u0000"+
		"\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400\u0001\u0000"+
		"\u0000\u0000\u0400\u0402\u0003\u00a8T\u0000\u0401\u03fe\u0001\u0000\u0000"+
		"\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0408\u0001\u0000\u0000"+
		"\u0000\u0403\u0404\u0005U\u0000\u0000\u0404\u0405\u0005(\u0000\u0000\u0405"+
		"\u0409\u0003\u009cN\u0000\u0406\u0407\u0005f\u0000\u0000\u0407\u0409\u0005"+
		"U\u0000\u0000\u0408\u0403\u0001\u0000\u0000\u0000\u0408\u0406\u0001\u0000"+
		"\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u0438\u0001\u0000"+
		"\u0000\u0000\u040a\u040b\u0003\u0090H\u0000\u040b\u040c\u0005\u0002\u0000"+
		"\u0000\u040c\u040e\u0001\u0000\u0000\u0000\u040d\u040a\u0001\u0000\u0000"+
		"\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000"+
		"\u0000\u040f\u0410\u0003\u00b8\\\u0000\u0410\u0411\u0005\u0003\u0000\u0000"+
		"\u0411\u0416\u0003&\u0013\u0000\u0412\u0413\u0005\u0005\u0000\u0000\u0413"+
		"\u0415\u0003&\u0013\u0000\u0414\u0412\u0001\u0000\u0000\u0000\u0415\u0418"+
		"\u0001\u0000\u0000\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0416\u0417"+
		"\u0001\u0000\u0000\u0000\u0417\u0419\u0001\u0000\u0000\u0000\u0418\u0416"+
		"\u0001\u0000\u0000\u0000\u0419\u041e\u0005\u0004\u0000\u0000\u041a\u041c"+
		"\u0005!\u0000\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041b\u041c\u0001"+
		"\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u041f\u0003"+
		"\u00a8T\u0000\u041e\u041b\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000"+
		"\u0000\u0000\u041f\u0438\u0001\u0000\u0000\u0000\u0420\u042a\u0005\u0003"+
		"\u0000\u0000\u0421\u0426\u0003>\u001f\u0000\u0422\u0423\u0005\u0005\u0000"+
		"\u0000\u0423\u0425\u0003>\u001f\u0000\u0424\u0422\u0001\u0000\u0000\u0000"+
		"\u0425\u0428\u0001\u0000\u0000\u0000\u0426\u0424\u0001\u0000\u0000\u0000"+
		"\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u042b\u0001\u0000\u0000\u0000"+
		"\u0428\u0426\u0001\u0000\u0000\u0000\u0429\u042b\u0003:\u001d\u0000\u042a"+
		"\u0421\u0001\u0000\u0000\u0000\u042a\u0429\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0001\u0000\u0000\u0000\u042c\u042d\u0005\u0004\u0000\u0000\u042d"+
		"\u0438\u0001\u0000\u0000\u0000\u042e\u042f\u0005\u0003\u0000\u0000\u042f"+
		"\u0430\u00038\u001c\u0000\u0430\u0435\u0005\u0004\u0000\u0000\u0431\u0433"+
		"\u0005!\u0000\u0000\u0432\u0431\u0001\u0000\u0000\u0000\u0432\u0433\u0001"+
		"\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u0436\u0003"+
		"\u00a8T\u0000\u0435\u0432\u0001\u0000\u0000\u0000\u0435\u0436\u0001\u0000"+
		"\u0000\u0000\u0436\u0438\u0001\u0000\u0000\u0000\u0437\u03fa\u0001\u0000"+
		"\u0000\u0000\u0437\u040d\u0001\u0000\u0000\u0000\u0437\u0420\u0001\u0000"+
		"\u0000\u0000\u0437\u042e\u0001\u0000\u0000\u0000\u0438?\u0001\u0000\u0000"+
		"\u0000\u0439\u0446\u0005\u0007\u0000\u0000\u043a\u043b\u0003\u0092I\u0000"+
		"\u043b\u043c\u0005\u0002\u0000\u0000\u043c\u043d\u0005\u0007\u0000\u0000"+
		"\u043d\u0446\u0001\u0000\u0000\u0000\u043e\u0443\u0003&\u0013\u0000\u043f"+
		"\u0441\u0005!\u0000\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0440\u0441"+
		"\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0444"+
		"\u0003\u0088D\u0000\u0443\u0440\u0001\u0000\u0000\u0000\u0443\u0444\u0001"+
		"\u0000\u0000\u0000\u0444\u0446\u0001\u0000\u0000\u0000\u0445\u0439\u0001"+
		"\u0000\u0000\u0000\u0445\u043a\u0001\u0000\u0000\u0000\u0445\u043e\u0001"+
		"\u0000\u0000\u0000\u0446A\u0001\u0000\u0000\u0000\u0447\u0455\u0005\u0005"+
		"\u0000\u0000\u0448\u044a\u0005d\u0000\u0000\u0449\u0448\u0001\u0000\u0000"+
		"\u0000\u0449\u044a\u0001\u0000\u0000\u0000\u044a\u0451\u0001\u0000\u0000"+
		"\u0000\u044b\u044d\u0005`\u0000\u0000\u044c\u044e\u0005n\u0000\u0000\u044d"+
		"\u044c\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e"+
		"\u0452\u0001\u0000\u0000\u0000\u044f\u0452\u0005W\u0000\u0000\u0450\u0452"+
		"\u00053\u0000\u0000\u0451\u044b\u0001\u0000\u0000\u0000\u0451\u044f\u0001"+
		"\u0000\u0000\u0000\u0451\u0450\u0001\u0000\u0000\u0000\u0451\u0452\u0001"+
		"\u0000\u0000\u0000\u0452\u0453\u0001\u0000\u0000\u0000\u0453\u0455\u0005"+
		"^\u0000\u0000\u0454\u0447\u0001\u0000\u0000\u0000\u0454\u0449\u0001\u0000"+
		"\u0000\u0000\u0455C\u0001\u0000\u0000\u0000\u0456\u0457\u0005k\u0000\u0000"+
		"\u0457\u0465\u0003&\u0013\u0000\u0458\u0459\u0005\u008e\u0000\u0000\u0459"+
		"\u045a\u0005\u0003\u0000\u0000\u045a\u045f\u0003\u0096K\u0000\u045b\u045c"+
		"\u0005\u0005\u0000\u0000\u045c\u045e\u0003\u0096K\u0000\u045d\u045b\u0001"+
		"\u0000\u0000\u0000\u045e\u0461\u0001\u0000\u0000\u0000\u045f\u045d\u0001"+
		"\u0000\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u0462\u0001"+
		"\u0000\u0000\u0000\u0461\u045f\u0001\u0000\u0000\u0000\u0462\u0463\u0005"+
		"\u0004\u0000\u0000\u0463\u0465\u0001\u0000\u0000\u0000\u0464\u0456\u0001"+
		"\u0000\u0000\u0000\u0464\u0458\u0001\u0000\u0000\u0000\u0465E\u0001\u0000"+
		"\u0000\u0000\u0466\u0468\u0005\u008b\u0000\u0000\u0467\u0469\u0005\u001d"+
		"\u0000\u0000\u0468\u0467\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000"+
		"\u0000\u0000\u0469\u046d\u0001\u0000\u0000\u0000\u046a\u046d\u0005Z\u0000"+
		"\u0000\u046b\u046d\u0005D\u0000\u0000\u046c\u0466\u0001\u0000\u0000\u0000"+
		"\u046c\u046a\u0001\u0000\u0000\u0000\u046c\u046b\u0001\u0000\u0000\u0000"+
		"\u046dG\u0001\u0000\u0000\u0000\u046e\u0470\u0003\u001a\r\u0000\u046f"+
		"\u046e\u0001\u0000\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470"+
		"\u0471\u0001\u0000\u0000\u0000\u0471\u0474\u0005\u008d\u0000\u0000\u0472"+
		"\u0473\u0005l\u0000\u0000\u0473\u0475\u0007\u0005\u0000\u0000\u0474\u0472"+
		"\u0001\u0000\u0000\u0000\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0476"+
		"\u0001\u0000\u0000\u0000\u0476\u0477\u0003L&\u0000\u0477\u047a\u0005\u0083"+
		"\u0000\u0000\u0478\u047b\u0003\u0096K\u0000\u0479\u047b\u0003J%\u0000"+
		"\u047a\u0478\u0001\u0000\u0000\u0000\u047a\u0479\u0001\u0000\u0000\u0000"+
		"\u047b\u047c\u0001\u0000\u0000\u0000\u047c\u047d\u0005\u0006\u0000\u0000"+
		"\u047d\u0488\u0003&\u0013\u0000\u047e\u0481\u0005\u0005\u0000\u0000\u047f"+
		"\u0482\u0003\u0096K\u0000\u0480\u0482\u0003J%\u0000\u0481\u047f\u0001"+
		"\u0000\u0000\u0000\u0481\u0480\u0001\u0000\u0000\u0000\u0482\u0483\u0001"+
		"\u0000\u0000\u0000\u0483\u0484\u0005\u0006\u0000\u0000\u0484\u0485\u0003"+
		"&\u0013\u0000\u0485\u0487\u0001\u0000\u0000\u0000\u0486\u047e\u0001\u0000"+
		"\u0000\u0000\u0487\u048a\u0001\u0000\u0000\u0000\u0488\u0486\u0001\u0000"+
		"\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u0497\u0001\u0000"+
		"\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048b\u0495\u0005K\u0000"+
		"\u0000\u048c\u0491\u0003>\u001f\u0000\u048d\u048e\u0005\u0005\u0000\u0000"+
		"\u048e\u0490\u0003>\u001f\u0000\u048f\u048d\u0001\u0000\u0000\u0000\u0490"+
		"\u0493\u0001\u0000\u0000\u0000\u0491\u048f\u0001\u0000\u0000\u0000\u0491"+
		"\u0492\u0001\u0000\u0000\u0000\u0492\u0496\u0001\u0000\u0000\u0000\u0493"+
		"\u0491\u0001\u0000\u0000\u0000\u0494\u0496\u0003:\u001d\u0000\u0495\u048c"+
		"\u0001\u0000\u0000\u0000\u0495\u0494\u0001\u0000\u0000\u0000\u0496\u0498"+
		"\u0001\u0000\u0000\u0000\u0497\u048b\u0001\u0000\u0000\u0000\u0497\u0498"+
		"\u0001\u0000\u0000\u0000\u0498\u049b\u0001\u0000\u0000\u0000\u0499\u049a"+
		"\u0005\u0094\u0000\u0000\u049a\u049c\u0003&\u0013\u0000\u049b\u0499\u0001"+
		"\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049e\u0001"+
		"\u0000\u0000\u0000\u049d\u049f\u00032\u0019\u0000\u049e\u049d\u0001\u0000"+
		"\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049fI\u0001\u0000\u0000"+
		"\u0000\u04a0\u04a1\u0005\u0003\u0000\u0000\u04a1\u04a6\u0003\u0096K\u0000"+
		"\u04a2\u04a3\u0005\u0005\u0000\u0000\u04a3\u04a5\u0003\u0096K\u0000\u04a4"+
		"\u04a2\u0001\u0000\u0000\u0000\u04a5\u04a8\u0001\u0000\u0000\u0000\u04a6"+
		"\u04a4\u0001\u0000\u0000\u0000\u04a6\u04a7\u0001\u0000\u0000\u0000\u04a7"+
		"\u04a9\u0001\u0000\u0000\u0000\u04a8\u04a6\u0001\u0000\u0000\u0000\u04a9"+
		"\u04aa\u0005\u0004\u0000\u0000\u04aaK\u0001\u0000\u0000\u0000\u04ab\u04ac"+
		"\u0003\u0090H\u0000\u04ac\u04ad\u0005\u0002\u0000\u0000\u04ad\u04af\u0001"+
		"\u0000\u0000\u0000\u04ae\u04ab\u0001\u0000\u0000\u0000\u04ae\u04af\u0001"+
		"\u0000\u0000\u0000\u04af\u04b0\u0001\u0000\u0000\u0000\u04b0\u04b3\u0003"+
		"\u0092I\u0000\u04b1\u04b2\u0005!\u0000\u0000\u04b2\u04b4\u0003\u00aeW"+
		"\u0000\u04b3\u04b1\u0001\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000"+
		"\u0000\u04b4\u04ba\u0001\u0000\u0000\u0000\u04b5\u04b6\u0005U\u0000\u0000"+
		"\u04b6\u04b7\u0005(\u0000\u0000\u04b7\u04bb\u0003\u009cN\u0000\u04b8\u04b9"+
		"\u0005f\u0000\u0000\u04b9\u04bb\u0005U\u0000\u0000\u04ba\u04b5\u0001\u0000"+
		"\u0000\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000"+
		"\u0000\u0000\u04bbM\u0001\u0000\u0000\u0000\u04bc\u04bf\u0005\u008f\u0000"+
		"\u0000\u04bd\u04be\u0005[\u0000\u0000\u04be\u04c0\u0003\u00b0X\u0000\u04bf"+
		"\u04bd\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0"+
		"O\u0001\u0000\u0000\u0000\u04c1\u04c2\u0005\u00b2\u0000\u0000\u04c2\u04c3"+
		"\u0005\u0003\u0000\u0000\u04c3\u04c4\u0005\u0094\u0000\u0000\u04c4\u04c5"+
		"\u0003&\u0013\u0000\u04c5\u04c6\u0005\u0004\u0000\u0000\u04c6Q\u0001\u0000"+
		"\u0000\u0000\u04c7\u04c9\u0005\u0003\u0000\u0000\u04c8\u04ca\u0003\u00b2"+
		"Y\u0000\u04c9\u04c8\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000"+
		"\u0000\u04ca\u04d5\u0001\u0000\u0000\u0000\u04cb\u04cc\u0005\u0099\u0000"+
		"\u0000\u04cc\u04cd\u0005(\u0000\u0000\u04cd\u04d2\u0003&\u0013\u0000\u04ce"+
		"\u04cf\u0005\u0005\u0000\u0000\u04cf\u04d1\u0003&\u0013\u0000\u04d0\u04ce"+
		"\u0001\u0000\u0000\u0000\u04d1\u04d4\u0001\u0000\u0000\u0000\u04d2\u04d0"+
		"\u0001\u0000\u0000\u0000\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3\u04d6"+
		"\u0001\u0000\u0000\u0000\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d5\u04cb"+
		"\u0001\u0000\u0000\u0000\u04d5\u04d6\u0001\u0000\u0000\u0000\u04d6\u04d7"+
		"\u0001\u0000\u0000\u0000\u04d7\u04d8\u0005m\u0000\u0000\u04d8\u04d9\u0005"+
		"(\u0000\u0000\u04d9\u04de\u0003f3\u0000\u04da\u04db\u0005\u0005\u0000"+
		"\u0000\u04db\u04dd\u0003f3\u0000\u04dc\u04da\u0001\u0000\u0000\u0000\u04dd"+
		"\u04e0\u0001\u0000\u0000\u0000\u04de\u04dc\u0001\u0000\u0000\u0000\u04de"+
		"\u04df\u0001\u0000\u0000\u0000\u04df\u04e2\u0001\u0000\u0000\u0000\u04e0"+
		"\u04de\u0001\u0000\u0000\u0000\u04e1\u04e3\u0003V+\u0000\u04e2\u04e1\u0001"+
		"\u0000\u0000\u0000\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04e4\u0001"+
		"\u0000\u0000\u0000\u04e4\u04e5\u0005\u0004\u0000\u0000\u04e5S\u0001\u0000"+
		"\u0000\u0000\u04e6\u0508\u0005\u0098\u0000\u0000\u04e7\u0509\u0003\u00ac"+
		"V\u0000\u04e8\u04ea\u0005\u0003\u0000\u0000\u04e9\u04eb\u0003\u00b2Y\u0000"+
		"\u04ea\u04e9\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000"+
		"\u04eb\u04f6\u0001\u0000\u0000\u0000\u04ec\u04ed\u0005\u0099\u0000\u0000"+
		"\u04ed\u04ee\u0005(\u0000\u0000\u04ee\u04f3\u0003&\u0013\u0000\u04ef\u04f0"+
		"\u0005\u0005\u0000\u0000\u04f0\u04f2\u0003&\u0013\u0000\u04f1\u04ef\u0001"+
		"\u0000\u0000\u0000\u04f2\u04f5\u0001\u0000\u0000\u0000\u04f3\u04f1\u0001"+
		"\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f7\u0001"+
		"\u0000\u0000\u0000\u04f5\u04f3\u0001\u0000\u0000\u0000\u04f6\u04ec\u0001"+
		"\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u0502\u0001"+
		"\u0000\u0000\u0000\u04f8\u04f9\u0005m\u0000\u0000\u04f9\u04fa\u0005(\u0000"+
		"\u0000\u04fa\u04ff\u0003f3\u0000\u04fb\u04fc\u0005\u0005\u0000\u0000\u04fc"+
		"\u04fe\u0003f3\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fe\u0501\u0001"+
		"\u0000\u0000\u0000\u04ff\u04fd\u0001\u0000\u0000\u0000\u04ff\u0500\u0001"+
		"\u0000\u0000\u0000\u0500\u0503\u0001\u0000\u0000\u0000\u0501\u04ff\u0001"+
		"\u0000\u0000\u0000\u0502\u04f8\u0001\u0000\u0000\u0000\u0502\u0503\u0001"+
		"\u0000\u0000\u0000\u0503\u0505\u0001\u0000\u0000\u0000\u0504\u0506\u0003"+
		"V+\u0000\u0505\u0504\u0001\u0000\u0000\u0000\u0505\u0506\u0001\u0000\u0000"+
		"\u0000\u0506\u0507\u0001\u0000\u0000\u0000\u0507\u0509\u0005\u0004\u0000"+
		"\u0000\u0508\u04e7\u0001\u0000\u0000\u0000\u0508\u04e8\u0001\u0000\u0000"+
		"\u0000\u0509U\u0001\u0000\u0000\u0000\u050a\u0514\u0003X,\u0000\u050b"+
		"\u0512\u0005\u00b4\u0000\u0000\u050c\u050d\u0005e\u0000\u0000\u050d\u0513"+
		"\u0005\u00b6\u0000\u0000\u050e\u050f\u0005\u009d\u0000\u0000\u050f\u0513"+
		"\u0005\u007f\u0000\u0000\u0510\u0513\u0005N\u0000\u0000\u0511\u0513\u0005"+
		"\u00b5\u0000\u0000\u0512\u050c\u0001\u0000\u0000\u0000\u0512\u050e\u0001"+
		"\u0000\u0000\u0000\u0512\u0510\u0001\u0000\u0000\u0000\u0512\u0511\u0001"+
		"\u0000\u0000\u0000\u0513\u0515\u0001\u0000\u0000\u0000\u0514\u050b\u0001"+
		"\u0000\u0000\u0000\u0514\u0515\u0001\u0000\u0000\u0000\u0515W\u0001\u0000"+
		"\u0000\u0000\u0516\u051d\u0007\u000e\u0000\u0000\u0517\u051e\u0003n7\u0000"+
		"\u0518\u0519\u0005\'\u0000\u0000\u0519\u051a\u0003j5\u0000\u051a\u051b"+
		"\u0005 \u0000\u0000\u051b\u051c\u0003l6\u0000\u051c\u051e\u0001\u0000"+
		"\u0000\u0000\u051d\u0517\u0001\u0000\u0000\u0000\u051d\u0518\u0001\u0000"+
		"\u0000\u0000\u051eY\u0001\u0000\u0000\u0000\u051f\u0520\u0003\u00b4Z\u0000"+
		"\u0520\u052a\u0005\u0003\u0000\u0000\u0521\u0526\u0003&\u0013\u0000\u0522"+
		"\u0523\u0005\u0005\u0000\u0000\u0523\u0525\u0003&\u0013\u0000\u0524\u0522"+
		"\u0001\u0000\u0000\u0000\u0525\u0528\u0001\u0000\u0000\u0000\u0526\u0524"+
		"\u0001\u0000\u0000\u0000\u0526\u0527\u0001\u0000\u0000\u0000\u0527\u052b"+
		"\u0001\u0000\u0000\u0000\u0528\u0526\u0001\u0000\u0000\u0000\u0529\u052b"+
		"\u0005\u0007\u0000\u0000\u052a\u0521\u0001\u0000\u0000\u0000\u052a\u0529"+
		"\u0001\u0000\u0000\u0000\u052b\u052c\u0001\u0000\u0000\u0000\u052c\u052d"+
		"\u0005\u0004\u0000\u0000\u052d[\u0001\u0000\u0000\u0000\u052e\u052f\u0003"+
		"\u00b6[\u0000\u052f\u053c\u0005\u0003\u0000\u0000\u0530\u0532\u0005>\u0000"+
		"\u0000\u0531\u0530\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000"+
		"\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u0538\u0003&\u0013\u0000"+
		"\u0534\u0535\u0005\u0005\u0000\u0000\u0535\u0537\u0003&\u0013\u0000\u0536"+
		"\u0534\u0001\u0000\u0000\u0000\u0537\u053a\u0001\u0000\u0000\u0000\u0538"+
		"\u0536\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539"+
		"\u053d\u0001\u0000\u0000\u0000\u053a\u0538\u0001\u0000\u0000\u0000\u053b"+
		"\u053d\u0005\u0007\u0000\u0000\u053c\u0531\u0001\u0000\u0000\u0000\u053c"+
		"\u053b\u0001\u0000\u0000\u0000\u053c\u053d\u0001\u0000\u0000\u0000\u053d"+
		"\u053e\u0001\u0000\u0000\u0000\u053e\u0540\u0005\u0004\u0000\u0000\u053f"+
		"\u0541\u0003P(\u0000\u0540\u053f\u0001\u0000\u0000\u0000\u0540\u0541\u0001"+
		"\u0000\u0000\u0000\u0541]\u0001\u0000\u0000\u0000\u0542\u0543\u0003p8"+
		"\u0000\u0543\u054d\u0005\u0003\u0000\u0000\u0544\u0549\u0003&\u0013\u0000"+
		"\u0545\u0546\u0005\u0005\u0000\u0000\u0546\u0548\u0003&\u0013\u0000\u0547"+
		"\u0545\u0001\u0000\u0000\u0000\u0548\u054b\u0001\u0000\u0000\u0000\u0549"+
		"\u0547\u0001\u0000\u0000\u0000\u0549\u054a\u0001\u0000\u0000\u0000\u054a"+
		"\u054e\u0001\u0000\u0000\u0000\u054b\u0549\u0001\u0000\u0000\u0000\u054c"+
		"\u054e\u0005\u0007\u0000\u0000\u054d\u0544\u0001\u0000\u0000\u0000\u054d"+
		"\u054c\u0001\u0000\u0000\u0000\u054d\u054e\u0001\u0000\u0000\u0000\u054e"+
		"\u054f\u0001\u0000\u0000\u0000\u054f\u0551\u0005\u0004\u0000\u0000\u0550"+
		"\u0552\u0003P(\u0000\u0551\u0550\u0001\u0000\u0000\u0000\u0551\u0552\u0001"+
		"\u0000\u0000\u0000\u0552\u0553\u0001\u0000\u0000\u0000\u0553\u0556\u0005"+
		"\u0098\u0000\u0000\u0554\u0557\u0003R)\u0000\u0555\u0557\u0003\u00acV"+
		"\u0000\u0556\u0554\u0001\u0000\u0000\u0000\u0556\u0555\u0001\u0000\u0000"+
		"\u0000\u0557_\u0001\u0000\u0000\u0000\u0558\u055a\u0005\u0095\u0000\u0000"+
		"\u0559\u055b\u0005t\u0000\u0000\u055a\u0559\u0001\u0000\u0000\u0000\u055a"+
		"\u055b\u0001\u0000\u0000\u0000\u055b\u055c\u0001\u0000\u0000\u0000\u055c"+
		"\u0561\u0003 \u0010\u0000\u055d\u055e\u0005\u0005\u0000\u0000\u055e\u0560"+
		"\u0003 \u0010\u0000\u055f\u055d\u0001\u0000\u0000\u0000\u0560\u0563\u0001"+
		"\u0000\u0000\u0000\u0561\u055f\u0001\u0000\u0000\u0000\u0561\u0562\u0001"+
		"\u0000\u0000\u0000\u0562a\u0001\u0000\u0000\u0000\u0563\u0561\u0001\u0000"+
		"\u0000\u0000\u0564\u0565\u0005m\u0000\u0000\u0565\u0566\u0005(\u0000\u0000"+
		"\u0566\u056b\u0003f3\u0000\u0567\u0568\u0005\u0005\u0000\u0000\u0568\u056a"+
		"\u0003f3\u0000\u0569\u0567\u0001\u0000\u0000\u0000\u056a\u056d\u0001\u0000"+
		"\u0000\u0000\u056b\u0569\u0001\u0000\u0000\u0000\u056b\u056c\u0001\u0000"+
		"\u0000\u0000\u056cc\u0001\u0000\u0000\u0000\u056d\u056b\u0001\u0000\u0000"+
		"\u0000\u056e\u056f\u0005b\u0000\u0000\u056f\u0572\u0003&\u0013\u0000\u0570"+
		"\u0571\u0007\u000f\u0000\u0000\u0571\u0573\u0003&\u0013\u0000\u0572\u0570"+
		"\u0001\u0000\u0000\u0000\u0572\u0573\u0001\u0000\u0000\u0000\u0573e\u0001"+
		"\u0000\u0000\u0000\u0574\u0577\u0003&\u0013\u0000\u0575\u0576\u0005-\u0000"+
		"\u0000\u0576\u0578\u0003\u0098L\u0000\u0577\u0575\u0001\u0000\u0000\u0000"+
		"\u0577\u0578\u0001\u0000\u0000\u0000\u0578\u057a\u0001\u0000\u0000\u0000"+
		"\u0579\u057b\u0003h4\u0000\u057a\u0579\u0001\u0000\u0000\u0000\u057a\u057b"+
		"\u0001\u0000\u0000\u0000\u057b\u057e\u0001\u0000\u0000\u0000\u057c\u057d"+
		"\u0005\u00af\u0000\u0000\u057d\u057f\u0007\u0010\u0000\u0000\u057e\u057c"+
		"\u0001\u0000\u0000\u0000\u057e\u057f\u0001\u0000\u0000\u0000\u057fg\u0001"+
		"\u0000\u0000\u0000\u0580\u0581\u0007\u0011\u0000\u0000\u0581i\u0001\u0000"+
		"\u0000\u0000\u0582\u0583\u0003&\u0013\u0000\u0583\u0584\u0005\u009b\u0000"+
		"\u0000\u0584\u058d\u0001\u0000\u0000\u0000\u0585\u0586\u0003&\u0013\u0000"+
		"\u0586\u0587\u0005\u009e\u0000\u0000\u0587\u058d\u0001\u0000\u0000\u0000"+
		"\u0588\u0589\u0005\u009d\u0000\u0000\u0589\u058d\u0005\u007f\u0000\u0000"+
		"\u058a\u058b\u0005\u009c\u0000\u0000\u058b\u058d\u0005\u009b\u0000\u0000"+
		"\u058c\u0582\u0001\u0000\u0000\u0000\u058c\u0585\u0001\u0000\u0000\u0000"+
		"\u058c\u0588\u0001\u0000\u0000\u0000\u058c\u058a\u0001\u0000\u0000\u0000"+
		"\u058dk\u0001\u0000\u0000\u0000\u058e\u058f\u0003&\u0013\u0000\u058f\u0590"+
		"\u0005\u009b\u0000\u0000\u0590\u0599\u0001\u0000\u0000\u0000\u0591\u0592"+
		"\u0003&\u0013\u0000\u0592\u0593\u0005\u009e\u0000\u0000\u0593\u0599\u0001"+
		"\u0000\u0000\u0000\u0594\u0595\u0005\u009d\u0000\u0000\u0595\u0599\u0005"+
		"\u007f\u0000\u0000\u0596\u0597\u0005\u009c\u0000\u0000\u0597\u0599\u0005"+
		"\u009e\u0000\u0000\u0598\u058e\u0001\u0000\u0000\u0000\u0598\u0591\u0001"+
		"\u0000\u0000\u0000\u0598\u0594\u0001\u0000\u0000\u0000\u0598\u0596\u0001"+
		"\u0000\u0000\u0000\u0599m\u0001\u0000\u0000\u0000\u059a\u059b\u0003&\u0013"+
		"\u0000\u059b\u059c\u0005\u009b\u0000\u0000\u059c\u05a2\u0001\u0000\u0000"+
		"\u0000\u059d\u059e\u0005\u009c\u0000\u0000\u059e\u05a2\u0005\u009b\u0000"+
		"\u0000\u059f\u05a0\u0005\u009d\u0000\u0000\u05a0\u05a2\u0005\u007f\u0000"+
		"\u0000\u05a1\u059a\u0001\u0000\u0000\u0000\u05a1\u059d\u0001\u0000\u0000"+
		"\u0000\u05a1\u059f\u0001\u0000\u0000\u0000\u05a2o\u0001\u0000\u0000\u0000"+
		"\u05a3\u05a4\u0007\u0012\u0000\u0000\u05a4\u05a5\u0005\u0003\u0000\u0000"+
		"\u05a5\u05a6\u0003&\u0013\u0000\u05a6\u05a7\u0005\u0004\u0000\u0000\u05a7"+
		"\u05a8\u0005\u0098\u0000\u0000\u05a8\u05aa\u0005\u0003\u0000\u0000\u05a9"+
		"\u05ab\u0003v;\u0000\u05aa\u05a9\u0001\u0000\u0000\u0000\u05aa\u05ab\u0001"+
		"\u0000\u0000\u0000\u05ab\u05ac\u0001\u0000\u0000\u0000\u05ac\u05ae\u0003"+
		"z=\u0000\u05ad\u05af\u0003X,\u0000\u05ae\u05ad\u0001\u0000\u0000\u0000"+
		"\u05ae\u05af\u0001\u0000\u0000\u0000\u05af\u05b0\u0001\u0000\u0000\u0000"+
		"\u05b0\u05b1\u0005\u0004\u0000\u0000\u05b1\u05f9\u0001\u0000\u0000\u0000"+
		"\u05b2\u05b3\u0007\u0013\u0000\u0000\u05b3\u05b4\u0005\u0003\u0000\u0000"+
		"\u05b4\u05b5\u0005\u0004\u0000\u0000\u05b5\u05b6\u0005\u0098\u0000\u0000"+
		"\u05b6\u05b8\u0005\u0003\u0000\u0000\u05b7\u05b9\u0003v;\u0000\u05b8\u05b7"+
		"\u0001\u0000\u0000\u0000\u05b8\u05b9\u0001\u0000\u0000\u0000\u05b9\u05bb"+
		"\u0001\u0000\u0000\u0000\u05ba\u05bc\u0003x<\u0000\u05bb\u05ba\u0001\u0000"+
		"\u0000\u0000\u05bb\u05bc\u0001\u0000\u0000\u0000\u05bc\u05bd\u0001\u0000"+
		"\u0000\u0000\u05bd\u05f9\u0005\u0004\u0000\u0000\u05be\u05bf\u0007\u0014"+
		"\u0000\u0000\u05bf\u05c0\u0005\u0003\u0000\u0000\u05c0\u05c1\u0005\u0004"+
		"\u0000\u0000\u05c1\u05c2\u0005\u0098\u0000\u0000\u05c2\u05c4\u0005\u0003"+
		"\u0000\u0000\u05c3\u05c5\u0003v;\u0000\u05c4\u05c3\u0001\u0000\u0000\u0000"+
		"\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5\u05c6\u0001\u0000\u0000\u0000"+
		"\u05c6\u05c7\u0003z=\u0000\u05c7\u05c8\u0005\u0004\u0000\u0000\u05c8\u05f9"+
		"\u0001\u0000\u0000\u0000\u05c9\u05ca\u0007\u0015\u0000\u0000\u05ca\u05cb"+
		"\u0005\u0003\u0000\u0000\u05cb\u05cd\u0003&\u0013\u0000\u05cc\u05ce\u0003"+
		"r9\u0000\u05cd\u05cc\u0001\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000"+
		"\u0000\u05ce\u05d0\u0001\u0000\u0000\u0000\u05cf\u05d1\u0003t:\u0000\u05d0"+
		"\u05cf\u0001\u0000\u0000\u0000\u05d0\u05d1\u0001\u0000\u0000\u0000\u05d1"+
		"\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d3\u0005\u0004\u0000\u0000\u05d3"+
		"\u05d4\u0005\u0098\u0000\u0000\u05d4\u05d6\u0005\u0003\u0000\u0000\u05d5"+
		"\u05d7\u0003v;\u0000\u05d6\u05d5\u0001\u0000\u0000\u0000\u05d6\u05d7\u0001"+
		"\u0000\u0000\u0000\u05d7\u05d8\u0001\u0000\u0000\u0000\u05d8\u05d9\u0003"+
		"z=\u0000\u05d9\u05da\u0005\u0004\u0000\u0000\u05da\u05f9\u0001\u0000\u0000"+
		"\u0000\u05db\u05dc\u0005\u00a4\u0000\u0000\u05dc\u05dd\u0005\u0003\u0000"+
		"\u0000\u05dd\u05de\u0003&\u0013\u0000\u05de\u05df\u0005\u0005\u0000\u0000"+
		"\u05df\u05e0\u0003\u0012\t\u0000\u05e0\u05e1\u0005\u0004\u0000\u0000\u05e1"+
		"\u05e2\u0005\u0098\u0000\u0000\u05e2\u05e4\u0005\u0003\u0000\u0000\u05e3"+
		"\u05e5\u0003v;\u0000\u05e4\u05e3\u0001\u0000\u0000\u0000\u05e4\u05e5\u0001"+
		"\u0000\u0000\u0000\u05e5\u05e6\u0001\u0000\u0000\u0000\u05e6\u05e8\u0003"+
		"z=\u0000\u05e7\u05e9\u0003X,\u0000\u05e8\u05e7\u0001\u0000\u0000\u0000"+
		"\u05e8\u05e9\u0001\u0000\u0000\u0000\u05e9\u05ea\u0001\u0000\u0000\u0000"+
		"\u05ea\u05eb\u0005\u0004\u0000\u0000\u05eb\u05f9\u0001\u0000\u0000\u0000"+
		"\u05ec\u05ed\u0005\u00a5\u0000\u0000\u05ed\u05ee\u0005\u0003\u0000\u0000"+
		"\u05ee\u05ef\u0003&\u0013\u0000\u05ef\u05f0\u0005\u0004\u0000\u0000\u05f0"+
		"\u05f1\u0005\u0098\u0000\u0000\u05f1\u05f3\u0005\u0003\u0000\u0000\u05f2"+
		"\u05f4\u0003v;\u0000\u05f3\u05f2\u0001\u0000\u0000\u0000\u05f3\u05f4\u0001"+
		"\u0000\u0000\u0000\u05f4\u05f5\u0001\u0000\u0000\u0000\u05f5\u05f6\u0003"+
		"z=\u0000\u05f6\u05f7\u0005\u0004\u0000\u0000\u05f7\u05f9\u0001\u0000\u0000"+
		"\u0000\u05f8\u05a3\u0001\u0000\u0000\u0000\u05f8\u05b2\u0001\u0000\u0000"+
		"\u0000\u05f8\u05be\u0001\u0000\u0000\u0000\u05f8\u05c9\u0001\u0000\u0000"+
		"\u0000\u05f8\u05db\u0001\u0000\u0000\u0000\u05f8\u05ec\u0001\u0000\u0000"+
		"\u0000\u05f9q\u0001\u0000\u0000\u0000\u05fa\u05fb\u0005\u0005\u0000\u0000"+
		"\u05fb\u05fc\u0003\u0012\t\u0000\u05fcs\u0001\u0000\u0000\u0000\u05fd"+
		"\u05fe\u0005\u0005\u0000\u0000\u05fe\u05ff\u0003\u0012\t\u0000\u05ffu"+
		"\u0001\u0000\u0000\u0000\u0600\u0601\u0005\u0099\u0000\u0000\u0601\u0603"+
		"\u0005(\u0000\u0000\u0602\u0604\u0003&\u0013\u0000\u0603\u0602\u0001\u0000"+
		"\u0000\u0000\u0604\u0605\u0001\u0000\u0000\u0000\u0605\u0603\u0001\u0000"+
		"\u0000\u0000\u0605\u0606\u0001\u0000\u0000\u0000\u0606w\u0001\u0000\u0000"+
		"\u0000\u0607\u0608\u0005m\u0000\u0000\u0608\u060a\u0005(\u0000\u0000\u0609"+
		"\u060b\u0003&\u0013\u0000\u060a\u0609\u0001\u0000\u0000\u0000\u060b\u060c"+
		"\u0001\u0000\u0000\u0000\u060c\u060a\u0001\u0000\u0000\u0000\u060c\u060d"+
		"\u0001\u0000\u0000\u0000\u060dy\u0001\u0000\u0000\u0000\u060e\u060f\u0005"+
		"m\u0000\u0000\u060f\u0610\u0005(\u0000\u0000\u0610\u0611\u0003|>\u0000"+
		"\u0611{\u0001\u0000\u0000\u0000\u0612\u0614\u0003&\u0013\u0000\u0613\u0615"+
		"\u0003h4\u0000\u0614\u0613\u0001\u0000\u0000\u0000\u0614\u0615\u0001\u0000"+
		"\u0000\u0000\u0615\u061d\u0001\u0000\u0000\u0000\u0616\u0617\u0005\u0005"+
		"\u0000\u0000\u0617\u0619\u0003&\u0013\u0000\u0618\u061a\u0003h4\u0000"+
		"\u0619\u0618\u0001\u0000\u0000\u0000\u0619\u061a\u0001\u0000\u0000\u0000"+
		"\u061a\u061c\u0001\u0000\u0000\u0000\u061b\u0616\u0001\u0000\u0000\u0000"+
		"\u061c\u061f\u0001\u0000\u0000\u0000\u061d\u061b\u0001\u0000\u0000\u0000"+
		"\u061d\u061e\u0001\u0000\u0000\u0000\u061e}\u0001\u0000\u0000\u0000\u061f"+
		"\u061d\u0001\u0000\u0000\u0000\u0620\u0621\u00038\u001c\u0000\u0621\u007f"+
		"\u0001\u0000\u0000\u0000\u0622\u0623\u00038\u001c\u0000\u0623\u0081\u0001"+
		"\u0000\u0000\u0000\u0624\u0625\u0007\u0016\u0000\u0000\u0625\u0083\u0001"+
		"\u0000\u0000\u0000\u0626\u0627\u0005\u00bc\u0000\u0000\u0627\u0085\u0001"+
		"\u0000\u0000\u0000\u0628\u062b\u0003&\u0013\u0000\u0629\u062b\u0003\f"+
		"\u0006\u0000\u062a\u0628\u0001\u0000\u0000\u0000\u062a\u0629\u0001\u0000"+
		"\u0000\u0000\u062b\u0087\u0001\u0000\u0000\u0000\u062c\u062d\u0007\u0017"+
		"\u0000\u0000\u062d\u0089\u0001\u0000\u0000\u0000\u062e\u062f\u0007\u0018"+
		"\u0000\u0000\u062f\u008b\u0001\u0000\u0000\u0000\u0630\u0631\u0003\u00ba"+
		"]\u0000\u0631\u008d\u0001\u0000\u0000\u0000\u0632\u0633\u0003\u00ba]\u0000"+
		"\u0633\u008f\u0001\u0000\u0000\u0000\u0634\u0635\u0003\u00ba]\u0000\u0635"+
		"\u0091\u0001\u0000\u0000\u0000\u0636\u0637\u0003\u00ba]\u0000\u0637\u0093"+
		"\u0001\u0000\u0000\u0000\u0638\u0639\u0003\u00ba]\u0000\u0639\u0095\u0001"+
		"\u0000\u0000\u0000\u063a\u063b\u0003\u00ba]\u0000\u063b\u0097\u0001\u0000"+
		"\u0000\u0000\u063c\u063d\u0003\u00ba]\u0000\u063d\u0099\u0001\u0000\u0000"+
		"\u0000\u063e\u063f\u0003\u00ba]\u0000\u063f\u009b\u0001\u0000\u0000\u0000"+
		"\u0640\u0641\u0003\u00ba]\u0000\u0641\u009d\u0001\u0000\u0000\u0000\u0642"+
		"\u0643\u0003\u00ba]\u0000\u0643\u009f\u0001\u0000\u0000\u0000\u0644\u0645"+
		"\u0003\u00ba]\u0000\u0645\u00a1\u0001\u0000\u0000\u0000\u0646\u0647\u0003"+
		"\u00ba]\u0000\u0647\u00a3\u0001\u0000\u0000\u0000\u0648\u0649\u0003\u00ba"+
		"]\u0000\u0649\u00a5\u0001\u0000\u0000\u0000\u064a\u064b\u0003\u00ba]\u0000"+
		"\u064b\u00a7\u0001\u0000\u0000\u0000\u064c\u064d\u0003\u00ba]\u0000\u064d"+
		"\u00a9\u0001\u0000\u0000\u0000\u064e\u064f\u0003\u00ba]\u0000\u064f\u00ab"+
		"\u0001\u0000\u0000\u0000\u0650\u0651\u0003\u00ba]\u0000\u0651\u00ad\u0001"+
		"\u0000\u0000\u0000\u0652\u0653\u0003\u00ba]\u0000\u0653\u00af\u0001\u0000"+
		"\u0000\u0000\u0654\u0655\u0003\u00ba]\u0000\u0655\u00b1\u0001\u0000\u0000"+
		"\u0000\u0656\u0657\u0003\u00ba]\u0000\u0657\u00b3\u0001\u0000\u0000\u0000"+
		"\u0658\u0659\u0003\u00ba]\u0000\u0659\u00b5\u0001\u0000\u0000\u0000\u065a"+
		"\u065b\u0003\u00ba]\u0000\u065b\u00b7\u0001\u0000\u0000\u0000\u065c\u065d"+
		"\u0003\u00ba]\u0000\u065d\u00b9\u0001\u0000\u0000\u0000\u065e\u0666\u0005"+
		"\u00b9\u0000\u0000\u065f\u0666\u0003\u008aE\u0000\u0660\u0666\u0005\u00bc"+
		"\u0000\u0000\u0661\u0662\u0005\u0003\u0000\u0000\u0662\u0663\u0003\u00ba"+
		"]\u0000\u0663\u0664\u0005\u0004\u0000\u0000\u0664\u0666\u0001\u0000\u0000"+
		"\u0000\u0665\u065e\u0001\u0000\u0000\u0000\u0665\u065f\u0001\u0000\u0000"+
		"\u0000\u0665\u0660\u0001\u0000\u0000\u0000\u0665\u0661\u0001\u0000\u0000"+
		"\u0000\u0666\u00bb\u0001\u0000\u0000\u0000\u00e1\u00bf\u00c7\u00ce\u00d3"+
		"\u00d9\u00df\u00e1\u00eb\u00f4\u00fa\u00fe\u0103\u0106\u010a\u010e\u0111"+
		"\u0118\u0121\u0128\u012f\u0134\u013a\u0146\u014a\u014f\u0152\u0155\u0158"+
		"\u015c\u015f\u016d\u0174\u017b\u017d\u0180\u0186\u018b\u0193\u0198\u01a7"+
		"\u01ad\u01b7\u01bc\u01c6\u01ca\u01cc\u01d0\u01d5\u01d7\u01df\u01ef\u01f9"+
		"\u01fe\u0206\u0212\u0217\u021f\u0226\u0229\u022f\u0234\u023e\u0243\u024c"+
		"\u0253\u0257\u025b\u025e\u0266\u0273\u0276\u027e\u0287\u028b\u0290\u02ae"+
		"\u02ba\u02bf\u02cb\u02d1\u02d8\u02dc\u02e6\u02e9\u02ef\u02f5\u02fe\u0301"+
		"\u0305\u0307\u0309\u0312\u031e\u0329\u032d\u0334\u033a\u033f\u0347\u034c"+
		"\u0350\u0353\u0357\u035a\u0362\u036d\u0373\u0375\u037d\u0384\u038b\u0390"+
		"\u0392\u0397\u039a\u03a2\u03a6\u03a9\u03af\u03b3\u03b8\u03bf\u03c8\u03cc"+
		"\u03ce\u03d2\u03db\u03e0\u03e2\u03ef\u03f2\u03f5\u03fa\u03fe\u0401\u0408"+
		"\u040d\u0416\u041b\u041e\u0426\u042a\u0432\u0435\u0437\u0440\u0443\u0445"+
		"\u0449\u044d\u0451\u0454\u045f\u0464\u0468\u046c\u046f\u0474\u047a\u0481"+
		"\u0488\u0491\u0495\u0497\u049b\u049e\u04a6\u04ae\u04b3\u04ba\u04bf\u04c9"+
		"\u04d2\u04d5\u04de\u04e2\u04ea\u04f3\u04f6\u04ff\u0502\u0505\u0508\u0512"+
		"\u0514\u051d\u0526\u052a\u0531\u0538\u053c\u0540\u0549\u054d\u0551\u0556"+
		"\u055a\u0561\u056b\u0572\u0577\u057a\u057e\u058c\u0598\u05a1\u05aa\u05ae"+
		"\u05b8\u05bb\u05c4\u05cd\u05d0\u05d6\u05e4\u05e8\u05f3\u05f8\u0605\u060c"+
		"\u0614\u0619\u061d\u062a\u0665";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}