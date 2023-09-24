package Utilities.Converters;

public class IntegerConverter {

    public static byte[] IntToByteA(int i){
        byte[] b = new byte[4];
        b[0] = (byte) ((0xFF       & i)      );
        b[1] = (byte) ((0xFF00     & i) >> 8 );
        b[2] = (byte) ((0xFF0000   & i) >> 16);
        b[3] = (byte) ((0xFF000000 & i) >> 24);
        return b;
    }
    public static int ByteAToInt(byte[] val){
        int
        num = val[0] & 0xFF;
        num |= ((val[1] << 8) & 0xFF00);
        num |= ((val[2] << 16) & 0xFF0000);
        num |= ((val[3] << 24) & 0xFF000000);
        return num;
    }

}
