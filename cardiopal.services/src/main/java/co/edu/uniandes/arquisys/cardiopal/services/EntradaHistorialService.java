/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.EntradaHistorialDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosEntradaHistorial;
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
@Path("entradasHistorial")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EntradaHistorialService {
    
    @EJB
    private IServiciosEntradaHistorial entradaHistorialEjb;
    
    @GET
    public List<EntradaHistorialDTO> getAllEntradaHistorials() {
        return entradaHistorialEjb.getAll();
    }
    
    @GET
    @Path("/{id: \\d+}")
    public EntradaHistorialDTO getEntradaHistorial(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return entradaHistorialEjb.getEntradaHistorial(id);
    }

    @POST
    @Path("/agregar")
    public EntradaHistorialDTO createEntradaHistorial(EntradaHistorialDTO br) {    
        return entradaHistorialEjb.createEntradaHistorial(br);
    }
    
    @PUT
    @Path("/editar")
    public EntradaHistorialDTO updateEntradaHistorial(EntradaHistorialDTO br){
        return entradaHistorialEjb.updateEntradaHistorial(br);
    }

    @DELETE
    @Path("/{id: \\d+}")
    public void deleteEntradaHistorial(@PathParam("id") Long id) throws ErrorDeNegocioException {
        entradaHistorialEjb.deleteEntradaHistorial(id);
    }
}
