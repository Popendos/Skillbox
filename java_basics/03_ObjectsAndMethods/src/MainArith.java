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


    void add(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void print (){
        System.out.println("Сумма: " + sum());
        System.out.println("Умножение: " + mult());
        System.out.println("большее число: " + comp());
        System.out.println("меньшее число: " + comp2());

    }

}

