/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.HistorialDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosHistorial;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosHistorial implements IServiciosHistorial {

    private List<HistorialDTO> historials;
    public ServiciosHistorial()
            {
                historials = new ArrayList<HistorialDTO>();
            }
    @Override
    public HistorialDTO getHistorial(Long idHistorial) {
        return historials.get(idHistorial.intValue() );
    }

    @Override
    public HistorialDTO updateHistorial(HistorialDTO historial) {
        HistorialDTO historialViejo = historials.get( historial.getId().intValue());
        
        historialViejo.setEntradas(historial.getEntradas());
        return historialViejo;
        
    }

    @Override
    public void deleteHistorial(Long idHistorial) {
        
        historials.remove( idHistorial.intValue());
    }

    @Override
    public HistorialDTO createHistorial(HistorialDTO historial) {
        
        if(historial.getId() == null)
        {
            Long idNuevo = new Long(historials.size());
            historial.setId(idNuevo);
        }
        historials.add(historial);
        return historial;
        
    }

    @Override
    public List<HistorialDTO> getAll() {

       return historials;

    }
    
}
