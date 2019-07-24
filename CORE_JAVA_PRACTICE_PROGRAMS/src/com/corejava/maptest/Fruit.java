package com.corejava.maptest;

public class Fruit {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit [name=" + name + "]";
    }

    @Override
    public int hashCode() {

        return 1;
    }

    @Override
    public boolean equals(Object obj) {

        return true;
    }

}
