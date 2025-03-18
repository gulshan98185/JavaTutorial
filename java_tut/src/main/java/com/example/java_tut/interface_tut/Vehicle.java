package com.example.java_tut.interface_tut;

public interface Vehicle {
    int maxSpeed = 500;

    void start();// public and abstract by default

    void stop();

    void speedUp();

    void gearChange();

    static void doSomething(){
        System.out.println("Vehicle doSomething");
    }

    default void doSomethingElse(){
        System.out.println("Vehicle doSomethingElse");
    }
}
