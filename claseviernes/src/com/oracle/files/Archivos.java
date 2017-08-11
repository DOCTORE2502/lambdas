
package com.oracle.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/HP/Desktop/MS769K/TestFile/Registro.txt");
        char[] in = new char[36];
        /*
        if(!file.exists()){
            try {
                if(file.createNewFile()){
                    System.out.println("Se creo Exitosamente");
                }else{
                    System.out.println("No se creo el archivo");
                }
                    
            } catch (IOException ex) {
                System.out.println("No se creo el archivo");
                ex.printStackTrace();
            }
        }else{
            System.out.println("El archivo ya existe");
        }
        
        
        FileWriter fw = new FileWriter(file);
        
        fw.write("Articulo: TV \r\n Precio: $50,000.00");
        
        fw.flush();
        fw.close();
        */
        FileReader fr = new FileReader(file);
        
        
        int size = fr.read(in);
        
        in = new char[size];
        
        System.out.println(size + "-- INICIO READER ");
        
        System.out.println(in);
        for(char c : in){
            System.out.println(c);
            fr.close();
        }
        
    }//psvm
}// Archivos
