package com.threads;

public class TestYield {

    public static void main(String[] args) {

        // "main thread" is important thread, so "YieldUnImportantThread"
        // gives chance to main thread to execute.
        YieldUnImportantThread yt = new YieldUnImportantThread();
        Thread t = new Thread(yt);
        // t.setPriority(5); // even if dont set also, it will inherit parent
        // thread(main) priority i.e 5
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Inside parent..");
        }
    }
}
