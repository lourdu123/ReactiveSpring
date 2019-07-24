package com.threads;

public class JoinVenueFixingThread implements Runnable {

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("we are fixing venue. wait some time........");
    }

}
