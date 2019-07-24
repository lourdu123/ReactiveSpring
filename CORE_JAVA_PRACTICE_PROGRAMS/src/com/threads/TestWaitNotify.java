package com.threads;

public class TestWaitNotify {

    public static void main(String[] args) {

        System.out.println("this is main thread...");
        WaitNotify wn = new WaitNotify();
        Thread t = new Thread(wn);
        t.start();
        synchronized(wn) {

            System.out.println("before calling wait() MEHTOD......");

            try {
                wn.wait();  // this statement releases the lock on the "wn"
                           // object. So some other thread will get the access
                           // to the object(wn) and once it is done it notifies
                           // one/all. So other threads which are waiting for
                           // this object will get the access later
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("afer calling wait method()...");

        }
    }
}
