public class ArithmeticCalculator {

    public int number1 = 0;
    public int number2 = 0;


    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;

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




