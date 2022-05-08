public class Zakaz {
    private final InfoOGruzah infoOGruzah;
    private final Ploshad ploshad;

    public Zakaz(InfoOGruzah infoOGruzah, Ploshad ploshad) {
        this.infoOGruzah = infoOGruzah;
        this.ploshad = ploshad;
    }

    public InfoOGruzah getInfoOGruzah() {
        return infoOGruzah;
    }

    public Ploshad getPloshad() {
        return ploshad;
    }

    public String toString() {
        return infoOGruzah.toString() + "\n" + "Объем: " + ploshad.math();
    }
}
