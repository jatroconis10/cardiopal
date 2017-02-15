/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.dto.EntradaHistorialDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class EntradaHistorialMock  {


    private List<EntradaHistorialDTO> entradaHistorials;
    public EntradaHistorialMock()
            {
                entradaHistorials = new ArrayList<EntradaHistorialDTO>();
            }
    public EntradaHistorialDTO getEntradaHistorial(Long idEntradaHistorial) {
        return entradaHistorials.get(idEntradaHistorial.intValue() );
    }

    public EntradaHistorialDTO updateEntradaHistorial(EntradaHistorialDTO entradaHistorial) {
        EntradaHistorialDTO entradaHistorialViejo = entradaHistorials.get( entradaHistorial.getId().intValue());
        
        entradaHistorialViejo.setInformacion(entradaHistorial.getInformacion());
        entradaHistorialViejo.setTipo(entradaHistorial.getTipo());
        return entradaHistorialViejo;
        
    }

    public void deleteEntradaHistorial(Long idEntradaHistorial) {
        
        entradaHistorials.remove( idEntradaHistorial.intValue());
    }

    public EntradaHistorialDTO createEntradaHistorial(EntradaHistorialDTO entradaHistorial) {
        
        if(entradaHistorial.getId() == null)
        {
            Long idNuevo = new Long(entradaHistorials.size());
            entradaHistorial.setId(idNuevo);
        }
        entradaHistorials.add(entradaHistorial);
        return entradaHistorial;
        
    }

    public List<EntradaHistorialDTO> getAll() {

       return entradaHistorials;

    }
    
}
