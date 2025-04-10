package com.example.java_tut.enums_tut;


import static com.example.java_tut.enums_tut.EnumExample.DAY.MONDAY;
import static com.example.java_tut.enums_tut.EnumExample.Vehilcle.BIKE;
import static com.example.java_tut.enums_tut.EnumExample.Vehilcle.BUS;
import static com.example.java_tut.enums_tut.EnumExample.Vehilcle.CAR;
import static com.example.java_tut.enums_tut.EnumExample.Vehilcle.CYCLE;
import static com.example.java_tut.enums_tut.EnumExample.Vehilcle.TRUCK;

import java.util.ArrayList;
import java.util.List;

public class EnumExample {

    static class Constants{
        public static final String RED = "RED";
        public static final String GREEN = "GREEN";
        public static final String BLUE = "BLUE";
    }

    public static void main(String[] args) {
        EnumExample example = new EnumExample();
//        example.print(Constants.RED);
//        example.print(new Vehical(8, 3));
//        example.print(Vehical.CAR);
//        example.printVehicle(Vehilcle.CYCLE);
//        for(Vehilcle vehilcle: Vehilcle.values()){
//            example.doWork(vehilcle);
//        }
//        Vehilcle vehilcle = Vehilcle.valueOf("CAR");

        Vehilcle vehilcle = getVehilcle("Truck", 5000).get(0);
        System.out.println(vehilcle.name());
        example.doWork(vehilcle);

//        CAR.name = "CCAR";

    }

    static List<Vehilcle> getVehilcle(String name, int price){
        List<Vehilcle> vehilcles = new ArrayList<>();
        for (Vehilcle vehilcle : Vehilcle.values()) {
            if (vehilcle.name.equals(name) && vehilcle.price == price) {
                vehilcles.add(vehilcle);
            }
        }
        return vehilcles;
    }

    enum DAY{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }

    interface Work{
        void doWork();
    }

    enum Vehilcle implements Work{
        CAR("Car", 100),
        SUPER_CAR("Car", 1000),
        BUS("Bus", 2000),
        CYCLE("Cycle", 30),
        BIKE("Bike", 1500),
        TRUCK("Truck", 5000);

        String name;
        int price;

        Vehilcle(String name, int price) {
            this.name = name;
            this.price = price;
        }

        void printSomething(){
            System.out.println("Print something");
        }

        @Override
        public void doWork() {
            System.out.println("Doing work with " + this.name + " : " + this);
        }
    }

    static class Vahan {
        int a;
        int b;
        public static final Vahan CAR = new Vahan(1, 2);
        public static final Vahan BUS = new Vahan(3, 4);
        public static final Vahan CYCLE = new Vahan(5, 6);
        public static final Vahan BIKE = new Vahan(7, 8);
        public static final Vahan TRUCK = new Vahan(8, 9);

        private Vahan(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            return o instanceof Vahan && this.a == ((Vahan) o).a && this.b == ((Vahan) o).b;
        }
    }

     void print(Vahan vehical){
         if (vehical.equals(Vahan.CAR)) {
             System.out.println("Car");
         } else if (vehical.equals(Vahan.BUS)) {
             System.out.println("Bus");
         } else if (vehical.equals(Vahan.CYCLE)) {
             System.out.println("Cycle");
         } else if (vehical.equals(Vahan.BIKE)) {
             System.out.println("Bike");
         } else if (vehical.equals(Vahan.TRUCK)) {
             System.out.println("Truck");
         } else {
             System.out.println("Unknown vehical");
         }
     }

    void print(String color) {
        switch (color) {
            case Constants.RED:
                System.out.println("Red color");
                break;
            case Constants.GREEN:
                System.out.println("Green color");
                break;
            case Constants.BLUE:
                System.out.println("Blue color");
                break;
            default:
                System.out.println("Unknown color");
        }
    }

    void printVehicle(Vehilcle vehilcle){// enum
        switch (vehilcle) {
            case CAR:
                System.out.println(CAR.name);
                break;
            case BUS:
                System.out.println(BUS.name);
                break;
            case CYCLE:
                System.out.println(CYCLE.name);
                break;
            case BIKE:
                System.out.println(BIKE.name);
                break;
            case TRUCK:
                System.out.println(TRUCK.name);
                break;
            default:
                System.out.println("Unknown vehical");
        }
    }

    void doWork(Work work){
        work.doWork();
    }
}
