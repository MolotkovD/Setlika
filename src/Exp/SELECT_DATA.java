package Exp;

import GlobalVariables.GlobalVariables;
import Parser.SetlikaParser;

public class SELECT_DATA {
    public SELECT_DATA(SetlikaParser.Select_stmtContext cts){
//        GlobalVariables.FS.
        for (SetlikaParser.Result_columnContext column :
                cts.result_columns().result_column()) {

        }
    }
}
