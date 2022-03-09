package com.leonardo.basics;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList();
        numeros.add(2);
        System.out.println(numeros.toString());
        System.out.println(numeros.get(0));

        numeros.add(1, 2);
        System.out.println(numeros.toString());
        numeros.remove();



    }
}
