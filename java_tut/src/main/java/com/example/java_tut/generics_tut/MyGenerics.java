package com.example.java_tut.generics_tut;

import java.util.ArrayList;

public class MyGenerics {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("String");
        arrayList.add("1 is good");
        arrayList.add("1.0");
        arrayList.add("true");

//        for (Object obj : arrayList) {
//            System.out.println(obj);
//        }

        String data = arrayList.get(1);

//        System.out.println(data);

        ABC<String, Float> abc = new ABC<>(1, "String", "T", 10.0f);
        abc.doWork();

        ABC<Integer, String> abc1 = new ABC<>(1, "String 123", 1, "String type data ");
        abc1.doWork();

        ABC<MyClass, MyClass> abc2 = new ABC<>(1, "String", new MyClass(10, "String type data "), new MyClass(140, "String data "));
        abc2.doWork();
        abc2.doSomething(new MyClass(10, "String type data "), new MyClass(140, "String data "));

        MyClass obj = new MyClass(10, "String type data ");
        obj.doMoreSomething(abc);
        obj.doMoreSomething(1);
        obj.doMoreSomething(1.0f);
        obj.doMoreSomething(obj);
    }
}

class MyClass{
    int a;
    String b;


    int d;
    public MyClass(int a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof MyClass && this.a == ((MyClass) o).a && this.b.equals(((MyClass) o).b);
    }

    @Override
    public String toString() {
        return  "{a: "+a + " b: " + b + "}";
    }

    <C> void doMoreSomething(C t){
        System.out.println(t);
    }

    static <C> void doSomething(C t){
        System.out.println(t);
    }


    // MyClass obj = new MyClass(10, "String type data ");
    // MyClass obj1 = new MyClass(10, "String type data ");
    // obj == obj1 -> false // 1 == 1

}





class ABC<T, U>{
    int a;
    String b;
    T t;
    U u;

    public ABC(int a, String b, T t, U u) {
        this.a = a;
        this.b = b;
        this.t = t;
        this.u = u;
    }

    public void doSomething(T t, U u){
//        System.out.println("a: "+t + " b: "+u);
    }
    void doWork(){
//        System.out.println("a: "+a + " b: "+b + " t: "+t + " u: "+u);
    }
}