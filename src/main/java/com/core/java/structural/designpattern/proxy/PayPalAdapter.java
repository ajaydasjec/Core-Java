package com.core.java.structural.designpattern.proxy;

public class PayPalAdapter implements PaymentGateway{
    private PayPal paymentGateWay;

    public PayPalAdapter(PayPal paymentGateWay) {
        this.paymentGateWay = paymentGateWay;
    }

    @Override
    public void processPayment(double amount) {
        paymentGateWay.makePayment(amount);
    }
}
