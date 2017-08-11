
package service;

import dao.AccesoDao;

public class Service {
    public static void main(String[] args) {
        try{
            Service.conectarOracle("url:ORACLE");
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    
    public static void conectarOracle(String url) throws Exception{
        AccesoDao dao = new AccesoDao();
     
        dao.conectarBd(); 
    }
}
