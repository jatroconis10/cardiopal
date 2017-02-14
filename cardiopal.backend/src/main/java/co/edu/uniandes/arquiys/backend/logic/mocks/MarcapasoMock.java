/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.dto.MarcapasoDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class MarcapasoMock {


    private List<MarcapasoDTO> marcapasos;
    public MarcapasoMock()
            {
                marcapasos = new ArrayList<MarcapasoDTO>();
            }
    public MarcapasoDTO getMarcapaso(Long idMarcapaso) {
        return marcapasos.get(idMarcapaso.intValue() );
    }

    public MarcapasoDTO updateMarcapaso(MarcapasoDTO marcapaso) {
        MarcapasoDTO marcapasoViejo = marcapasos.get( marcapaso.getId().intValue());
        
        marcapasoViejo.setFrecuencia(marcapaso.getFrecuencia());
        return marcapasoViejo;
        
    }

    public void deleteMarcapaso(Long idMarcapaso) {
        
        marcapasos.remove( idMarcapaso.intValue());
    }

    public MarcapasoDTO createMarcapaso(MarcapasoDTO marcapaso) {
        
        if(marcapaso.getId() == null)
        {
            Long idNuevo = new Long(marcapasos.size());
            marcapaso.setId(idNuevo);
        }
        marcapasos.add(marcapaso);
        return marcapaso;
        
    }

    public List<MarcapasoDTO> getAll() {

       return marcapasos;

    }
    
    
}
