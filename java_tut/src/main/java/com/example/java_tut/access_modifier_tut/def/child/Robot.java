package com.example.java_tut.access_modifier_tut.def.child;

import com.example.java_tut.access_modifier_tut.def.Human;

public class Robot {
    void access(){
        // in other package within package of Object class ACCESSIBLE = public
        // in other package within package of Object class NOT ACCESSIBLE = default, private, protected
         Human human = new Human();
//         System.out.println(human.limbs); //------>(default) NOT ACCESSIBLE
//         System.out.println(human.eyes); //------>(private) NOT ACCESSIBLE
//         System.out.println(human.ears); //------>(protected) NOT ACCESSIBLE
         System.out.println(human.nose); //------>(public) ACCESSIBLE
    }
}
