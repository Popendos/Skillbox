public class Storage {

    private final Dimensions dimensions;
    private final int weight;
    private final String address;
    private final boolean rotate;
    private final String regNumber;



    public Storage(Dimensions dimensions, int weight, String address, boolean rotate, String regNumber) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.rotate = rotate;
        this.regNumber = regNumber;
    }

    public Storage setPloshad(Dimensions dimensions) {
        return new Storage(dimensions, weight, address, rotate, regNumber);
    }

    public Storage setWeight(int weight) {
        return new Storage(dimensions, weight, address, rotate, regNumber);
    }

    public Storage setAddress(String address) {
        return new Storage(dimensions, weight, address, rotate, regNumber);
    }

    public Storage setRotate(boolean rotate) {
        return new Storage(dimensions, weight, address, rotate, regNumber);
    }

    public Storage setRegNumber(String regNumber) {
        return new Storage(dimensions, weight, address, rotate, regNumber);
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
        return "объем: " + dimensions.math() + "\n" + "Вес: " + weight + "\n" + "Адрес: " + address + "\n" + "Можно ли переварачивать? " + (rotate ? "да" : "нет") + "\n" + "Регситрационный номер: " + regNumber;
    }


}
