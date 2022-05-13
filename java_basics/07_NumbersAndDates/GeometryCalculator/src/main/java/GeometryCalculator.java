import java.math.BigInteger;

public class GeometryCalculator {

    private static double S;
    private static double V;
    private static boolean trianglePossible;
    private static double p;

    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        Math.abs(radius);
        S = Math.PI * Math.pow(radius, 2);
        System.out.println(S);

        return S;
    }


    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {

        BigInteger integer1 = new BigInteger("4");
        BigInteger integer2 = new BigInteger("3");



            V =  (integer1.doubleValue() / integer2.doubleValue()) * Math.PI * Math.pow(radius, 3);
            System.out.println(V);


        return Math.abs(V);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            trianglePossible = true;
            System.out.println(trianglePossible);
        } else {
            trianglePossible = false;
            System.out.println(trianglePossible);

        }  return trianglePossible;
    }


    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {

        if (isTrianglePossible(a, b, c)) {
            p = (a + b + c) / 2;
            S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(S);



        } else return -1.0;
        return S;
    }
}