package TypesColumns;

public class TextType implements DataTypeDB{
    private final String value;
    public TextType(String text){
        this.value = text;
    }
    @Override
    public byte[] GetByte() {
        return value.getBytes();
    }
}
