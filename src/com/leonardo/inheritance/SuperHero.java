package com.leonardo.inheritance;

import sun.security.ec.SunEC;

public class SuperHero extends Person{
    String superPower;

    SuperHero(String name, int age, String superPower){
        super(name, age);
        this.superPower = superPower;

    }
}
