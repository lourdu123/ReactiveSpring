package com.corejava.immutabletest;

import java.util.Date;

public final class ImmutableClass {

    private final int id;
    private final String name;
    private final Date myDate; // we can modify this as this is mutable object.
                               // so do deep cloning.

    public ImmutableClass(int id, String name, Date myDate) {

        this.id = id;
        this.name = name;
        this.myDate = myDate;
    }

    public int getA() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getMyDate() {
        return (Date) myDate.clone();
    }

}
