package SBinaryOperator;

public class Less extends Operator{
    @Override
    public boolean getExp(Object data1, Object data2) {
        return (int)data1 < (int)data2;
    }
}
