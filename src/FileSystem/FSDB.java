package FileSystem;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class FSDB {
    Path localDirectory;


    public FSDB(Path path, String name){
        localDirectory = path;
        InitBase(name);
    }

    public OutputStream GetMetaBlock(String name) throws IOException{
        return Files.newOutputStream(localDirectory.resolve(name + ".mmi"));
    }

    public void InitBase(String name){
    try
    {

        localDirectory = localDirectory.resolve(name);
        Files.createDirectory(localDirectory);
        Files.createDirectory(localDirectory.resolve("Tables" ));
        Files.createDirectory(localDirectory.resolve("BackUps"));
        Files.createDirectory(localDirectory.resolve("Cache"  ));
        Files.createDirectory(localDirectory.resolve("Rules"  ));

        Files.createFile(localDirectory.resolve(name + ".mmi"));
        OutputStream input = GetMetaBlock(name);
        input.write(
                Metadata.GetMetaBlock(name)
        );
        input.flush();
        input.close();

    }
    catch (IOException error)
    {
        System.out.println(
                error.getMessage()
        );
    }

   }

    public void AddUser(String user, String password, String RulesType, String[] RulesCommands) throws NoSuchAlgorithmException, IOException {
        Path userFile = localDirectory.resolve("Rules").resolve(user);
        Files.createFile(userFile);
        OutputStream writer = Files.newOutputStream(userFile);
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] codePassword = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        writer.write(codePassword);

        if (RulesType.equals("WL")) {
            writer.write("w".getBytes());
        }
        else if (RulesType.equals("BL")) {
            writer.write("b".getBytes());
        }
//
//        for (String command : RulesCommands) {
//            writer.write(command.getBytes());
//            writer.flush();
//        }
        writer.flush();
        writer.close();

    }
}
