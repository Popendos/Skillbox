public class GeometryCalculator {

    private static double S;
    private static double V;
    private static boolean trianglePossible;

    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        if (radius > 0) {
            S = Math.PI * Math.pow(radius, 2);
            System.out.println("Площадь круга = " + S);
        } else {
            System.out.println("Радиус меньше нуля");


        }
        return 0;
    }


    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        if (radius > 0) {
            V = (double) (4 / 3) * Math.PI * Math.pow(radius, 3);
            System.out.println("Объем шара равен: " + V);
        } else {
            System.out.println("Радиус меньше нуля");
        }
        return 0;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            trianglePossible = true;
            System.out.println("Возможно построить");

        } else System.out.println("Невозможно построить такой треугольник");
        return false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p;

        double S;
        if (trianglePossible = true) {
            p = (a + b + c) / 2;
            S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(S);


        } else System.out.println("Невозможно построить такой треугольник");
        return -1;
    }
}
