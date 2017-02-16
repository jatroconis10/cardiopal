/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.SensorEstresDTO;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sf.munera10
 */
@Local
public interface IServiciosSensorEstres {
    
    public SensorEstresDTO getMedidaSensor(Long idSensorEstres);
    public SensorEstresDTO updateMedidaSensor(SensorEstresDTO sensor);
    public void deleteMedidaSensor(Long idSensorEstres);
    public SensorEstresDTO createMedidaSensor(Long idHistorial, SensorEstresDTO sensor);
    public List<SensorEstresDTO> getAllMedidas();
   
}
