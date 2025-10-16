public class Calculator {

    public Operator cal(int num1, String operator, int num2){

        switch (operator) {
            case "+":
                return new Add(num1, num2);
            case "-":
                return new Minus(num1, num2);
            case "*":
                return new Times(num1, num2);
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("除數不可為 0");
                }
                return new Divided(num1, num2);
            default:
                throw new IllegalArgumentException("不支援的運算符號: " + operator);
        }
    }

    public int performOperator(Operator operator){
        return operator.calculate();
    }
}
