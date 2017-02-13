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
    
    public EntradaHistorialDTO getEntradaHistorial(Long idEntradaHistorial);
    public EntradaHistorialDTO updateEntradaHistorial(EntradaHistorialDTO entrada);
    public void deleteEntradaHistorial(Long idEntradaHistorial);
    public EntradaHistorialDTO createEntradaHistorial(EntradaHistorialDTO entrada);
    public List<EntradaHistorialDTO> getAll();
}
