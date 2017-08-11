
package com.oracle.files;

import java.io.Serializable;

public class Gato implements Serializable {
    
    //private static final long serialVersionUID = 00000000000;
    public String nombre;
    public String raza;

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    
}
