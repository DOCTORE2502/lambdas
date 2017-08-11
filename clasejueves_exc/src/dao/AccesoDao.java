
package dao;

public class AccesoDao {
    public void conectarBd() throws Exception{
        try{
            System.out.println("Intentando Conectar");
            throw new Exception("La URL es INCORRECTA");
        }catch(Exception e){
            throw new Exception(e);
        }
        
    }
}
