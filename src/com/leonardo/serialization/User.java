package com.leonardo.serialization;

import java.io.*;

public class User implements Serializable {
    String name;
    String password;

    public void sayHi()
    {
        System.out.println("Hola, " + name);
    }
}
