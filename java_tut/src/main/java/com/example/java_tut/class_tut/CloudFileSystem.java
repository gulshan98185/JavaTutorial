package com.example.java_tut.class_tut;

public abstract class CloudFileSystem extends FileSystem{

    public CloudFileSystem(String name, long size, long createdDate, long modifiedDate){
        super(name, size, createdDate, modifiedDate);
        System.out.println("CloudFileSystem Constructor 4 variables");
    }

    public abstract void uploadFile();

    public void downloadFile(){
        System.out.println("Cloud File downloaded");
    }

    public abstract void shareFile();
}
