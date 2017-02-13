/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.MarcapasoDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosMarcapaso;
import java.util.List;

/**
 *
 * @author ce.gonzalez13
 */
public class ServiciosMarcapaso implements IServiciosMarcapaso {

    @Override
    public MarcapasoDTO getMarcapaso(int idMarcapaso) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
    }

    @Override
    public MarcapasoDTO updateMarcapaso(int idMarcapaso) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMarcapaso(int idMarcapaso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MarcapasoDTO createMarcapaso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MarcapasoDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
