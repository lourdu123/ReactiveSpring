package com.threads;

public class InteruptSleepingOrWaitingThread implements Runnable {

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("This is InteruptSleepingOrWaitingThread:" + i);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e) {
            // e.printStackTrace();
            System.out.println("InteruptSleepingOrWaitingThread got interrupted...");
        }

    }

}
