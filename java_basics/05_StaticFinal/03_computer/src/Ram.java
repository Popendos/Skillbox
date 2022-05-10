public class Ram {
    private final String type;
    private final int memory;
    private final int weght;

    public Ram(String type, int memory, int weght) {
        this.type = type;
        this.memory = memory;
        this.weght = weght;
    }

    public String toString() {
        return "Тип: " + type + "\n" + "Количетсво памяти: " + "\n" + "Вес: " + weght;
    }

    public int getWeght() {
        return weght;
    }
}
