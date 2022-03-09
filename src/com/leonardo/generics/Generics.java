package com.leonardo.generics;

public class Generics {
    public static void main(String[] args) {
        /* Generics =   activa tipos (clases e interfaces) para ser parámetros cuando definamos:
        *               clases, interfaces, y métodos
        *               un beneficio es eliminar la necesidad de crear múltiples versiones
        *               de métodos or clases para varios tipos de datos.
        *               Usa una versión para todas las referencias de tipos de datos*/

        Integer[] intArray = {2,43,5,6,67,7};
        Double[] doubleArray = {3.3,34.3,3.4};
        Character[] charArray = {'d', 'd', 'v', 'd'};
        String[] stringArray = {"Hello", "Goodbye", "hi", "bye"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(stringArray);
        /////método genérico////
        System.out.println("En consola nuestro método genérico");
        displayArrayGeneric(intArray);
        displayArrayGeneric(charArray);
    }
    //O sea, necesito un método para cada tipo de dato perooo, podemos lograrlo solo con uno ///////////
    public static void displayArray(Integer[] array) {
        for (Integer x: array) {
            System.out.println(x+"");
        }
        System.out.println();
    }
    public static void displayArray(String[] array) {
        for (String x: array) {
            System.out.println(x+"");
        }
        System.out.println();
    }
    public static void displayArray(Double[] array) {
        for (Double x: array) {
            System.out.println(x+"");
        }
        System.out.println();
    }

    ////////////////////////////////lográndolo sólo con un método/////////////////////////////
    public static <Thing> void displayArrayGeneric(Thing[] array) {
        for (Thing x :
             array) {
            System.out.println(x);
        }
        System.out.println();
    }
}
