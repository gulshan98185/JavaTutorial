package com.example.java_tut.class_tut;

public class OneDriveFileSystem extends CloudFileSystem{
    public OneDriveFileSystem(String name, long size, long createdDate, long modifiedDate) {
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
        super.downloadFile();
        System.out.println("OneDrive File downloaded");
    }
}
