
package exceptions;

public class TestException {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = 0;
        // DIVISION ENTRE 0
        // c = a/b;
        
        // MAL MANEJO DEL FOR
        String[] nombres = {"Nombre 1","Nombre 2","Nombre 3"};
        try{
            for(int x=0; x<=3; x++){
                System.out.println(nombres[x]);
            }
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            if(e instanceof RuntimeException){
                    System.out.println("Error de RuntimeException");
            }
            /*
            System.out.println("Fallo tu Programa - al intentar dividir");
            System.out.println("Error: " + e);
            System.out.println("Error: " + e.getMessage());
            */
        }/*catch(ArithmeticException e){
            System.out.println("Fallo tu Programa - al intentar dividir");
            System.out.println("Error: " + e);
            System.out.println("Error: " + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Fallo tu Programa - al intentar ingresar a un posicion invalida");
            System.out.println("Error: " + e);
            System.out.println("Error: " + e.getMessage());
        }*/catch(Exception e){
            System.out.println("Fallo tu Programa");
            System.out.println("Error: " + e);
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Bloque FINALLY");
            System.out.println("Cerrando recurso");
        }
        System.out.println("Operacion Continua");
    }
    
}
