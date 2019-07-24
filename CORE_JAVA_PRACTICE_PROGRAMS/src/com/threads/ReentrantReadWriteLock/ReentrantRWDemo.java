package com.threads.ReentrantReadWriteLock;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantRWDemo {

    Map<String, String> mapInfo = new TreeMap<>();

    ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();

    public void put(String key, String value) {

        System.out.println("write thread data:::" + key);
        try {
            rrwl.writeLock().lock();

            Thread.sleep(1000);

            mapInfo.put(key, value);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            rrwl.writeLock().unlock();
        }

    }

    public String get(String key) {

        System.out.println("read thread data:::" + key);
        try {
            rrwl.readLock().lock();
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            rrwl.readLock().unlock();
        }
        return mapInfo.get(key);

    }

    public static void main(String[] args) {

        ReentrantRWDemo rrwd = new ReentrantRWDemo();

        rrwd.put("5", "lourdu");
        rrwd.put("6", "reddy");
        rrwd.put("7", "ponnapati");

        Thread t1 = new Thread(new ReadThread(rrwd));  // t1 and t2 will be
        Thread t2 = new Thread(new ReadThread(rrwd)); // executed at the same
                                                      // time..

        Thread t3 = new Thread(new WriterThread(rrwd));

        t1.start();
        t2.start();
        t3.start();

    }
}
