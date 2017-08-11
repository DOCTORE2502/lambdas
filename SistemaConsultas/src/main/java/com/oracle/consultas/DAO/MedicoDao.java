
package com.oracle.consultas.DAO;

import com.oracle.consultas.model.Medico;
import java.util.List;

public interface MedicoDao {
    public void crearMedico(Medico medico);
    
    public void EliminarMedico(Medico medico);
    
    public void modificarMedico(Medico medico);
    
    public Medico buscarMedico(Medico medico);
    
    public List<Medico> listarMedicos(); 
}
