package com.threads;

public class DeadLockThread1 implements Runnable {

    private Employee e1;
    private Employee e2;

    public DeadLockThread1(Employee e1, Employee e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public void run() {

        synchronized(e1) {
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("DeadLockThread1 synchronized e1");
            synchronized(e2) {
                System.out.println("DeadLockThread1 synchronized e2");
            }

        }
    }

}
