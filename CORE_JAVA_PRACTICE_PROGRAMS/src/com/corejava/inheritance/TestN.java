package com.corejava.inheritance;

public class TestN extends TestM {

    static
    {
        System.out.println('D');
    }

    {
        System.out.println('E');
    }

    public TestN()
    {
        System.out.println('F');
    }
}
