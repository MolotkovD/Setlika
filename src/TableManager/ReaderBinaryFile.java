package TableManager;

import java.io.IOException;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReaderBinaryFile {
    public void mains() {
        try (FileInputStream fin = new FileInputStream("notes.txt")) {
            byte[] buffer = new byte[256];
            System.out.println("File data:");
            fin.readNBytes(10);

            int count;
            while ((count = fin.read(buffer)) != -1) {

                for (int i = 0; i < count; i++) {

                    System.out.print((char) buffer[i]);
                }
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
