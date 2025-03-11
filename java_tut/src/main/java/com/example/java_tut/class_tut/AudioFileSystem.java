package com.example.java_tut.class_tut;

public class AudioFileSystem extends MediaFileSystem{

    public AudioFileSystem(String name, long size, long createdDate, long modifiedDate){
        super(name, size, createdDate, modifiedDate);
        System.out.println("AudioFileSystem Constructor 4 variables");
    }

    @Override
    public void editFile() {
        System.out.println("Audio File edited");
    }

    public void listenFile(){
        System.out.println("File listened");
    }


}
