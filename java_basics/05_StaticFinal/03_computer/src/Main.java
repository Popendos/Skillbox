public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer(new Processor(22, 2, "lool", 2),
                new Ram("lol", 22, 15),
                new InformationStorage(InformationStorageType.SSD, 22, 15),
                new Display(24, DisplayType.IPS, 34),
                new Keyboard("ololo", true, 44), "lol", "lol");
        System.out.println(computer);
        System.out.println(computer.getWeight());


    }
}
