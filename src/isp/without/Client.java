package isp.without;

public class Client {
    public static void main(String[] args) {
        Printer printer = new AdvancedPrinter();
        printer.print();
        printer.sendFax();

        printer = new BasicPrinter();
        printer.print();
        // printer.sendFax(); // Issue: throws an exception
    }
}

