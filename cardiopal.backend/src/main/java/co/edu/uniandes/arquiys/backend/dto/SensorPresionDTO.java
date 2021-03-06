/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.dto;

import java.util.Date;

/**
 *
 * @author sf.munera10
 */
public class SensorPresionDTO {
    
    public static final String NORMAL = "NORMAL";
    
    public static final String PREHIPERTENSION = "PREHIPERTENSION";
    
    public static final String HIPERTENSION_SIS_ALTA = "HIPERTENSION_SIS_ALTA";
    
    public static final String ALTA = "HIPERTENSION_SIS_ALTA";
    
    private Long id;
    
    private int presionDiastolica;
    
    private int presionSistolica;
    
    private Date fecha;
    
    private String estado;
    
    public SensorPresionDTO(){
        
    }

    public SensorPresionDTO(Long id, int presionDiastolica, int presionSistolica, Date fecha) {
        this.id = id;
        this.presionDiastolica = presionDiastolica;
        this.presionSistolica = presionSistolica;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the presionDiastolica
     */
    public int getPresionDiastolica() {
        return presionDiastolica;
    }

    /**
     * @param presionDiastolica the presionDiastolica to set
     */
    public void setPresionDiastolica(int presionDiastolica) {
        this.presionDiastolica = presionDiastolica;
    }

    /**
     * @return the presionSistolica
     */
    public int getPresionSistolica() {
        return presionSistolica;
    }

    /**
     * @param presionSistolica the presionSistolica to set
     */
    public void setPresionSistolica(int presionSistolica) {
        this.presionSistolica = presionSistolica;
    }
}
