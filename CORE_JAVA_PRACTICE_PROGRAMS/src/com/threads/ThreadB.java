package com.threads;

public class ThreadB implements Runnable {

    private SynchronizedAndNonSynchronizedMethods sansm;

    public ThreadB(SynchronizedAndNonSynchronizedMethods sm) {
        this.sansm = sm;
    }

    @Override
    public void run() {
        System.out.println("Inside ThreadB run() method");
        sansm.methd2(2);
    }
}
