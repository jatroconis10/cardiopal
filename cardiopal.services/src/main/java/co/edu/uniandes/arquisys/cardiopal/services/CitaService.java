/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.CitaDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosCita;
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
@Path("citas")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CitaService {
    
    @EJB
    private IServiciosCita citaEjb;
    
    @GET
    public List<CitaDTO> getAllCitas() {
        return citaEjb.getAll();
    }
    
    @GET
    @Path("/{id: \\d+}")
    public CitaDTO getCita(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return citaEjb.getCita(id);
    }

    @POST
    @Path("/agregar")
    public CitaDTO createCita(CitaDTO br) {    
        return citaEjb.createCita(br);
    }
    
    @PUT
    @Path("/editar")
    public CitaDTO updateCita(CitaDTO br){
        return citaEjb.updateCita(br);
    }

    @DELETE
    @Path("/{id: \\d+}")
    public void deleteCita(@PathParam("id") Long id) throws ErrorDeNegocioException {
        citaEjb.deleteCita(id);
    }
}
