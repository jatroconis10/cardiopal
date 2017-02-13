/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.MedicoDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosMedico {
    
    public MedicoDTO getMedico(Long idMedico);
    public MedicoDTO createMedico(MedicoDTO medico);
    public void deleteMedico(Long idMedico);
    public MedicoDTO updateMedico(MedicoDTO medico);
    public List<MedicoDTO> getAll();
    
    
}
