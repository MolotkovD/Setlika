package GlobalVariables;

import FileSystem.FileSystem;

import java.nio.file.Path;

/**
 *  Global Variables class
 */
public class GlobalVariables {

    /**SLVersion - Setlika Version*/
    static public String SLVersion = "SL1.00";

    /** Meta file of DataBase */
    static public Path MetaDataBase;

    /** Folder for tables */
    static public Path TablesFolder;

    /** Folder for BackUps */
    static public Path BackUpFolder;

    /** Folder fot Rules */
    static public Path RulesFolder;

    /** Initer File System */
    static public FileSystem FS;


}
