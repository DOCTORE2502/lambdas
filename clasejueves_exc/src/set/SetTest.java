
package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
    
        lista.add("c");
        lista.add("b");
        lista.add("c");
        lista.add("b");
        lista.add("c");
        lista.add("a");
        lista.add("a");
        lista.add("a");
        lista.add("w");
        lista.add("h");
        lista.add("z");

        for(String list : lista){
            System.out.println(list);
        }
        
    }

}
