
package colecciones;

public class Profesor extends Persona {
   public String especialidad;

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastName=" + lastName + ", Especialidad=" + especialidad + '}';
    }
}
