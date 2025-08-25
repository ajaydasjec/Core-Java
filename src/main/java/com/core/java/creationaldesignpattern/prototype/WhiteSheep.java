package com.core.java.creationaldesignpattern.prototype;

public class WhiteSheep implements Sheep{
    String name;
    public WhiteSheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        return new WhiteSheep(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name= name;
    }
}
