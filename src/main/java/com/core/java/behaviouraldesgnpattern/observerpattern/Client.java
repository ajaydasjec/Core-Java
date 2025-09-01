package com.core.java.behaviouraldesgnpattern.observerpattern;

public class Client {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        Observer aman = new Subscriber();
        channel.subscribe(aman);
        channel.notifyChanges();
    }
}
