package com.example.java_tut.class_tut;

public class BoxDriveFileSystem extends CloudFileSystem{
    public BoxDriveFileSystem(String name, long size, long createdDate, long modifiedDate) {
        super(name, size, createdDate, modifiedDate);
    }

    @Override
    public void uploadFile() {

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

    @Override
    public void downloadFile() {
        System.out.println("BoxDrive File downloaded");
    }
}
