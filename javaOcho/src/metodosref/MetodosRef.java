
package metodosref;

import java.util.Arrays;
import java.util.Comparator;

public class MetodosRef {
    public static void main(String[] args) {
        MetodosRef.refMetodosObj();
    }
    
    public static void refMetodosObj(){
        String[] nombres = {"Sergay","Bacilio","Guarura","Rokie","Vampiro Gay"};
        
        /*
        Arrays.sort(nombres, new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                return o1.compareToIgnoreCase(o2);
            }
        });
        */
        Arrays.sort(nombres ,String :: compareToIgnoreCase);
        
        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }
    
    public void refMetododoPart(){
        
    }
    
    public void refMetodoContr(){
        IPersona iper = Persona ::new;
        Persona per = iper.crear(1, "Felipe Ferras");
        
        System.out.println(per);
    }
}
