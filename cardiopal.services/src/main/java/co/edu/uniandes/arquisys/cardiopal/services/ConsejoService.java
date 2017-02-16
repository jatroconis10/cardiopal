/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.ConsejoDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosConsejo;
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
@Path("consejos")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ConsejoService {
    
    @EJB
    private IServiciosConsejo consejoEjb;
    
    @GET
    public List<ConsejoDTO> getAllConsejos() {
        return consejoEjb.getAll();
    }
    
    @GET
    @Path("/{id: \\d+}")
    public ConsejoDTO getConsejo(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return consejoEjb.getConsejo(id);
    }

    @POST
    @Path("/agregar")
    public ConsejoDTO createConsejo(ConsejoDTO br) {    
        return consejoEjb.createConsejo(br);
    }
    
    @PUT
    @Path("/editar")
    public ConsejoDTO updateConsejo(ConsejoDTO br){
        return consejoEjb.updateConsejo(br);
    }

    @DELETE
    @Path("/{id: \\d+}")
    public void deleteConsejo(@PathParam("id") Long id) throws ErrorDeNegocioException {
        consejoEjb.deleteConsejo(id);
    }
    
}
