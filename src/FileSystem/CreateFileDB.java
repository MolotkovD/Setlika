package FileSystem;


import GlobalValue.GlobalValue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateFileDB {

    public static void CreateNewDB(String name){
    try
    {
        Path localDirectory = GlobalValue.pathToDBDirectory.resolve(String.format("%s", name));
        Files.createDirectory(localDirectory);
        Files.createDirectory(localDirectory.resolve("Data"));
        Files.createDirectory(localDirectory.resolve("Table"));
        Files.createFile(localDirectory.resolve(String.format("%s.mmi", name)));

        Files.write(
                localDirectory.resolve(String.format("%s.mmi", name)),
        );

    }
    catch (IOException error)
    {
        System.out.println(
                error.getMessage()
        );
    }

}
}
