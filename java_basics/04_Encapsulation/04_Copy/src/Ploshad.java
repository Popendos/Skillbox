public class Ploshad {
    private final int length;
    private final int height;
    private final int width;







    public Ploshad(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Ploshad setLenght(int length) {
        return new Ploshad(length, height, width);
    }

    public Ploshad setHeight(int height) {
        return new Ploshad(length, height, width);
    }

    public Ploshad setWidth(int width) {
        return new Ploshad(length, height, width);
    }

    public int math() {
        int math;
        math = length * height * width;
        return math;
    }

}

