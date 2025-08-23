package com.core.java.structural.designpattern.proxy;

public class StripeAdapter implements PaymentGateway{

    private StripePaymentGateway paymentGateway;

    public StripeAdapter(StripePaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        paymentGateway.charge(amount);
    }
}
