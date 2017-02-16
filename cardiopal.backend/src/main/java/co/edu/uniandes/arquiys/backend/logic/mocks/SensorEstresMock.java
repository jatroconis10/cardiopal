/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.SensorEstresDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorEstres;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sf.munera10
 */
public class SensorEstresMock implements IServiciosSensorEstres {

    private List<SensorEstresDTO> sensores;

    public SensorEstresMock() {
        sensores = new ArrayList<SensorEstresDTO>();
    }

    @Override
    public SensorEstresDTO getMedidaSensor(Long idSensorEstres) {
        return sensores.get(idSensorEstres.intValue());
    }

    @Override
    public SensorEstresDTO updateMedidaSensor(SensorEstresDTO sensor) {
        SensorEstresDTO sensorViejo = sensores.get(sensor.getId().intValue());
        sensorViejo.setVariabilidadCardiaca(sensor.getVariabilidadCardiaca());
        return sensorViejo;
    }

    @Override
    public void deleteMedidaSensor(Long idSensorEstres) {
        sensores.remove(idSensorEstres.intValue());
    }

    @Override
    public SensorEstresDTO createMedidaSensor(SensorEstresDTO sensor) {
        if (sensor.getId() == null) {
            Long idNuevo = new Long(sensores.size());
            sensor.setId(idNuevo);
        }
        sensores.add(sensor);
        return sensor;
    }

    @Override
    public List<SensorEstresDTO> getAllMedidas() {
        return sensores;
    }

}
