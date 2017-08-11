
package com.oracle.consultas.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    public void Conectar(){
       String url = "jdbc:derby://localhost:1527/";
       String dbName = "ConsultasDB";
       String driver = "org.apache.derby.jdbc.ClientDriver";
       String userName = "root";
       String password = "root";
       try{
           Class.forName(driver).newInstance();
           connection = DriverManager.getConnection(url+dbName, userName, password);
           System.out.println("Conexion EXITOSA");
       }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
           System.out.println("Conexion FALLIDA");
       }
    }
    /*
public static void main(String[] args){
    Dao dao = new Dao();
    dao.Conectar();
}*/
    
public void cerrarConexion(){
    
    try{
        if (connection != null){
            if (connection.isClosed()){
                connection.close();;
            }
        }
    }catch(Exception e){
            e.printStackTrace();
            System.out.println("Conexion FALLIDA");
    }
}
}
