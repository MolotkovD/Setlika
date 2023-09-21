package TableManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReaderBinaryFile {
    private byte[] ContextInputFile;
    ReaderBinaryFile(Path pathToFile){
        try {
           ContextInputFile = Files.readAllBytes(pathToFile);
        } catch (IOException e){
            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }


}
