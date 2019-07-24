package com.corejava;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton singletonInstance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {

        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }

        return singletonInstance;

    }

    @Override
    public Singleton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // If the Singleton class implements the java.io.Serializable interface,
    // when a singleton is serialized and then deserialized more than once,
    // there will be multiple instances of Singleton created. In order to avoid
    // this the readResolve method should be implemented. See Serializable ()
    // and readResolve Method () in javadocs.
    protected Object readResolve() {
        return getInstance();
    }
}
