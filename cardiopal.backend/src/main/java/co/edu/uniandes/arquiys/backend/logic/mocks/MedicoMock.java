/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.dto.MedicoDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class MedicoMock {
private List<MedicoDTO> medicos;
    public MedicoMock()
            {
                medicos = new ArrayList<MedicoDTO>();
            }
    public MedicoDTO getMedico(Long idMedico) {
        return medicos.get(idMedico.intValue() );
    }

    public MedicoDTO updateMedico(MedicoDTO medico) {
        MedicoDTO medicoViejo = medicos.get( medico.getId().intValue());
        
        medicoViejo.setNombre(medico.getNombre());
        medicoViejo.setPacientes(medico.getPacientes());
        return medicoViejo;
        
    }

    public void deleteMedico(Long idMedico) {
        
        medicos.remove( idMedico.intValue());
    }

    public MedicoDTO createMedico(MedicoDTO medico) {
        
        if(medico.getId() == null)
        {
            Long idNuevo = new Long(medicos.size());
            medico.setId(idNuevo);
        }
        medicos.add(medico);
        return medico;
        
    }

    public List<MedicoDTO> getAll() {

       return medicos;

    }
    
}
