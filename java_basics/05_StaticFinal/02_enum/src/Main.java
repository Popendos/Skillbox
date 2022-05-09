public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(2, 5);
        System.out.println(arithmeticCalculator.calculate(Operation.ADD));
        System.out.println(arithmeticCalculator.calculate(Operation.MULTIPLY));
        System.out.println(arithmeticCalculator.calculate(Operation.SUBSTRACT));
    }
}
