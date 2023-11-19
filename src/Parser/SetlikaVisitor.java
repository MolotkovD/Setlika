// Generated from Setlika.g4 by ANTLR 4.13.1
package Parser;
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
	 * Visit a parse tree produced by {@link SetlikaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SetlikaParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SetlikaParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#stmt_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_line(SetlikaParser.Stmt_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(SetlikaParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#create_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_stmt(SetlikaParser.Create_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(SetlikaParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SetlikaParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SetlikaParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#result_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_columns(SetlikaParser.Result_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SetlikaParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#from_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_body(SetlikaParser.From_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#join_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clauses(SetlikaParser.Join_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SetlikaParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#cross_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_join(SetlikaParser.Cross_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#inner_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_join(SetlikaParser.Inner_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#existence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistence(SetlikaParser.ExistenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SetlikaParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#columns_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns_def(SetlikaParser.Columns_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SetlikaParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#columns_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns_names(SetlikaParser.Columns_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SetlikaParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SetlikaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_key(SetlikaParser.Primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(SetlikaParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SetlikaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(SetlikaParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SetlikaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SetlikaParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(SetlikaParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SetlikaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(SetlikaParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(SetlikaParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(SetlikaParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetlikaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SetlikaParser.IdentifierContext ctx);
}