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
    
    public MedicoDTO getMedico(int idMedico);
    public MedicoDTO createMedico();
    public void deleteMedico(int idMedico);
    public MedicoDTO updateMedico(int idMedico);
    public List<MedicoDTO> getAll();
    
    
}
