/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.EmergenciaDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosEmergencia;
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
@Path("emergencia")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmergenciaService {
    
    @EJB
    private IServiciosEmergencia emergenciaEjb;
    
    @GET
    @Path("/emergencias")
    public List<EmergenciaDTO> getAllEmergencias() {
        return emergenciaEjb.getAll();
    }
    
    @GET
    @Path("/buscar/{id: \\d+}")
    public EmergenciaDTO getEmergencia(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return emergenciaEjb.getEmergencia(id);
    }

    @POST
    @Path("/agregar")
    public EmergenciaDTO createEmergencia(EmergenciaDTO br) {    
        return emergenciaEjb.createEmergencia(br);
    }
    
    @PUT
    @Path("/editar")
    public EmergenciaDTO updateEmergencia(EmergenciaDTO br){
        return emergenciaEjb.updateEmergencia(br);
    }

    @DELETE
    @Path("/borrar/{id: \\d+}")
    public void deleteEmergencia(@PathParam("id") Long id) throws ErrorDeNegocioException {
        emergenciaEjb.deleteEmergencia(id);
    }
    
}
