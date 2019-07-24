package com.threads;

public class TestProducerConsumer {

    public static void main(String[] args) {

        ProducerConsumer pc = new ProducerConsumer();
        ProducerThread pt = new ProducerThread(pc);
        Thread t1 = new Thread(pt);
        t1.start();

        ConsumerThread ct = new ConsumerThread(pc);
        Thread t2 = new Thread(ct);
        t2.start();

    }

}
