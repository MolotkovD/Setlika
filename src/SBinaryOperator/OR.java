package SBinaryOperator;

public class OR extends Operator{
    @Override
    public boolean getExp(Object data1, Object data2) {
        return (boolean)data1 | (boolean)data2;
    }
}
