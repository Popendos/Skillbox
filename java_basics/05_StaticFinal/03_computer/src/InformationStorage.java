public class InformationStorage {

    private final InformationStorageType type;
    private final int memory;
    private final int weight;

    public InformationStorage(InformationStorageType type, int memory, int weight) {
        this.type = type;
        this.memory = memory;
        this.weight = weight;
    }

    public String toString() {
        return "Тип памяти: " + type + "\n" + "Объем памяти: " + memory + "\n" + "Вес: " + weight;
    }

    public int getWeight() {
        return weight;
    }
}
