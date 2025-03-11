package com.example.java_tut.class_tut;

public class PhotoFileSystem extends FileSystem{
    public PhotoFileSystem(String name, long size, long createdDate, long modifiedDate){
        super(name, size, createdDate, modifiedDate);
        System.out.println("PhotoFileSystem Constructor 4 variables");
    }

    @Override
    public void createFile(){
        System.out.println("Photo File created");
    }

    @Override
    public void deleteFile(){
        System.out.println("Photo File deleted");
    }

    //
    public void compressFile(){
        System.out.println("File compressed");
    }

    public void viewFile(){
        System.out.println("File viewed");
    }
}
