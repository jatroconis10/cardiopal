/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.CitaDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosCita;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosCita implements IServiciosCita {

    private List<CitaDTO> citas;
    public ServiciosCita()
            {
                citas = new ArrayList<CitaDTO>();
            }
    @Override
    public CitaDTO getCita(Long idCita) {
        return citas.get(idCita.intValue() );
    }

    @Override
    public CitaDTO updateCita(CitaDTO cita) {
        CitaDTO citaViejo = citas.get( cita.getId().intValue());
        
        citaViejo.setFecha(cita.getFecha());
        citaViejo.setUsuario(cita.getUsuario());
        return citaViejo;
        
    }

    @Override
    public void deleteCita(Long idCita) {
        
        citas.remove( idCita.intValue());
    }

    @Override
    public CitaDTO createCita(CitaDTO cita) {
        
        if(cita.getId() == null)
        {
            Long idNuevo = new Long(citas.size());
            cita.setId(idNuevo);
        }
        citas.add(cita);
        return cita;
        
    }

    @Override
    public List<CitaDTO> getAll() {

       return citas;

    }
    
}
