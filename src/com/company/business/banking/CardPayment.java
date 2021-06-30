package com.company.business.banking;

public class CardPayment extends PaymentDetails implements Payment{

    private String cardNumber;
    private String bankName;

    public CardPayment (){}

    public CardPayment (String cardNumber,String bankName){
        this.cardNumber = cardNumber;
        this.bankName = bankName;
    }

    @Override
    public boolean savePaymentDetails(PaymentDetails details) {
        System.out.println("Card payment details saving");
        return true;
    }

    @Override
    public int makePayment() {
        System.out.println("card payment gateway connect");
        return (int) Math.random();
    }

    @Override
    public PaymentDetails getPaymentDetails(PaymentDetails details) {
        return details;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
