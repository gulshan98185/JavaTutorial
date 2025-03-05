package com.example.java_tut.access_modifier_tut.def;

public class Animal {

    public void access(){
        // in other class in same package ACCESSIBLE = default, protected, public
        // in other class in same package NOT ACCESSIBLE = private
        Human human = new Human();
        System.out.println(human.limbs);
//        System.out.println(human.eyes);  //-------->(private) NOT ACCESSIBLE
        System.out.println(human.ears);  //-------->(protected) ACCESSIBLE
        System.out.println(human.nose);  //-------->(public) ACCESSIBLE
        human.talk(); //-------->(default) ACCESSIBLE
    }
}
