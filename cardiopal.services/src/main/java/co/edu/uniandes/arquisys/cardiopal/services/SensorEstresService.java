/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.SensorEstresDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorEstres;
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
@Path("estres")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SensorEstresService {

    @EJB
    private IServiciosSensorEstres estresEjb;

    @GET
    @Path("/nivelesestres")
    public List<SensorEstresDTO> getAllSensorEstress() {
        return estresEjb.getAllMedidas();
    }

    @GET
    @Path("/buscar/{id: \\d+}")
    public SensorEstresDTO getSensorEstres(@PathParam("id") Long id) throws ErrorDeNegocioException {
        return estresEjb.getMedidaSensor(id);
    }

    @POST
    @Path("/agregar")
    public SensorEstresDTO createSensorEstres(SensorEstresDTO br) {
        return estresEjb.createMedidaSensor(br);
    }

    @PUT
    @Path("/editar")
    public SensorEstresDTO updateSensorEstres(SensorEstresDTO br) {
        return estresEjb.updateMedidaSensor(br);
    }

    @DELETE
    @Path("/borrar/{id: \\d+}")
    public void deleteSensorEstres(@PathParam("id") Long id) throws ErrorDeNegocioException {
        estresEjb.deleteMedidaSensor(id);
    }
}
