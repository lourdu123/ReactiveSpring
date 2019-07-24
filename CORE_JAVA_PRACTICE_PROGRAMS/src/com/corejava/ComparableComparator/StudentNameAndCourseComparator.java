package com.corejava.ComparableComparator;

import java.util.Comparator;

public class StudentNameAndCourseComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int flag = o1.getName().compareTo(o2.getName());

        if (flag == 0) {
            flag = o1.getCourse().compareTo(o2.getCourse());
        }
        return flag;
    }

}
