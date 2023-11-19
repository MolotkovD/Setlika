package Exp;


import GlobalVariables.GlobalVariables;
import STypes.EntryCol;

import java.io.IOException;
import java.util.List;

public class CREATE_TABLE {
    public CREATE_TABLE(
            String name,
            List<EntryCol> fields,
            boolean IF_EXISTS
    ) {
        try {
            GlobalVariables.FS.CreateNewTable(
                    name, fields
            );
        } catch (IOException exception){
            System.out.println("a............");
        }
    }
}
