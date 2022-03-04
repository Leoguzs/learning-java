package com.leonardo.basics;

import java.util.LinkedList;

public class Arrays {
    public static void main(String[] args) {
        String[] fruits = {"mangoes", "apples", "strawberries"};
        System.out.println(fruits[2]);

        int [] numeros = {2,2,4,2,3,43,5,6,556,4};
        System.out.println(numeros[3]);

        LinkedList lista = new LinkedList();
        lista.add(4);

        String [] cars = new String[4];
        cars[3] = "Tesla";
        cars[0] = "Jetta";
        cars[1] = "BMW";
        cars[2] = "Toyota";

       for (int i=0; i<cars.length; i++) {
           System.out.println(cars[i]);
        }

       /*Arreglo 2d*/
        System.out.println("Desplegando un arreglo en 2D");
       String[][] carros = {
               {"Mercedes", "Tesla"},
               {"Lambo", "Ferrari"}
       };

       for(int i=0; i<carros.length; i++){
           System.out.println();
           for (int j=0; j<carros[i].length; j++){
               System.out.println(carros[i][j]);
           }
       }
    }
}
