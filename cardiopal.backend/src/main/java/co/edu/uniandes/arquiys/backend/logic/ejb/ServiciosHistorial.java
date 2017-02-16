/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.HistorialDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosHistorial;
import co.edu.uniandes.arquiys.backend.logic.mocks.HistorialMock;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosHistorial implements IServiciosHistorial {


    private HistorialMock historialMock;
    public ServiciosHistorial()
            {
                historialMock = new HistorialMock();
            }
    @Override
    public HistorialDTO getHistorial(Long idHistorial) {
        return historialMock.getHistorial(idHistorial);
    }

    @Override
    public HistorialDTO updateHistorial(HistorialDTO historial) {
       return historialMock.updateHistorial(historial);
        
    }

    @Override
    public void deleteHistorial(Long idHistorial) {
        historialMock.deleteHistorial(idHistorial);
    }

    @Override
    public HistorialDTO createHistorial(HistorialDTO historial) {
        
       return historialMock.createHistorial(historial);
        
    }

    @Override
    public List<HistorialDTO> getAll() {

        return historialMock.getAll();
    }
    
}
