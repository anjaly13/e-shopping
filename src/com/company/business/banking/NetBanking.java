package com.company.business.banking;

public class NetBanking extends PaymentDetails implements Payment{

    private String bankName;

    @Override
    public boolean savePaymentDetails(PaymentDetails details) {
        System.out.println("Card payment details saving");
        return true;
    }

    @Override
    public int makePayment() {
        System.out.println("net banking gateway connect");
        return 0;
    }

    @Override
    public PaymentDetails getPaymentDetails(PaymentDetails details) {
        return null;
    }
}
