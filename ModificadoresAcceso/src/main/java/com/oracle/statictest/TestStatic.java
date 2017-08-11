
package com.oracle.statictest;

import com.oracle.util.Herramientas;
import java.util.Date;

public class TestStatic {
    static String nombre;
    
    public static void main(String[] args){
        /*
        Herramientas herra = new Herramientas();
        System.out.println("Fecha: " + herra.getFecha("12/12/2012"));
        */
        Date fecha  = Herramientas.getFecha("10/12/2017");
        System.out.println("Fecha: " + fecha);
    }
}
