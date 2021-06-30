package com.company.business.banking;

public class PaymentDetails {

    private String paymentAddress;
    private String paymentType;
    private String paymentInfo;
    private String paymentStatus;

    public PaymentDetails() {
    }

    public PaymentDetails(String paymentAddress, String paymentType, String paymentInfo) {
        this.paymentAddress = paymentAddress;
        this.paymentType = paymentType;
        this.paymentInfo = paymentInfo;
    }

    public boolean savePaymentDetails(PaymentDetails details){
        return true;
    }

    public boolean updatePaymentStatus(PaymentDetails details,String status){
        details.setPaymentStatus(status);
        return true;
    }

    public String getPaymentAddress() {
        return paymentAddress;
    }

    public void setPaymentAddress(String paymentAddress) {
        this.paymentAddress = paymentAddress;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
