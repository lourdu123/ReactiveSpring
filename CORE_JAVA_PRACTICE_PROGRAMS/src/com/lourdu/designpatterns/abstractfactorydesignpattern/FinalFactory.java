package com.lourdu.designpatterns.abstractfactorydesignpattern;


public class FinalFactory {

    public static Shape getFactory(ShapeFactoryOfFactories sfof) {
        return sfof.createShapeFactory();

    }

}
