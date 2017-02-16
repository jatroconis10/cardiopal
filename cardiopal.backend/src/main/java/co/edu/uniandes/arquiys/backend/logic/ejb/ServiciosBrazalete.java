/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.logic.mocks.BrazaleteMock;
import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosBrazalete implements IServiciosBrazalete {

    private BrazaleteMock mock;
    public ServiciosBrazalete()
            {
                mock = new BrazaleteMock();
            }
    @Override
    public BrazaleteDTO getBrazalete(Long idBrazalete) {
        if(idBrazalete != null)
        {
                    return mock.getBrazalete(idBrazalete);
        }
        return null;
    }

    @Override
    public BrazaleteDTO updateBrazalete(BrazaleteDTO brazalete) {
        
        return mock.updateBrazalete(brazalete);
        
    }

    @Override
    public void deleteBrazalete(Long idBrazalete) {
        if(!getBrazalete(idBrazalete).equals(null))
        {
                    mock.deleteBrazalete(idBrazalete);
        }
       
    }

    @Override
    public BrazaleteDTO createBrazalete(BrazaleteDTO brazalete) {
        if(!brazalete.equals(null))
        {
            if(brazalete.getId().equals(null))
            {
                brazalete.setId(mock.getAll().size() + 1L);
            }
            return mock.createBrazalete(brazalete);
        }
        return null;
    }

    @Override
    public List<BrazaleteDTO> getAll() {
        return mock.getAll();
    }
    
}
