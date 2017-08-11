
package com.att.atnctes.client;

import com.att.atnctes.bean.Persona;

public class Ternario {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.edad = 17;
        /*
        if (){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es Menor de edad");
        }
                
        boolean esMayorEdad = persona.edad > 18 ? true:false;
        System.out.println("Es mayor de edad :" + esMayorEdad);
        */
        String esMayor = persona.edad > 18 ? "Cierto":"Falso";
        System.out.println("Es mayor de edad :" + esMayor);
    }
            
}
