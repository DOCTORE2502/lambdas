
package com.oracle.abstracclass;

public class Lavadora extends LineaBlanca{

    @Override
    public void tareaDomestica() {
        System.out.println("Lavar Ropa");
    }

    @Override
    public void encender() {
        System.out.println("Encendido Automatico");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar cuando Termina");
    }
    
}
