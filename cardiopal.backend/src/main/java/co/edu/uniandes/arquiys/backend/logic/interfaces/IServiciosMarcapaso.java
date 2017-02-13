/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.MarcapasoDTO;
import java.util.List;
/**
 *
 * @author ce.gonzalez13
 */
public interface IServiciosMarcapaso {
    
    public MarcapasoDTO getMarcapaso(int idMarcapaso);
    public MarcapasoDTO updateMarcapaso(int idMarcapaso);
    public void deleteMarcapaso(int idMarcapaso);
    public MarcapasoDTO createMarcapaso();
    public List<MarcapasoDTO> getAll();
}
