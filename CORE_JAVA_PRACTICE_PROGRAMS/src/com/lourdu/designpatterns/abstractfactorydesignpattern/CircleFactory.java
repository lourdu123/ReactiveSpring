package com.lourdu.designpatterns.abstractfactorydesignpattern;

public class CircleFactory implements ShapeFactoryOfFactories {

    @Override
    public Shape createShapeFactory() {
        return new Circle();
    }

}
