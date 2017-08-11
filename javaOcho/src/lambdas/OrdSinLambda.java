
package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdSinLambda {

    public static void main(String[] args) {
        List<Persona> clientes = new ArrayList<Persona>();
        clientes.add(new Persona("Alberto"));
        clientes.add(new Persona("Samuel"));
        clientes.add(new Persona("Miguel"));
        clientes.add(new Persona("Yesica"));
        
        /*
        Collections.sort(clientes, new Comparator<Persona>(){
            @Override
            public int compare(Persona o1,Persona o2){
                return o1.nombre.compareTo(o2.nombre);
            }
            
        });
        */
        
        Collections.sort(clientes,(Persona p1, Persona p2) -> p1.nombre.compareTo(p2.nombre));
        
        for(Persona cliente : clientes){
            System.out.println(cliente);
        }
    }
    
}
