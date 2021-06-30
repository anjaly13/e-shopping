package com.company.business.banking;

public interface Payment {

    int makePayment();
    PaymentDetails getPaymentDetails(PaymentDetails details);
}
