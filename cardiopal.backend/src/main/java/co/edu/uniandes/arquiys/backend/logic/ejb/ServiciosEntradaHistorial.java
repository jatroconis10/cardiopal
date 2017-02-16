/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.EntradaHistorialDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosEntradaHistorial;
import co.edu.uniandes.arquiys.backend.logic.mocks.EntradaHistorialMock;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosEntradaHistorial implements IServiciosEntradaHistorial {

    private EntradaHistorialMock mock;
    public ServiciosEntradaHistorial()
            {
                mock = new EntradaHistorialMock();
            }
    @Override
    public EntradaHistorialDTO getEntradaHistorial(Long idEntradaHistorial) {
        return mock.getEntradaHistorial(idEntradaHistorial);
    }

    @Override
    public EntradaHistorialDTO updateEntradaHistorial(EntradaHistorialDTO entradaHistorial) {
        return mock.updateEntradaHistorial(entradaHistorial);
        
    }

    @Override
    public void deleteEntradaHistorial(Long idEntradaHistorial) {
        
        mock.deleteEntradaHistorial(idEntradaHistorial);
    }

    @Override
    public EntradaHistorialDTO createEntradaHistorial(EntradaHistorialDTO entradaHistorial) {
        
        return mock.createEntradaHistorial(entradaHistorial);
        
    }

    @Override
    public List<EntradaHistorialDTO> getAll() {

       return mock.getAll();

    }
    
}
