/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.RegistroBrazaleteDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosRegistroBrazalete;
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
@Path("registrobrazalete")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RegistroBrazaleteService {
    
    @EJB
    private IServiciosRegistroBrazalete registroBrazaleteEjb;
    
    @GET
    @Path("/registrosbrazaletes")
    public List<RegistroBrazaleteDTO> getAllRegistroBrazaletes() {
        return registroBrazaleteEjb.getAll();
    }
    
    @GET
    @Path("/buscar/{id: \\d+}")
    public RegistroBrazaleteDTO getRegistroBrazalete(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return registroBrazaleteEjb.getRegistroBrazalete(id);
    }

    @POST
    @Path("/agregar")
    public RegistroBrazaleteDTO createRegistroBrazalete(RegistroBrazaleteDTO br) {    
        return registroBrazaleteEjb.createRegistroBrazalete(br);
    }
    
    @PUT
    @Path("/editar")
    public RegistroBrazaleteDTO updateRegistroBrazalete(RegistroBrazaleteDTO br){
        return registroBrazaleteEjb.updateRegistroBrazalete(br);
    }

    @DELETE
    @Path("/borrar/{id: \\d+}")
    public void deleteRegistroBrazalete(@PathParam("id") Long id) throws ErrorDeNegocioException {
        registroBrazaleteEjb.deleteRegistroBrazalete(id);
    }   
}
