package com.corejava;

public class TestSuperClassMethodFromChildClassUsingSuper extends SuperClass1 {

    @Override
    public void m1() {
        System.out.println("inside child class m1() method");
        super.m1();
    }

    public static void main(String[] args) {
        TestSuperClassMethodFromChildClassUsingSuper tscmfcus = new TestSuperClassMethodFromChildClassUsingSuper();
        tscmfcus.m1();
    }
}
