public class Country {


    private String name;
    private int count;
    private int square;
    private String capital;
    private boolean sea;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isSea() {
        return sea;
    }

    public void setSea(boolean sea) {
        this.sea = sea;
    }
}
