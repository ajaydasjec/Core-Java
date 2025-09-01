package com.core.java.behaviouraldesgnpattern.templatemethod;

public abstract class Paymentflow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();
    public final void sendMoney(){
        calculateFees();
        creditAmount();
        validateRequest();
        debitAmount();

    }
}
