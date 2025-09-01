package com.core.java.behaviouraldesgnpattern.observerpattern;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyChanges();
}
