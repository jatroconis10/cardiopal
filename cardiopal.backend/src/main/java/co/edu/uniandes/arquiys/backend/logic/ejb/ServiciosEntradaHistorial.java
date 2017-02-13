/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.EntradaHistorialDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosEntradaHistorial;
import java.util.List;

/**
 *
 * @author ce.gonzalez13
 */
public class ServiciosEntradaHistorial implements IServiciosEntradaHistorial {

    @Override
    public EntradaHistorialDTO getEntradaHistorial(int idEntradaHistorial) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
    }

    @Override
    public EntradaHistorialDTO updateEntradaHistorial(int idEntradaHistorial) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEntradaHistorial(int idEntradaHistorial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntradaHistorialDTO createEntradaHistorial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EntradaHistorialDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
