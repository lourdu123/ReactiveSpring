package com.threads.BusySpinning;

import java.util.Stack;

public class ProducerThread implements Runnable {

    Stack stack = new Stack<>();

    public boolean productionInProcess = true;

    @Override
    public void run() {

        System.out.println("inside producer");
        for (int i = 0; i < 7; i++) {
            stack.push(i);
            System.out.println("statck size after pushing:" + stack.size());
        }

        productionInProcess = false;

    }

}
