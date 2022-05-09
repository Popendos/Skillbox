public class ArithmeticCalculator {

    public final int number1;
    public final int number2;
    public final Operation type;


    public ArithmeticCalculator(int number1, int number2, Operation type) {
        this.number1 = number1;
        this.number2 = number2;
        this.type = type;

    }


    public int calculate(Operation type) {
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




