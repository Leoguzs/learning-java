package com.leonardo.AccessModifyers.Package2;

import com.leonardo.AccessModifyers.Package1.*;

public class Subclase extends A {
    public static void main(String[] args) {
        Subclase subclase = new Subclase();
        System.out.println(subclase.protectedMessage);
    }

}
