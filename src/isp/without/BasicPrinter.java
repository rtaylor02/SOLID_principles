package isp.without;

public class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Basic printer is printing");
    }

    @Override
    public void sendFax() {
        throw new UnsupportedOperationException();
    }
}
