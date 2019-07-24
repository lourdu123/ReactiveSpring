package com.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallableThread {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);  // ExecutorService
                                                                           // is
                                                                           // used
                                                                           // when
                                                                           // we
                                                                           // dont
                                                                           // want
                                                                           // to
                                                                           // create
                                                                           // threads
        List<Future<String>> futures = null;

        List<CallableThread> ctl = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CallableThread ct = new CallableThread(i);
            ctl.add(ct);
        }

        try {
            futures = executorService.invokeAll(ctl);
            // Executors.callable(runnableTask) // this line is used to convert
            // Runnable to Callable interface..
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Future f: futures) {

            try {
                if (f.isDone()) {

                    String s = (String) f.get();
                    System.out.println("s value is:" + s);
                }

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            catch (ExecutionException e) {
                e.printStackTrace();
            }

        }

        executorService.shutdown();
        System.out.println("is shutdown:" + executorService.isShutdown());
    }
}
