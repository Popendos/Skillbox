public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(2, 5, Operation.ADD);
        System.out.println(arithmeticCalculator.calculate(Operation.ADD));
    }
}
