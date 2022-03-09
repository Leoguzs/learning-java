package com.leonardo.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> Lista = new ArrayList();
        Lista.add("Leonardo");
        Lista.add("juan");
        Lista.set(0, "Rafael");
        Lista.set(0, "Luis");
        System.out.println(Lista);
        System.out.println(Lista.get(0));
        System.out.println(Lista.size());


        for (String e: Lista
             ) {
            System.out.println(e);
        }

        String[] nombres = {"Leo", "Diana"};
        System.out.println(Arrays.toString(nombres));

        List<String> colores = new ArrayList<>();
        colores.add("Azul");
        System.out.println(colores.get(0));

        ArrayList<String> amigos = new ArrayList<>();
        amigos.add("Luis");
        amigos.add("Matilda");
        amigos.add("Pepe");

        for (int i = 0; i < amigos.size() ; i++) {
            System.out.println(amigos.get(i));
        }

        amigos.clear();
        for (String amigo : amigos) {
            System.out.println("\n"+amigo);
        }
    }
}
