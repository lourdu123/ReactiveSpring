package com.corejava.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {

        Student s = new Student();
        s.setId(1);
        s.setName("Bijesh");
        s.setCourse("Java");

        Student s1 = new Student();
        s1.setId(5);
        s1.setName("Ajesh");
        s1.setCourse("Jogo");

        Student s2 = new Student();
        s2.setId(5);
        s2.setName("Ajesh");
        s2.setCourse("Bogo");

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s);
        studentList.add(s1);
        studentList.add(s2);

        System.out.println(studentList.toString());

        System.out.println("***************************");

        Collections.sort(studentList, new StudentNameComparator());

        System.out.println(studentList.toString());

        System.out.println("***************************");

        Collections.sort(studentList, new StudentCourseComparator());

        System.out.println(studentList.toString());

        System.out.println("***************************");

        Collections.sort(studentList, new StudentNameAndCourseComparator());

        System.out.println(studentList.toString());

    }

}
