package com.core.java.behaviouraldesgnpattern.templatemethod;

public class TemplateMethodClient {
    public static void main(String[] args) {
        Paymentflow friend = new PayToFriend();
        Paymentflow merchant = new PayToMerchant();
        friend.sendMoney();
        System.out.println("------");
        merchant.sendMoney();
    }
}
