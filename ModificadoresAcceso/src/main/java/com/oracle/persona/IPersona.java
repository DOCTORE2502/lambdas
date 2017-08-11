
package com.oracle.persona;

public interface  IPersona{
    
    String NACIONALIDAD = "MEXICANA";
    
    public void comer(String comida);
    public void dormir(String persona);
    
    public default void caminar(String calle){
        System.out.println("Caminando por la Calle: " + calle);
    }
    
}
