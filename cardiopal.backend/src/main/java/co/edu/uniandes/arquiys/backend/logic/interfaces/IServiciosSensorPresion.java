/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.SensorPresionDTO;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sf.munera10
 */
@Local
public interface IServiciosSensorPresion {
    
    public SensorPresionDTO getSensorPresion(Long idSensorPresion);
    public SensorPresionDTO updateSensorPresion(SensorPresionDTO sensor);
    public void deleteSensorPresion(Long idSensorPresion);
    public SensorPresionDTO createSensorPresion(Long idHistorial,SensorPresionDTO sensor);
    public List<SensorPresionDTO> getAll();
    
}
