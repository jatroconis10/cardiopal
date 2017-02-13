/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.HistorialDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosHistorial {
    
    public HistorialDTO getHistorial(Long idHistorial);
    public HistorialDTO updateHistorial(HistorialDTO historial);
    public void deleteHistorial(Long idHistorial);
    public HistorialDTO createHistorial(HistorialDTO historial);
    public List<HistorialDTO> getAll();
}
