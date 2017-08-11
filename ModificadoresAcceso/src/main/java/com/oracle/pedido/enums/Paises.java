
package com.oracle.pedido.enums;

public enum Paises {
    MEXICO(0.16f),
    ESPAÑA(0.21f),
    ARGENTINA(0.08f),
    PARIS(0.45f);
    private float iva;
    
    private Paises(float iva){
        this.iva = iva;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

}
