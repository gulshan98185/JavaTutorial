package com.example.java_tut.class_tut;

public class GoogleDrive extends CloudFileSystem{

    public GoogleDrive(String name, long size, long createdDate, long modifiedDate) {
        super(name, size, createdDate, modifiedDate);
    }

    @Override
    public void uploadFile() {
        System.out.println("GoogleDrive File uploaded");
    }

    @Override
    public void shareFile() {

    }

    @Override
    protected void createFile() {

    }

    @Override
    public void deleteFile() {

    }
}
