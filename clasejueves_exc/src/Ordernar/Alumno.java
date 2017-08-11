
package Ordernar;

public class Alumno implements Comparable<Alumno>{
    public String nombre;
    public String apellido;
    public Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    
    @Override
    public int compareTo(Alumno t) {
        //return nombre.compareTo(t.nombre);
        //return edad.compareTo(t.edad);
        
        //String a = new String(String.valueOf(this.getEdad()) + this.getNombre());
        //String b = new String(String.valueOf(t.getEdad()) + t.getNombre());
        String a = new String(String.valueOf( this.getNombre()+ this.getEdad()));
        String b = new String(String.valueOf(t.getNombre() +t.getEdad()));
        return a.compareTo(b);
    }

    @Override
    public String toString() {

        
        return "Alumno{" + "Nombre: " + nombre + " | Apellido: " + apellido + " | Edad: " + edad + '}';
    }
    
}
