package com.example.javatutorial.callback;

public class NormalCallback {
    public void click(int position, String name) {
        System.out.println("NormalCallback: " + position + " " + name);
    }

    public void click2(int position, String name) {
        System.out.println("NormalCallback2: " + position + " " + name);
    }
}
