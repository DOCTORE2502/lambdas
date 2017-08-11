
package colecciones;

import java.util.ArrayList;
import java.util.List;

public class ListPerformance {
    public static void main(String[] args) {
        long inicio01 = System.nanoTime();
        List<Integer> lista = new ArrayList<Integer>();
        for(int i=0; i < 1000000; i++){
            lista.add(i);
        }
        long fin01 = System.nanoTime();
        System.out.println("Inicio Uno:");
        System.out.println(fin01- inicio01);
        
        
        
        long inicio02 = System.nanoTime();
        List<Integer> lista02 = new ArrayList<Integer>();
        for(int i=0; i < 1000000; i++){
            lista.add(i);
        }
        long fin02 = System.nanoTime();
        System.out.println("Inicio Dos:");
        System.out.println(fin02- inicio02);
        
        
        
    }
}