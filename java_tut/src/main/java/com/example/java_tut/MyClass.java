package com.example.java_tut;

import com.example.java_tut.class_tut.AudioFileSystem;
import com.example.java_tut.class_tut.CloudFileSystem;
import com.example.java_tut.class_tut.DocumentFileSystem;
import com.example.java_tut.class_tut.FileSystem;
import com.example.java_tut.class_tut.FirestoreFileSystem;
import com.example.java_tut.class_tut.GoogleDrive;

public class MyClass {
    public static void main(String[] args) {
        FileSystem documentFileSystem = new DocumentFileSystem("Document", 100, 123, 123);
        documentFileSystem.deleteFile();

        AudioFileSystem mediaFileSystem = new AudioFileSystem("Audio", 100, 123, 123);
        mediaFileSystem.editFile();
        mediaFileSystem.listenFile();

        CloudFileSystem cloudFileSystem = new GoogleDrive("Google Drive", 100, 123, 123);
        cloudFileSystem.downloadFile();
        cloudFileSystem.uploadFile();

//        FirestoreFileSystem firestoreDrive = new FirestoreFileSystem("Firestore Drive", 100, 123, 123, "FIREBASE");
        CloudFileSystem firestoreDrive = new FirestoreFileSystem("Firestore Drive", 100, 123, 123);
        firestoreDrive.uploadFile();
//        firestoreDrive.uploadImage();
    }
}
