/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosBrazalete {
    
    public BrazaleteDTO getBrazalete(int idBrazalete);
    public BrazaleteDTO updateBrazalete(int idBrazalete);
    public void deleteBrazalete(int idBrazalete);
    public BrazaleteDTO createBrazalete();
    public List<BrazaleteDTO> getAll();
}
