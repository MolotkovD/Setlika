package Exp;

import GlobalVariables.GlobalVariables;
import STypes.Types;

import java.io.IOException;
import java.util.List;

public class INSERT_INTO {
    public INSERT_INTO(String table_name, List<Types> values) {
        try{
            GlobalVariables.FS.InsertData(table_name, values);
        } catch (IOException e){
            System.out.print(e.getMessage());
        }


    }

}
