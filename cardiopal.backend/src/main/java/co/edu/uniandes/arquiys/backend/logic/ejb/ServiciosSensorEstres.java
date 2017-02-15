/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.ejb;

import co.edu.uniandes.arquiys.backend.dto.SensorEstresDTO;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorEstres;
import co.edu.uniandes.arquiys.backend.logic.mocks.SensorEstresMock;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author sf.munera10
 */
@Stateless
public class ServiciosSensorEstres implements IServiciosSensorEstres {

    private SensorEstresMock mock;

    public ServiciosSensorEstres() {
        mock = new SensorEstresMock();
    }

    @Override
    public SensorEstresDTO getMedidaSensor(Long idSensorEstres) {
        return mock.getMedidaSensor(idSensorEstres);
    }

    @Override
    public SensorEstresDTO updateMedidaSensor(SensorEstresDTO sensor) {
        return mock.updateMedidaSensor(sensor);
    }

    @Override
    public void deleteMedidaSensor(Long idSensorEstres) {
        mock.deleteMedidaSensor(idSensorEstres);
    }

    @Override
    public SensorEstresDTO createMedidaSensor(SensorEstresDTO sensor) {
        return mock.createMedidaSensor(sensor);
    }

    @Override
    public List<SensorEstresDTO> getAllMedidas() {
        return mock.getAllMedidas();
    }

}
