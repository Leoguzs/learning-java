package com.leonardo.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        //Encapsulación = los atributos de una clase pueden estar ocultos o privados
        //                se puede acceder a los atributos por medio de métodos (getters and setters)
        //                Deberías hacer atributos privados si no hay alguna razón para que sean public/protected
        //                esto para mantener la seguridad de tus programas

        Car car = new Car("Chevrolet", "Camaro", 2021);
        Car car2 = new Car("Ford", "Mustang", 2021);
        System.out.println(car.getMake());
        car.setMake("Ford");
        System.out.println(car.getMake());
        System.out.println(car);

        //copiando objetos
        System.out.println("\nCopiando objetos");
        //vamos a copiar el car en carro 2, pero, para que no tengan la misma dirección en memoria, haremos lo siguiente:
        car2.copy(car);
        System.out.println(car);
        System.out.println(car2);

    }
}
