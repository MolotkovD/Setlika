import TableManager.CreateTable;


public class Main{
    public static void main(String[] args){
        System.out.println("Start App!");
        CreateTable table = new CreateTable();
        table.SetName("TestDataBase");
        table.SetVersion("SL2.02");
        table.SetDate("21032023");

        System.out.print(" ");
        table.SaveDataBase("D:\\Users\\molotkov.d\\Desktop\\Test.bit");
    }
}