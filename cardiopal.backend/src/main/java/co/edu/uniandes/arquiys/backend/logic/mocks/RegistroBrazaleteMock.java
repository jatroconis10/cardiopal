/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.dto.RegistroBrazaleteDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class RegistroBrazaleteMock {

private List<RegistroBrazaleteDTO> registroBrazaletes;
    public RegistroBrazaleteMock()
            {
                registroBrazaletes = new ArrayList<RegistroBrazaleteDTO>();
            }
    public RegistroBrazaleteDTO getRegistroBrazalete(Long idRegistroBrazalete) {
        return registroBrazaletes.get(idRegistroBrazalete.intValue() );
    }

    public RegistroBrazaleteDTO updateRegistroBrazalete(RegistroBrazaleteDTO registroBrazalete) {
        RegistroBrazaleteDTO registroBrazaleteViejo = registroBrazaletes.get( registroBrazalete.getId().intValue());
        
        registroBrazaleteViejo.setFecha(registroBrazalete.getFecha());
        registroBrazaleteViejo.setHistorial(registroBrazalete.getHistorial());
        registroBrazaleteViejo.setRitmo(registroBrazalete.getRitmo());
        return registroBrazaleteViejo;
        
    }

    public void deleteRegistroBrazalete(Long idRegistroBrazalete) {
        
        registroBrazaletes.remove( idRegistroBrazalete.intValue());
    }

    public RegistroBrazaleteDTO createRegistroBrazalete(RegistroBrazaleteDTO registroBrazalete) {
        
        if(registroBrazalete.getId() == null)
        {
            Long idNuevo = new Long(registroBrazaletes.size());
            registroBrazalete.setId(idNuevo);
        }
        registroBrazaletes.add(registroBrazalete);
        return registroBrazalete;
        
    }

    public List<RegistroBrazaleteDTO> getAll() {

       return registroBrazaletes;

    }
    
}
