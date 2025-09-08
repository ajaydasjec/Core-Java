package com.core.java.behaviouraldesgnpattern.strategy;

public class CreditcardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Payment completed by credit card: "+amount);
    }
}
