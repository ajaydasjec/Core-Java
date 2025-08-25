package com.core.java.creationaldesignpattern.prototype;
/*
* First we define our Sheep interface which define a prototype of our sheep objects
* This interface declares a clone method to create  copies of sheep*/
public interface Sheep {
    Sheep clone();
    String getName();
    void setName(String name);
}
