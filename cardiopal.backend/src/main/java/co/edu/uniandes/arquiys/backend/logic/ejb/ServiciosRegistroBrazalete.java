/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.RegistroBrazaleteDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosRegistroBrazalete;
import co.edu.uniandes.arquiys.backend.logic.mocks.RegistroBrazaleteMock;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosRegistroBrazalete implements IServiciosRegistroBrazalete {

    private RegistroBrazaleteMock mock;
    public ServiciosRegistroBrazalete()
            {
                mock = new RegistroBrazaleteMock();
            }
    @Override
    public RegistroBrazaleteDTO getRegistroBrazalete(Long idRegistroBrazalete) {
        return mock.getRegistroBrazalete(idRegistroBrazalete);
    }

    @Override
    public RegistroBrazaleteDTO updateRegistroBrazalete(RegistroBrazaleteDTO registroBrazalete) {
        return mock.updateRegistroBrazalete(registroBrazalete);
    }

    @Override
    public void deleteRegistroBrazalete(Long idRegistroBrazalete) {
        
        mock.deleteRegistroBrazalete(idRegistroBrazalete);
    }

    @Override
    public RegistroBrazaleteDTO createRegistroBrazalete(RegistroBrazaleteDTO registroBrazalete) {
        
        return mock.createRegistroBrazalete(registroBrazalete);
    }

    @Override
    public List<RegistroBrazaleteDTO> getAll() {

       return mock.getAll();

    }
    
}
