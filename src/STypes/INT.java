package STypes;

import java.nio.ByteBuffer;

public class INT extends Types {
    public INT(){
        this.byte_type = 1;
        this.size = Integer.BYTES;
    }

    public INT(int val){
        this.value = val;
    }

    @Override
    public byte[] getConvertValue() {
        return ByteBuffer.allocate(Integer.BYTES).putInt((Integer) this.value).array();
    }
}
