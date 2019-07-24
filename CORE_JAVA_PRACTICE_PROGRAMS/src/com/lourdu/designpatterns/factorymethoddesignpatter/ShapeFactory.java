package com.lourdu.designpatterns.factorymethoddesignpatter;

public class ShapeFactory {

    public static Shape getShape(String shape) throws Exception {

        switch (shape) {

            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                throw new Exception();
        }

    }

}
