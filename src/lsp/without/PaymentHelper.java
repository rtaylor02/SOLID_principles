package lsp.without;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {
    List<Payment> paymentList = new ArrayList<>();

    public void addUser(Payment user) {
        paymentList.add(user);
    }

    public void showPreviousPayments() {
        for(Payment p : paymentList) {
            p.previousPaymentInfo();
            System.out.println("------------------");
        }
    }

    public void processNewPayments() {
        for(Payment p : paymentList) {
            p.newPayment();
            System.out.println("------------------");
        }
    }
}
