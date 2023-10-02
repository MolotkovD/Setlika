package Authentication;

import FileSystem.FSDB;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Registration {
    FSDB fileSystem;
    public Registration(FSDB FileSystem){
        fileSystem = FileSystem;
    }
    public void AddAdmin(String UserName, String Password){
        try {
            fileSystem.AddUser(UserName, Password, "BL", new String[]{});
        } catch (IOException | NoSuchAlgorithmException io) {
            System.out.println(io.getMessage());
        }

    }
}
