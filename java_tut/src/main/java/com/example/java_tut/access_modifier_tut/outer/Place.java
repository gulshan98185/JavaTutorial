package com.example.java_tut.access_modifier_tut.outer;

import com.example.java_tut.access_modifier_tut.def.Human;

public class Place {

    public void access(){
        // in other package ACCESSIBLE = public
        // in other package NOT ACCESSIBLE = default, private, protected
        Human human = new Human();
//        System.out.println(human.limbs);  //-------->(default) NOT ACCESSIBLE
//        System.out.println(human.eyes);  //-------->(private) NOT ACCESSIBLE
//        System.out.println(human.ears);  //-------->(protected) NOT ACCESSIBLE
        System.out.println(human.nose);  //-------->(public) NOT ACCESSIBLE
    }
}
