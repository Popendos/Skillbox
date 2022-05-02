public class MainArith {
    int number1;
    int number2;

    int sum() {
        return number1 + number2;
    }

    int mult() {
        return number1 * number2;
    }

    int comp() {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    int comp2() {
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }


    void number12(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

}

