package com.core.java.behaviouraldesgnpattern.templatemethod;

public class PayToMerchant extends Paymentflow{
    @Override
    public void validateRequest() {
        System.out.println("Validate request of pay to Merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% fees charged of pay to Merchant");

    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amount logic of pay to merchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit amount of pay to merchant");
    }
}
