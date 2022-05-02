public class arith {
    public static void main(String[] args) {
        MainArith numbers = new MainArith();
        numbers.number12(3, 4);

        System.out.println("Сумма: " + numbers.sum());
        System.out.println("Умножение: " + numbers.mult());
        System.out.println("большее число: " + numbers.comp());
        System.out.println("меньшее число: " + numbers.comp2());


    }
}
