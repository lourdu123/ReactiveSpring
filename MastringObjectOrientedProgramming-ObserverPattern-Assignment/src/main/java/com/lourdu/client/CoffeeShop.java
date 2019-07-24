package com.lourdu.client;

import com.lourdu.domain.CoffeeAttendant;
import com.lourdu.domain.Customer;
import com.lourdu.domain.WaitingCustomer;

public class CoffeeShop {

    public static void main(String[] args) {

        CoffeeAttendant cAttendant = new CoffeeAttendant();

        WaitingCustomer customer1 = new Customer("lourdu", "Apple juice");

        cAttendant.takeOrder(customer1);

        WaitingCustomer customer2 = new Customer("sagar", "banana juice");

        cAttendant.takeOrder(customer2);

        WaitingCustomer customer3 = new Customer("vijay", "cane juice");

        cAttendant.takeOrder(customer3);

    }

}
