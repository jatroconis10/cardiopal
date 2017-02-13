/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.PacienteDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosPaciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ce.gonzalez13
 */
public class ServiciosPaciente implements IServiciosPaciente {

    private List<PacienteDTO> pacientes;
    public ServiciosPaciente()
            {
                pacientes = new ArrayList<PacienteDTO>();
            }
    @Override
    public PacienteDTO getPaciente(Long idPaciente) {
        return pacientes.get(idPaciente.intValue() );
    }

    @Override
    public PacienteDTO updatePaciente(PacienteDTO paciente) {
        PacienteDTO pacienteViejo = pacientes.get( paciente.getId().intValue());
        
        pacienteViejo.setNombre(paciente.getNombre());
        pacienteViejo.setBrazalete(paciente.getBrazalete());
        pacienteViejo.setCitas(paciente.getCitas());
        pacienteViejo.setConsejos(paciente.getConsejos());
        pacienteViejo.setMedicos(paciente.getMedicos());
        return pacienteViejo;
        
    }

    @Override
    public void deletePaciente(Long idPaciente) {
        
        pacientes.remove( idPaciente.intValue());
    }

    @Override
    public PacienteDTO createPaciente(PacienteDTO paciente) {
        
        if(paciente.getId() == null)
        {
            Long idNuevo = new Long(pacientes.size());
            paciente.setId(idNuevo);
        }
        pacientes.add(paciente);
        return paciente;
        
    }

    @Override
    public List<PacienteDTO> getAll() {

       return pacientes;

    }
    
}
