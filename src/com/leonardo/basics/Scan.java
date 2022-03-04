package com.leonardo.basics;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuál es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Cuál es tu edad?");
        int edad = sc.nextInt();
        System.out.println("eres "+ nombre + " y tienes " + edad + " años");
    }
}
