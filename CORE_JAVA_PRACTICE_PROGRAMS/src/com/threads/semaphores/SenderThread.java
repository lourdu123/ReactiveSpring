package com.threads.semaphores;

import java.util.concurrent.Semaphore;

public class SenderThread implements Runnable {

    private Semaphore semaphore;

    public SenderThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("inside SenderThread semaphore..:" + i);
        }

        try {
            this.semaphore.acquire();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
