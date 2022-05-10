public class Display {
    private final int diagonal;
    private final DisplayType type;
    private final int weight;

    public Display(int diagonal, DisplayType type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public String toString() {
        return "Диагональ: " + diagonal + "\n" + "Тип дисплея: " + type + "\n" + "Вес: " + weight;
    }

    public int getWeight() {
        return weight;
    }
}
