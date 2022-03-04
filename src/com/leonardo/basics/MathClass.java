package com.leonardo.basics;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        System.out.println(Math.pow(y, 2));
        System.out.println(Math.ceil(x));
        System.out.println(Math.round(x));

        double sq= 64;
        System.out.println(Math.sqrt(sq));

        /*Problema para sacar hipotwnusa de un triangulo*/
        double a, b, hipotenusa;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa lado a");
        a = sc.nextDouble();

        System.out.println("Ingresa lado b");
        b = sc.nextDouble();



        hipotenusa =Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(hipotenusa);

        sc.close();
    }
}
