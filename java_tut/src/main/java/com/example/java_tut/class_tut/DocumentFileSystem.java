package com.example.java_tut.class_tut;

public class DocumentFileSystem extends FileSystem{
    public DocumentFileSystem(String name, long size, long createdDate, long modifiedDate){
        super(name, size, createdDate, modifiedDate);
        System.out.println("DocumentFileSystem Constructor 4 variables");
    }

    @Override
    public void createFile(){
        System.out.println("Document File created");
    }

    @Override
    public void deleteFile() {
        System.out.println("Document File deleted");
    }
}
