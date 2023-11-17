import Exp.DROP_TABLE;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import Parser.*;
import Parser.SetlikaParser.ParseContext;
import Parser.SetlikaBaseListener;

class Listener extends SetlikaBaseListener {
    @Override
    public void enterDrop_stmt(SetlikaParser.Drop_stmtContext ctx) {
        new DROP_TABLE(
                ctx.drop_table_name.getText()
        );
    }

    @Override
    public void enterCreate_table_stmt(SetlikaParser.Create_table_stmtContext ctx) {

        super.enterCreate_table_stmt(ctx);
    }
}

public class Start {
    public static void main(String[] args) {

        Lexer lexer = new SetlikaLexer(CharStreams.fromString("DROP TABLE AAW;"));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        SetlikaParser parser = new SetlikaParser(tokenStream);
        ParseContext cst = parser.parse();
        parser.setBuildParseTree(true);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(
                new Listener(), cst
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