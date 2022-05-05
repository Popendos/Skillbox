public class Printer {

    private int stringQueue = 0;
    private int getPendingPagesCount = 0;
    private String text = "";
    private String name = "";
    private int pages = 0;
    private int getPendingPagesCountAllTimes = 0;




    public void append(String text) {
        stringQueue = stringQueue + 1;
        this.text = text;

    }

    public void append(String text, String name) {
        stringQueue = stringQueue + 1;
        this.text = text;
        this.name = name;
    }

    public void append(String text, String name, int pages) {
        stringQueue = stringQueue + 1;
        this.text =this.text + text;
        this.name =this.name + name;
        this.pages =this.pages + pages;
        getPendingPagesCount = getPendingPagesCount + pages;
        getPendingPagesCountAllTimes = getPendingPagesCountAllTimes + pages;
    }

    public void clear() {
        stringQueue = 0;
    }

    public  int getPendingPagesCountAllTimes() {
        return getPendingPagesCountAllTimes;
    }

    public int getPendingPagesCount() {
        return getPendingPagesCount;
    }


    public void print() {
        if (stringQueue == 0 ) {
            System.out.println("нет документов на печать");
        } else {
            System.out.println(text + name + pages);
        } stringQueue = 0;
        getPendingPagesCount = 0;

    }

}

