package com.example.java_tut.class_tut;

public abstract class MediaFileSystem extends FileSystem{
    public MediaFileSystem(String name, long size, long createdDate, long modifiedDate){
        super(name, size, createdDate, modifiedDate);
        System.out.println("MediaFileSystem Constructor 4 variables");
    }

    @Override
    public void createFile(){
        System.out.println("Media File created");
    }

    @Override
    public void deleteFile(){
        System.out.println("Media File deleted");
    }

    public void compressFile(){
        System.out.println("File compressed");
    }

    public void playFile(){
        System.out.println("File played");
    }

    public void stopFile(){
        System.out.println("File stopped");
    }

    public abstract void editFile();
}
