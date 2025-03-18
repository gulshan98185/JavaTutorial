package com.example.java_tut.interface_tut;

public interface Truck extends Vehicle{

    void reverseByGear();

    void highPowered();

    @Override
    default void doSomethingElse() {
        Vehicle.super.doSomethingElse();
        System.out.println("Truck doSomethingElse");
    }
}
