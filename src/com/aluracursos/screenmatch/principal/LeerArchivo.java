package com.aluracursos.screenmatch.principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) throws IOException {
        File file = new File("peliculas.txt");
        FileReader reader = new FileReader(file);
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();
    }
}
