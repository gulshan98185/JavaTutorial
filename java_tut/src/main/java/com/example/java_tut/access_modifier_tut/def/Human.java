package com.example.java_tut.access_modifier_tut.def;

public class Human {
    // Access modifiers: public, private, protected, default

    // default : Accessible within the same package
    // protected : Accessible within the same package (by creating object of the class)

    // protected : Accessible within the child class (from parent)

    // private : Accessible within the same class
    // public : Accessible from anywhere
    int limbs = 4;
    private int eyes = 2;
    protected int ears = 2;
    public int nose = 1;

    final int mouth = 1;

    void walk() {
        // within class ACCESSIBLE = default, private, public, protected
        limbs = 4;
        eyes = 2;
        ears = 2;
        nose = 1;
//        mouth = 1; //-------->(final) NOT CHANGEABLE
        System.out.println(mouth);
        System.out.println(limbs);//-------->(default) ACCESSIBLE
        System.out.println(eyes);//-------->(private) ACCESSIBLE
        System.out.println(ears);//-------->(protected) ACCESSIBLE
        System.out.println(nose);//-------->(public) ACCESSIBLE
        System.out.println("Walking...");

        smell();
    }

    protected void talk() {
        System.out.println("Talking...");
    }

    private void listen() {
        System.out.println("Listening...");
    }

    protected final void smell() {
        System.out.println("Smelling...");
    }

}
