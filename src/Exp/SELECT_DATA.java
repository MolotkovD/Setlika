package Exp;

import GlobalVariables.GlobalVariables;
import Parser.SetlikaParser;

import java.io.IOException;

public class SELECT_DATA {
    public SELECT_DATA(SetlikaParser.Select_stmtContext cts)
    {
        try {
            GlobalVariables.FS.SelectAllData(cts.from_body().table_name().getText());
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }


    }
}
