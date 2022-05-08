public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(7, 2, 3);

        Storage storage = new Storage(dimensions, 23, "222", true, "222ff");
        System.out.println(storage);
        Storage storage1 = storage.setAddress("dddd");
        storage = storage1;
        System.out.println(storage);


    }
}
