package Exp;

import GlobalVariables.GlobalVariables;

public class DROP_TABLE {
    public DROP_TABLE(String NameTable){
        try {
            GlobalVariables.FS.DeleteTable(NameTable);
        } catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
