/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.ConsejoDTO;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author ce.gonzalez13
 */
@Local
public interface IServiciosConsejo {
    
    public ConsejoDTO getConsejo(Long idConsejo);
    public ConsejoDTO updateConsejo(ConsejoDTO consejo);
    public void deleteConsejo(Long idConsejo);
    public ConsejoDTO createConsejo(ConsejoDTO consejo);
    public List<ConsejoDTO> getAll();
}
