package isp.with;

public class AdvancedPrinter implements FaxMachine, Printer {
    @Override
    public void sendFax() {
        System.out.println("Advanced printer is sending a fax");
    }

    @Override
    public void print() {
        System.out.println("Advanced printer is printing");
    }
}
