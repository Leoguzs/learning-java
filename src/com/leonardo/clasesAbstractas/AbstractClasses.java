package com.leonardo.clasesAbstractas;

public class AbstractClasses {
    public static void main(String[] args) {

        //Vehicle vehicle = new Vehicle(); no puedo instanciar una clase abstracta
        Car car = new Car();
        car.movement();
        car.introduction();
    }
}
