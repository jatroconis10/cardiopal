/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.RegistroBrazaleteDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosRegistroBrazalete;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosRegistroBrazalete implements IServiciosRegistroBrazalete {

    private List<RegistroBrazaleteDTO> registroBrazaletes;
    public ServiciosRegistroBrazalete()
            {
                registroBrazaletes = new ArrayList<RegistroBrazaleteDTO>();
            }
    @Override
    public RegistroBrazaleteDTO getRegistroBrazalete(Long idRegistroBrazalete) {
        return registroBrazaletes.get(idRegistroBrazalete.intValue() );
    }

    @Override
    public RegistroBrazaleteDTO updateRegistroBrazalete(RegistroBrazaleteDTO registroBrazalete) {
        RegistroBrazaleteDTO registroBrazaleteViejo = registroBrazaletes.get( registroBrazalete.getId().intValue());
        
        registroBrazaleteViejo.setFecha(registroBrazalete.getFecha());
        registroBrazaleteViejo.setHistorial(registroBrazalete.getHistorial());
        registroBrazaleteViejo.setRitmo(registroBrazalete.getRitmo());
        return registroBrazaleteViejo;
        
    }

    @Override
    public void deleteRegistroBrazalete(Long idRegistroBrazalete) {
        
        registroBrazaletes.remove( idRegistroBrazalete.intValue());
    }

    @Override
    public RegistroBrazaleteDTO createRegistroBrazalete(RegistroBrazaleteDTO registroBrazalete) {
        
        if(registroBrazalete.getId() == null)
        {
            Long idNuevo = new Long(registroBrazaletes.size());
            registroBrazalete.setId(idNuevo);
        }
        registroBrazaletes.add(registroBrazalete);
        return registroBrazalete;
        
    }

    @Override
    public List<RegistroBrazaleteDTO> getAll() {

       return registroBrazaletes;

    }
    
}
