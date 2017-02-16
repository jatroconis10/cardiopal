/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.PacienteDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosPaciente;
import java.util.ArrayList;
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
 * @author ja.troconis10
 */
@Path("paciente")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PacienteService {
    
    @EJB
    private IServiciosPaciente pacienteEjb;
    
    @GET
    @Path("pacientes")
    public ArrayList<PacienteDTO> getAllPacientes() {
        return pacienteEjb.getAll();
    }
    
    @GET
    @Path("/buscar/{id: \\d+}")
    public PacienteDTO getPaciente(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return pacienteEjb.getPaciente(id);
    }

    @POST
    @Path("/agregar")
    public PacienteDTO createPaciente(PacienteDTO br) {    
        return pacienteEjb.createPaciente(br);
    }
    
    @PUT
    @Path("/editar")
    public PacienteDTO updatePaciente(PacienteDTO br){
        return pacienteEjb.updatePaciente(br);
    }

    @DELETE
    @Path("/borrar/{id: \\d+}")
    public void deletePaciente(@PathParam("id") Long id) throws ErrorDeNegocioException {
        pacienteEjb.deletePaciente(id);
    }
    
}
