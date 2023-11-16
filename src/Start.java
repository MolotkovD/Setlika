import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import Parser.SetlikaParser;
import Parser.SetlikaLexer;
import Parser.SetlikaBaseVisitor;

class Ts implements ParseTreeListener {

    @Override
    public void visitTerminal(TerminalNode terminalNode) {


    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {}

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
public class Start {
    public static void main(String[] args) {

//        Lexer lexer = new SetlikaLexer(CharStreams.fromString("DROP TABLE AAW;"));
//        TokenStream tokenStream = new CommonTokenStream(lexer);
//        SetlikaParser parser = new SetlikaParser(tokenStream);
//
//
//        parser.setBuildParseTree(true);
//
//        ParseTreeVisitor<> s = new SetlikaBaseVisitor();
//
//        ParseTree parseTree = parser.parse();
//        ParseTreeWalker walker = new ParseTreeWalker();
//        ParseTreeListener s = new Ts();
//
//        walker.walk(
//                s, parseTree
//        );








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