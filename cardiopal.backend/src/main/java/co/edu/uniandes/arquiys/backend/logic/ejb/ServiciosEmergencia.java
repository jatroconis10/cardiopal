/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.EmergenciaDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosEmergencia;
import java.util.List;

/**
 *
 * @author ce.gonzalez13
 */
public class ServiciosEmergencia implements IServiciosEmergencia {

    @Override
    public EmergenciaDTO getEmergencia(int idEmergencia) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
    }

    @Override
    public EmergenciaDTO updateEmergencia(int idEmergencia) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEmergencia(int idEmergencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmergenciaDTO createEmergencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EmergenciaDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
