/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class HistorialDTO {

    
    
    private Long id;
    private List<EntradaHistorialDTO> entradas;
    private List<SensorEstresDTO> medicionesEstres;
    private List<SensorFreqDTO> medicionesFreq;
    private List<SensorPresionDTO> medicionesPres;

    public HistorialDTO()
    {
        medicionesEstres = new ArrayList();
        medicionesFreq = new ArrayList();
        medicionesPres = new ArrayList();
        entradas = new ArrayList();
    }
    public HistorialDTO(Long id) {
        this.id = id;
        medicionesEstres = new ArrayList();
        medicionesFreq = new ArrayList();
        medicionesPres = new ArrayList();
        entradas = new ArrayList();
    }
    
    public List<EntradaHistorialDTO> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<EntradaHistorialDTO> entradas) {
        this.entradas = entradas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SensorEstresDTO> getMedicionesEstres() {
        return medicionesEstres;
    }

    public void setMedicionesEstres(List<SensorEstresDTO> medicionesEstres) {
        this.medicionesEstres = medicionesEstres;
    }

    public List<SensorFreqDTO> getMedicionesFreq() {
        return medicionesFreq;
    }

    public void setMedicionesFreq(List<SensorFreqDTO> medicionesFreq) {
        this.medicionesFreq = medicionesFreq;
    }

    public List<SensorPresionDTO> getMedicionesPres() {
        return medicionesPres;
    }

    public void setMedicionesPres(List<SensorPresionDTO> medicionesPres) {
        this.medicionesPres = medicionesPres;
    }
}
