
package com.oracle.pedidos;

import static com.oracle.pedido.enums.Paises.*;


public class PedidoEspania extends Pedido {

    @Override
    protected void calcularIva() {
        this.pais = "España";
        importeIVA = importeSinIVA * ESPAÑA.getIva();
    }
}
    
