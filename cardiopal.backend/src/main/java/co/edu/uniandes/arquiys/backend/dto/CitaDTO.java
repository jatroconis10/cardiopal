/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.dto;

import java.util.Date;

/**
 *
 * @author Ricardo
 */
public class CitaDTO {
    
     private Long Id;
     
     private Date fecha;
     
     private PacienteDTO usuario;

    public CitaDTO(PacienteDTO usuario)
    {
        this.usuario = usuario;
    }
       public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }
    
     public PacienteDTO getUsuario() {
        return usuario;
    }
     public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setUsuario(PacienteDTO paciente)
    {
        this.usuario = paciente;
    }
}
