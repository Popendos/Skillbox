public class Popovich {

    private int weight;
    private boolean fat;
    private boolean eatCake;

    public Popovich(int weight, boolean fat) {
        this.weight = weight;
        this.fat = fat;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isFat() {
        return fat;
    }

    public void setFat(boolean fat) {
        this.fat = fat;
    }

    public boolean isEatCake() {
        return eatCake;
    }

    public void setEatCake(boolean eatCake) {
        this.eatCake = eatCake;
    }
}
