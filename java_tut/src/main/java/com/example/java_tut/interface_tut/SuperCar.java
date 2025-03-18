package com.example.java_tut.interface_tut;

public interface SuperCar extends Car, Truck{//

    @Override
    default void doSomethingElse() {
//        Car.super.doSomethingElse();
//        Truck.super.doSomethingElse();
        System.out.println("SuperCar doSomethingElse");
    }

    void fly();
}
