package com.threads;

public class TestDeadLock {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(101);
        e1.setName("lurdu");

        Employee e2 = new Employee();
        e2.setId(102);
        e2.setName("reddy");

        DeadLockThread1 dlt1 = new DeadLockThread1(e1, e2);
        Thread t1 = new Thread(dlt1);
        t1.start();

        DeadLockThread2 dlt2 = new DeadLockThread2(e1, e2);
        Thread t2 = new Thread(dlt2);
        t2.start();

    }
}
