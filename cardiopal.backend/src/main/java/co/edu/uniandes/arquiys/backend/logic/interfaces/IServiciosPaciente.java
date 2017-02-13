/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.PacienteDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosPaciente {
    
        public PacienteDTO createPaciente();
    public PacienteDTO getPaciente(int idPaciente);
    public PacienteDTO updatePaciente(int idPaciente);
    public void deletePaciente(int idPaciente);
    public List<PacienteDTO> getAll();
}
