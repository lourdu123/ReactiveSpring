package com.corejava.inheritance;

public class InstanceVariableOfSuperCassIsNotOverriddenInSubClassMethod {

    public static void main(String[] args)
    {
        TestA a = new TestB();
        System.out.println(a.i);  // behaves like static member of class
        System.out.println(a.j);
        a.test1();
        a.test2();

        TestB b = new TestB();
        System.out.println(b.i);
        System.out.println(b.j);
        b.test1();
        b.test2();

        TestA aa = new TestA();
        System.out.println(aa.i);
        System.out.println(aa.j);
        aa.test1();
        aa.test2();
    }
}
