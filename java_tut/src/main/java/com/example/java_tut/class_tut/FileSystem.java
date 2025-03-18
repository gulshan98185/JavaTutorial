package com.example.java_tut.class_tut;

public abstract class FileSystem {// related to file manager
    String name;
    long size;
    long createdDate;
    long modifiedDate;
    public static int num = 0;
    public int num2 = 0;

    public static final String MOVE = "MOVE";

//    public FileSystem(){
//        System.out.println("FileSystem Constructor");
//    }

    public FileSystem(String name, long size, long createdDate, long modifiedDate){
        this.name = name;
        this.size = size;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        System.out.println("FileSystem Constructor 4 variables");
    }

    public FileSystem(String name, long size, long createdDate){
        this.name = name;
        this.size = size;
        this.createdDate = createdDate;
        this.modifiedDate = createdDate;
        System.out.println("FileSystem Constructor 3 variables");
    }

    protected abstract void createFile();

    public abstract void deleteFile();

    public void renameFile(){
        System.out.println("File renamed");
    }

    public void copyFile(){
        System.out.println("File copied");
    }

    public void moveFile(){
        System.out.println("File moved");
        int size = 300;
        if(size>200){
            formatFileSystem();
        }
    }

    final void formatFileSystem(){
        System.out.println("File accessed");
        doSomething();
    }

    public static void doIt(){
        doSomething();
    }

    private static void doSomething(){
        System.out.println("Do something");
    }

}
