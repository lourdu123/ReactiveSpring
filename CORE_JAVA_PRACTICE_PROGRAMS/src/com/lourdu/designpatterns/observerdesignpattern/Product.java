package com.lourdu.designpatterns.observerdesignpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Product implements Subject {

    private String name;
    private int amount;
    private Observer observer;
    List<Observer> observers = new ArrayList<>();

    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    private void notifyObservers() {
        for (Iterator iterator = observers.iterator(); iterator.hasNext();) {
            Observer observer = (Observer) iterator.next();
            observer.listner(observer, name, amount);

        }

    }

    @Override
    public void setBidAmountForProduct(Observer observer, Integer amount) {

        if (this.amount < amount) {
            this.observer = observer;
            this.amount = amount;
            notifyObservers();
        }
        else {
            System.out.println("bidding amount should not be lesser than the current bid value.");
        }

    }

}
