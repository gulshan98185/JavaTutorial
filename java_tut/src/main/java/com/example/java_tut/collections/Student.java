package com.example.java_tut.collections;

class Student{
        String name;
        int age;
        String fathersName;

        public Student(String name, String fathersName, int age) {
            this.name = name;
            this.age = age;
            this.fathersName = fathersName;
        }

    @Override
    public String toString() {
        return "{" + name+ " : " + fathersName  + " : " + age /*+ ", fathersName: " + fathersName + ", age: " + age */ + "}";
    }

    //Not recommended to override equals method
    @Override
    public boolean equals(Object o) {
        return ((Student)o).name.equals(this.name) && ((Student)o).fathersName.equals(this.fathersName) && ((Student)o).age == this.age;
    }
}