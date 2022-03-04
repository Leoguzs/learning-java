package com.leonardo.basics;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        double random = Math.round(Math.random() * 10);
        System.out.println(random);

        Random randomMejorado = new Random();
        int numeroRandom = randomMejorado.nextInt();
        System.out.println(numeroRandom);

        boolean z = randomMejorado.nextBoolean();
        System.out.println(z);
    }
}
