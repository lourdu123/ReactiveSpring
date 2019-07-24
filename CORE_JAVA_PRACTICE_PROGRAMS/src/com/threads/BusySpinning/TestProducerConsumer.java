package com.threads.BusySpinning;

public class TestProducerConsumer {

    public static void main(String[] args) {

        ProducerThread pt = new ProducerThread();
        Thread t1 = new Thread(pt);
        t1.start();

        ConsumerThread ct = new ConsumerThread(pt);
        Thread t2 = new Thread(ct);
        t2.start();

    }

}
