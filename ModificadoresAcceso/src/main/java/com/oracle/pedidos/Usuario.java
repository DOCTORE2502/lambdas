
package com.oracle.pedidos;

public class Usuario {
    public static void main(String[] args) {
        Pedido pedidoMEX = new PedidoMexico();
        pedidoMEX.setImporteSinIVA(10000);
        pedidoMEX.calcularPerecioConIva();
        pedidoMEX.visualiza();
        
        Pedido pedidoESP = new PedidoEspania();
        pedidoESP.setImporteSinIVA(10000);
        pedidoESP.calcularPerecioConIva();
        pedidoESP.visualiza();
    }
}
