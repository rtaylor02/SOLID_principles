package lsp.with;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {
    List<PreviousPayment> previousPayments = new ArrayList<>();
    List<NewPayment> newPayments = new ArrayList<>();

    public void addNewPayment(NewPayment newPaymentRequest) {
        newPayments.add(newPaymentRequest);
    }
    public void addPreviousPayment(PreviousPayment previousPayment) {
        previousPayments.add(previousPayment);
    }

    public void showPreviousPayments() {
        for(PreviousPayment p : previousPayments) {
            p.previousPaymentInfo();
            System.out.println("------------------");
        }
    }

    public void processNewPayments() {
        for(NewPayment p : newPayments) {
            p.newPayment();
            System.out.println("------------------");
        }
    }
}
