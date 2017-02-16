/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.MedicoDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosMedico;
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
@Path("medicos")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MedicoService {
    
    @EJB
    private IServiciosMedico medicoEjb;
    
    @GET
    public List<MedicoDTO> getAllMedicos() {
        return medicoEjb.getAll();
    }
    
    @GET
    @Path("/{id: \\d+}")
    public MedicoDTO getMedico(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return medicoEjb.getMedico(id);
    }

    @POST
    @Path("/agregar")
    public MedicoDTO createMedico(MedicoDTO br) {    
        return medicoEjb.createMedico(br);
    }
    
    @PUT
    @Path("/editar")
    public MedicoDTO updateMedico(MedicoDTO br){
        return medicoEjb.updateMedico(br);
    }

    @DELETE
    @Path("/{id: \\d+}")
    public void deleteMedico(@PathParam("id") Long id) throws ErrorDeNegocioException {
        medicoEjb.deleteMedico(id);
    }
    
}
