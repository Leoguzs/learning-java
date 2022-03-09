package com.leonardo.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //Exception =       es un evento que ocurre durante la ejecución de un programa que, interrumpe
        //                  el flujo normal de las instrucciones
        Scanner sc = new Scanner(System.in);
        try{

            System.out.println("Ingresa un número entero a dividir");
            int x = sc.nextInt();

            System.out.println("Ingresa un número entero a dividir entre: ");
            int y = sc.nextInt();

            int z = x / y;
            System.out.println("El resultado de dividir " + x + " entre " + y + " es: " + z);
        } catch (ArithmeticException e) {
            System.out.println("ingresa un numero entero y el 0 tampoco es válido");
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingresa un número");
        } finally {
            sc.close();
        }

    }
}
