package com.example.java_tut.access_modifier_tut.outer;

import com.example.java_tut.access_modifier_tut.def.Human;

public class Female extends Human {

    public void access(){
        // in other package in child class ACCESSIBLE = public
        // in other package in child class NOT ACCESSIBLE = default, private, protected


        // in other package  in child class NOT ACCESSIBLE = default, private (from parent)
        // in other package in child class ACCESSIBLE = public, protected (from parent)
        Human human = new Human();
//        System.out.println(human.limbs); //------>(default) NOT ACCESSIBLE
//        System.out.println(human.eyes); //------>(private) NOT ACCESSIBLE
//        System.out.println(human.ears); //------>(protected) NOT ACCESSIBLE
        System.out.println(human.nose); //------>(public) ACCESSIBLE

        talk(); //------>(protected) from parent ACCESSIBLE
//        System.out.println(limbs); //------>(default) from parent NOT ACCESSIBLE
//        System.out.println(eyes); //------>(private) from parent NOT ACCESSIBLE
        System.out.println(ears); //------>(protected) from parent ACCESSIBLE
        System.out.println(nose); //------>(public) from parent ACCESSIBLE
    }

    @Override
    protected void talk() {
        super.talk();
    }
}
