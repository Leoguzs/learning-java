package com.leonardo.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FaileReaders {
    public static void main(String[] args) {
        // FileReader =         lee el contenido de un archivo como un flujo de carácteres. Uno por
        //                      uno, read() regresa un int qu contiene el valor en byte cuando read()
        //                      regresa -1, ya no quedan más datos por leer

        try{
            FileReader fileReader = new FileReader("C:\\Users\\w10\\Desktop\\JAVA\\src\\com\\leonardo\\art.txt"); //le indicamos en el parámetro el file path
            int data = fileReader.read();

            while(data != -1){
                System.out.print((char) data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
