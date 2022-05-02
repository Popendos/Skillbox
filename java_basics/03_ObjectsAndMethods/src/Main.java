public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        Basket basket1 = new Basket();
        basket1.add("Мясо", 30, 3, 22);
        basket1.print("Мясо");
    }
}
