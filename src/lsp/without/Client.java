package lsp.without;

public class Client {
    public static void main(String[] args) {
        PaymentHelper paymentHelper = new PaymentHelper();

        RegisteredUserPayment robinPayment = new RegisteredUserPayment("Robin");
        paymentHelper.addUser(robinPayment);
        RegisteredUserPayment jackPayment = new RegisteredUserPayment("Jack");
        paymentHelper.addUser(jackPayment);

        GuestUserPayment guestUser = new GuestUserPayment();
        paymentHelper.addUser(guestUser);

        paymentHelper.showPreviousPayments();
        paymentHelper.processNewPayments();
    }
}
