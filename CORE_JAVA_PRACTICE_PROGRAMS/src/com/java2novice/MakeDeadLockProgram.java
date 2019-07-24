package com.java2novice;


public class MakeDeadLockProgram {

    private static String str1 = "java";
    private static String str2 = "net";

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

    }

    public static class Thread1 extends Thread {

        public void run() {
            synchronized(str1) {
                System.out.println("thread1 got the lock on str1........");
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(str2) {
                    System.out.println("thread1 got the lock on str2........");
                }
            }
        }
    }

    public static class Thread2 extends Thread {

        public void run() {
            synchronized(str2) {
                System.out.println("thread2 got the lock on str2........");
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(str1) {
                    System.out.println("thread2 got the lock on str1........");
                }
            }
        }
    }

    /*public static class Thread2 extends Thread {

        public void run() {
            synchronized(str1) {
                System.out.println("thread2 got the lock on str1........");
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(str2) {
                    System.out.println("thread2 got the lock on str2........");
                }
            }
        }
    }*/

}
