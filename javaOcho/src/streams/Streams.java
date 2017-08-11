
package streams;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    private List<String> lista;
    private List<String> numeros;
    
    public static void main(String[] args) {
        Streams  streams = new Streams();
        streams.filtrar();
    }
    
        
    public Streams(){
        lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Amador");
        lista.add("Pepe");
        
        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
    }
    public void filtrar(){
        lista.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
    }
    public void ordenar(){
        lista.stream().sorted((x,y) -> x.compareTo(x)).forEach(System.out::println);
    }
    
    public void limit(){
        lista.stream().limit(0);
    }
}
