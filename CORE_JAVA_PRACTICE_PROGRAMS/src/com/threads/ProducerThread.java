package com.threads;

public class ProducerThread implements Runnable {

    private ProducerConsumer pc;

    public ProducerThread(ProducerConsumer pc) {
        this.pc = pc;
    }

    @Override
    public void run() {

        System.out.println("inside producer");
        for (int i = 0; i < 5; i++) {
            pc.produce(i);
        }

    }

}
