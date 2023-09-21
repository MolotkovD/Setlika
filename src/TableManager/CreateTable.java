package TableManager;

import DataTypes.DataType;
import java.util.Hashtable;

public class CreateTable {

    private byte[] NameDB = new byte[24];
    private Hashtable<String, Object> Table = new Hashtable<>();
    public void CreateDataBase(String NameBase){
        System.arraycopy(NameBase.getBytes(),0, this.NameDB,0, 24);
    }
    public byte[] GetName(){return this.NameDB;}
    public void AddTablet(String TableName, String[][] input_column){
        System.out.println(TableName);
        for (String[] row: input_column) {

            System.out.println(row[0] + " " + row[1]);
            this.AddColumn(row[0], row[1]);


        }
    }

    private void AddColumn(String Name, String Type){

    }
}



