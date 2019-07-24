package com.threads;

public class ThreadN implements Runnable {

    private OtherObjectLevelSynchronization ools;
    private Employee e;

    public ThreadN(OtherObjectLevelSynchronization ools, Employee e) {
        this.ools = ools;
        this.e = e;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            ools.test2(e);
        }
    }

}
