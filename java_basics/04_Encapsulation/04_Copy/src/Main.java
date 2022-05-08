public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(7, 2, 3);
        System.out.println(dimensions.math());
        Dimensions dimensions1 = dimensions.setHeight(10);
        System.out.println(dimensions1.math());
        InfoOGruzah infoOGruzah = new InfoOGruzah(dimensions, 23, "222", true, "222ff");
        System.out.println(infoOGruzah);
        InfoOGruzah infoOGruzah1 = infoOGruzah.setAddress("dddd");
        System.out.println(infoOGruzah1);


    }
}
