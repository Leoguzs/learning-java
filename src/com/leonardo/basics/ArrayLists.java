package com.leonardo.basics;

import java.util.ArrayList;
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


        String[] nombres = new String[2];
    }
}
