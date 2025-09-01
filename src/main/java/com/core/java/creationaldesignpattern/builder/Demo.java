package com.core.java.creationaldesignpattern.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
    }
}
