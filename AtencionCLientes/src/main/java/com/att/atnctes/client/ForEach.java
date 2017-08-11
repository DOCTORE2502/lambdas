
package com.att.atnctes.client;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main (String[] args){
        /*List<String> nombres = new ArrayList<String>();
        
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        */
        String [] nombres = {"Nombre 1","Nombre 2","Nombre 3"};
        
        for (String nombre : nombres) {
            System.out.println(":: " + nombre);
        }
    }
}
