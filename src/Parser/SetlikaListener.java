// Generated from Setlika.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SetlikaParser}.
 */
public interface SetlikaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SetlikaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SetlikaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SetlikaParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SetlikaParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#stmt_line}.
	 * @param ctx the parse tree
	 */
	void enterStmt_line(SetlikaParser.Stmt_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#stmt_line}.
	 * @param ctx the parse tree
	 */
	void exitStmt_line(SetlikaParser.Stmt_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(SetlikaParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(SetlikaParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#create_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_stmt(SetlikaParser.Create_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#create_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_stmt(SetlikaParser.Create_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(SetlikaParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(SetlikaParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SetlikaParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SetlikaParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SetlikaParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SetlikaParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#result_columns}.
	 * @param ctx the parse tree
	 */
	void enterResult_columns(SetlikaParser.Result_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#result_columns}.
	 * @param ctx the parse tree
	 */
	void exitResult_columns(SetlikaParser.Result_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SetlikaParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SetlikaParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#from_body}.
	 * @param ctx the parse tree
	 */
	void enterFrom_body(SetlikaParser.From_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#from_body}.
	 * @param ctx the parse tree
	 */
	void exitFrom_body(SetlikaParser.From_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#join_clauses}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clauses(SetlikaParser.Join_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#join_clauses}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clauses(SetlikaParser.Join_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SetlikaParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SetlikaParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#cross_join}.
	 * @param ctx the parse tree
	 */
	void enterCross_join(SetlikaParser.Cross_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#cross_join}.
	 * @param ctx the parse tree
	 */
	void exitCross_join(SetlikaParser.Cross_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#inner_join}.
	 * @param ctx the parse tree
	 */
	void enterInner_join(SetlikaParser.Inner_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#inner_join}.
	 * @param ctx the parse tree
	 */
	void exitInner_join(SetlikaParser.Inner_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#existence}.
	 * @param ctx the parse tree
	 */
	void enterExistence(SetlikaParser.ExistenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#existence}.
	 * @param ctx the parse tree
	 */
	void exitExistence(SetlikaParser.ExistenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SetlikaParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SetlikaParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#columns_def}.
	 * @param ctx the parse tree
	 */
	void enterColumns_def(SetlikaParser.Columns_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#columns_def}.
	 * @param ctx the parse tree
	 */
	void exitColumns_def(SetlikaParser.Columns_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SetlikaParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SetlikaParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#columns_names}.
	 * @param ctx the parse tree
	 */
	void enterColumns_names(SetlikaParser.Columns_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#columns_names}.
	 * @param ctx the parse tree
	 */
	void exitColumns_names(SetlikaParser.Columns_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SetlikaParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SetlikaParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SetlikaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SetlikaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#primary_key}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_key(SetlikaParser.Primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#primary_key}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_key(SetlikaParser.Primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(SetlikaParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(SetlikaParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SetlikaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SetlikaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SetlikaParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SetlikaParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SetlikaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SetlikaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SetlikaParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SetlikaParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(SetlikaParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(SetlikaParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SetlikaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SetlikaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(SetlikaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(SetlikaParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(SetlikaParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(SetlikaParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(SetlikaParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(SetlikaParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SetlikaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SetlikaParser.IdentifierContext ctx);
}