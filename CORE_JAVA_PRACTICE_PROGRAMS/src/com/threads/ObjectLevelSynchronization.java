package com.threads;

public class ObjectLevelSynchronization {

    public void test1() {
        synchronized(this) {
            System.out.println("this is test1() method");
        }

    }

    public synchronized void test2() {
        synchronized(this) {
            System.out.println("this is test2() method");
        }

    }

}
