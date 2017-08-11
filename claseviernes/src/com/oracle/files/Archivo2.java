
package com.oracle.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo2 {
    public static void main(String[] args) {
        File file = new File("/Users/HP/Desktop/MS769K/TestFile/Archivo2.txt");
        try {
            FileWriter fw = new FileWriter(file);
            
            PrintWriter pw = new PrintWriter(file);
            
            pw.print("Producto: Lavadora \r\n");
            pw.print("Precio: $10,000.00 ");
            
            pw.flush();
            pw.close();
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String data = br.readLine();
            String data2 = br.readLine();
            System.out.println(data);
            System.out.println(data2);
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
