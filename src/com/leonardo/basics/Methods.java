package com.leonardo.basics;

import java.util.Scanner;

public class Methods {
    public static void saludo(){
        System.out.println("Ingrese su nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Hola, muy buenos días, " + nombre);
    }
    public static void suma(){
        System.out.println("Ingrese el primer numero a sumar");
        Scanner sc = new Scanner(System.in);
        Integer numero1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero a sumar");
        Integer numero2 = sc.nextInt();
        Integer suma= numero1 + numero2;
        System.out.println("La suma de los números " + numero1 + " y el número " + numero2 + " es: " + suma);
    }
    public static int sumaConParametros(int numero1, int numero2){
        Integer suma= numero1 + numero2;
        System.out.println("La suma de los números " + numero1 + " y el número " + numero2 + " es: " + suma);
        return  numero1+numero2;
    }

    public static void main(String[] args) {
        saludo();
        suma();
        sumaConParametros(4, 7);
        int num1= 4, num2=4;
        sumaConParametros(num1, num2);

    }
}
