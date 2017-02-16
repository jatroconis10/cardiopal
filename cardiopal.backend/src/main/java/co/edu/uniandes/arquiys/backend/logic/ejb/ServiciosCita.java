/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.CitaDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosCita;
import co.edu.uniandes.arquiys.backend.logic.mocks.CitaMock;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosCita implements IServiciosCita {

    private CitaMock citaMock;
    public ServiciosCita()
            {
                citaMock = new CitaMock();
            }
    @Override
    public CitaDTO getCita(Long idCita) {
        return citaMock.getCita(idCita);
    }

    @Override
    public CitaDTO updateCita(CitaDTO cita) {
        return citaMock.updateCita(cita);
        
    }

    @Override
    public void deleteCita(Long idCita) {
        
        citaMock.deleteCita(idCita);
    }

    @Override
    public CitaDTO createCita(CitaDTO cita) {
        
       return citaMock.createCita(cita);
        
    }

    @Override
    public List<CitaDTO> getAll() {

       return citaMock.getAll();

    }
    
}
