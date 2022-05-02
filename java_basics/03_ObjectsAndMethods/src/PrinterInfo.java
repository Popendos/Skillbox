public class PrinterInfo {
    public static void main(String[] args) {

        Printer append = new Printer();
        append.append3("lol", "poplol", 4);
        append.append3("lll", ";;;", 7);
        append.append1("плп");
        append.append2("[p[", "asf");

        System.out.println(append.print());
        System.out.println("Всего страниц: " + append.getPendingPagesCount());
        System.out.println("Всего документов на печать: " + append.getStringQueue());
        append.clear();
        System.out.println(append.getPendingPagesCount());
        System.out.println("Принтер распечатал за все время: " + append.AllStringQueue);

    }
}