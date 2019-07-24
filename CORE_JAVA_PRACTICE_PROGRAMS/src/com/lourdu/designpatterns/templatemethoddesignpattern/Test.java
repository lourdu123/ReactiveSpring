package com.lourdu.designpatterns.templatemethoddesignpattern;

public class Test {

    public static void main(String[] args) {
        PizzaMaker pm = new VezPizza();
        pm.makePizza();
        System.out.println("**********");
        PizzaMaker pm1 = new NonVezPizza();
        pm1.makePizza();
        System.out.println("**********");
        PizzaMaker pm2 = new InHousePizzaMaking();
        pm2.makePizza();
    }

}
