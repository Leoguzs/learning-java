package com.leonardo;

public class Main {

    public static void main(String[] args) {
	    int numero1= 4;
	    int numero2=3;

	    int pivote;

        System.out.println("Antes mis números eran " + numero1 + " y " + numero2);

        pivote = numero1;
        numero1 = numero2;

        numero2 = pivote;

        System.out.println("Ahora mis números son " + numero1 + " y " + numero2);
        
        }
    }

