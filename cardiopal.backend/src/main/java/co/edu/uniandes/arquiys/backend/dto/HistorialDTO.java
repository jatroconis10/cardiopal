/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.dto;

import java.util.List;

/**
 *
 * @author Ricardo
 */
public class HistorialDTO {
    
    private Long id;
    private List<EntradaHistorialDTO> entradas;

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
    
    
}
