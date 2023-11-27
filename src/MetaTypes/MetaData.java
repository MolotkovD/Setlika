package MetaTypes;

public class MetaData {
    public String fieldName;
    public byte type;
    public int size;
    public MetaData(String fieldName, byte type, int size){
        this.fieldName = fieldName;
        this.type = type;
        this.size = size;
    }
}
