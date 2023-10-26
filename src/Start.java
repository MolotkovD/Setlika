import FileSystem.FileSystem;

import java.nio.file.Paths;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        Scanner scan = new Scanner(System.in);

        fs.InitFileSystem(
                Paths.get(scan.nextLine()),
                scan.nextLine()
        );
    }
}