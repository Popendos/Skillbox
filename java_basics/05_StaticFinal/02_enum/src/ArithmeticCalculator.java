public class ArithmeticCalculator {

    private final int number1;
    private final int number2;
    private final Operation type;


    public ArithmeticCalculator(int number1, int number2, Operation type) {
        this.number1 = number1;
        this.number2 = number2;
        this.type = type;

    }


    public int calculate() {
        if (type == Operation.ADD) {
            return number1 + number2;
        }
        if (type == Operation.SUBSTRACT) {
            return number1 - number2;
        }
        if (type == Operation.MULTIPLY) {
            return number1 * number2;
        }

        return 0;

    }
}




