package com.threads.ReentrantReadWriteLock;

public class WriterThread implements Runnable {

    private ReentrantRWDemo rrwd;

    public WriterThread(ReentrantRWDemo rrwd) {
        this.rrwd = rrwd;
    }

    @Override
    public void run() {
        rrwd.put("9", "Hari");
    }

}
