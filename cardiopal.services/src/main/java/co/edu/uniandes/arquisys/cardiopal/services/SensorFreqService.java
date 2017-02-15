/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.SensorFreqDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorFreq;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sf.munera10
 */
@Path("frecuencia")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SensorFreqService {

    @EJB
    private IServiciosSensorFreq frecuenciaEjb;

    @GET
    @Path("/frecuencias")
    public List<SensorFreqDTO> getAllSensorFreqs() {
        return frecuenciaEjb.getAll();
    }

    @GET
    @Path("/buscar/{id: \\d+}")
    public SensorFreqDTO getSensorFreq(@PathParam("id") Long id) throws ErrorDeNegocioException {
        return frecuenciaEjb.getSensorFreq(id);
    }

    @POST
    @Path("/agregar")
    public SensorFreqDTO createSensorFreq(SensorFreqDTO br) {
        return frecuenciaEjb.createSensorFreq(br);
    }

    @PUT
    @Path("/editar")
    public SensorFreqDTO updateSensorFreq(SensorFreqDTO br) {
        return frecuenciaEjb.updateSensorFreq(br);
    }

    @DELETE
    @Path("/borrar/{id: \\d+}")
    public void deleteSensorFreq(@PathParam("id") Long id) throws ErrorDeNegocioException {
        frecuenciaEjb.deleteSensorFreq(id);
    }
}
