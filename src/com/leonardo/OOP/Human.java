package com.leonardo.OOP;

public class Human {
    String name;
    int age;
    String major;
    //un Constructor es un método especial que se llama cuando se instancia un objeto
    Human (String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    public void saludar(){
        System.out.println(this.name + " esta saludando");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}
