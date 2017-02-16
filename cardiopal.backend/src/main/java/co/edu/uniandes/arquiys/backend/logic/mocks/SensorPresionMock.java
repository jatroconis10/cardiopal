/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.SensorPresionDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorPresion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sf.munera10
 */
public class SensorPresionMock implements IServiciosSensorPresion {

    private List<SensorPresionDTO> sensores;
    private PacienteMock pacienteMock;
    private HistorialMock historialMock;

    public SensorPresionMock() {
        sensores = new ArrayList<SensorPresionDTO>();
        pacienteMock = new PacienteMock();
        historialMock = new HistorialMock();
    }

    @Override
    public SensorPresionDTO getSensorPresion(Long idSensorPresion) {
         for(int i = 0; i<sensores.size(); i++)
        {
            SensorPresionDTO sensor = sensores.get(i);
            if(sensor.getId() == idSensorPresion)
            {
                return sensor;
            }
        }
        return null;
    }

    @Override
    public SensorPresionDTO updateSensorPresion(SensorPresionDTO sensor) {
        SensorPresionDTO sensorViejo = sensores.get(sensor.getId().intValue());
        sensorViejo.setPresionDiastolica(sensor.getPresionDiastolica());
        sensorViejo.setPresionSistolica(sensor.getPresionSistolica());
        return sensorViejo;
    }

    @Override
    public void deleteSensorPresion(Long idSensorPresion) {
        sensores.remove(idSensorPresion.intValue());
    }

    @Override
    public SensorPresionDTO createSensorPresion(Long idHistorial, SensorPresionDTO sensor) {
        if(sensor.getId() == null){
            Long idNuevo = new Long(sensores.size());
            sensor.setId(idNuevo);
        }
        sensores.add(sensor);
        historialMock.agregarSensorPresion(idHistorial,sensor);
        return sensor;
    }

    @Override
    public List<SensorPresionDTO> getAll() {
        return sensores;
    }
}
