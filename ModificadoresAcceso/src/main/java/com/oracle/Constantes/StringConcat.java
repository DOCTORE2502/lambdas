
package com.oracle.Constantes;

public class StringConcat {
    public static  String nombre  = "Mi nombre";
    
    public static void main(String[] args) {
        //StringBuilder con;
        //StringBuffer  con2;
        StringBuilder con = new StringBuilder("Nombre,Nombre,");
        
        while(true){
            con.append("Nombre,").append("Nombre,");
            System.out.println(con);
        }
    }
}
