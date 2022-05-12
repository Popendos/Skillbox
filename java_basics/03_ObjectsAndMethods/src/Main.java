public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");


        Basket basket1 = new Basket();
        basket1.add("Мясо", 30, 4);
        basket1.print("Мясо");

        Basket basket2 = new Basket();
        basket2.add("poplol", 25, 10, 2);
        basket2.print("poplol");

        System.out.println(Basket.getAllTotalPrice());
        System.out.println(Basket.getAllItems());
        System.out.println(Basket.getAvaragePriceItems());
        System.out.println(Basket.getAvaragePriceBasket());
    }
}
