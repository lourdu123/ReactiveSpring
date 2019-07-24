package com.threads;

public class TestThreadUsingRunnableInterface {

    public static void main(String[] args) {

        ThreadUsingRunnableInterface1 turi1 = new ThreadUsingRunnableInterface1();
        Thread t1 = new Thread(turi1);  // here turi1 is a Target Runnable

        // For every Thread the required mandatory activities like registering
        // the Thread with Thread Scheduler
        // will takes care by Thread class start() method and programmer is
        // responsible just to
        // define the job of the Thread inside run() method.
        // That is start() method acts as best assistant to the programmer.

        // Example
        // start()
        // {
        // 1. Register Thread with Thread Scheduler
        // 2. All other mandatory low level activities.
        // 3. Invoke or calling run() method.
        // }

        t1.start(); // calling thread method

        ThreadUsingRunnableInterface2 turi2 = new ThreadUsingRunnableInterface2();
        Thread t2 = new Thread(turi2);  // here turi2 is a Target Runnable
        t2.start(); // calling thread method
    }
}
