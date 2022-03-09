package com.leonardo.module2;

public class Overloading {
    public static void main(String[] args) {
        //overloaded methods son métodos que tienen el mismo nombre pero tienen diferentes parámetros
                        //method name + method parameters =    method siganture

        System.out.println(add(2,3));
        System.out.println(add(2));
        System.out.println(add(2.2, 3.2));
    }

    static int add(int nubmer1, int number2){
        return nubmer1 + number2;
    }
    static int add(int number){
        return 10 + number;
    }
    static double add(double number, double numer2){
        return numer2 + number;
    }
}
