public class InfoOGruzah {

    private final Dimensions ploshad;
    private final int weight;
    private final String address;
    private final boolean rotate;
    private final String regNumber;



    public InfoOGruzah(Dimensions ploshad, int weight, String address, boolean rotate, String regNumber) {
        this.ploshad = ploshad;
        this.weight = weight;
        this.address = address;
        this.rotate = rotate;
        this.regNumber = regNumber;
    }

    public InfoOGruzah setPloshad(Dimensions dimensions) {
        return new InfoOGruzah(dimensions, weight, address, rotate, regNumber);
    }

    public InfoOGruzah setWeight(int weight) {
        return new InfoOGruzah(ploshad, weight, address, rotate, regNumber);
    }

    public InfoOGruzah setAddress(String address) {
        return new InfoOGruzah(ploshad, weight, address, rotate, regNumber);
    }

    public InfoOGruzah setRotate(boolean rotate) {
        return new InfoOGruzah(ploshad, weight, address, rotate, regNumber);
    }

    public InfoOGruzah setRegNumber(String regNumber) {
        return new InfoOGruzah(ploshad, weight, address, rotate, regNumber);
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isRotate() {
        return rotate;
    }

    public String getRegNumber() {
        return regNumber;
    }


    public String toString() {
        return "объем: " + ploshad.math() + "\n" + "Вес: " + weight + "\n" + "Адрес: " + address + "\n" + "Можно ли переварачивать? " + (rotate ? "да" : "нет") + "\n" + "Регситрационный номер: " + regNumber;
    }


}
