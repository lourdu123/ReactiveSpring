package com.threads;

public class YieldUnImportantThread implements Runnable {

    @Override
    public void run() {

        // 1. yield() method causes
        // "to pause current executing Thread for giving the chance of remaining waiting Threads of same priority".
        // 2. If all waiting Threads have the low priority or if there is no
        // waiting Threads then the same Thread will be continued its execution.
        // 3. If several waiting Threads with same priority available then we
        // can't expect exact which Thread will get chance for execution.
        // 4. The Thread which is yielded when it get chance once again for
        // execution is depends on mercy of the Thread scheduler.
        // 5. public static native void yield();
        // 6. Some operating systems may not provide proper support for yield()
        // method

        for (int i = 0; i < 100; i++) {
            Thread.yield();
            System.out.println("Inside Child..");

        }

    }

}
