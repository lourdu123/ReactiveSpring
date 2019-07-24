package com.threads;

public class ThreadX implements Runnable {

    private ObjectLevelSynchronization ols;

    public ThreadX(ObjectLevelSynchronization ols) {
        this.ols = ols;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            ols.test1();
        }
    }

}
