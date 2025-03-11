package com.example.java_tut.class_tut;

public class FirestoreFileSystem extends GoogleDrive{
    String type;
    public FirestoreFileSystem(String name, long size, long createdDate, long modifiedDate) {
        super(name, size, createdDate, modifiedDate);
    }

    public FirestoreFileSystem(String name, long size, long createdDate, long modifiedDate, String type) {
        super(name, size, createdDate, modifiedDate);
        this.type = type;
    }

    public void uploadImage(){
        System.out.println("Image uploaded to Firestore");
    }

    @Override
    public void downloadFile() {
        super.downloadFile();
        System.out.println("Firestore File downloaded");
    }

//    @Override
//    public void uploadFile() {
//        System.out.println("Firestore File uploaded of type: " + type);
//    }
}
