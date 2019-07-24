package com.lourdu.domain;

public class Customer implements WaitingCustomer {

    private String name;
    private String drinkOrdered;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrinkOrdered() {
        return drinkOrdered;
    }

    public void setDrinkOrdered(String drinkOrdered) {
        this.drinkOrdered = drinkOrdered;
    }

    public Customer(String name, String drinkOrdered) {
        super();
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    public void orderReady(String preparedDrink) {
        if (drinkOrdered.equals(preparedDrink)) {
            System.out.println(name + ",your drink " + preparedDrink + " is ready");
        }

    }

}
