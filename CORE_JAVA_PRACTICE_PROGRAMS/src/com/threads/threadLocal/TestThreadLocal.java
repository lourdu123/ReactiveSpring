package com.threads.threadLocal;

public class TestThreadLocal {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread t11 = new Thread(t1);

        Thread1 t2 = new Thread1();
        Thread t22 = new Thread(t2);

        t11.start();
        t22.start();
    }
}
