/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.EntradaHistorialDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosEntradaHistorial {
    
    public EntradaHistorialDTO getEntradaHistorial(int idEntradaHistorial);
    public EntradaHistorialDTO updateEntradaHistorial(int idEntradaHistorial);
    public void deleteEntradaHistorial(int idEntradaHistorial);
    public EntradaHistorialDTO createEntradaHistorial();
    public List<EntradaHistorialDTO> getAll();
}
