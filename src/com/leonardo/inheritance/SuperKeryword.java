package com.leonardo.inheritance;

public class SuperKeryword {
    public static void main(String[] args) {
        //super se refiere a la superclase(parent) de un objeto, muy similar a la palabra clave: this

        SuperHero batman = new SuperHero("Batman", 42, "$$$");
        System.out.println(batman.name);

        SuperHero superman = new SuperHero("Superman", 43, "eveything");
        superman.introduction();
    }
}
