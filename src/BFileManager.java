import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class BFileManager {
    private byte[] Head = new byte[ConstantsFilePoints.HeadSize];
    private byte[] MetaTableContext;
    BFileManager(String NameBase){

        byte[] nameBytes = NameBase.getBytes();
        nameBytes = resizeByteByZero(nameBytes, ConstantsFilePoints.NameSize);
        System.arraycopy(nameBytes, 0, Head, 0, ConstantsFilePoints.NameSize);
        setMetaDate();
        setCountTable(0);
    }

    private void setMetaDate(){
        System.arraycopy(
                "1234567891234567".getBytes(), 0, Head, ConstantsFilePoints.NameSize, ConstantsFilePoints.MetaInfoSize
        );
    }
    private void setCountTable(int count){
        byte[] intb = IntToByte(count);
        System.arraycopy(
                intb, 0, Head,
                ConstantsFilePoints.NameSize + ConstantsFilePoints.MetaInfoSize,
                intb.length
        );

    }
    private byte[] resizeByteByZero(byte[] array, int size){
        if (array.length < size){
            byte[] res = new byte[array.length+(size-array.length)];
            Arrays.fill(res, (byte) 0);
            System.arraycopy(array, 0, res,0, array.length);
            return res;
        }
        return array;
    }
    private byte[] IntToByte(int i){
        byte[] b = new byte[4];
        b[0] = (byte)  (0xFF & i);
        b[1] = (byte) ((0xFF00 & i) >> 8);
        b[2] = (byte) ((0xFF0000 & i) >> 16);
        b[3] = (byte) ((0xFF000000 & i) >> 24);
        return b;
    }
    private int ByteToInt(byte[] val){
        int num = val[0] & 0xFF;
        num |= ((val[1] << 8) & 0xFF00);
        num |= ((val[2] << 16) & 0xFF0000);
        num |= ((val[3] << 24) & 0xFF000000);
        return num;
    }
    public void Save(){
        Path p = Paths.get("D:\\Users\\molotkov.d\\Documents\\res.db");
        File saveFile = new File(p.toString());
        try {
            if (saveFile.createNewFile()){
                Files.write(p, Head);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
            return;
        }
    }
    public void AddTable(String TableName){
        resizeByteByZero(MetaTableContext, 100);
    }
}

