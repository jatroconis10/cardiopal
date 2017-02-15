/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.dto.CitaDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class CitaMock  {

 private List<CitaDTO> citas;
    public CitaMock()
            {
                citas = new ArrayList<CitaDTO>();
            }
    public CitaDTO getCita(Long idCita) {
        return citas.get(idCita.intValue() );
    }

    public CitaDTO updateCita(CitaDTO cita) {
        CitaDTO citaViejo = citas.get( cita.getId().intValue());
        
        citaViejo.setFecha(cita.getFecha());
        citaViejo.setUsuario(cita.getUsuario());
        return citaViejo;
        
    }

    public void deleteCita(Long idCita) {
        
        citas.remove( idCita.intValue());
    }

    public CitaDTO createCita(CitaDTO cita) {
        
        if(cita.getId() == null)
        {
            Long idNuevo = new Long(citas.size());
            cita.setId(idNuevo);
        }
        citas.add(cita);
        return cita;
        
    }

    public List<CitaDTO> getAll() {

       return citas;

    }
}
