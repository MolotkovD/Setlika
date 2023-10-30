import FileSystem.FileSystem;
import GlobalVariables.GlobalVariables;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        String FilePathDebug = "D:\\Users\\molotkov.d\\Desktop\\Setlikatests";

        System.out.println(
                """
                   ╔══════════════════════════════════════════════════════╗
                   ║                                                      ║
                   ║ ███████╗███████╗████████╗██╗     ██╗██╗  ██╗ █████╗  ║
                   ║ ██╔════╝██╔════╝╚══██╔══╝██║     ██║██║ ██╔╝██╔══██╗ ║
                   ║ ███████╗█████╗     ██║   ██║     ██║█████╔╝ ███████║ ║
                   ║ ╚════██║██╔══╝     ██║   ██║     ██║██╔═██╗ ██╔══██║ ║
                   ║ ███████║███████╗   ██║   ███████╗██║██║  ██╗██║  ██║ ║
                   ║ ╚══════╝╚══════╝   ╚═╝   ╚══════╝╚═╝╚═╝  ╚═╝╚═╝  ╚═╝ ║
                   ║                                                      ║
                   ║ Verson: SL1.00  *                                    ║
                   ║                                                      ║
                   ╚══════════════════════════════════════════════════════╝"""
        );


        FileSystem fs = new FileSystem();
        Scanner scan = new Scanner(System.in);
        GlobalVariables.FS = fs;
        fs.InitFileSystem(Paths.get(FilePathDebug), scan.nextLine());

        try {
            fs.CreateNewTable("Table1");
        }
        catch (IOException error){
            System.out.println(error.getMessage());
        }
    }
}