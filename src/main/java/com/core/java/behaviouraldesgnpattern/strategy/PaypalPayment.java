package com.core.java.behaviouraldesgnpattern.strategy;

public class PaypalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Payment completed by paypal : "+amount);
    }
}
