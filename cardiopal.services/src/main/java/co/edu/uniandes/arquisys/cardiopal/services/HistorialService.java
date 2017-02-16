/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.HistorialDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosHistorial;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sf.munera10
 */
@Path("historiales")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HistorialService {
    
    @EJB
    private IServiciosHistorial historialEjb;
    
    @GET
    public List<HistorialDTO> getAllHistorials() {
        return historialEjb.getAll();
    }
    
    @GET
    @Path("/{id: \\d+}")
    public HistorialDTO getHistorial(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return historialEjb.getHistorial(id);
    }

    @POST
    @Path("/agregar")
    public HistorialDTO createHistorial(HistorialDTO br) {    
        return historialEjb.createHistorial(br);
    }
    
    @PUT
    @Path("/editar")
    public HistorialDTO updateHistorial(HistorialDTO br){
        return historialEjb.updateHistorial(br);
    }

    @DELETE
    @Path("/{id: \\d+}")
    public void deleteHistorial(@PathParam("id") Long id) throws ErrorDeNegocioException {
        historialEjb.deleteHistorial(id);
    }
    
    @GET
    @Path("rango-fecha")
    public HistorialDTO getRegistroSensores(@DefaultValue("1000") @QueryParam("from") Date from,
            @DefaultValue("999")@QueryParam("to") Date to){
        return null;
    }
}
