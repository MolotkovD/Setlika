package TypesColumns;

import Utilities.Converters.IntegerConverter;

public class IntegerType implements DataTypeDB{
    private final int value;
    public IntegerType(int value){
        this.value = value;
    }
    @Override
    public byte[] GetByte() {
        return IntegerConverter.IntToByteA(this.value);
    }
}
