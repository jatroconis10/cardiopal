/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.dto;

/**
 *
 * @author Ricardo
 */
public class MarcapasoDTO {
    
     private long Id;
     private long ritmoAct;
     private long frecuencia;
     private final PacienteDTO usuario;

    public MarcapasoDTO(PacienteDTO usuario)
    {
        this.usuario = usuario;
    }
       public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }
      public long getRitmoAct() {
        return ritmoAct;
    }
      
    public long getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(long frecuencia) {
        this.frecuencia = frecuencia;
    }
     public PacienteDTO getUsuario() {
        return usuario;
    }

    
}
