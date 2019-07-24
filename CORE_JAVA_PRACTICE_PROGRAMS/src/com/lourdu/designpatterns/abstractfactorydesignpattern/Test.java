package com.lourdu.designpatterns.abstractfactorydesignpattern;

public class Test {

    public static void main(String[] args) {
        FinalFactory ff = new FinalFactory();
        ff.getFactory(new SquareFactory());
        ff.getFactory(new CircleFactory());
    }

}
