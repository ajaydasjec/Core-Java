package com.core.java.behaviouraldesgnpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
   List<Observer> subscriber =  new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        subscriber.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.subscriber.remove(observer);
    }

    @Override
    public void notifyChanges() {
        for(Observer observer: subscriber){
            observer.notified();
        }
    }
}
