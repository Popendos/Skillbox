public class Processor {

    private final int frequncy;
    private final int countCore;
    private final String manufactured;
    private final int weight;

    public Processor(int frequncy, int countCore, String manufactured, int weight) {
        this.frequncy = frequncy;
        this.countCore = countCore;
        this.manufactured = manufactured;
        this.weight = weight;
    }

    public String toString() {
        return "частота процессора: " + frequncy + "\n" + "Количсетво ядер: " + countCore + "\n" + "Производитель: " + manufactured + "\n" + "Вес: " + weight;
    }


    public int getWeight() {
        return weight;
    }
}
