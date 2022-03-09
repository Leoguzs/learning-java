package com.leonardo.inheritance;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void introduction(){
        System.out.println(this.name + " tiene " + this.age + " años");
    }
}
