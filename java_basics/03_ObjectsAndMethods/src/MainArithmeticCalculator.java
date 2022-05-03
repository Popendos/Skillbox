import java.util.SortedMap;

public class MainArithmeticCalculator {
    public static void main(String[] args) {

        ArithmeticCalculator calculator = new ArithmeticCalculator(2, 4);
        System.out.println(calculator.sum());
        System.out.println(calculator.mult());
        System.out.println(calculator.returnMaxNumber());
        System.out.println(calculator.returnMinNumber());


        }

    }
