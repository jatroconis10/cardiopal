/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.SensorPresionDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorPresion;
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
@Path("presion")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SensorPresionService {

    @EJB
    private IServiciosSensorPresion presionEjb;

    @GET
    @Path("/presiones")
    public List<SensorPresionDTO> getAllSensorPresions() {
        return presionEjb.getAll();
    }

    @GET
    @Path("/buscar/{id: \\d+}")
    public SensorPresionDTO getSensorPresion(@PathParam("id") Long id) throws ErrorDeNegocioException {
        return presionEjb.getSensorPresion(id);
    }

    @POST
    @Path("/agregar")
    public SensorPresionDTO createSensorPresion(SensorPresionDTO br) {
        return presionEjb.createSensorPresion(br);
    }

    @PUT
    @Path("/editar")
    public SensorPresionDTO updateSensorPresion(SensorPresionDTO br) {
        return presionEjb.updateSensorPresion(br);
    }

    @DELETE
    @Path("/borrar/{id: \\d+}")
    public void deleteSensorPresion(@PathParam("id") Long id) throws ErrorDeNegocioException {
        presionEjb.deleteSensorPresion(id);
    }

}
