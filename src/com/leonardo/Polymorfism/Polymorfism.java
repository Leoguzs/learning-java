package com.leonardo.Polymorfism;

public class Polymorfism {
    public static void main(String[] args) {
        //Polimorfismo =        griego  poly-"muchos", morph-"forma"
        //                      la habilidad de un objeto de identificarse de uno o más tipos

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] corredores = {car, bike, boat};
        System.out.println(corredores);


        //si vamos a almacenar objetos dentro de un arreglo y son diferentes tipos de objetos, debemos averiguar lo que tengan en común
        //y hacer un arreglo de ese tipo

        car.go();
        boat.go();
        bike.go();

        ///o podemos hacerlo con un for loop

        for(Vehicle x : corredores){
            x.go();
        }
    }
}
