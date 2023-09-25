package TypesColumns;

public class CharType implements DataTypeDB{
    private final char value;
    public CharType(char ch){
        this.value = ch;
    }
    @Override
    public byte[] GetByte() {
        return new byte[]{(byte)this.value};
    }
}
