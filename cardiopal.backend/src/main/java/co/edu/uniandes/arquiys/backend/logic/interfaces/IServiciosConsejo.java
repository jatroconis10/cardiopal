/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.ConsejoDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosConsejo {
    
    public ConsejoDTO getConsejo(int idConsejo);
    public ConsejoDTO updateConsejo(int idConsejo);
    public void deleteConsejo(int idConsejo);
    public ConsejoDTO createConsejo();
    public List<ConsejoDTO> getAll();
}
