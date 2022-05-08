public class Main {
    public static void main(String[] args) {

        Dimensions ploshad = new Dimensions(7, 2, 3);
        System.out.println(ploshad.math());
        Dimensions ploshad1 = ploshad.setHeight(10);
        System.out.println(ploshad1.math());
        InfoOGruzah infoOGruzah = new InfoOGruzah(ploshad, 23, "222", true, "222ff");
        System.out.println(infoOGruzah);
        InfoOGruzah infoOGruzah1 = infoOGruzah.setAddress("dddd");
        System.out.println(infoOGruzah1);


    }
}
