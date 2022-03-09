package com.leonardo.dynamicPolymorfism;

import java.util.Scanner;

public class DynamicPolymorfism {
    public static void main(String[] args) {
        //Polymorfism =     muchas formas
        //Dynamic =         después de compilación (during runtime)

        //ejemplo:  Un Mustang es: un Mustang, y un carro, y un vehículo, y un objeto


        //Le queremos preguntar al usuario si quiere crear un perro o un gato, pero esto es ya durante el tiempo de ejecución
        Animal animal;

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué animal deseas crear? \n(1=Gato) o (2=Perro):");
        int preferencia = sc.nextInt();

        if (preferencia ==2) {
            animal = new Dog();
            animal.speak();
        } else if (preferencia ==1) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("Esa elección no es válida");
            animal.speak();
        }

        //Dynamic polymorfism = declaras un objeto y le guardas un espacio en memoria, incluso si no  sabes qué tipo de objeti quieres,
        //el usuario lo decidirá
    }
}
