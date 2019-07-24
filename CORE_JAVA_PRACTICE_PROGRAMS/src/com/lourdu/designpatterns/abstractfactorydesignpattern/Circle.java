package com.lourdu.designpatterns.abstractfactorydesignpattern;

public class Circle implements Shape {

    public Circle() {
        System.out.println("circle class constructor");
    }

    @Override
    public void draw() {
        System.out.println("Circle class draw() method.");
    }

}
