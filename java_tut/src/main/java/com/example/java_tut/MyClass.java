package com.example.java_tut;

import com.example.java_tut.class_tut.AudioFileSystem;
import com.example.java_tut.class_tut.CloudFileSystem;
import com.example.java_tut.class_tut.DocumentFileSystem;
import com.example.java_tut.class_tut.FileSystem;
import com.example.java_tut.class_tut.FirestoreFileSystem;
import com.example.java_tut.class_tut.GoogleDrive;
import com.example.java_tut.interface_tut.Car;
import com.example.java_tut.interface_tut.SuperCar;
import com.example.java_tut.interface_tut.Truck;
import com.example.java_tut.interface_tut.Vehicle;
import com.example.java_tut.interface_tut.Vishwas;

public class MyClass {
    public static void main(String[] args) {
//        FileSystem documentFileSystem = new DocumentFileSystem("Document", 100, 123, 123);
//        documentFileSystem.deleteFile();
//
//        AudioFileSystem mediaFileSystem = new AudioFileSystem("Audio", 100, 123, 123);
//        mediaFileSystem.editFile();
//        mediaFileSystem.listenFile();

        CloudFileSystem cloudFileSystem = new GoogleDrive("Google Drive", 100, 123, 123);
//        cloudFileSystem.downloadFile();
//        cloudFileSystem.uploadFile();

//        FirestoreFileSystem firestoreDrive = new FirestoreFileSystem("Firestore Drive", 100, 123, 123, "FIREBASE");
        CloudFileSystem firestoreDrive = new FirestoreFileSystem("Firestore Drive", 100, 123, 123);
//        firestoreDrive.uploadFile();
//        firestoreDrive.uploadImage();

        System.out.println("********************************************************" );
        System.out.println("FirestoreFileSystem num " + FileSystem.num);
        FileSystem.num = 10;
        System.out.println("FirestoreFileSystem num " + CloudFileSystem.num);

        System.out.println("CloudFileSystem num " + FileSystem.num);

        System.out.println("FirestoreFileSystem num2 " + firestoreDrive.num2);
        firestoreDrive.num2 = 20;
        System.out.println("FirestoreFileSystem num2 " + firestoreDrive.num2);
        System.out.println("CloudFileSystem num2 " + cloudFileSystem.num2);
        cloudFileSystem.num2 = 65;
        System.out.println("CloudFileSystem num2 " + cloudFileSystem.num2);


        Vehicle vehicle = new Vishwas();
        vehicle.start();
        vehicle.stop();
//        vehicle.openAirBag();

        Car car = new Vishwas();
        car.start();
        car.openAirBag();
//        car.highPowered();


        Vishwas vishwas = new Vishwas();

        MyClass myClass = new MyClass();
        myClass.access(vishwas);
        myClass.accessTruck(vishwas);

        myClass.access(new Car() {
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
            public void reverseByGear() {

            }

            @Override
            public void openAirBag() {

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
        });

//        myClass.accessFileSystem();
    }

    public void access(Car car){
        car.playMusic();
//        car.highPowered();
    }

    public void accessTruck(Truck superCar){
        superCar.highPowered();
    }

    public void accessFileSystem(FileSystem fileSystem){
        fileSystem.moveFile();
    }
}
