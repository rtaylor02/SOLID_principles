package isp.without;

public class AdvancedPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Advanced printer is printing");
    }

    @Override
    public void sendFax() {
        System.out.println("Advanced printer is sending a fax");
    }
}
