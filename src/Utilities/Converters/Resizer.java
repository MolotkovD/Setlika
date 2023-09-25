package Utilities.Converters;

import java.util.Arrays;

public class Resizer {
    public static byte[] resizeByteByZero(byte[] array, int size){
        if (array.length < size){
            byte[] res = new byte[array.length+(size-array.length)];
            Arrays.fill(res, (byte) 0);
            System.arraycopy(array, 0, res,0, array.length);
            return res;
        }
        return array;
    }
}
