package FileSystem;

import GlobalVariables.GlobalVariables;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;



public class FileSystem {
    public void InitFileSystem(Path path, String name)
    {
        try {
            Path localDirectory = path.resolve(name);
            Files.createDirectory(localDirectory);
            GlobalVariables.TablesFolder = localDirectory.resolve("Tables" );
            Files.createDirectory(GlobalVariables.TablesFolder);
            GlobalVariables.BackUpFolder = localDirectory.resolve("BackUp" );
            Files.createDirectory(GlobalVariables.BackUpFolder);
            GlobalVariables.RulesFolder  = localDirectory.resolve("Rules"  );
            Files.createDirectory(GlobalVariables.RulesFolder);
            Path MetaFile = Files.createFile(localDirectory.resolve(name + ".sl" ));
            try (OutputStream s = new FileOutputStream(MetaFile.toString(), true)){
                s.write(GlobalVariables.SLVersion.getBytes());
                s.write(new byte[]{0});
                s.write(name.getBytes());
                GlobalVariables.MetaDataBase = MetaFile;
            }
            catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }

        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }



}
