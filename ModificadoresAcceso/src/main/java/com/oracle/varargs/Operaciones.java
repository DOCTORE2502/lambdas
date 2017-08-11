package com.oracle.varargs;

public class Operaciones {
    /*
    public float promedio(int... calificaciones){
        int suma = 0;
        
        for (int calificacion : calificaciones){
            suma += calificacion; // suma = suma + calificacion;
        }
        return (float) suma / calificaciones.length;
    }
        
    
    public static void main(String[] args){
        Operaciones op = new Operaciones();
        float promedio = op.promedio(1,9,2,8,3,7,4,6,5);
        System.out.println("Promedio: " + promedio);
    }
    */
    /*
     public static void main(String[] args){
        
         int suma = 0;
         for (String calificacion : args){
             suma += Integer.parseInt(calificacion);
         }
        System.out.println("Promedio: " + (float) suma / args.length);
    }
*/
     public static void main(String[] args){
        
         Operaciones op = new Operaciones ();
         op.calcularCalificaciones("Saul", "Boxeo", 10,10,9,9,10);
    }
     public void calcularCalificaciones( String nombreAlumno, String carrera, int... calificaciones){
         System.out.println("Alumno: " + nombreAlumno);
         System.out.println("Carrera: " + carrera);
         for (int calificacion : calificaciones){
             System.out.println("Calificaciones: " + calificacion);
         }
         
     }
}
