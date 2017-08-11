
package com.oracle.abstracclass;

public class TestCasa {
    public static void main(String[] args) {
        ElectroDomestico tv = new TeleVision();
        ElectroDomestico lava = new Lavadora();
        
        LineaBlanca lavaMabe = new Lavadora();
        LineaBlanca tvEKT = new TeleVision();
        
        //-----------------------------------
        tvEKT.encender();
        tvEKT.tareaDomestica();
        tvEKT.apagar();
        
        System.out.println("/-----------------------------------");
        lava.encender();
        lavaMabe.tareaDomestica();
        lava.apagar();
    }
    
    public void validar(ElectroDomestico electro){
        if (electro instanceof Lavadora){
            System.out.println("Es una lavadora");
            Lavadora easy = (Lavadora)electro;
        }else{
            System.out.println("No es una lavadora");
        }
        
    }
}
