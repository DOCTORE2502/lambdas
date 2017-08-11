package com.att.atnctes.bean;

import java.util.logging.Logger;

public class Cliente {
    public int id;    
    public String nombre;
    public String apellidos;
    public int edad;    
    public float saldo;
    
    private final static Logger LOG = Logger.getLogger(Cliente.class.getName());

    public Cliente(int id,String nombre, String apellidos, int edad, float saldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.saldo = saldo;
    }
    
    public Cliente(int id,String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    
    public float consultaSaldo(int id){
        this.saldo = consultarDAO(id);
        return this.saldo;
    }
    private float consultarDAO(int id ){
        return 100.5f;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Id: " + id + " | Nombre: " + nombre + " | Apellidos: " + apellidos + " | Edad: " + edad + " | Saldo: " + saldo + '}';
    }
    
}
