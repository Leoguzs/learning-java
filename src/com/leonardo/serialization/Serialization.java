package com.leonardo.serialization;
import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {
        //Serialization   =   Es el proceso de convertir un objeto en un flujo de byte.
        //                    Persiste (guarda es estado) el objeto después de que se sale del programa
        //                    El flujo de byte puede ser guardado como un archivo o enviado por un red
        //                    Puede ser enviado a una máquina diferente
        //                    El flujo de byte puede ser guardado como un archivo(.ser) cuya plataforma es independiente
        //                    (Es como si guardaras un archivo con la información del objeto)

        //Deserialization =   Es el proceso invertido de convertir un flujo de byte en un objeto.
        //                    (Es como si estuvieras cargando

        /*pasos para serializacion
        * 1- tu clase debe implementar la clase Serializable
        * 2- agregar import. java.io.serializable
        * 3- FileOutputStream fileOut = new FileOutputStream(file path)
        * 4- ObjectOutputStream out = new ObjectOutputStream(fileOut)
        * 5- out.writeObject(objectName)
        * 6- out.close(); fileout.close();
        * */



        User user = new User();
        user.name = "Leonardo";
        user.password = "dvljh7878";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved");

    }
}
