package com.att.atnctes.client;

import com.att.atnctes.bean.Cliente;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ClienteTest {
    BigInteger saldo;
    BigDecimal nomina;
    public static void main(String [] args){

        /*Cliente juan = new Cliente();*/
        Cliente juan = new Cliente(1,"Juan","Flores Flores",29,1500);
        Cliente pepe = new Cliente(2,"Jose","Juarez Lopez",30);
        
        System.out.println(":: "+ juan);
        System.out.println(":: "+ pepe);
    }
    
}
