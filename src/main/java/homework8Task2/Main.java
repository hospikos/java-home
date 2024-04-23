package homework8Task2;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial pages printed: " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(10);
        System.out.println("Pages printed: " + pagesPrinted);
        System.out.println("Total pages printed: " + printer.getPagesPrinted());

        int tonerLevel = printer.addToner(30);
        System.out.println("Toner level after adding: " + tonerLevel);

        pagesPrinted = printer.printPages(10);
        System.out.println("Pages printed: " + pagesPrinted);
        System.out.println("Total pages printed: " + printer.getPagesPrinted());

    }
}
