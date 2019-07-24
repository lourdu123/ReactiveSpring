package com.threads;

public class TestOtherObjectLevelSynchronization {

    public static void main(String[] args) {

        OtherObjectLevelSynchronization ools1 = new OtherObjectLevelSynchronization();
        OtherObjectLevelSynchronization ools2 = new OtherObjectLevelSynchronization();
        Employee e1 = new Employee();
        e1.setId(101);
        e1.setName("Lourdu");

        // Employee e2 = new Employee();
        // e2.setId(102);
        // e2.setName("Reddy");

        ThreadM tx = new ThreadM(ools1, e1);  // we are passing same "e1" to "t1"
                                             // and "t2" threads.
                                             // so if one thread acquires lock
                                             // of
                                             // "e1" then other has to wait
        Thread t1 = new Thread(tx);
        t1.start();

        ThreadN ty = new ThreadN(ools2, e1);  // if we pass "e2" here then there
                                             // wont be any lock concepts since
                                             // e1 and e2 are different..
        Thread t2 = new Thread(ty);
        t2.start();

    }

}
