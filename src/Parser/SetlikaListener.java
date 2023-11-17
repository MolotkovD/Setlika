// Generated from Setlika.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SetlikaParser}.
 */
public interface SetlikaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SetlikaParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SetlikaParser.ParseContext ctx);
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
	 * Enter a parse tree produced by {@link SetlikaParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SetlikaParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SetlikaParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SetlikaParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SetlikaParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SetlikaParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SetlikaParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SetlikaParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SetlikaParser.Create_table_stmtContext ctx);
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
	 * Enter a parse tree produced by {@link SetlikaParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SetlikaParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SetlikaParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SetlikaParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SetlikaParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SetlikaParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SetlikaParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SetlikaParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SetlikaParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SetlikaParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SetlikaParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(SetlikaParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(SetlikaParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(SetlikaParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(SetlikaParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SetlikaParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SetlikaParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#recursive_cte}.
	 * @param ctx the parse tree
	 */
	void enterRecursive_cte(SetlikaParser.Recursive_cteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#recursive_cte}.
	 * @param ctx the parse tree
	 */
	void exitRecursive_cte(SetlikaParser.Recursive_cteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SetlikaParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SetlikaParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SetlikaParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SetlikaParser.Delete_stmtContext ctx);
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
	 * Enter a parse tree produced by {@link SetlikaParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(SetlikaParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(SetlikaParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SetlikaParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SetlikaParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#value_row}.
	 * @param ctx the parse tree
	 */
	void enterValue_row(SetlikaParser.Value_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#value_row}.
	 * @param ctx the parse tree
	 */
	void exitValue_row(SetlikaParser.Value_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(SetlikaParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(SetlikaParser.Values_clauseContext ctx);
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
	 * Enter a parse tree produced by {@link SetlikaParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturning_clause(SetlikaParser.Returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturning_clause(SetlikaParser.Returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#upsert_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpsert_clause(SetlikaParser.Upsert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#upsert_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpsert_clause(SetlikaParser.Upsert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SetlikaParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SetlikaParser.Pragma_valueContext ctx);
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
	 * Enter a parse tree produced by {@link SetlikaParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SetlikaParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SetlikaParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SetlikaParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SetlikaParser.Table_or_subqueryContext ctx);
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
	 * Enter a parse tree produced by {@link SetlikaParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SetlikaParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SetlikaParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SetlikaParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SetlikaParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(SetlikaParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(SetlikaParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SetlikaParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SetlikaParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(SetlikaParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(SetlikaParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SetlikaParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SetlikaParser.Qualified_table_nameContext ctx);
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
	 * Enter a parse tree produced by {@link SetlikaParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void enterFilter_clause(SetlikaParser.Filter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void exitFilter_clause(SetlikaParser.Filter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#window_defn}.
	 * @param ctx the parse tree
	 */
	void enterWindow_defn(SetlikaParser.Window_defnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#window_defn}.
	 * @param ctx the parse tree
	 */
	void exitWindow_defn(SetlikaParser.Window_defnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(SetlikaParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(SetlikaParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#frame_spec}.
	 * @param ctx the parse tree
	 */
	void enterFrame_spec(SetlikaParser.Frame_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#frame_spec}.
	 * @param ctx the parse tree
	 */
	void exitFrame_spec(SetlikaParser.Frame_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrame_clause(SetlikaParser.Frame_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrame_clause(SetlikaParser.Frame_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#simple_function_invocation}.
	 * @param ctx the parse tree
	 */
	void enterSimple_function_invocation(SetlikaParser.Simple_function_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#simple_function_invocation}.
	 * @param ctx the parse tree
	 */
	void exitSimple_function_invocation(SetlikaParser.Simple_function_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#aggregate_function_invocation}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_invocation(SetlikaParser.Aggregate_function_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#aggregate_function_invocation}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_invocation(SetlikaParser.Aggregate_function_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#window_function_invocation}.
	 * @param ctx the parse tree
	 */
	void enterWindow_function_invocation(SetlikaParser.Window_function_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#window_function_invocation}.
	 * @param ctx the parse tree
	 */
	void exitWindow_function_invocation(SetlikaParser.Window_function_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#common_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_stmt(SetlikaParser.Common_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#common_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_stmt(SetlikaParser.Common_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#order_by_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_stmt(SetlikaParser.Order_by_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#order_by_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_stmt(SetlikaParser.Order_by_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#limit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLimit_stmt(SetlikaParser.Limit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#limit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLimit_stmt(SetlikaParser.Limit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SetlikaParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SetlikaParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterAsc_desc(SetlikaParser.Asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitAsc_desc(SetlikaParser.Asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#frame_left}.
	 * @param ctx the parse tree
	 */
	void enterFrame_left(SetlikaParser.Frame_leftContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#frame_left}.
	 * @param ctx the parse tree
	 */
	void exitFrame_left(SetlikaParser.Frame_leftContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#frame_right}.
	 * @param ctx the parse tree
	 */
	void enterFrame_right(SetlikaParser.Frame_rightContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#frame_right}.
	 * @param ctx the parse tree
	 */
	void exitFrame_right(SetlikaParser.Frame_rightContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#frame_single}.
	 * @param ctx the parse tree
	 */
	void enterFrame_single(SetlikaParser.Frame_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#frame_single}.
	 * @param ctx the parse tree
	 */
	void exitFrame_single(SetlikaParser.Frame_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#window_function}.
	 * @param ctx the parse tree
	 */
	void enterWindow_function(SetlikaParser.Window_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#window_function}.
	 * @param ctx the parse tree
	 */
	void exitWindow_function(SetlikaParser.Window_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(SetlikaParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(SetlikaParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(SetlikaParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(SetlikaParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by(SetlikaParser.Partition_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by(SetlikaParser.Partition_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#order_by_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expr(SetlikaParser.Order_by_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#order_by_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expr(SetlikaParser.Order_by_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#order_by_expr_asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expr_asc_desc(SetlikaParser.Order_by_expr_asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#order_by_expr_asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expr_asc_desc(SetlikaParser.Order_by_expr_asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#expr_asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterExpr_asc_desc(SetlikaParser.Expr_asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#expr_asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitExpr_asc_desc(SetlikaParser.Expr_asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#initial_select}.
	 * @param ctx the parse tree
	 */
	void enterInitial_select(SetlikaParser.Initial_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#initial_select}.
	 * @param ctx the parse tree
	 */
	void exitInitial_select(SetlikaParser.Initial_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#recursive_select}.
	 * @param ctx the parse tree
	 */
	void enterRecursive_select(SetlikaParser.Recursive_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#recursive_select}.
	 * @param ctx the parse tree
	 */
	void exitRecursive_select(SetlikaParser.Recursive_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SetlikaParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SetlikaParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SetlikaParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SetlikaParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SetlikaParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SetlikaParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SetlikaParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SetlikaParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SetlikaParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SetlikaParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SetlikaParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SetlikaParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SetlikaParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SetlikaParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(SetlikaParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(SetlikaParser.Schema_nameContext ctx);
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
	 * Enter a parse tree produced by {@link SetlikaParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SetlikaParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SetlikaParser.Table_or_index_nameContext ctx);
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
	 * Enter a parse tree produced by {@link SetlikaParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SetlikaParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SetlikaParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SetlikaParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SetlikaParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SetlikaParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SetlikaParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SetlikaParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SetlikaParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SetlikaParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SetlikaParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SetlikaParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SetlikaParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SetlikaParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SetlikaParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SetlikaParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SetlikaParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SetlikaParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SetlikaParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SetlikaParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SetlikaParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#window_name}.
	 * @param ctx the parse tree
	 */
	void enterWindow_name(SetlikaParser.Window_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#window_name}.
	 * @param ctx the parse tree
	 */
	void exitWindow_name(SetlikaParser.Window_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SetlikaParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SetlikaParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(SetlikaParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(SetlikaParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#base_window_name}.
	 * @param ctx the parse tree
	 */
	void enterBase_window_name(SetlikaParser.Base_window_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#base_window_name}.
	 * @param ctx the parse tree
	 */
	void exitBase_window_name(SetlikaParser.Base_window_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#simple_func}.
	 * @param ctx the parse tree
	 */
	void enterSimple_func(SetlikaParser.Simple_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#simple_func}.
	 * @param ctx the parse tree
	 */
	void exitSimple_func(SetlikaParser.Simple_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#aggregate_func}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_func(SetlikaParser.Aggregate_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#aggregate_func}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_func(SetlikaParser.Aggregate_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#table_function_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_function_name(SetlikaParser.Table_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#table_function_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_function_name(SetlikaParser.Table_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SetlikaParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SetlikaParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SetlikaParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SetlikaParser.Any_nameContext ctx);
}