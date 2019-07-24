package com.threads;

public class ThreadY implements Runnable {

    private ObjectLevelSynchronization ols;

    public ThreadY(ObjectLevelSynchronization ols) {
        this.ols = ols;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            ols.test2();
        }
    }

}
