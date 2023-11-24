package SBinaryOperator;
public class Equals extends Operator {
    @Override
    public boolean getExp(Object data1, Object data2) {
        return data1 == data2;
    }
}
