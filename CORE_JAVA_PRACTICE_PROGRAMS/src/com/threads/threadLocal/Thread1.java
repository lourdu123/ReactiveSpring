package com.threads.threadLocal;

import java.util.UUID;

public class Thread1 implements Runnable {

    private ThreadLocal<String> tl = new ThreadLocal<String>() {

        @Override
        protected String initialValue() {
            return "hello world";
        }
    };

    @Override
    public void run() {

        System.out.println(tl.get());

        tl.set("Lourdu - " + UUID.randomUUID());
        System.out.println(tl.get());
    }

}
