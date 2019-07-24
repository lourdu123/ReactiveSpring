package com.threads;

public class TestObjectLevelSynchronization {

    public static void main(String[] args) {

        ObjectLevelSynchronization ols = new ObjectLevelSynchronization();
        ThreadX tx = new ThreadX(ols);
        Thread t1 = new Thread(tx);
        t1.start();

        ThreadY ty = new ThreadY(ols);
        Thread t2 = new Thread(ty);
        t2.start();

    }
}
