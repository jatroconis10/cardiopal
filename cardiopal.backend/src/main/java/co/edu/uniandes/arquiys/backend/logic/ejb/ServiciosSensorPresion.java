/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.SensorPresionDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorPresion;
import co.edu.uniandes.arquiys.backend.logic.mocks.SensorPresionMock;
import java.util.List;
import java.util.Date;

import javax.ejb.Stateless;

/**
 *
 * @author sf.munera10
 */
@Stateless
public class ServiciosSensorPresion implements IServiciosSensorPresion {

    private SensorPresionMock mock;

    public ServiciosSensorPresion() {
        mock = new SensorPresionMock();
    }

    @Override
    public SensorPresionDTO getSensorPresion(Long idSensorPresion) {
        return mock.getSensorPresion(idSensorPresion);
    }

    @Override
    public SensorPresionDTO updateSensorPresion(SensorPresionDTO sensor) {
        return mock.updateSensorPresion(sensor);
    }

    @Override
    public void deleteSensorPresion(Long idSensorPresion) {
        mock.deleteSensorPresion(idSensorPresion);
    }

    @Override
    public SensorPresionDTO createSensorPresion(Long idHistorial,SensorPresionDTO sensor) {
        return mock.createSensorPresion(idHistorial, sensor);
    }

    @Override
    public List<SensorPresionDTO> getAll() {
        return mock.getAll();
    }

}
