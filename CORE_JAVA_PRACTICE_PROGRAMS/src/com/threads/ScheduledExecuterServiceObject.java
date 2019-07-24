package com.threads;

public class ScheduledExecuterServiceObject implements Runnable {

    private int id;

    public ScheduledExecuterServiceObject(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        System.out.println("this is thread:" + id);
    }

}
