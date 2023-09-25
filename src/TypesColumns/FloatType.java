package TypesColumns;

import Utilities.Converters.FloatConverter;

public class FloatType implements DataTypeDB{
    private final float value;
    public FloatType(float val){
        this.value = val;
    }
    @Override
    public byte[] GetByte() {
        return FloatConverter.FloatToByteA(value);
    }
}
