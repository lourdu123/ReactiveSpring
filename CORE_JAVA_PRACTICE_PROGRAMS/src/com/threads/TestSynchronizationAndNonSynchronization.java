package com.threads;

public class TestSynchronizationAndNonSynchronization {

    public static void main(String[] args) {

        System.out.println("inside main() thread..");
        SynchronizedAndNonSynchronizedMethods sansm = new SynchronizedAndNonSynchronizedMethods();
        ThreadA ta = new ThreadA(sansm);
        Thread t1 = new Thread(ta);
        t1.start();

        ThreadB tb = new ThreadB(sansm);
        Thread t2 = new Thread(tb);
        t2.start();
    }
}
