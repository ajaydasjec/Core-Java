package com.core.java.structural.designpattern.proxy;

public class Client {
    public static void main(String[] args) {
        IEmployee emp =new EmployeeProxy();
        emp.create("ADMIN5",33);

    }
}
