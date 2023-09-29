package FileSystem;


import Enums.SLError;
import GlobalValue.GlobalValue;
import Utilities.Converters.Resizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CreateFileDB {

    public static SLError CreateNewDB(String name){
    try
    {

        Path localDirectory = GlobalValue.pathToDBDirectory.resolve(String.format("%s", name));
        Files.createDirectory(localDirectory);

        Files.createDirectory(localDirectory.resolve("Tables"));
        Files.createDirectory(localDirectory.resolve("BackUps"));
        Files.createDirectory(localDirectory.resolve("Cache"));
        Files.createDirectory(localDirectory.resolve("Rules"));

        Files.createFile(localDirectory.resolve(String.format("%s.mmi", name)));
        Files.write(localDirectory.resolve(String.format("%s.mmi", name)), GenHead(name));

        return SLError.CREATE_DATABASE_OK;
    }
    catch (IOException error)
    {
        System.out.println(
                error.getMessage()
        );
        return SLError.CREATE_DATABASE_ERROR;
    }

}
    public static void CreateTable(String name, String[] columns){

    }

    private static byte[] GenHead(String name){
        byte[] context = new byte[272];
        String date = new SimpleDateFormat("ddMMyyyy",   Locale.getDefault()).format(new Date());
        System.arraycopy(
                String.format("%s/%s", GlobalValue.SLVersion, date).getBytes(), 0, context, 0, 16
        );
        System.arraycopy(
                Resizer.resizeByteByZero(name.getBytes(), 256), 0, context, 16, 256
        );
        return context;
    }
}
