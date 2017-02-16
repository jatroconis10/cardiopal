/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.MedicoDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosMedico;
import co.edu.uniandes.arquiys.backend.logic.mocks.MedicoMock;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosMedico implements IServiciosMedico {

    private MedicoMock mock;
    public ServiciosMedico()
            {
                mock = new MedicoMock();
            }
    @Override
    public MedicoDTO getMedico(Long idMedico) {
        return mock.getMedico(idMedico);
    }

    @Override
    public MedicoDTO updateMedico(MedicoDTO medico) {
        return mock.updateMedico(medico);
    }

    @Override
    public void deleteMedico(Long idMedico) {
        
        mock.deleteMedico(idMedico);
    }

    @Override
    public MedicoDTO createMedico(MedicoDTO medico) {
        
        return mock.createMedico(medico);
    }

    @Override
    public List<MedicoDTO> getAll() {

       return mock.getAll();

    }
    
}
