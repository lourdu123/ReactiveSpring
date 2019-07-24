package com.threads;

import java.util.Date;

public class ThreadUsingRunnableInterface1 implements Runnable {

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am inside run method of ThreadUsingRunnableInterface1 class:" + new Date());
    }

}
