package com.core.java.structural.designpattern.proxy;

public class AdaptorDesignPattern {
    public static void main(String[] args) {
        PaymentGateway payPalGateWay = new PayPalAdapter(new PayPal());
        PaymentGateway stripeGateWay = new StripeAdapter(new StripePaymentGateway());
        double amount = 100.0;

        // Process payments using different payment gateways
        payPalGateWay.processPayment(amount);
        stripeGateWay.processPayment(amount);
    }
}
