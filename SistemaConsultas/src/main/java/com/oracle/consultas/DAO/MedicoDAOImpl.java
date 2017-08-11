
package com.oracle.consultas.DAO;

import com.oracle.consultas.model.Medico;
import java.sql.PreparedStatement;
import java.util.List;

public class MedicoDAOImpl extends Dao implements MedicoDao{

    private String crearSql = "INSERT INTO MEDICO(CODIGO,NOMBRE,APELLIDO,ESPECIALIDAD) VALUES (?,?,?,?)";
    
    @Override
    public void crearMedico(Medico medico) {
        this.Conectar();
        try{
            PreparedStatement pst = this.getConnection().prepareStatement(crearSql);
            pst.setInt(1,medico.getCodigo());
            pst.setString(2, medico.getNombre());
            pst.setString(3, medico.getApellido());
            pst.setString(4, medico.getEspecialidad());
            
            pst.executeUpdate();
            System.out.println("Conexion EXITOSA");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Conexion FALLIDA Medico DAO");
        }finally{
            this.cerrarConexion();
        }
    }

    @Override
    public void EliminarMedico(Medico medico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarMedico(Medico medico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medico buscarMedico(Medico medico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medico> listarMedicos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
