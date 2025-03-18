package com.example.java_tut.interface_tut;

public class Vishwas implements Car, Truck{

    void create(){
        doSomethingElse();
        start();
        stop();
    }

    @Override
    public void start() {

    }

    @Override
    public void playMusic() {

    }

    @Override
    public void storeLuggage() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void speedUp() {

    }

    @Override
    public void gearChange() {

    }

    @Override
    public void reverseByGear() {

    }

    @Override
    public void openAirBag() {

    }

    @Override
    public void doSomethingElse() {
        Car.super.doSomethingElse();
    }

    @Override
    public void highPowered() {
        doSomethingElse();
    }



}
