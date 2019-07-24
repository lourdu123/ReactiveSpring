package com.threads;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {

    private int a;

    public CallableThread(int a) {
        this.a = a;
    }

    @Override
    public String call() throws Exception {

        for (int i = 0; i < 10; i++) {
            System.out.println("inside call() method of CallableThread");
        }
        return "I AM DONE " + a;
    }

}
