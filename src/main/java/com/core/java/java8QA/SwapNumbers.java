package com.core.java.java8QA;

public class SwapNumbers {
    public static void main(String[] args) {
        int a =10;
        int b = 12;
        System.out.println("a is "+ a+" b is "+b);

        a= a+b;
        b= a-b;
        a= a- b;
        System.out.println("a : "+a +" b :"+b);
        a = (a + b) - (b = a);
        System.out.println("a : "+a +" b :"+b);
    }
}
