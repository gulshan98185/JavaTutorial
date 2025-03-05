package com.example.java_tut.access_modifier_tut.def;

public class Student extends Human {
    void access(){
        // in child class in same package ACCESSIBLE = default, protected, public (by creating object)
        // in child class in same package NOT ACCESSIBLE = private (by creating object)

        // in child class in same package NOT ACCESSIBLE = , private (from parent)
        // in child class in same package ACCESSIBLE = public, protected, default (from parent)
        Human human = new Human();
        System.out.println(human.limbs); //-------->(default) ACCESSIBLE
//        System.out.println(human.eyes); //-------->(private) NOT ACCESSIBLE
        System.out.println(human.ears); //-------->(protected) ACCESSIBLE
        System.out.println(human.nose); //-------->(public) ACCESSIBLE
        human.talk(); //-------->(default) ACCESSIBLE


        talk(); //------>(protected) from parent ACCESSIBLE
        System.out.println(limbs); //------>(default) from parent ACCESSIBLE
//        System.out.println(eyes); //------>(private) from parent NOT ACCESSIBLE
        System.out.println(ears); //------>(protected) from parent ACCESSIBLE
        System.out.println(nose); //------>(public) from parent ACCESSIBLE

        smell(); //------>(final) from parent ACCESSIBLE
    }

    @Override
    protected void talk() {
        super.talk();
        //
    }


//    @Override
//    protected void smell() {  //------>(final) from parent not overridable
//        super.smell();
//        //
//    }

}
