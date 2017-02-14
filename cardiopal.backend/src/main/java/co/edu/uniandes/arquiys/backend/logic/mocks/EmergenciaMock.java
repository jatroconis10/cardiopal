/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.dto.EmergenciaDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class EmergenciaMock  {


    private List<EmergenciaDTO> emergencias;
    public EmergenciaMock()
            {
                emergencias = new ArrayList<EmergenciaDTO>();
            }
    public EmergenciaDTO getEmergencia(Long idEmergencia) {
        return emergencias.get(idEmergencia.intValue() );
    }

    public EmergenciaDTO updateEmergencia(EmergenciaDTO emergencia) {
        EmergenciaDTO emergenciaViejo = emergencias.get( emergencia.getId().intValue());
        
        emergenciaViejo.setDescripcion(emergencia.getDescripcion());
        return emergenciaViejo;
        
    }

    public void deleteEmergencia(Long idEmergencia) {
        
        emergencias.remove( idEmergencia.intValue());
    }

    public EmergenciaDTO createEmergencia(EmergenciaDTO emergencia) {
        
        if(emergencia.getId() == null)
        {
            Long idNuevo = new Long(emergencias.size());
            emergencia.setId(idNuevo);
        }
        emergencias.add(emergencia);
        return emergencia;
        
    }

    public List<EmergenciaDTO> getAll() {

       return emergencias;

    }
    
    
}
