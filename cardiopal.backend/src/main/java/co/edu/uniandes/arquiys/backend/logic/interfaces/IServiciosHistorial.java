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
    
    public HistorialDTO getHistorial(int idHistorial);
    public HistorialDTO updateHistorial(int idHistorial);
    public void deleteHistorial(int idHistorial);
    public HistorialDTO createHistorial();
    public List<HistorialDTO> getAll();
}
