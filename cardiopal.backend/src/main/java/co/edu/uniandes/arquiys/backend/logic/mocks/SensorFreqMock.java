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
    private PacienteMock pacienteMock;
    private HistorialMock historialMock;

    public SensorFreqMock() {
        sensores = new ArrayList<SensorFreqDTO>();
        pacienteMock = new PacienteMock();
        historialMock = new HistorialMock();
    }
    
    @Override
    public SensorFreqDTO getSensorFreq(Long idSensorFreq) {
         for(int i = 0; i<sensores.size(); i++)
        {
            SensorFreqDTO sensor = sensores.get(i);
            if(sensor.getId() == idSensorFreq)
            {
                return sensor;
            }
        }
        return null;
    }

    @Override
    public SensorFreqDTO updateSensorFreq(SensorFreqDTO sensor){
        SensorFreqDTO sensorViejo = sensores.get(sensor.getId().intValue());
        sensorViejo.setTiempo(sensor.getnPulsaciones());
        sensorViejo.setnPulsaciones(sensor.getTiempo());
        return sensorViejo;
    }

    @Override
    public void deleteSensorFreq(Long idSensorFreq) {
        sensores.remove(idSensorFreq.intValue());
    }

    @Override
    public SensorFreqDTO createSensorFreq(Long idHistorial, SensorFreqDTO sensor) {
        if(sensor.getId() == null){
            Long idNuevo = new Long(sensores.size());
            sensor.setId(idNuevo);
        }
        sensores.add(sensor);
        historialMock.agregarSensorFreq(idHistorial,sensor);
        return sensor;
    }

    @Override
    public List<SensorFreqDTO> getAll() {
        return sensores;
    }
    
}
