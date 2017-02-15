/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.interfaces;

import co.edu.uniandes.arquiys.backend.dto.SensorFreqDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sf.munera10
 */
@Local
public interface IServiciosSensorFreq {
    
    public SensorFreqDTO getSensorFreq(Long idSensorFreq);
    public SensorFreqDTO updateSensorFreq(SensorFreqDTO sensor);
    public void deleteSensorFreq(Long idSensorFreq);
    public SensorFreqDTO createSensorFreq(SensorFreqDTO sensor);
    public List<SensorFreqDTO> getAll();
    
}
