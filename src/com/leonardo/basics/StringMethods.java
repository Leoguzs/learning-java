package com.leonardo.basics;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class StringMethods {
    public static void main(String[] args) {
        String name= "Leoo";
        System.out.println(name.equalsIgnoreCase("leo"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("o"));
        System.out.println(name);
        System.out.println(name.trim());

        System.out.println(name.replace("Leoo", "Leonardo"));



    }
}
