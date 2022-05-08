public class Dimensions {
    private final int length;
    private final int height;
    private final int width;


    public Dimensions(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Dimensions setLenght(int length) {
        return new Dimensions(length, height, width);
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(length, height, width);
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(length, height, width);
    }

    public int math() {
        int math;
        math = length * height * width;
        return math;
    }

}

