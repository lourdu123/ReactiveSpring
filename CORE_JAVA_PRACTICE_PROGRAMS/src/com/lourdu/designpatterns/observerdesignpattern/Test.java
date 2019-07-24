package com.lourdu.designpatterns.observerdesignpattern;

public class Test {

    public static void main(String[] args) {

        Subject subject = new Product("Pepe Jeans", 700);

        Observer observer1 = new Bidder("Lourdu");
        Observer observer2 = new Bidder("Sagar");
        Observer observer3 = new Bidder("Hemanth");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        subject.setBidAmountForProduct(observer2, 800);
        subject.setBidAmountForProduct(observer2, 600);

        subject.removeObserver(observer3);
        subject.setBidAmountForProduct(observer2, 900);
    }

}
