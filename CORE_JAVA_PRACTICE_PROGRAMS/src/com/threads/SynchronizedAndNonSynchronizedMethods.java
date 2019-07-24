package com.threads;

import java.util.Date;

public class SynchronizedAndNonSynchronizedMethods {

    public synchronized void methd1(int a) {

        for (int i = 0; i < 5; i++) {
            System.out.println("this is methd1():" + new Date() + ":, name:" + a);
        }
    }

    public void methd2(int a) {

        for (int i = 0; i < 5; i++) {
            System.out.println("this is methd2():" + new Date() + ":, name:" + a);
        }
    }
}
