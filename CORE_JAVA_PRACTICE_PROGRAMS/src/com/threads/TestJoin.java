package com.threads;

public class TestJoin {

    public static void main(String[] args) throws InterruptedException {

        JoinCardsPrintingThread jt = new JoinCardsPrintingThread();
        Thread t = new Thread(jt);
        t.start();
        t.join(); // Once t thread is done then only the thread
        // in which you invoking t.join() will be executed...(in this case main
        // thread..)

        System.out.println("Cards distribution phase. I am waiting for other threads to complete..");
    }
}
