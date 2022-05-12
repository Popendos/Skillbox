import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int containerInTruck = 12;
        int boxInContainer = 27;
        int truck = 1;
        int container = 1;


        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int box = Integer.parseInt(boxes);

        if (box < 1) {
            container = 0;
            truck = 0;
        } else {
            System.out.println("Грузовик: " + truck);
            System.out.println("\tКонтейнер: " + container);
        }
        for (int i = 1; i <= box; i++) {
            System.out.println("\t\tЯщик: " + i);

            if (i % (boxInContainer * containerInTruck) == 0) {
                ++truck;
                System.out.println("Грузовик: " + truck);

            }
            if ((i % boxInContainer == 0) && (i != box)) {
                ++container;
                System.out.println("\tКонтейнер: " + container);


            }

        }
        System.out.println("Необходимо:" + "\n" + "грузовиков - " + truck + " шт." + "\n" + "контейнеров - " + container + " шт.");

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



