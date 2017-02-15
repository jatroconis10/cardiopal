/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.dto.HistorialDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class HistorialMock {

private List<HistorialDTO> historials;
    public HistorialMock()
            {
                historials = new ArrayList<HistorialDTO>();
            }
    public HistorialDTO getHistorial(Long idHistorial) {
        return historials.get(idHistorial.intValue() );
    }

    public HistorialDTO updateHistorial(HistorialDTO historial) {
        HistorialDTO historialViejo = historials.get( historial.getId().intValue());
        
        historialViejo.setEntradas(historial.getEntradas());
        return historialViejo;
        
    }

    public void deleteHistorial(Long idHistorial) {
        
        historials.remove( idHistorial.intValue());
    }

    public HistorialDTO createHistorial(HistorialDTO historial) {
        
        if(historial.getId() == null)
        {
            Long idNuevo = new Long(historials.size());
            historial.setId(idNuevo);
        }
        historials.add(historial);
        return historial;
        
    }

    public List<HistorialDTO> getAll() {

       return historials;

    }
    
}
