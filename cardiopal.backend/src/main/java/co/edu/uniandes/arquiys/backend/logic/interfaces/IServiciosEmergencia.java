/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.EmergenciaDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosEmergencia {
    
    public EmergenciaDTO getEmergencia(Long idEmergencia);
    public EmergenciaDTO updateEmergencia(EmergenciaDTO emergencia);
    public void deleteEmergencia(Long idEmergencia);
    public EmergenciaDTO createEmergencia(EmergenciaDTO emergencia);
    public List<EmergenciaDTO> getAll();
}
