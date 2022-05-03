public class ArithmeticCalculator {

    int number1;
    int number2;


    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    public int returnMaxNumber() {
        if (number1 > number2)
            return number1;
        else return number2;

    }

    public int returnMinNumber() {
        if (number1 < number2)
            return  number1;
        else return  number2;
    }

    public int sum() {
        int sum;
        sum = number1 + number2;
        return sum;
    }

    public int mult() {
        int mult;
        mult = number1 * number2;
        return mult;
    }


}

