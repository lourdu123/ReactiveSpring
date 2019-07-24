package com.lourdu.designpatterns.factorymethoddesignpatter;

public class Test {

    public static void main(String[] args) {

        ShapeFactory sp = new ShapeFactory();

        try {
            Shape s = sp.getShape("circle");
            s.draw();

            Shape s1 = sp.getShape("square");
            s1.draw();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
