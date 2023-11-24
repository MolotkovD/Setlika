package SBinaryOperator;

public class MoreEquals extends Operator{
    @Override
    public boolean getExp(Object data1, Object data2) {
        return (int)data1 >= (int)data2;
    }
}
