package com.threads;

public class ThreadM implements Runnable {

    private OtherObjectLevelSynchronization ools;
    private Employee e;

    public ThreadM(OtherObjectLevelSynchronization ools, Employee e) {
        this.ools = ools;
        this.e = e;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            ools.test1(e);
        }
    }

}
