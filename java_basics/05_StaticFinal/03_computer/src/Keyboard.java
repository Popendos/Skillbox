public class Keyboard {

    private final String type;
    private final Boolean isLight;
    private final int weight;

    public Keyboard(String type, Boolean isLight, int weight) {
        this.type = type;
        this.isLight = isLight;
        this.weight = weight;
    }

    public String toString() {
        return "Тип клавиатуры: " + type + "\n" + "Наличие подстветки: " + (isLight ? "Да" : "Нет") + "\n" + "Вес: " + weight;
    }

    public int getWeight() {
        return weight;
    }
}
