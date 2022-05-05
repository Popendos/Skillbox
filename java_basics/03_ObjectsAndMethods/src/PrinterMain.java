public class PrinterMain {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.append("poplol");
        printer.append("lolpop", "lolpop");
        printer.append("pop", "pop", 2);
        printer.append("pope", "pope", 4);
        System.out.println(printer.getPendingPagesCount());
        printer.print();
        System.out.println(printer.getPendingPagesCount());
        System.out.println(printer.getPendingPagesCountAllTime());
    }
}
