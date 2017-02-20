/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.dto;

import java.util.List;

/**
 * agregar quitar medico,consejo,cita
 * @author ja.troconis10
 */
public class PacienteDTO {

    private String nombre;
    private Long Id;
    private BrazaleteDTO brazalete;
    private List<MedicoDTO>  medicos;
    private List<CitaDTO>  citas;
    private List<ConsejoDTO>  consejos;
    private List<EmergenciaDTO> emergencias;
    private HistorialDTO historial;
    
    
    
    //-----------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------

    /**
     * Constructor de la clase (sin argumentos)
     */
    public PacienteDTO()
    {

    }

      public PacienteDTO(Long id, String nombre) {
        this.nombre = nombre;
        this.Id = id;
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    public String getNombre() {
        return nombre;
    }
      
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
     
     public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }
     public BrazaleteDTO getBrazalete() {
        return brazalete;
    }

    public void setBrazalete(BrazaleteDTO brazalete) {
        this.brazalete = brazalete;
    }
     public List<MedicoDTO> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<MedicoDTO> medicos) {
        this.medicos = medicos;
    }

    public List<CitaDTO> getCitas() {
        return citas;
    }

    public void setCitas(List<CitaDTO> citas) {
        this.citas = citas;
    }

    public List<ConsejoDTO> getConsejos() {
        return consejos;
    }

    public void setConsejos(List<ConsejoDTO> consejos) {
        this.consejos = consejos;
    }

    public List<EmergenciaDTO> getEmergencias() {
        return emergencias;
    }

    public HistorialDTO getHistorial() {
        return historial;
    }


}
