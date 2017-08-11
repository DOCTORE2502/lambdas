
package com.oracle.bean;

public class Persona {
    Persona padre;
    Persona madre;
    String nombre;
    char sexo;
    
    public Persona reproducirse(Persona p){
        Persona hijo = null;
        
        if (p instanceof Persona){
            System.out.println("SI es instancia");
            if(p != null){
                if(p.sexo != this.sexo){
                    hijo = new Persona();

                    switch (sexo) {
                        case 'F':
                            hijo.madre = this;
                            hijo.padre = p;
                            System.out.println("Es la MADRE");
                            break;
                        case 'M':
                            hijo.madre = p;
                            hijo.padre = this;
                            System.out.println("Es la PADRE");
                            break;
                        default:
                            System.out.println("Es el PADRE");
                            break;
                    }
                }else{
                    System.out.println("No pueden Reproducirse");
                }

            }
        }else{
            System.out.println("No es instancia");
        }
        
        return hijo;
    }
}
