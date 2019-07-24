package com.threads.ReentrantReadWriteLock;

import java.util.Date;

public class ReadThread implements Runnable {

    private ReentrantRWDemo rrwd;

    public ReadThread(ReentrantRWDemo rrwd) {
        this.rrwd = rrwd;
    }

    @Override
    public void run() {

        System.out.println("value is.." + rrwd.get("5") + "  , time:" + new Date());
    }

}
