package com.threads;

public class ThreadA implements Runnable {

    private SynchronizedAndNonSynchronizedMethods sansm;

    public ThreadA(SynchronizedAndNonSynchronizedMethods sm) {
        this.sansm = sm;
    }

    @Override
    public void run() {
        System.out.println("Inside ThreadA run() method");
        sansm.methd1(1);
    }
}
