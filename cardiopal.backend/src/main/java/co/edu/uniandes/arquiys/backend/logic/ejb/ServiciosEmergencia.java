/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.EmergenciaDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosEmergencia;
import co.edu.uniandes.arquiys.backend.logic.mocks.EmergenciaMock;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosEmergencia implements IServiciosEmergencia {

    private EmergenciaMock mock;
    public ServiciosEmergencia()
            {
                mock = new EmergenciaMock();
            }
    @Override
    public EmergenciaDTO getEmergencia(Long idEmergencia) {
        return mock.getEmergencia(idEmergencia);
    }

    @Override
    public EmergenciaDTO updateEmergencia(EmergenciaDTO emergencia) {
        return mock.updateEmergencia(emergencia);
        
    }

    @Override
    public void deleteEmergencia(Long idEmergencia) {
        
        mock.deleteEmergencia(idEmergencia);
    }

    @Override
    public EmergenciaDTO createEmergencia(EmergenciaDTO emergencia) {
        
       return mock.createEmergencia(emergencia);
        
    }

    @Override
    public List<EmergenciaDTO> getAll() {

       return mock.getAll();

    }
    
}
