package com.corejava;

public interface Interface1 {

    public void m1();

    default void test(String str) {
        System.out.println(str);
    }

    default void test1() {
        System.out.println("test1...");
    }
}
