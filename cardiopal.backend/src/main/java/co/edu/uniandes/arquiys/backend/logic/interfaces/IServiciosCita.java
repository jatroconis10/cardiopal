/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.CitaDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosCita {
    
    public CitaDTO createCita();
    public CitaDTO getCita(int idCita);
    public CitaDTO updateCita(int idCita0);
    public void deleteCita(int idCita);
    public List<CitaDTO> getAll();

}
