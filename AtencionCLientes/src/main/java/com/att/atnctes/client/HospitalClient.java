
package com.att.atnctes.client;

import com.att.atnctes.bean.Medico;
import com.att.atnctes.bean.Odontologo;

public class HospitalClient {
    public static void main (String[] args){
        Medico doctorSimi = new Medico();
        
        Odontologo odontologo  = new Odontologo();
        
        if (odontologo instanceof Medico){
            System.out.println("El Odontologo SI es un Medico");
        }else{
            System.out.println("El Odontologo NO es un Medico");
        }
    }
}
