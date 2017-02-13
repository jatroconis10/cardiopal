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
public class RegistroBrazaleteDTO {
    
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HistorialDTO getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialDTO historial) {
        this.historial = historial;
    }
    private long ritmo;
    private Date        fecha;
    private HistorialDTO        historial;
    
    public RegistroBrazaleteDTO()
    {
        
    }

    public long getRitmo() {
        return ritmo;
    }

    public void setRitmo(long ritmo) {
        this.ritmo = ritmo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    
}
