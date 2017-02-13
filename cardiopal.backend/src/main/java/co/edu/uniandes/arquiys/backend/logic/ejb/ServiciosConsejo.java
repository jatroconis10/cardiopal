/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.ConsejoDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosConsejo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ce.gonzalez13
 */
public class ServiciosConsejo implements IServiciosConsejo {

    private List<ConsejoDTO> consejos;
    public ServiciosConsejo()
            {
                consejos = new ArrayList<ConsejoDTO>();
            }
    @Override
    public ConsejoDTO getConsejo(Long idConsejo) {
        return consejos.get(idConsejo.intValue() );
    }

    @Override
    public ConsejoDTO updateConsejo(ConsejoDTO consejo) {
        ConsejoDTO consejoViejo = consejos.get( consejo.getId().intValue());
        
        consejoViejo.setConsejo(consejo.getConsejo());
        return consejoViejo;
        
    }

    @Override
    public void deleteConsejo(Long idConsejo) {
        
        consejos.remove( idConsejo.intValue());
    }

    @Override
    public ConsejoDTO createConsejo(ConsejoDTO consejo) {
        
        if(consejo.getId() == null)
        {
            Long idNuevo = new Long(consejos.size());
            consejo.setId(idNuevo);
        }
        consejos.add(consejo);
        return consejo;
        
    }

    @Override
    public List<ConsejoDTO> getAll() {

       return consejos;

    }
    
}
