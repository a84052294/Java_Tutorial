public class Minus extends Operator {

    public Minus(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int calculate() {
        return getNum1() - getNum2();
    }

    @Override
    public String getOperator() {
        return "-";
    }

}
