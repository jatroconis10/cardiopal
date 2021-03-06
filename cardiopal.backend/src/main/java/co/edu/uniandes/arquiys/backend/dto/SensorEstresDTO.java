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
public class SensorEstresDTO {
    
    public static final int BAJO = 0;
    
    public static final int MEDIO = 1;
    
    public static final int ALTO = 2;
    
    private Long id;
    
    private int variabilidadCardiaca;
    
    private int tipo;
    
    private Date fecha;
    
    public SensorEstresDTO(){
        
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
     * @return the variabilidadCardiaca
     */
    public int getVariabilidadCardiaca() {
        return variabilidadCardiaca;
    }

    /**
     * @param variabilidadCardiaca the variabilidadCardiaca to set
     */
    public void setVariabilidadCardiaca(int variabilidadCardiaca) {
        this.variabilidadCardiaca = variabilidadCardiaca;
    }
}
