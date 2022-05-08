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

    public Dimensions getDimensions() {
        return dimensions;
    }


    public int getWeight() {
        return weight;
    }

    public Storage setWeight(int weight) {
        return new Storage(dimensions, weight, address, rotate, regNumber);
    }

    public String getAddress() {
        return address;
    }

    public Storage setAddress(String address) {
        return new Storage(dimensions, weight, address, rotate, regNumber);
    }

    public boolean isRotate() {
        return rotate;
    }

    public Storage setRotate(boolean rotate) {
        return new Storage(dimensions, weight, address, rotate, regNumber);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Storage setRegNumber(String regNumber) {
        return new Storage(dimensions, weight, address, rotate, regNumber);
    }

    public String toString(){
        return dimensions + " " + weight + " " + address + " " + rotate + " " + regNumber;
    }
}
