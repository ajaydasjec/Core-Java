package com.core.java.behaviouraldesgnpattern.templatemethod;

public class PayToFriend extends Paymentflow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic pay to friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fees charged of pay to friend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic of pay to friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit amount logic of pay to friend");
    }
}
