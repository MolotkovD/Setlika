package STypes;


public class STR extends Types {
    public STR(int size_){
        this.size = size_;
        this.byte_type = 2;
    }

    public STR(String val){
        this.value = val;
    }

    @Override
    public byte[] getConvertValue() {
        return String.valueOf(this.value).getBytes();
    }
}
