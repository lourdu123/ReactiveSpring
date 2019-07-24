package com.threads;

public class Thread2 implements Runnable {

    private SynchronizedMethods sm;

    public Thread2(SynchronizedMethods sm) {
        this.sm = sm;
    }

    @Override
    public void run() {
        System.out.println("Inside Thread2 run() method");
        sm.m2("Ajay");
    }

}
