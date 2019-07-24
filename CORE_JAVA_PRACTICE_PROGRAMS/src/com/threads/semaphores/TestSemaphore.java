package com.threads.semaphores;

import java.util.concurrent.Semaphore;

public class TestSemaphore {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1);

        SenderThread sender = new SenderThread(semaphore);
        RecieverThread reciever = new RecieverThread(semaphore);

        Thread t1 = new Thread(sender);
        Thread t2 = new Thread(reciever);

        t1.start();
        t2.start();
    }
}
