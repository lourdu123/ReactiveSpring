package com.threads;

public class TestInterrupt {

    public static void main(String[] args) {

        InteruptSleepingOrWaitingThread isowt = new InteruptSleepingOrWaitingThread();
        Thread t = new Thread(isowt);
        t.start();

        t.interrupt();  // whenever we say t.interrupt(),and if t thread goes
                       // into
                       // sleeping state or wait state then t thread gets
                       // interrupted

        System.out.println("This is parent Interrupt method...");

    }
}
