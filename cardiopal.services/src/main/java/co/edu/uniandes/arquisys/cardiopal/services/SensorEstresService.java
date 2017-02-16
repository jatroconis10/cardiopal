/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.SensorEstresDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorEstres;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@Path("paciente/{pacienteId: \\d+}/estres")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SensorEstresService {

    @EJB
    private IServiciosSensorEstres estresEjb;

    @GET
    public List<SensorEstresDTO> getAllSensorEstress() {
        return estresEjb.getAllMedidas();
    }

    @GET
    @Path("/{id: \\d+}")
    public SensorEstresDTO getSensorEstres(@PathParam("id") Long id) throws ErrorDeNegocioException {
        return estresEjb.getMedidaSensor(id);
    }

    @POST
    @Path("fecha/{fecha}/agregar/")
    public SensorEstresDTO createSensorEstres(@PathParam("pacienteId") Long idHistorial, SensorEstresDTO br, @PathParam("fecha") String fecha) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss-a");
        Date date = format.parse(fecha);
        br.setFecha(date);
        return estresEjb.createMedidaSensor(idHistorial, br);
    }

    @PUT
    @Path("/editar")
    public SensorEstresDTO updateSensorEstres(SensorEstresDTO br) {
        return estresEjb.updateMedidaSensor(br);
    }

    @DELETE
    @Path("/{id: \\d+}")
    public void deleteSensorEstres(@PathParam("id") Long id) throws ErrorDeNegocioException {
        estresEjb.deleteMedidaSensor(id);
    }
}
