package com.oracle.consultas.controller;

import com.oracle.consultas.DAO.MedicoDAOImpl;
import com.oracle.consultas.DAO.MedicoDao;
import com.oracle.consultas.model.Medico;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean
@RequestScoped
public class MedicoBean {
    private Medico medico = new Medico();

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public void registrar(){
        MedicoDao dao = new MedicoDAOImpl();
        dao.crearMedico(this.medico);
    }
}
