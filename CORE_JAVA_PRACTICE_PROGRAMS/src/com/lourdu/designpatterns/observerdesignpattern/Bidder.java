package com.lourdu.designpatterns.observerdesignpattern;

public class Bidder implements Observer {

    private String bidderName;

    public Bidder(String bidderName) {
        this.bidderName = bidderName;
    }

    @Override
    public void listner(Observer observer, String productName, int amount) {

        if (observer.toString().equals(bidderName)) {
            System.out.println("you have bid " + productName + " for " + amount);
        }
        else {
            System.out.println(observer.toString() + "has bid " + productName + " for " + amount);
        }

    }

    @Override
    public String toString() {
        return bidderName;
    }

}
