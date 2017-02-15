/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosBrazalete;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.dto.BrazaleteDTO;
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
@Path("brazalete")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BrazaleteService {

    @EJB
    private IServiciosBrazalete brazaleteEjb;

    @GET
    @Path("/brazaletes")
    public List<BrazaleteDTO> getAllBrazaletes() {
        return brazaleteEjb.getAll();
    }
    
    @GET
    @Path("/buscar/{id: \\d+}")
    public BrazaleteDTO getBrazalete(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return brazaleteEjb.getBrazalete(id);
    }

    @POST
    @Path("/agregar")
    public BrazaleteDTO createBrazalete(BrazaleteDTO br) {    
        return brazaleteEjb.createBrazalete(br);
    }
    
    @PUT
    @Path("/editar")
    public BrazaleteDTO updateBrazalete(BrazaleteDTO br){
        return brazaleteEjb.updateBrazalete(br);
    }

    @DELETE
    @Path("/borrar/{id: \\d+}")
    public void deleteBrazalete(@PathParam("id") Long id) throws ErrorDeNegocioException {
        brazaleteEjb.deleteBrazalete(id);
    }
}
