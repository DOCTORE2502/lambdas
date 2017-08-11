
package Ordernar;

import java.util.ArrayList;
import java.util.Collections;

public class TestOrder {
    public static void main(String[] args) {
        
        Alumno alu01 = new Alumno();
        alu01.nombre = "Felipe";
        alu01.apellido = "Ferras";
        alu01.edad = 18;
        
        Alumno alu02 = new Alumno();
        alu02.nombre = "Alejandro";
        alu02.apellido = "Magno";
        alu02.edad = 88;
        
        Alumno alu03 = new Alumno();
        alu03.nombre = "Abuelo";
        alu03.apellido = "Paterno";
        alu03.edad = 99;
        
        Alumno alu04 = new Alumno();
        alu04.nombre = "Alejandro";
        alu04.apellido = "Diaz";
        alu04.edad = 60;
        
        Alumno alu05 = new Alumno();
        alu05.nombre = "Abuelo";
        alu05.apellido = "Materno";
        alu05.edad = 5;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        alumnos.add(alu01);
        alumnos.add(alu02);
        alumnos.add(alu03);
        alumnos.add(alu04);
        alumnos.add(alu05);
        
        System.out.println("Sin Ordenar");
        for(Alumno alumno1 : alumnos){
            System.out.println(alumno1);
        }
        
        Collections.sort(alumnos);
        System.out.println("Lista Ordenada");
        for(Alumno alumno1 : alumnos){
            System.out.println(alumno1);
        }
    }
}
