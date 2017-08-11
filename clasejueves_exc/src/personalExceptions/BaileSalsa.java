
package personalExceptions;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static personalExceptions.BaileSalsa.validarEntrar;

public class BaileSalsa {
    
    public static void main(String[] args) throws MyException {
        try{
            validarEntrar("Felipe",15);
        }catch(MyException ex){
            JOptionPane.showMessageDialog(null, "Codigo de Error: " + ex.getCode() + " | " + ex.getDescription() 
                    + " | " + DateFormat.getDateInstance().format(ex.getDate()));
        }
    }
    
    public static boolean validarEntrar(String nombre,int edad) throws MyException {
        boolean esMayor = false;
        if (edad >= 18){
            esMayor = true;
            System.out.println("Bienvenido: " + nombre);
        }else{
            //throw new MyException("Estas CHAVO");
            throw new MyException(15, "Esta muy joven este Chavo", new Date(), "NO LODEJEN ENTRAR");
        }
        return esMayor;
    }
}
