package com.threads.BusySpinning;

public class ConsumerThread implements Runnable {

    private ProducerThread pt;

    public ConsumerThread(ProducerThread pt) {
        this.pt = pt;
    }

    @Override
    public void run() {

        while (pt.productionInProcess) {
            System.out.println("consumer is waiting for producer job to be done.");
        }

        for (int i = 0; i < pt.stack.size(); i++) {
            pt.stack.pop();
            System.out.println("stack size after poping elements:" + pt.stack.size());
        }

    }

}
