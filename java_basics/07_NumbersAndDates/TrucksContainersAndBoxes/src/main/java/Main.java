import java.util.Scanner;

public class Main {


    private static int containerInTruck = 12;
    private static int boxInContainer = 27;
    private static int truck = 1;
    private static int container = 1;
    private static int box = 1;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int box = Integer.parseInt(boxes);

        if (box > 0) {
            System.out.println("Грузовиков: " + truck);
            System.out.println("\tКонтейнеров: " + container);
        }
        for (int i = 1; i <= box; i++) {
            System.out.println("\t\tящиков: " + i);

            if (i % (boxInContainer * containerInTruck) == 0) {
                truck++;
                System.out.println("Грузовиков: " + truck);

            }
            if (i % boxInContainer == 0) {
                container++;
                System.out.println("\tКонтейнеров: " + container);




            }

        }
        System.out.println("Необходимо Грузовиков: " + truck);
        System.out.println("Необходимо Контейнеров: " + container);
    }

}

// TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
// пример вывода при вводе 2
// для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */



