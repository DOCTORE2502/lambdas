
package com.att.atnctes.client;

import com.att.atnctes.bean.Persona;

public class Swicth {
    public static void main(String[] args){
        Persona persona = new Persona();
        
        persona.edad = 18;
        persona.nombre = "Juan";
        
        switch (persona.nombre){
            case "Alberto":
                System.out.println("Mi nombre es ALBERTO");
                break;
            case "Juan":
                System.out.println("Mi nombre es JUAN");
                break;
            default:
                System.out.println("NO TE CONOZCO");
        }
    }
}
