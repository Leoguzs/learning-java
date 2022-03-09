package com.leonardo.Interfaces;

import com.leonardo.AccessModifyers.Package1.A;

public class Interfaces {
    public static void main(String[] args) {
        //interface =       una plantilla que puede ser aplicada a una clase
        //                  similar a la herencia, pero especifica lo que una clase tiene/debe hacer
        //                  clases pueden aplicar más de una interfaz, la herencia es limitada a una super clase


        Conejo buggsBunny = new Conejo();
        buggsBunny.huir();

        Aguila eagly = new Aguila();
        eagly.acechar();

        Pescado pez = new Pescado();
        pez.huir();
    }
}
