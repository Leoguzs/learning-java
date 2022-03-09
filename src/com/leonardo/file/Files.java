package com.leonardo.file;
import java.io.File;

public class Files {
    public static void main(String[] args) {
        //  file =        es una representación abstracta de las rutas del directorio
        File file = new File("C:\\Users\\w10\\Desktop\\JAVA\\src\\com");

        if(file.exists()) {
            System.out.println("ese archivo existe");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
        } else {
            System.out.println("Ese archivo no existe");
        }
    }
}
