package com.corejava;

public interface Interface2 {

    public void m2();

    default void test(String str) {
        System.out.println(str);
    }

    default void test2() {
        System.out.println("test2...");
    }
}
