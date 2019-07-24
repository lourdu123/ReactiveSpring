package com.corejava.ComparableComparator;

import java.util.Arrays;

public class ComparableTest {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setId(4);
        e.setName("Bannu");

        Employee e1 = new Employee();
        e1.setId(4);
        e1.setName("Ajay");

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("Vjay");

        Employee e3 = new Employee();
        e3.setId(5);
        e3.setName("Kjay");

        Employee[] a = new Employee[4];
        a[0] = e;
        a[1] = e1;
        a[2] = e2;
        a[3] = e3;

        Arrays.sort(a);

        for (Employee x: a) {
            System.out.println(x);
        }
    }

}
