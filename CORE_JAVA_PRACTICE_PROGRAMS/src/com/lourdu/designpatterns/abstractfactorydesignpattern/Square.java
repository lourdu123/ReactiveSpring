package com.lourdu.designpatterns.abstractfactorydesignpattern;

public class Square implements Shape {

    public Square() {
        System.out.println("Square class constructor");
    }

    @Override
    public void draw() {
        System.out.println("Square class draw() method.");
    }

}
