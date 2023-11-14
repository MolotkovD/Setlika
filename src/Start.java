import FileSystem.FileSystem;
import GlobalVariables.GlobalVariables;
import Parser.SetlikaLexer;
import Parser.SetlikaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.atn.ATN;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        SetlikaLexer lexer = new SetlikaLexer(
                CharStreams.fromString(
                        "sasd"
                )
        );
        


//        String FilePathDebug = "D:\\Users\\molotkov.d\\Desktop\\Setlikatests";
//
//        //<editor-fold desc="Logo">
//        System.out.println(
//                """
//                   ╔══════════════════════════════════════════════════════╗
//                   ║                                                      ║
//                   ║ ███████╗███████╗████████╗██╗     ██╗██╗  ██╗ █████╗  ║
//                   ║ ██╔════╝██╔════╝╚══██╔══╝██║     ██║██║ ██╔╝██╔══██╗ ║
//                   ║ ███████╗█████╗     ██║   ██║     ██║█████╔╝ ███████║ ║
//                   ║ ╚════██║██╔══╝     ██║   ██║     ██║██╔═██╗ ██╔══██║ ║
//                   ║ ███████║███████╗   ██║   ███████╗██║██║  ██╗██║  ██║ ║
//                   ║ ╚══════╝╚══════╝   ╚═╝   ╚══════╝╚═╝╚═╝  ╚═╝╚═╝  ╚═╝ ║
//                   ║                                                      ║
//                   ║ Version: SL1.00  *                                   ║
//                   ║                                                      ║
//                   ╚══════════════════════════════════════════════════════╝"""
//        );
//        //</editor-fold>


//        FileSystem fs = new FileSystem();
//        Scanner scan = new Scanner(System.in);



//        GlobalVariables.FS = fs;
//        fs.InitFileSystem(Paths.get(FilePathDebug), scan.nextLine());
//
//        try {
//            fs.CreateNewTable("Table1");
//        }
//        catch (IOException error){
//            System.out.println(error.getMessage());
//        }
    }
}