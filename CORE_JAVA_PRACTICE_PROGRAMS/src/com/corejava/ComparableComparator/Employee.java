package com.corejava.ComparableComparator;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeComparableComparator [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;  // ascending order
        // return o.id - this.id; descending order
    }

}
