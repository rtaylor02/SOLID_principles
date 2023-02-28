package lsp.with;

public class GuestUserPayment implements NewPayment {
    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }

    @Override
    public void newPayment() {
        System.out.printf("Processing %s's current payment request%n", name);
    }
}
