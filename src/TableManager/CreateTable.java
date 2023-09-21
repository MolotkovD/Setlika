package TableManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateTable {

    private final byte[] HeadContext = new byte[128];

    private final byte NameSize = 127;
    private final byte VersionSize = 6;
    private final byte DateSize = 8;
    private final byte CountTableSize = 18;


    public void SetName(String NameBase){ System.arraycopy(NameBase.getBytes(),0, this.HeadContext,0, NameBase.getBytes().length);  }
    public void SetVersion(String Version){ System.arraycopy(Version.getBytes(), 0, this.HeadContext, this.NameSize, Version.getBytes().length);}
    public void SetDate(String Date){System.arraycopy(Date.getBytes(), 0, this.HeadContext, this.NameSize+this.VersionSize, Date.getBytes().length);}

    public void SaveDataBase(String pathToSave) {

    try{
        File save = new File(pathToSave);
        boolean r = save.createNewFile();
        Path path = Paths.get(pathToSave);
        Files.write(path, this.HeadContext);

    } catch (IOException e){
        System.out.println("An error occurred.");
    }


    }
}



