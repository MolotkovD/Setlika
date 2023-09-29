import Enums.SLError;
import FileSystem.CreateFileDB;
import GlobalValue.GlobalValue;
import NetWorking.SetlikaServer;
import Utilities.Converters.FloatConverter;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Directory BD:");
        GlobalValue.pathToDBDirectory = Paths.get(scanner.nextLine());
        System.out.println("Name BD:");
        SLError res = CreateFileDB.CreateNewDB(scanner.nextLine());
        System.out.println(res);
        if (res == SLError.CREATE_DATABASE_OK){
            System.out.println("Good");
        }

        String input = "";
        while (!input.equals("Stop")){
            input = scanner.nextLine();
            System.out.println(input);
        }
    }
}