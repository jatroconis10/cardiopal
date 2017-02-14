/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.MedicoDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosMedico;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosMedico implements IServiciosMedico {

    private List<MedicoDTO> medicos;
    public ServiciosMedico()
            {
                medicos = new ArrayList<MedicoDTO>();
            }
    @Override
    public MedicoDTO getMedico(Long idMedico) {
        return medicos.get(idMedico.intValue() );
    }

    @Override
    public MedicoDTO updateMedico(MedicoDTO medico) {
        MedicoDTO medicoViejo = medicos.get( medico.getId().intValue());
        
        medicoViejo.setNombre(medico.getNombre());
        medicoViejo.setPacientes(medico.getPacientes());
        return medicoViejo;
        
    }

    @Override
    public void deleteMedico(Long idMedico) {
        
        medicos.remove( idMedico.intValue());
    }

    @Override
    public MedicoDTO createMedico(MedicoDTO medico) {
        
        if(medico.getId() == null)
        {
            Long idNuevo = new Long(medicos.size());
            medico.setId(idNuevo);
        }
        medicos.add(medico);
        return medico;
        
    }

    @Override
    public List<MedicoDTO> getAll() {

       return medicos;

    }
    
}
