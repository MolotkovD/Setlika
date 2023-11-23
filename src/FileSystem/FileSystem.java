package FileSystem;

import GlobalVariables.GlobalVariables;
import STypes.EntryCol;
import STypes.Types;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


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
                s.write(0);
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

    public void CreateNewTable(String name, List<EntryCol> fields) throws IOException{
        Path tempDir = GlobalVariables.TablesFolder.resolve(name);
        Files.createDirectory(tempDir);
        Files.createDirectory(tempDir.resolve("Indices"));
        Path FieldsFolder = Files.createDirectory(tempDir.resolve("Fields"));
        Path metaTable = Files.createFile(tempDir.resolve(
                name + ".ti"
        ));
        try {

        OutputStream s = new FileOutputStream(metaTable.toString(), true);
        s.write(
                ByteBuffer.allocate(4).putInt(fields.size()).array()
        );
        for (int i = 0; i < fields.size(); i++) {

            Files.createFile(FieldsFolder.resolve(i + ".ffs"));
            s.write(  fields.get(i).getName().getBytes() );
            s.write(0);
            s.write(fields.get(i).getByteType());
            s.write( ByteBuffer.allocate(4).putInt(fields.get(i).getType().size).array());
        }
            s.close();
        } catch (IOException exception){
            System.out.println("ERROR!");
            Files
                    .walk(tempDir)
                    .sorted(Comparator.reverseOrder())
                    .forEach(path -> {
                        try {
                            Files.delete(path);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }

    }

    public void DeleteTable(String name) throws IOException{
        Files
                .walk(GlobalVariables.TablesFolder.resolve(name))
                .sorted(Comparator.reverseOrder())
                .forEach(path -> {
                    try {
                        Files.delete(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }



    public void InsertData(String TableName, List<Types> values) throws IOException {

        if (!Files.exists(GlobalVariables.TablesFolder.resolve(TableName)))
            return;
        Path local_dir = GlobalVariables.TablesFolder.resolve(TableName);
        Path meta = local_dir.resolve(TableName + ".ti");
        InputStream inputStreamReader = new FileInputStream(meta.toString());
        if (ByteBuffer.wrap(inputStreamReader.readNBytes(4)).getInt() != values.size()){
            inputStreamReader.close();
            return;
        }
        List<Integer> sizes = getSizeFieldsMetaTable(meta);

        for (int index = 0; index < values.size(); index++) {
            OutputStream writer = new FileOutputStream
                    (local_dir.resolve("Fields").resolve(index + ".ffs").toString(), true);

            byte[] value = values.get(index).getConvertValue();
            value = Arrays.copyOf(value, sizes.get(index));
            writer.write(value);
            writer.close();
        }


        inputStreamReader.close();
    }

    public List<Integer> getSizeFieldsMetaTable(Path meta) throws IOException {

        List<Integer> result = new ArrayList<>();

        InputStream metafile;
        metafile = new FileInputStream(meta.toString());
        int count = ByteBuffer.wrap(metafile.readNBytes(4)).getInt();

        metafile.skip(4);
        for (int i = 0; i < count; i++) {
            int last = 1;
            while (last != 0) {
                last = metafile.read();

            }

            System.out.println(last);
            metafile.skip(1);
            byte[] sdd = metafile.readNBytes(4);
            System.out.println(Arrays.toString(sdd));
            int res =  ByteBuffer.wrap(sdd).getInt();
            System.out.println(
                    res
            );
            result.add(
                res
            );
        }




        metafile.close();
        return result;

    }

}
