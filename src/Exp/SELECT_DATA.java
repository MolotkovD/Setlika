package Exp;

import Parser.SetlikaParser;

public class SELECT_DATA {
    public SELECT_DATA(SetlikaParser.Select_stmtContext cts){
        boolean last_reals;
        if (cts.where_clause() != null){
            for (var item: cts.where_clause().binary_expr().children) {
                   if (item.getClass() == SetlikaParser.ExprContext.class){

                   }
            }

        }
    }
}
