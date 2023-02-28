package lsp.with;


public class Client {
    public static void main(String[] args) {
        RegisteredUserPayment robinPayment = new RegisteredUserPayment("Robin");
        RegisteredUserPayment jackPayment = new RegisteredUserPayment("Jack");
        GuestUserPayment guestUser = new GuestUserPayment();

        PaymentHelper paymentHelper = new PaymentHelper();
        paymentHelper.addPreviousPayment(robinPayment);
        paymentHelper.addPreviousPayment(jackPayment);
        paymentHelper.addNewPayment(robinPayment);
        paymentHelper.addNewPayment(jackPayment);
        paymentHelper.addNewPayment(guestUser);

        paymentHelper.showPreviousPayments();
        paymentHelper.processNewPayments();
    }
}
