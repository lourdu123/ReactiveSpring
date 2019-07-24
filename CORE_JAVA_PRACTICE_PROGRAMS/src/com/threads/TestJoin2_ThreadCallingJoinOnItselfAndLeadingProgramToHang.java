package com.threads;

public class TestJoin2_ThreadCallingJoinOnItselfAndLeadingProgramToHang {

    public static void main(String[] args) {

        try {
            System.out.println("start .....I called join on myself...");
            Thread.currentThread().join();
            System.out.println("end.....I called join on myself.....");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
