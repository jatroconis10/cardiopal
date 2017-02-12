/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.dto;

import java.util.List;

/**
 * agregar quitar paciente
 * @author Ricardo
 */
class MedicoDTO {
    private long id;
    private String nombre;
    private List<PacienteDTO> pacientes;

    
    public MedicoDTO()
            {
                
            }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public List<PacienteDTO> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<PacienteDTO> pacientes) {
        this.pacientes = pacientes;
    }
    
}
