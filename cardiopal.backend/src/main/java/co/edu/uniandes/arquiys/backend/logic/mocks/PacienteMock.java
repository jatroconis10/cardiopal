/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import co.edu.uniandes.arquiys.backend.dto.PacienteDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class PacienteMock  {

 private List<PacienteDTO> pacientes;
    public PacienteMock()
            {
                pacientes = new ArrayList<PacienteDTO>();
                pacientes.add(new PacienteDTO(1L,"Pepito"));
            }
    public PacienteDTO getPaciente(Long idPaciente) {
        for(int i = 0; i<pacientes.size(); i++)
        {
            PacienteDTO paciente = pacientes.get(i);
            if(paciente.getId() == idPaciente)
            {
                return paciente;
            }
        }
        return null;
    }

    public PacienteDTO updatePaciente(PacienteDTO paciente) {
        PacienteDTO pacienteViejo = pacientes.get( paciente.getId().intValue());
        
        pacienteViejo.setNombre(paciente.getNombre());
        pacienteViejo.setBrazalete(paciente.getBrazalete());
        pacienteViejo.setCitas(paciente.getCitas());
        pacienteViejo.setConsejos(paciente.getConsejos());
        pacienteViejo.setMedicos(paciente.getMedicos());
        return pacienteViejo;
        
    }

    public void deletePaciente(Long idPaciente) {
        
        pacientes.remove( idPaciente.intValue());
    }

    public PacienteDTO createPaciente(PacienteDTO paciente) {
        
        if(paciente.getId() == null)
        {
            Long idNuevo = new Long(pacientes.size());
            paciente.setId(idNuevo);
        }
        pacientes.add(paciente);
        return paciente;
        
    }

    public List<PacienteDTO> getAll() {

       return pacientes;

    }
}
