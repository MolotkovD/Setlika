import Authentication.Registration;
import Enums.Errors;
import FileSystem.FSDB;
import GlobalValue.GlobalValue;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Directory BD:");
        Path path = Paths.get(scanner.nextLine());
        System.out.println("Name BD:");
        String nameDB = scanner.nextLine();
        System.out.println("Admin Login: ");
        String AdminLogin = scanner.nextLine();
        System.out.println("Password Admin: ");
        String AdminPassword = scanner.nextLine();


        FSDB FS = new FSDB(path, nameDB);
        Registration registration = new Registration(FS);
        registration.AddAdmin(AdminLogin, AdminPassword);


    }
}