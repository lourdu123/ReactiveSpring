package com.threads;

public class ConsumerThread implements Runnable {

    private ProducerConsumer pc;

    public ConsumerThread(ProducerConsumer pc) {
        this.pc = pc;
    }

    @Override
    public void run() {

        System.out.println("inside consumer");
        pc.consume();

    }

}
