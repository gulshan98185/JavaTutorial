package com.example.java_tut.class_tut;

public class VideoFileSystem extends MediaFileSystem{
    public VideoFileSystem(String name, long size, long createdDate, long modifiedDate){
        super(name, size, createdDate, modifiedDate);
        System.out.println("VideoFileSystem Constructor 4 variables");
    }

    @Override
    public void editFile() {

    }

    public void viewFile(){
        System.out.println("File viewed");
    }

    @Override
    public void compressFile() {
        super.compressFile();
        System.out.println("Video File compressed");
    }
}
