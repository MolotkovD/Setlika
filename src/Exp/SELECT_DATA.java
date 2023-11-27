package Exp;

import GlobalVariables.GlobalVariables;
import Parser.SetlikaParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SELECT_DATA {
    public SELECT_DATA(SetlikaParser.Select_stmtContext cts)
    {
        try {

            List<SetlikaParser.Result_columnContext> columns = cts.result_columns().result_column();

            List<String> names = new ArrayList<>();

            for (SetlikaParser.Result_columnContext column : columns) names.add(column.getText());
            GlobalVariables.FS.SelectAllData(cts.from_body().table_name().getText().trim(), names);
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }


    }
}
