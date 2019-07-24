package com.threads;

public class TestDeamonThread {

    public static void main(String[] args) {

        DeamonThread dt = new DeamonThread();
        Thread t = new Thread(dt);
        t.setDaemon(true); // Once you set thread as deamon
                           // then you will not get the output of that thread in
                           // the console.
                           // It will be running behind the scense.
        t.start();

        // try {
        // Thread.sleep(60000);
        // }
        // catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        System.out.println("Inside parent......");
    }
}
