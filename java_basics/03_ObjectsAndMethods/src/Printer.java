public class Printer {
    int StringQueue = 0;
    int PendingPagesCount = 0;
    String Items = "";
    int AllStringQueue = 0;

    public int getPendingPagesCount() {
        return PendingPagesCount;
    }

    public int getStringQueue() {
        return StringQueue;
    }

    public String print() {
        return Items;

    }


    public void append1(String text) {
        StringQueue = StringQueue + 1;
        Items = Items + "\n" + "Текст: " + text;
        AllStringQueue = AllStringQueue + 1;


    }

    public void append2(String text, String name) {
        StringQueue = StringQueue + 1;
        Items = Items + "\n" + "Текст: " + text + "; Имя: " + name;
        AllStringQueue = AllStringQueue + 1;


    }

    public void append3(String text, String name, int pages) {
        Items = Items + "\n" + "Текст: " + text + "; Имя: " + name + "; Количетсво страниц: " + pages;
        StringQueue = StringQueue + 1;
        PendingPagesCount = PendingPagesCount + pages;
        AllStringQueue = AllStringQueue + 1;


    }


    void clear() {
        StringQueue = 0;
        PendingPagesCount = 0;
    }

}