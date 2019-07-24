package com.lourdu.designpatterns.templatemethoddesignpattern;

public class NonVezPizza extends PizzaMaker {

    @Override
    public void addToppings() {
        System.out.println("Adding non-vez toppings");

    }

    @Override
    public void prepareIngredients() {
        System.out.println("Adding non-vez ingredients");

    }

}
