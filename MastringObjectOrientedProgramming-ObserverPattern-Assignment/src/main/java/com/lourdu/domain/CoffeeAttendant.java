package com.lourdu.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoffeeAttendant {

    private List<Customer> customersList;
    private String completedDrink;

    public CoffeeAttendant() {
        customersList = new ArrayList<Customer>();
    }

    public void takeOrder(WaitingCustomer customer) {
        customersList.add((Customer) customer);
        prepareDrink(((Customer) customer).getDrinkOrdered());
    }

    private void prepareDrink(String drinkToPrepare) {

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        completedDrink = drinkToPrepare;
        callOutCompletedOrder();

    }

    private void callOutCompletedOrder() {

        for (Iterator iterator = customersList.iterator(); iterator.hasNext();) {
            Customer customer = (Customer) iterator.next();
            customer.orderReady(completedDrink);

        }
    }

}
