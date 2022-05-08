public class Main {
    public static void main(String[] args) {

        Ploshad ploshad = new Ploshad(7, 2, 3);
        System.out.println(ploshad.math());
        Ploshad ploshad1 = ploshad.setHeight(10);
        System.out.println(ploshad1.math());
        InfoOGruzah infoOGruzah = new InfoOGruzah(ploshad, 23, "222", false, "222ff");
        System.out.println(infoOGruzah);
        InfoOGruzah infoOGruzah1 = infoOGruzah.setAddress("dddd");
        System.out.println(infoOGruzah1);


    }
}
