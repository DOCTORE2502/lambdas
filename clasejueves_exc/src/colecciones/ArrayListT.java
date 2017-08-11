
package colecciones;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListT {
    public static void main(String[] args) {
        /*
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona("Miguel","Angel"));
        personas.add(new Persona("David","Lopez"));
        personas.add(new Persona("Peter","Grifind"));
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(9);
        arrayList.add(23);
        arrayList.add(300);
        
        System.out.println(arrayList.size());
        
        System.out.println("Sin Ordenar: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Sin Ordenar: " + arrayList);
        */
        
        ArrayList personas = new ArrayList();
        
        Persona pepe = new Persona("Emilio","Varela");
        
        Profesor profe = new Profesor();
        profe.name = "Joel";
        profe.lastName = "Perez";
        profe.especialidad = "Fisico";
        
        personas.add(pepe);
        personas.add(profe);
        
        for (Object persona : personas){
            System.out.println(persona);
        }
        
        Iterator iterar = personas.iterator();
        while (iterar.hasNext()){
            System.out.println("Iterator");
            System.out.println(iterar.next());
        }
    }

}
