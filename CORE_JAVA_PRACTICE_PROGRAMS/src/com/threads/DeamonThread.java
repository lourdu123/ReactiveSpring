package com.threads;

public class DeamonThread implements Runnable {

    @Override
    public void run() {

        try {
            Thread.sleep(60000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inside thread....");
    }

}
