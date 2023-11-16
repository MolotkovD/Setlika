package Parser;// Generated from Setlika.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetlikaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetlikaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SetlikaParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SetlikaParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SetlikaParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SetlikaParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SetlikaParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SetlikaParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SetlikaParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SetlikaParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SetlikaParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SetlikaParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SetlikaParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SetlikaParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(SetlikaParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(SetlikaParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SetlikaParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#recursive_cte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursive_cte(SetlikaParser.Recursive_cteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SetlikaParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SetlikaParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(SetlikaParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SetlikaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(SetlikaParser.Raise_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SetlikaParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#value_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_row(SetlikaParser.Value_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(SetlikaParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SetlikaParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning_clause(SetlikaParser.Returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#upsert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpsert_clause(SetlikaParser.Upsert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(SetlikaParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SetlikaParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SetlikaParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SetlikaParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SetlikaParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SetlikaParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SetlikaParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SetlikaParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(SetlikaParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SetlikaParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(SetlikaParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SetlikaParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(SetlikaParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#filter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_clause(SetlikaParser.Filter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#window_defn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_defn(SetlikaParser.Window_defnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(SetlikaParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#frame_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_spec(SetlikaParser.Frame_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_clause(SetlikaParser.Frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#simple_function_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_function_invocation(SetlikaParser.Simple_function_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#aggregate_function_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function_invocation(SetlikaParser.Aggregate_function_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#window_function_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_function_invocation(SetlikaParser.Window_function_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#common_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_stmt(SetlikaParser.Common_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#order_by_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_stmt(SetlikaParser.Order_by_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#limit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_stmt(SetlikaParser.Limit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SetlikaParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsc_desc(SetlikaParser.Asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#frame_left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_left(SetlikaParser.Frame_leftContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#frame_right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_right(SetlikaParser.Frame_rightContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#frame_single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_single(SetlikaParser.Frame_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#window_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_function(SetlikaParser.Window_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(SetlikaParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(SetlikaParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#partition_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by(SetlikaParser.Partition_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#order_by_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expr(SetlikaParser.Order_by_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#order_by_expr_asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expr_asc_desc(SetlikaParser.Order_by_expr_asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#expr_asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_asc_desc(SetlikaParser.Expr_asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#initial_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_select(SetlikaParser.Initial_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#recursive_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursive_select(SetlikaParser.Recursive_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SetlikaParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SetlikaParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SetlikaParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SetlikaParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SetlikaParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SetlikaParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SetlikaParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(SetlikaParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SetlikaParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SetlikaParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SetlikaParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SetlikaParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SetlikaParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SetlikaParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SetlikaParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SetlikaParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SetlikaParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SetlikaParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SetlikaParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SetlikaParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SetlikaParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_name(SetlikaParser.Window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SetlikaParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(SetlikaParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#base_window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_window_name(SetlikaParser.Base_window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#simple_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_func(SetlikaParser.Simple_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#aggregate_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_func(SetlikaParser.Aggregate_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#table_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_function_name(SetlikaParser.Table_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SetlikaParser.Any_nameContext ctx);
}