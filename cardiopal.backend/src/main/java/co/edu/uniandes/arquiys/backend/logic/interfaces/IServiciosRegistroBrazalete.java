/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.RegistroBrazaleteDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosRegistroBrazalete {
    
    public RegistroBrazaleteDTO getRegistroBrazalete(int idRegistroBrazalete);
    public RegistroBrazaleteDTO updateRegistroBrazalete(int idRegistroBrazalete);
    public void deleteRegistroBrazalete(int idRegistroBrazalete);
    public RegistroBrazaleteDTO createRegistroBrazalete();
    public List<RegistroBrazaleteDTO> getAll();
}
