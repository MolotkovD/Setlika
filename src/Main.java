import TableManager.CreateTable;

import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        System.out.println("Start App!");
//        CreateTable table = new CreateTable();
//        table.SetName("TestDataBase");
//        table.SetVersion("SL2.02");
//        table.SetDate("21032023");

        int[] array = new int[100];
        int target = -5;
        for (int i = 0; i < array.length; i++) {
            array[i] = -i;
        }
        System.out.println(
                Arrays.toString(array)
        );
        System.out.println(
                Arrays.binarySearch(array, target)
        );



        System.out.print(" ");
//        table.SaveDataBase("");
    }
}