/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.SensorFreqDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorFreq;
import co.edu.uniandes.arquiys.backend.logic.mocks.SensorFreqMock;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author sf.munera10
 */
@Stateless
public class ServiciosSensorFreq implements IServiciosSensorFreq {

    private SensorFreqMock mock;

    public ServiciosSensorFreq() {
        mock = new SensorFreqMock();
    }

    @Override
    public SensorFreqDTO getSensorFreq(Long idSensorFreq) {
        return mock.getSensorFreq(idSensorFreq);
    }

    @Override
    public SensorFreqDTO updateSensorFreq(SensorFreqDTO sensor) {
        return mock.updateSensorFreq(sensor);
    }

    @Override
    public void deleteSensorFreq(Long idSensorFreq) {
        mock.deleteSensorFreq(idSensorFreq);
    }

    @Override
    public SensorFreqDTO createSensorFreq(SensorFreqDTO sensor) {
        return mock.createSensorFreq(sensor);
    }

    @Override
    public List<SensorFreqDTO> getAll() {
        return mock.getAll();
    }

}
