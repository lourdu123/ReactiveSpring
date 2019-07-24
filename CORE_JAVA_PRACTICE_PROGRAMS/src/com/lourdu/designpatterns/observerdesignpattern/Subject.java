package com.lourdu.designpatterns.observerdesignpattern;

public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void setBidAmountForProduct(Observer observer, Integer amount);
}
