/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.PacienteDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author ce.gonzalez13
 */
@Local
public interface IServiciosPaciente {
    
    public PacienteDTO createPaciente(PacienteDTO paciente);
    public PacienteDTO getPaciente(Long idPaciente);
    public PacienteDTO updatePaciente(PacienteDTO paciente);
    public void deletePaciente(Long idPaciente);
    public ArrayList<PacienteDTO> getAll();
}
