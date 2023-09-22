import TableManager.CreateTable;

import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        System.out.println("Start App!");

        BFileManager fs = new BFileManager("DataNNN");
        fs.AddTable("t1");
        fs.Save();
    }
}