public class Computer {

    public Processor processor;
    public Ram ram;
    public InformationStorage informationStorage;
    public Display display;
    public Keyboard keyboard;
    private final String vendor;
    private final String name;


    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setInformationStorage(InformationStorage informationStorage) {
        this.informationStorage = informationStorage;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public InformationStorage getInformationStorage() {
        return informationStorage;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer(Processor processor, Ram ram, InformationStorage informationStorage, Display display, Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.ram = ram;
        this.informationStorage = informationStorage;
        this.display = display;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;

    }

    public int getWeight() {
        return processor.getWeight() + ram.getWeght() + informationStorage.getWeight() + display.getWeight() + keyboard.getWeight();
    }


    public String toString() {
        return "Компьютер: " + "\n" + "производитель: " + vendor + "\n" + "название: " + name + "\n" + "\n" +
                "Процессор: " + "\n" + processor + "\n" + "\n" +
                "Оперативная память: " + "\n" + ram + "\n" + "\n" +
                "Внутренний накопитель: " + "\n" + informationStorage + "\n" + "\n" +
                "Экран: " + "\n" + display + "\n" + "\n" +
                "Клавиатура: " + "\n" + keyboard;
    }


}
