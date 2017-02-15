/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.SensorFreqDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorFreq;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sf.munera10
 */
public class SensorFreqMock implements IServiciosSensorFreq{

    private List<SensorFreqDTO> sensores;

    public SensorFreqMock() {
        sensores = new ArrayList<SensorFreqDTO>();
    }
    
    @Override
    public SensorFreqDTO getSensorFreq(Long idSensorFreq) {
        return sensores.get(idSensorFreq.intValue());
    }

    @Override
    public SensorFreqDTO updateSensorFreq(SensorFreqDTO sensor){
        SensorFreqDTO sensorViejo = sensores.get(sensor.getId().intValue());
        return sensorViejo;
    }

    @Override
    public void deleteSensorFreq(Long idSensorFreq) {
        sensores.remove(idSensorFreq.intValue());
    }

    @Override
    public SensorFreqDTO createSensorFreq(SensorFreqDTO sensor) {
        if(sensor.getId() == null){
            Long idNuevo = new Long(sensores.size());
            sensor.setId(idNuevo);
        }
        sensores.add(sensor);
        return sensor;
    }

    @Override
    public List<SensorFreqDTO> getAll() {
        return sensores;
    }
    
}
