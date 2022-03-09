package com.leonardo.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Muerto el ser amado, \nla vida se hace transparente, \nalejado de lo que pasa día a día, \ncomo testigo de los dias que se vam  ");
            writer.append("-Leonardo");
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
