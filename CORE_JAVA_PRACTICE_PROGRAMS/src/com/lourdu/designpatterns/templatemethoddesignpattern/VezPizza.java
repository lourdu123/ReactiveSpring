package com.lourdu.designpatterns.templatemethoddesignpattern;

public class VezPizza extends PizzaMaker {

    @Override
    public void addToppings() {
        System.out.println("Adding vez toppings");

    }

    @Override
    public void prepareIngredients() {
        System.out.println("Adding vez ingredients");

    }

}
