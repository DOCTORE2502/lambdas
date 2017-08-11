
package com.oracle.pedidos;

public abstract class Pedido {
    protected String pais;
    protected double importeSinIVA;
    protected double importeIVA;
    protected double importeConIVA;
    
    protected abstract void calcularIva();
    
    protected void calcularPerecioConIva(){
        this.calcularIva();
        importeConIVA = importeSinIVA + importeIVA;
    }
    
    public void setImporteSinIVA(double importeSinIva){
        this.importeSinIVA = importeSinIva;
    }
    
    public void visualiza(){
        System.out.println("Pedido: " + pais);
        System.out.println("Importe sin IVA: " + importeSinIVA);
        System.out.println("Importe sin IVA: " + importeIVA);
        System.out.println("Importe con IVA: " + importeConIVA);
    }
    

}
