package SBinaryOperator;

public class NotEquals extends Operator{
    @Override
    public boolean getExp(Object data1, Object data2) {
        return data1 != data2;
    }
}
