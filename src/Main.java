import FileSystem.CreateFileDB;
import GlobalValue.GlobalValue;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Directory BD:");
        GlobalValue.pathToDBDirectory = Paths.get(scanner.nextLine());
        System.out.println("Name BD:");
        CreateFileDB.CreateNewDB(scanner.nextLine());
}
}