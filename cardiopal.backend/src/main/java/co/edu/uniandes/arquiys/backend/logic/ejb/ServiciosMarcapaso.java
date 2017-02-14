/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.MarcapasoDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosMarcapaso;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosMarcapaso implements IServiciosMarcapaso {

    private List<MarcapasoDTO> marcapasos;
    public ServiciosMarcapaso()
            {
                marcapasos = new ArrayList<MarcapasoDTO>();
            }
    @Override
    public MarcapasoDTO getMarcapaso(Long idMarcapaso) {
        return marcapasos.get(idMarcapaso.intValue() );
    }

    @Override
    public MarcapasoDTO updateMarcapaso(MarcapasoDTO marcapaso) {
        MarcapasoDTO marcapasoViejo = marcapasos.get( marcapaso.getId().intValue());
        
        marcapasoViejo.setFrecuencia(marcapaso.getFrecuencia());
        return marcapasoViejo;
        
    }

    @Override
    public void deleteMarcapaso(Long idMarcapaso) {
        
        marcapasos.remove( idMarcapaso.intValue());
    }

    @Override
    public MarcapasoDTO createMarcapaso(MarcapasoDTO marcapaso) {
        
        if(marcapaso.getId() == null)
        {
            Long idNuevo = new Long(marcapasos.size());
            marcapaso.setId(idNuevo);
        }
        marcapasos.add(marcapaso);
        return marcapaso;
        
    }

    @Override
    public List<MarcapasoDTO> getAll() {

       return marcapasos;

    }
    
}
