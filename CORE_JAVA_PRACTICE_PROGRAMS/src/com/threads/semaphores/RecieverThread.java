package com.threads.semaphores;

import java.util.concurrent.Semaphore;

public class RecieverThread implements Runnable {

    private Semaphore semaphore;

    public RecieverThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

       
            this.semaphore.release();

            for (int i = 0; i < 10; i++) {
                System.out.println("inside RecieverThread semaphore..:" + i);
            }
       

    }
}
