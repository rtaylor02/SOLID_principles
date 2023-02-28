package lsp.with;

public class RegisteredUserPayment implements PreviousPayment, NewPayment {
    String name;

    public RegisteredUserPayment(String userName) {
        this.name = userName;
    }

    @Override
    public void newPayment() {
        System.out.printf("Processing %s's current payment request%n", name);
    }

    @Override
    public void previousPaymentInfo() {
        System.out.printf("Retrieving %s's last payment details%n", name);
    }
}
