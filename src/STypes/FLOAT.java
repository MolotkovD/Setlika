package STypes;

import java.nio.ByteBuffer;

public class FLOAT extends Types{
    public FLOAT(){
        this.byte_type = 3;
        this.size = Float.BYTES;
    }

    public FLOAT(float val){
        this.value = val;
    }

    @Override
    public byte[] getConvertValue() {
        return ByteBuffer.allocate(Float.BYTES).putFloat((Float)this.value).array();
    }
}
