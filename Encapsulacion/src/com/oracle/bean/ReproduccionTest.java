
package com.oracle.bean;

public class ReproduccionTest {
    public static void main(String[] args){
        Persona romeo = new Persona();
        romeo.nombre = "Romeo";
        romeo.sexo = 'M';

        Persona julieta = new Persona();
        julieta.nombre = "Julieta";
        julieta.sexo = 'F';
        
        romeo.reproducirse(romeo);
    }


}
