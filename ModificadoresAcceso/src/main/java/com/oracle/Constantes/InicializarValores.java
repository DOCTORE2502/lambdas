
package com.oracle.Constantes;


public class InicializarValores {
    private static final boolean [] switches = new boolean[5];
    static{
       System.out.println("Iniciando Valores...............");
       for (int i=0; i<5; i++){
           switches[i] = true;
       }
    }
    public static void main(String[] args){
        System.out.println("VALORES INICIALES");
        for(boolean swit1:switches){
            System.out.println(swit1);
        }
        System.out.println("SE CAMBIAN VALORES");
        switches[1] = false;
        switches[4] = false;
        System.out.println("VALORES MODIFICADOS");
        for(boolean swit:switches){
            System.out.println(swit);
        }
    }
}
