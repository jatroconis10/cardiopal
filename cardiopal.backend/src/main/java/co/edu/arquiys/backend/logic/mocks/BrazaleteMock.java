/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class BrazaleteMock implements IServiciosBrazalete {


    private List<BrazaleteDTO> brazaletes;
    public BrazaleteMock()
            {
                brazaletes = new ArrayList<BrazaleteDTO>();
            }
    public BrazaleteDTO getBrazalete(Long idBrazalete) {
        return brazaletes.get(idBrazalete.intValue() );
    }

    public BrazaleteDTO updateBrazalete(BrazaleteDTO brazalete) {
        BrazaleteDTO brazaleteViejo = brazaletes.get( brazalete.getId().intValue());
        
        return brazaleteViejo;
        
    }

    public void deleteBrazalete(Long idBrazalete) {
        
        brazaletes.remove( idBrazalete.intValue());
    }

    public BrazaleteDTO createBrazalete(BrazaleteDTO brazalete) {
        
        if(brazalete.getId() == null)
        {
            Long idNuevo = new Long(brazaletes.size());
            brazalete.setId(idNuevo);
        }
        brazaletes.add(brazalete);
        return brazalete;
        
    }

    public List<BrazaleteDTO> getAll() {

       return brazaletes;

    }
    
}
