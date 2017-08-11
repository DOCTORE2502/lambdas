
package encapsulacion;

public class Empleado {
   private String nombre;
   private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad< 0){
            System.out.println("Edad no permitida, es necesario ser mayor a 0");
        }else if(edad >= 100){
            System.out.println("Edad muy alta, Favor de visitar Atencion a Clientes");
        }else{
            System.out.println("Tu edad es " + edad);
            this.edad = edad;
        }
        this.edad = edad;
    }
   
   
}
