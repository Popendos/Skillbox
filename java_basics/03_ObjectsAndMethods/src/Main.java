public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        Basket basket1 = new Basket();
        basket1.add("Мясо", 30, 3);
        basket1.print("Мясо");

        Basket basket2 = new Basket();
        basket2.add("poplol", 25, 2, 2);
        basket2.print("poplol");
    }
}
