package com.core.java.creationaldesignpattern.prototype;

public class SheepFarmClient {
    public static void main(String[] args) {
        //Create A prototype sheep
        Sheep blackPrototype = new BlackSheep("Baa Baa");
        Sheep whiteprototype = new WhiteSheep("Fleecy");

        //Clone sheep as needed

        Sheep clonedBlackSheep =  blackPrototype.clone();
        clonedBlackSheep.setName("Midnight");
        Sheep clonedWhiteSheep = whiteprototype.clone();
        whiteprototype.setName("Snow");

        System.out.println("Black Sheep "+clonedBlackSheep.getName());
        System.out.println("White Sheep "+clonedWhiteSheep.getName());
    }
}
