public class Product {

    private final String name;
    private int price;
    private  final int barcode;

    public Product(String name, int price, int barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getBarcode() {
        return barcode;
    }
}
