package com.leonardo.basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        String day = "monday";

        switch (day.toUpperCase()) {
            case "SUNDAY":
                System.out.println("Es Domingo");
                break;
                case "MONDAY": System.out.println("Es lunes");
                break;
            default:
                System.out.println("no hay cita");
        }

        System.out.println("Estas jugando, sin quieres salir, presiona q");
        Scanner sc = new Scanner(System.in);
        String response = sc.next();
        if(response.equals("q")|| response.equals("Q")){
            System.out.println("Has salido del juego");
        } else {
            System.out.println("Sigues en el juego");
        }


    }
}
