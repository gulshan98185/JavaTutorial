package com.example.java_tut.interface_tut;

public interface Car extends Vehicle{
    int tyre = 4;

    void start();

    void playMusic();

    void storeLuggage();

    void reverseByGear();

    void openAirBag();

    @Override
    default void doSomethingElse() {
        Vehicle.super.doSomethingElse();
        System.out.println("Car doSomethingElse");
    }
}
