package isp.with;

public class Client {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print();
        printer = new AdvancedPrinter();
        printer.print();
        FaxMachine faxMachine = new AdvancedPrinter();
        faxMachine.sendFax();
    }
}
