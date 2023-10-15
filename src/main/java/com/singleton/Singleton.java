package com.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        return singleton == null ? new Singleton() : singleton;
    }
}