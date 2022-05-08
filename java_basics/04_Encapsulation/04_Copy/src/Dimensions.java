public class Dimensions {

    private final int length;
    private final int height;
    private final int width;

    public Dimensions(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void mathDimensions() {
        int mathDimensions;
        mathDimensions = length * height * width;
        System.out.println(mathDimensions);
    }


    }



