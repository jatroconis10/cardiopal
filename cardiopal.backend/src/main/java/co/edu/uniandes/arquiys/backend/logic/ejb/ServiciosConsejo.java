/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.ConsejoDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosConsejo;
import co.edu.uniandes.arquiys.backend.logic.mocks.ConsejoMock;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosConsejo implements IServiciosConsejo {

    private ConsejoMock mock;
    public ServiciosConsejo()
            {
                mock = new ConsejoMock();
            }
    @Override
    public ConsejoDTO getConsejo(Long idConsejo) {
        return mock.getConsejo(idConsejo);
    }

    @Override
    public ConsejoDTO updateConsejo(ConsejoDTO consejo) {
        return mock.updateConsejo(consejo);
        
    }

    @Override
    public void deleteConsejo(Long idConsejo) {
        
        mock.deleteConsejo(idConsejo);
    }

    @Override
    public ConsejoDTO createConsejo(ConsejoDTO consejo) {
        
        return mock.createConsejo(consejo);
    }

    @Override
    public List<ConsejoDTO> getAll() {

       return mock.getAll();

    }
    
}
