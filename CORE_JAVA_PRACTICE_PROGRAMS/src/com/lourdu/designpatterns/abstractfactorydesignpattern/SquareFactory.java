package com.lourdu.designpatterns.abstractfactorydesignpattern;

public class SquareFactory implements ShapeFactoryOfFactories {

    @Override
    public Shape createShapeFactory() {
        return new Square();
    }

}
