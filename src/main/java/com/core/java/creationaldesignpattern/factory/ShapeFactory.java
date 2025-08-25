package com.core.java.creationaldesignpattern.factory;

public class ShapeFactory {
    public Shape getShapeInstance(String value){
        if(value.equals("Circle")){
            return new Circle();
        } else if (value.equals("Square")) {
            return new Square();
        } else if (value.equals("Rectangle")) {
            return new Rectangle();
        }else {
            return null;
        }


    }
}
