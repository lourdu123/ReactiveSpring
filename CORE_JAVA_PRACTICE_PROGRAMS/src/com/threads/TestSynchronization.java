package com.threads;

public class TestSynchronization {

    public static void main(String[] args) {

        System.out.println("inside main() thread..");
        SynchronizedMethods sm = new SynchronizedMethods();
        Thread1 t1 = new Thread1(sm);
        Thread t11 = new Thread(t1);
        t11.start();

        Thread2 t2 = new Thread2(sm);
        Thread t22 = new Thread(t2);
        t22.start();
    }
}
