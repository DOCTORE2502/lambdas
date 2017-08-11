
package com.oracle.abstracclass;

// IS-A
public class TeleVision extends LineaBlanca{
    //HAS_A
    public ControlRemotoUni controlRemoto;
    
    @Override
    public void tareaDomestica() {
        System.out.println("Ver NetFlix");
    }

    @Override
    public void encender() {
        //controlRemoto.combinacion("Sony");
        System.out.println("Encender como TV");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar cuando te quedas dormido :P");
    }


    
}
