package com.oracle.animales;

public class SobrecargaA {
        public static void main(String[] args){
        int edad = 18;
        String nombre = "Juan";
        float salario = 15000.20f;
        
        System.out.println("edad:" + edad); 
        System.out.println("nombre:" + nombre); 
        System.out.println("salario:" + salario); 
    }
    public static int suma(int a, int b){
        return a+b;
    }
    public static double suma(double a, double b){
        return a+b;
    }
    
    public static double dividir(double a, double b){
        return a+b;
    }
    
    public static Object multi(double a, double b){
        Integer valor = null;
        Float   valorF = null;
        Double  valorD = null;
        
        return valor;
    }
}
