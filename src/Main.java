import TableManager.CreateTable;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;

public class Main{
    public static void main(String[] args) {
        System.out.println("Start App!");
        CreateTable table = new CreateTable();
        table.CreateDataBase("TestDataBase");
        String[][] req = {{"Strin", "int"}};
        table.AddTablet("Table", req);
        System.out.println(
                new String(table.GetName(), StandardCharsets.UTF_8)
        );
    }
}