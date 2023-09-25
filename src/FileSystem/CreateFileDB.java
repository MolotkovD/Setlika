package FileSystem;


import GlobalValue.GlobalValue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;

public class CreateFileDB {

    public static void CreateNewDB(String name){
    try
    {
        Path localDirectory = GlobalValue.pathToDBDirectory.resolve(String.format("%s", name));
        Files.createDirectory(localDirectory);
        Files.createDirectory(localDirectory.resolve("Data"));
        Files.createDirectory(localDirectory.resolve("Table"));
        Files.createDirectory(localDirectory.resolve("BackUps"));
        Files.createDirectory(localDirectory.resolve("Cache"));

        Files.createFile(localDirectory.resolve(String.format("%s.mmi", name)));

        Files.write(
                localDirectory.resolve(String.format("%s.mmi", name)), GenHead()
        );

    }
    catch (IOException error)
    {
        System.out.println(
                error.getMessage()
        );
    }

}
    private byte[] GenHead(){
        byte[] context = new byte[272];

        System.arraycopy(
                String.format("%v/%d", GlobalValue.SLVersion, DateFormat.getDateInstance().toString()).getBytes(), 0, context, 0, 16
        );

        return context;
    }
}
