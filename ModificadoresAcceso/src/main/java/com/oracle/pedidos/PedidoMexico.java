
package com.oracle.pedidos;

import static com.oracle.pedido.enums.Paises.*;

public class PedidoMexico extends Pedido {

    @Override
    protected void calcularIva() {
        this.pais = "Mexico";
        importeIVA = importeSinIVA* MEXICO.getIva();
    }
    
}
