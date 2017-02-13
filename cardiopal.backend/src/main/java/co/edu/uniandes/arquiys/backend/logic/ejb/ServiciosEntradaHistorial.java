/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.EntradaHistorialDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosEntradaHistorial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ce.gonzalez13
 */
public class ServiciosEntradaHistorial implements IServiciosEntradaHistorial {

    private List<EntradaHistorialDTO> entradaHistorials;
    public ServiciosEntradaHistorial()
            {
                entradaHistorials = new ArrayList<EntradaHistorialDTO>();
            }
    @Override
    public EntradaHistorialDTO getEntradaHistorial(Long idEntradaHistorial) {
        return entradaHistorials.get(idEntradaHistorial.intValue() );
    }

    @Override
    public EntradaHistorialDTO updateEntradaHistorial(EntradaHistorialDTO entradaHistorial) {
        EntradaHistorialDTO entradaHistorialViejo = entradaHistorials.get( entradaHistorial.getId().intValue());
        
        entradaHistorialViejo.setInformacion(entradaHistorial.getInformacion());
        entradaHistorialViejo.setTipo(entradaHistorial.getTipo());
        return entradaHistorialViejo;
        
    }

    @Override
    public void deleteEntradaHistorial(Long idEntradaHistorial) {
        
        entradaHistorials.remove( idEntradaHistorial.intValue());
    }

    @Override
    public EntradaHistorialDTO createEntradaHistorial(EntradaHistorialDTO entradaHistorial) {
        
        if(entradaHistorial.getId() == null)
        {
            Long idNuevo = new Long(entradaHistorials.size());
            entradaHistorial.setId(idNuevo);
        }
        entradaHistorials.add(entradaHistorial);
        return entradaHistorial;
        
    }

    @Override
    public List<EntradaHistorialDTO> getAll() {

       return entradaHistorials;

    }
    
}
