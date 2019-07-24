package com.threads;

public class OtherObjectLevelSynchronization {

    public void test1(Employee e) {
        synchronized(e) {
            for (int i = 0; i < 10; i++) {
                System.out.println("this is test1() method:" + e.getName());
            }

        }

    }

    public synchronized void test2(Employee e) {
        synchronized(e) {
            for (int i = 0; i < 10; i++) {
                System.out.println("this is test2() method:" + e.getName());
            }

        }

    }
}
