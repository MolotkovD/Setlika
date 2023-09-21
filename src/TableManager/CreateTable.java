package TableManager;

import DataTypes.DataType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateTable {

    private byte[] HeadContext = new byte[128];

    private byte NameSize = 96;
    private byte VersionSize = 6;
    private byte DateSize = 8;
    private byte CountTableSize = 18;


    public void SetName(String NameBase){ System.arraycopy(NameBase.getBytes(),0, this.HeadContext,0, NameBase.getBytes().length);  }
    public void SetVersion(String Version){ System.arraycopy(Version.getBytes(), 0, this.HeadContext, this.NameSize, Version.getBytes().length);}
    public void SetDate(String Date){System.arraycopy(Date.getBytes(), 0, this.HeadContext, this.NameSize+this.VersionSize, Date.getBytes().length);}

    public void SaveDataBase(String pathToSave) {

    try{
        File save = new File(pathToSave);
        save.createNewFile();
        Path path = Paths.get(pathToSave);
        Files.write(path, this.HeadContext);

    } catch (IOException e){
        System.out.println("An error occurred.");
    }


    }
}



