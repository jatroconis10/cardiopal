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
    
    public BrazaleteDTO getBrazalete(Long idBrazalete);
    public BrazaleteDTO updateBrazalete(BrazaleteDTO brazalete);
    public void deleteBrazalete(Long idBrazalete);
    public BrazaleteDTO createBrazalete(BrazaleteDTO brazalete);
    public List<BrazaleteDTO> getAll();
}
