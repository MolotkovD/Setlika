package DataTypes;

import java.lang.*;

public class DataType{
    public String TypeName;
    public Object TypeObject;
    public Object GetType(){
        System.out.println(this.TypeName);
        return this.TypeObject;
    }

    DataType(String TypeName, Object TypeObject){
        this.TypeName = TypeName;
        this.TypeObject = TypeObject;
    }
}
