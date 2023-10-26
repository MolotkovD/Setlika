package FileSystem;

import GeneralCore.GlobalValue;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;



public class FileSystem {
    Path localDirectory;

    public void InitFileSystem(Path path, String name){
        localDirectory = path;
        InitBase(name);
    }

    public void InitBase(String name)
    {

        try {
            localDirectory = localDirectory.resolve(name);

            Files.createDirectory(localDirectory); // Main Folder

            GlobalValue.TablesFolder = localDirectory.resolve("Tables" );
            Files.createDirectory(GlobalValue.TablesFolder); // Folder for Tables

            GlobalValue.BackUpFolder = localDirectory.resolve("BackUp" );
            Files.createDirectory(GlobalValue.BackUpFolder); // Folder for BackUp

            GlobalValue.RulesFolder  = localDirectory.resolve("Rules"  );
            Files.createDirectory(GlobalValue.RulesFolder); // Folder fot Rules

            Path MetaFile = Files.createFile(localDirectory.resolve(name + ".sl" ));  // Main meta file
            try (OutputStream s = new FileOutputStream(MetaFile.toString(), true)){
                s.write( GlobalValue.SLVersion.getBytes() );
                s.write( new byte[]{0} );
                s.write( name.getBytes() );
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }

            CreateLocalAdmin();



        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }

    private void CreateLocalAdmin(){
        try (OutputStream admin = new FileOutputStream(
                GlobalValue.RulesFolder.resolve("Admin.rsl").toString()
        )) {
           admin.write("Root123".getBytes());
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

}
