package com.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduledExecuterService {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        ScheduledExecuterServiceObject seso = null;

        for (int i = 0; i < 5; i++) {
            seso = new ScheduledExecuterServiceObject(i);
            scheduledExecutorService.scheduleWithFixedDelay(seso, 0, 5, TimeUnit.SECONDS);
        }

    }
}
