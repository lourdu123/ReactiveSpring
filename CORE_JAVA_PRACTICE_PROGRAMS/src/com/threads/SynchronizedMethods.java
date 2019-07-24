package com.threads;

import java.util.Date;

public class SynchronizedMethods {

    public synchronized void m1(String name) {

        for (int i = 0; i < 5; i++) {
            System.out.println("this is m1():" + new Date() + ":, name:" + name);
        }

    }

    public synchronized void m2(String name) {

        for (int i = 0; i < 5; i++) {
            System.out.println("this is m2():" + new Date() + ":, name:" + name);
        }
    }
}
