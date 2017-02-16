/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.PacienteDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosPaciente;
import co.edu.uniandes.arquiys.backend.logic.mocks.PacienteMock;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author ce.gonzalez13
 */
@Stateless
public class ServiciosPaciente implements IServiciosPaciente {

    public PacienteMock pacienteMock;
    public ServiciosPaciente()
            {
                pacienteMock = new PacienteMock();
            }
    @Override
    public PacienteDTO getPaciente(Long idPaciente) {
        return pacienteMock.getPaciente(idPaciente);
    }

    @Override
    public PacienteDTO updatePaciente(PacienteDTO paciente) {
        return pacienteMock.updatePaciente(paciente);
        
    }

    @Override
    public void deletePaciente(Long idPaciente) {
        
        pacienteMock.deletePaciente(idPaciente);
    }

    @Override
    public PacienteDTO createPaciente(PacienteDTO paciente) {
        
       return pacienteMock.createPaciente(paciente);
        
    }

    @Override
    public List<PacienteDTO> getAll() {

       return pacienteMock.getAll();

    }
    
}
