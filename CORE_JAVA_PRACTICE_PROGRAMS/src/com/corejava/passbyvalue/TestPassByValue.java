package com.corejava.passbyvalue;

public class TestPassByValue {

    public static void main(String[] args) {

        TestPassByValueModel testPassByValueModel = new TestPassByValueModel();
        Fruit f = new Fruit();
        f.setName("Apple");
        testPassByValueModel.m1(f);

        System.out.println(f.toString());
    }
}
