/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.RegistroBrazaleteDTO;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author ce.gonzalez13
 */
@Local
public interface IServiciosRegistroBrazalete {
    
    public RegistroBrazaleteDTO getRegistroBrazalete(Long idRegistroBrazalete);
    public RegistroBrazaleteDTO updateRegistroBrazalete(RegistroBrazaleteDTO registro);
    public void deleteRegistroBrazalete(Long idRegistroBrazalete);
    public RegistroBrazaleteDTO createRegistroBrazalete(RegistroBrazaleteDTO registro);
    public List<RegistroBrazaleteDTO> getAll();
}
