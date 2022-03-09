package com.leonardo.module2;

public class PrinfMethod {
    public static void main(String[] args) {
        /*printf():   Es un método para formatear y mostrar texto en la consola
        *              recibe dos argumentos = format string  + (object/variable/value)
        *              % [flags] [precision] [width] [conversion-character]*/


        System.out.printf("Esta es una cadena de texto formateada %d", 123);
        System.out.printf("\n%d Esta es una cadena de texto formateada", 123);

        boolean myBoolean = false;
        char myChar ='@';
        String myString = "Leo";
        int myInt = 3;
        double myDouble = 1000.0;

        System.out.printf("\n%b", myBoolean);
        System.out.printf("\n%c", myChar);
        System.out.printf("\n%f", myDouble);

        //usando with, es un numero para separar caracteres
        System.out.printf("\nHola %4s", myString);

    }
}
