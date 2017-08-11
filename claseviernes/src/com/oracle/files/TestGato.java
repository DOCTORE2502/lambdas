
package com.oracle.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestGato {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Gato benito = new Gato();
        benito.nombre = "Benito";
        benito.raza = "Angora";
        
        
        try {
            
            FileOutputStream fm = new FileOutputStream("/Users/HP/Desktop/MS769K/TestFile/Gato.ser");
            ObjectOutputStream os = new ObjectOutputStream(fm);
            
            
            os.writeObject(benito);
            os.flush();
            os.close();
            
            
            
            FileInputStream fi = new FileInputStream("/Users/HP/Desktop/MS769K/TestFile/Gato.ser");
            ObjectInputStream obj = new ObjectInputStream(fi);
            
            Gato newGato =(Gato) obj.readObject();
            obj.close();
            
            System.out.println(newGato);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
