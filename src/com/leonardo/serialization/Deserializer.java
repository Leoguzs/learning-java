package com.leonardo.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //          Pasos para DESERIALIZAR
        //          ---------------------------------------------------------
        //          1- declarar tu objeto (no instanciarlo)
        //          2- Implementar la interfaz Serializable en tu clase
        //          3- import java.io.Serializable
        //          4- FileInputStream fileIn = new FileInputStream(file path);
        //          5- ObjectInputStream in = new ObjectInputStream(fileIn);
        //          6- objectNam = (Class) in.readObject();
        //          7- in.close();  fileIn.close();

        User user = null;
        FileInputStream fileIn = new FileInputStream("C:\\Users\\XMX4843\\Music\\learning-java");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHi();

    }
}
