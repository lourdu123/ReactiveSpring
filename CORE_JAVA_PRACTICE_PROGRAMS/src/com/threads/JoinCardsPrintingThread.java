package com.threads;

public class JoinCardsPrintingThread implements Runnable {

    @Override
    public void run() {

        JoinVenueFixingThread jvft = new JoinVenueFixingThread();
        Thread t = new Thread(jvft);
        t.start();
        try {
            t.join();  // Once t thread is done then only the thread
                      // in which you invoking t.join() will be executed...(in
                      // this case "JoinCardsPrintingThread" thread..)
            Thread.sleep(2000);
            System.out.println("we are printing cards. Please wait for some time.....");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
