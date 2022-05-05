public class Printer {

    private String queue = "";
    private int pendingPagesCount = 0;
    private int pendingPagesCountAllTime = 0;


    public void append(String text) {
        queue =queue + "\n" + " " + text;
    }

    public void append(String text, String name){append(text);
        queue = queue + "\n" + " " + name;
    }

    public void append(String text, String name, int count) {append(text, name);

        pendingPagesCount = pendingPagesCount + count;
        pendingPagesCountAllTime = pendingPagesCountAllTime + count;
    }

    public int getPendingPagesCount () {
        return pendingPagesCount;
    }

    public int getPendingPagesCountAllTime () {
        return pendingPagesCountAllTime;
    }

    public void clear() {
        queue = "";
        pendingPagesCount = 0;
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("Очередь печати пуста");
        } else {
            System.out.println(queue);
        }
        queue = "";
        pendingPagesCount = 0;
    }
}
