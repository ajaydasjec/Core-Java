package com.core.java.structural.designpattern.proxy;

public class StripePaymentGateway {
    public void charge(double amount){
        System.out.println("Charged INR "+ amount + "via using stripe");
    }
}
