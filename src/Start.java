import Exp.*;
import GlobalVariables.GlobalVariables;
import STypes.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import Parser.*;
import Parser.SetlikaParser.*;
import Parser.SetlikaBaseListener;
import FileSystem.FileSystem;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class Listener extends SetlikaBaseListener {
    @Override
    public void enterDrop_stmt(SetlikaParser.Drop_stmtContext ctx) {
        new DROP_TABLE(
                ctx.table_name().getText()
        );
    }

    @Override
    public void enterCreate_stmt(SetlikaParser.Create_stmtContext ctx) {
        String table_name = ctx.table_name().getText();
        boolean ex = ctx.existence() != null;
        List<Column_defContext> col = ctx.columns_def().column_def();

        List<EntryCol> res_cols = new ArrayList<>();
        for (Column_defContext item: col) {
            String name = item.column_name().getText();
            TypeContext type = item.type();
            Types res_type = new Types();
            if (type.start.getText().equals("str")){
                res_type = new STR(Integer.parseInt(type.integer().getText()));
            } else if (type.start.getText().equals("int")) {
                res_type = new INT();
            } else if (type.start.getText().equals("bool")) {
                res_type = new BOOL();
            } else if (type.start.getText().equals("float")) {
                res_type = new FLOAT();
            }
            res_cols.add(
                    new EntryCol(
                            name, res_type
                    )
            );




        }
        new CREATE_TABLE(
                table_name, res_cols, ex
        );

    }

    @Override
    public void enterInsert_stmt(Insert_stmtContext ctx) {
        String table_name = ctx.table_name().getText();
        List<Types> value;
        for (ValueContext valueContext: ctx.values().value()) {
            value = new ArrayList<>();
            for (LiteralContext literal :
                    valueContext.literal()) {
                if (literal.integer() != null){
                    value.add(
                            new INT(
                                    Integer.parseInt(literal.integer().getText())
                            )
                    );
                } else if (literal.float_() != null) {
                    value.add(
                            new FLOAT(
                                    Float.parseFloat(literal.float_().getText())
                            )
                    );
                } else if (literal.bool() != null) {
                    value.add(
                            new BOOL(
                                    Boolean.parseBoolean(literal.bool().getText())
                            )
                    );
                } else if (literal.text() != null) {
                    String str = literal.text().getText().split("'")[1];
                    value.add(
                            new STR(
                                    str
                            )
                    );
                }



            }
            new INSERT_INTO(
                    table_name, value
            );
            }


//
//        }


        }

    @Override
    public void enterSelect_stmt(Select_stmtContext ctx) {
        new SELECT_DATA(ctx);
    }
}


public class Start {
    public static void main(String[] args) {
        //<editor-fold desc="Logo">
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
        //</editor-fold>

        System.out.println(
                ByteBuffer.wrap(
                        ByteBuffer.allocate(4).putInt(1002).array()
        ).getInt()
        );



        System.out.println();


        FileSystem fs = new FileSystem();
        Scanner scan = new Scanner(System.in);
        String FilePathDebug = "C:\\Users\\user\\Desktop\\qwwe";

        GlobalVariables.FS = fs;
        fs.InitFileSystem(
                Paths.get(FilePathDebug),
                scan.nextLine()
        );
        ParseTreeWalker walker = new ParseTreeWalker();
        while (true) {
            String inputStr = scan.nextLine();
            if (inputStr.equals("ex")){
                return;
            }

            Lexer lexer = new SetlikaLexer(CharStreams.fromString(inputStr));
            TokenStream tokenStream = new CommonTokenStream(lexer);



            SetlikaParser parser = new SetlikaParser(tokenStream);

            StmtContext cst = parser.stmt();
            parser.setBuildParseTree(true);

            walker.walk(
                    new Listener(), cst
            );

        }







//




//        try {
//            List<EntryCol> slist = new ArrayList<EntryCol>();
//            slist.add( new EntryCol("s", new INT()) );
//            fs.CreateNewTable("Table1", slist);
//        }
//        catch (IOException error){
//            System.out.println(error.getMessage());
//        }


    }

}