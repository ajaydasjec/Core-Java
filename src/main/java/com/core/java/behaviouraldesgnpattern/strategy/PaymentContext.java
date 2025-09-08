package com.core.java.behaviouraldesgnpattern.strategy;

public class PaymentContext {
    private final PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(double amount){
        paymentStrategy.pay(amount);
    }
}
