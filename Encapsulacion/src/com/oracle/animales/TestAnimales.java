package com.oracle.animales;

class Animal{
    String nombre;
    public Animal(String nombre){
        this.nombre = nombre;
    }
    Animal reproducirse(Animal a){
        Animal hijo = new Animal(nombre);
        return hijo;
    }
}

class Gato extends Animal{
    public Gato(String nombre){
        super(nombre);
    }

    @Override
    Animal reproducirse(Animal animalG) {
        Gato gato = null;
        if(!(animalG instanceof Gato)) {
            System.out.println("No se puede Reproducir");
        }else{
             gato = new Gato("Gato BB");
        }
        return gato;
    }
}

class Perro extends Animal{
    public Perro(String nombre){
        super(nombre);
    }

    @Override
    Animal reproducirse(Animal animalP) {
        Gato gato = null;
        if(!(animalP instanceof Gato)) {
            System.out.println("No se puede Reproducir");
        }else{
             gato = new Gato("Perro BB");
        }
        return gato;
    }
}
    





public class TestAnimales {
    public static void main(String[] args){
        Perro p = new Perro("Coraje");
        Gato g = new Gato("Garfield");
        
        System.out.println("Nuevo Animal:" + g.reproducirse(p)); 
    }
}
