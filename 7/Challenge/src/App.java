public class App {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(
                "Pages printed was " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(1);
        System.out.println(
                "Pages printed was " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
    }
}