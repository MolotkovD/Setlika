package STypes;

public class EntryCol{
    private final String name;
    private final Types type;

    public EntryCol(
            String name_,
            Types type_
    ){
        this.name = name_;
        this.type = type_;
    }

    public String getName(){
        return this.name;
    }

    public byte getByteType(){
        return type.byte_type;
    }

    public Types getType(){
        return type;
    }


}
