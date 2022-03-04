package com.leonardo.basics;

import java.util.Scanner;

public class IfConditional {
    public static void main(String[] args) {

        try {
            System.out.println("Ingresa un numero");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if(num >=5 && num<23){
                System.out.println("Felicidades, lo hiciste bien");
            } else{
                System.out.println("Gracias por participar");
            }
        }catch (Exception e) {
            System.out.println("Tienes que ingresar un numero");
        }

    }
}
