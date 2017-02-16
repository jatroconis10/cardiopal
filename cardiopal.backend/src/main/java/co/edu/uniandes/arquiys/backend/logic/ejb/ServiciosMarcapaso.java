/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.MarcapasoDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosMarcapaso;
import co.edu.uniandes.arquiys.backend.logic.mocks.MarcapasoMock;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosMarcapaso implements IServiciosMarcapaso {

    private MarcapasoMock mock;
    public ServiciosMarcapaso()
            {
                mock = new MarcapasoMock();
            }
    @Override
    public MarcapasoDTO getMarcapaso(Long idMarcapaso) {
        return mock.getMarcapaso(idMarcapaso);
    }

    @Override
    public MarcapasoDTO updateMarcapaso(MarcapasoDTO marcapaso) {
        return mock.updateMarcapaso(marcapaso);
    }

    @Override
    public void deleteMarcapaso(Long idMarcapaso) {
        
        mock.deleteMarcapaso(idMarcapaso);
    }

    @Override
    public MarcapasoDTO createMarcapaso(MarcapasoDTO marcapaso) {
        
        return mock.createMarcapaso(marcapaso);
        
    }

    @Override
    public List<MarcapasoDTO> getAll() {

       return mock.getAll();

    }
    
}
