package Utilities.Converters;

public class FloatConverter {
    public static byte[] FloatToByteA(float i) {
        return IntegerConverter.IntToByteA(
                Float.floatToIntBits(i)
        );
    }

    public static float ByteAToFloat(byte[] val) {
        int intBits = 0;
        if (val != null && val.length == 4) {

            intBits = val[0];
            intBits &= 0xff;
            intBits |= ((int) val[1] << 8);
            intBits &= 0xffff;
            intBits |= ((int) val[2] << 16);
            intBits &= 0xffffff;
            intBits |= ((int) val[3] << 24);



        }
        return Float.intBitsToFloat(intBits);

    }
}