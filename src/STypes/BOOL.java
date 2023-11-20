package STypes;

public class BOOL extends Types {
    public BOOL(){
        this.byte_type = 5;
        this.size = 1;
    }


    public BOOL(boolean val){
        this.value = val;
    }

    @Override
    public byte[] getConvertValue() {
        if ((Boolean) this.value)
            return new byte[] {1};
        return new byte[] {0};
    }
}
