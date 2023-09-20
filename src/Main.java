import TableManager.CreateTable;

import java.io.IOException;
import java.lang.reflect.Array;

public class Main{
    public static void main(String[] args) {
        System.out.println("Start App!");
        CreateTable table = new CreateTable();
        table.CreateDataBase("TestDataBase====================");
        String[][] req = {{"Strin", "int"}};
        table.AddTablet("Table", req);
    }
}