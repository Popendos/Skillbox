public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("poplol", "lol", 14);
        printer.append("lolpop", "lolpop", 12);
        System.out.println(printer.getPendingPagesCount());
        System.out.println(printer.getPendingPagesCountAllTimes());
        printer.print();
        System.out.println(printer.getPendingPagesCount());
        System.out.println(printer.getPendingPagesCountAllTimes());





    }
}