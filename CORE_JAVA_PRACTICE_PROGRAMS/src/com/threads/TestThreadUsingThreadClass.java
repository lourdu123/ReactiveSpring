package com.threads;

public class TestThreadUsingThreadClass {

    public static void main(String[] args) {

        ThreadUsingThreadClass1 tutc1 = new ThreadUsingThreadClass1();
        tutc1.setName("A");
        tutc1.setPriority(1);
        tutc1.start();

        ThreadUsingThreadClass2 tutc2 = new ThreadUsingThreadClass2();
        tutc2.setName("B");
        tutc2.setPriority(10);   // since we have given high priority to
                               // this thread, this will be executed first. This
                               // scenario is valid only if CPU is too busy.
                               // otherwise its upto CPU to run which ever the
                               // thread.
        tutc2.start();

        try {
            Thread.currentThread().sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is main method Thread with default priority as 5.");

        // Every thread has a priority. When there is competition for processing
        // resources,
        // threads with higher priority are generally executed in preference to
        // threads with lower priority.
        // Such preference is not, however, a guarantee that the highest
        // priority thread will always be running,
        // and thread priorities cannot be used to reliably implement mutual
        // exclusion

        // Thread priority is only a hint to OS task scheduler. Task scheduler
        // will only try to allocate more resources to a thread with higher
        // priority, however there are no explicit guarantees.

        // But in the case of t.run(), no new Thread will be created and run()
        // method will be executed
        // just like a normal method by the main Thread.

        // tutc1.run();
        // tutc2.run();
    }
}
