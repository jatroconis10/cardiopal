/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.MarcapasoDTO;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author ce.gonzalez13
 */
@Local
public interface IServiciosMarcapaso {
    
    public MarcapasoDTO getMarcapaso(Long idMarcapaso);
    public MarcapasoDTO updateMarcapaso(MarcapasoDTO marcapaso);
    public void deleteMarcapaso(Long idMarcapaso);
    public MarcapasoDTO createMarcapaso(MarcapasoDTO marcapaso);
    public List<MarcapasoDTO> getAll();
}
