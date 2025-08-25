package com.core.java.creationaldesignpattern.factory;

public class FactoryClient {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circleObj = shapeFactory.getShapeInstance("Circle");
        Shape squareObj = shapeFactory.getShapeInstance("Square");
        Shape rectangleObj = shapeFactory.getShapeInstance("Rectangle");
        circleObj.computeArea();
        squareObj.computeArea();
        rectangleObj.computeArea();
    }
}
