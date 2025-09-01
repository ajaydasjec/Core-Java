package com.core.java.behaviouraldesgnpattern.observerpattern;

public class Subscriber implements Observer{

    @Override
    public void notified() {
        System.out.println("New Video uploaded : notification");
    }
}
