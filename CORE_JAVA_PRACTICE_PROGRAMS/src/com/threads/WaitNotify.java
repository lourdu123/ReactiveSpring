package com.threads;

public class WaitNotify implements Runnable {

    @Override
    public void run() {

        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                System.out.println("this is wait-notify class method...");
            }

            this.notify();
        }
    }

}
