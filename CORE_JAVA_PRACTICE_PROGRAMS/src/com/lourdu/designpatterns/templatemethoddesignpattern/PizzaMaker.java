package com.lourdu.designpatterns.templatemethoddesignpattern;

public abstract class PizzaMaker {

    public final void makePizza() {

        prepareDough();
        preBakeCrust();
        prepareIngredients();
        addToppings();
        bakePizza();
        if (customerWantsPackedPizza()) {
            packPizza();
        }
    }

    private void prepareDough() {
        System.out.println("preparing dough");
    }

    private void preBakeCrust() {
        System.out.println("prebakecrust...");

    }

    public abstract void addToppings();

    public abstract void prepareIngredients();

    private void bakePizza() {
        System.out.println("baking pizza..");

    }

    public boolean customerWantsPackedPizza() {
        return true;
    }

    private void packPizza() {
        System.out.println("packing pizza..");

    }

}
