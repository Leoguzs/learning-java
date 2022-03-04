package com.leonardo.basics;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num=4;

       /* while (num != 10) {
            System.out.println("aun no llegas");
            num++;
            System.out.println(num);
        } */

        System.out.println("ingresa tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.next();

        while (nombre.isEmpty()){
            System.out.println("Este paso es obligatorio");
        }
        System.out.println("bienvenide, "+ nombre);
    }
}
