package com.threads;

public class Thread1 implements Runnable {

    private SynchronizedMethods sm;

    public Thread1(SynchronizedMethods sm) {
        this.sm = sm;
    }

    @Override
    public void run() {
        System.out.println("Inside Thread1 run() method");
        sm.m1("Raghu");
    }

}
