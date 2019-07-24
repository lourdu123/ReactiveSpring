package com.corejava.immutabletest;

import java.util.Date;

public class TestImmutable {

    public static void main(String[] args) {

        int id = 10;

        String name = "LOURDU";

        Date date = new Date();
        System.out.println("first date:" + date);

        ImmutableClass immutableClass = new ImmutableClass(id, name, date);

        System.out.println("first object date: " + immutableClass.getMyDate());

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        date = new Date();
        System.out.println("last date:" + date);

        System.out.println("last object date: " + immutableClass.getMyDate());

    }
}
