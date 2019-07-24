package com.lourdu.designpatterns.templatemethoddesignpattern;

public class InHousePizzaMaking extends PizzaMaker {

    @Override
    public void addToppings() {
        System.out.println("In-house toppings");

    }

    @Override
    public void prepareIngredients() {
        System.out.println("In-house toppings");

    }

    @Override
    public boolean customerWantsPackedPizza() {
        return false;
    }

}
