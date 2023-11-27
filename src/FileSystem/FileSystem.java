package FileSystem;

import GlobalVariables.GlobalVariables;
import MetaTypes.MetaData;
import STypes.EntryCol;
import STypes.Types;
import until.AsciiArtTable;

import java.io.*;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;


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
            byte[] nameOfBytes = fields.get(i).getName().getBytes(StandardCharsets.UTF_8);
            Files.createFile(FieldsFolder.resolve(i + ".ffs"));
            s.write(ByteBuffer.allocate(4).putInt(nameOfBytes.length).array());
            s.write(nameOfBytes);
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
        Path local_dir = GlobalVariables.TablesFolder.resolve(TableName);
        if (Files.notExists(local_dir)) return;
        Path meta = local_dir.resolve(TableName + ".ti");
        MetaData[] metaData = ParserTableMeta(meta);
        for (int index = 0; index < values.size(); index++) {
            OutputStream writer = new FileOutputStream
                    (local_dir.resolve("Fields").resolve(index + ".ffs").toString(), true);
            byte[] value = values.get(index).getConvertValue();
            value = Arrays.copyOf(value, metaData[index].size);
            writer.write(value);
            writer.close();
        }
    }


    public void SelectAllData(String TableName, List<String> fieldsList) throws IOException {

        Path tablepath = GlobalVariables.TablesFolder.resolve(TableName);
        Path metapath = tablepath.resolve(TableName + ".ti");

        if (Files.notExists(metapath)) return;
        MetaData[] metaData = ParserTableMeta(metapath);
        AsciiArtTable result_table = new AsciiArtTable();
        for (MetaData metaDatum : metaData) {
            if (fieldsList.contains(metaDatum.fieldName) | fieldsList.contains("*"))
                result_table.addHeaderCols(metaDatum.fieldName);
        }
        Path fieldspath = tablepath.resolve("Fields");
        InputStream[] fieldsStreams = new InputStream[metaData.length];

        for (int j = 0; j < metaData.length; j++)
            fieldsStreams[j] = new FileInputStream(fieldspath.resolve(j + ".ffs").toString());

        for (int i = 0; i < Files.size(fieldspath.resolve("0.ffs")) / metaData[0].size; i++) {
            for (int j = 0; j < metaData.length; j++) {
                if (!fieldsList.contains(metaData[j].fieldName) | fieldsList.contains("*"))
                    continue;

                String value = "";
                byte[] bytes = fieldsStreams[j].readNBytes(metaData[j].size);
                if (metaData[j].type == 1)
                    value = String.valueOf(ByteBuffer.wrap(bytes).getInt());
                if (metaData[j].type == 2) {

                    value = new String(bytes, StandardCharsets.UTF_8).trim();
                }
                if (metaData[j].type == 3)
                    value = String.valueOf(ByteBuffer.wrap(bytes).getFloat());
                if (metaData[j].type == 4)
                    value = bytes[0] == 1 ? "True" : "False";

                result_table.add(value);
            }
        }

        for (int j = 0; j < metaData.length; j++)
            fieldsStreams[j].close();

        System.out.println(result_table.getOutput());

    }


    private MetaData[] ParserTableMeta(Path metapath) throws IOException{
        InputStream metaStream = new FileInputStream(metapath.toString());
        int countFields = ByteBuffer.wrap(metaStream.readNBytes(4)).getInt();
        MetaData[] result = new MetaData[countFields];
        for (int i = 0; i < countFields; i++) {
            int sizeName = ByteBuffer.wrap(
                    metaStream.readNBytes(4)
            ).getInt();
            String name = new String(
                    metaStream.readNBytes(sizeName),
                    StandardCharsets.UTF_8
            );
            byte type = (byte) metaStream.read();
            int size = ByteBuffer.wrap(
                    metaStream.readNBytes(4)
            ).getInt();

            result[i] = new MetaData(name, type, size);
        }
        metaStream.close();
        return result;
    }

}
