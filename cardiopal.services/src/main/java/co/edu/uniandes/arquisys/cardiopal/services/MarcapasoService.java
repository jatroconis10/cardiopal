/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquisys.cardiopal.services;

import co.edu.uniandes.arquiys.backend.dto.MarcapasoDTO;
import co.edu.uniandes.arquiys.backend.excepciones.ErrorDeNegocioException;
import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosMarcapaso;
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
@Path("marcapaso")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MarcapasoService {
    
    @EJB
    private IServiciosMarcapaso marcapasoEjb;
    
    @GET
    @Path("/marcapasos")
    public List<MarcapasoDTO> getAllMarcapasos() {
        return marcapasoEjb.getAll();
    }
    
    @GET
    @Path("/buscar/{id: \\d+}")
    public MarcapasoDTO getMarcapaso(@PathParam("id") Long id) throws ErrorDeNegocioException{
        return marcapasoEjb.getMarcapaso(id);
    }

    @POST
    @Path("/agregar")
    public MarcapasoDTO createMarcapaso(MarcapasoDTO br) {    
        return marcapasoEjb.createMarcapaso(br);
    }
    
    @PUT
    @Path("/editar")
    public MarcapasoDTO updateMarcapaso(MarcapasoDTO br){
        return marcapasoEjb.updateMarcapaso(br);
    }

    @DELETE
    @Path("/borrar/{id: \\d+}")
    public void deleteMarcapaso(@PathParam("id") Long id) throws ErrorDeNegocioException {
        marcapasoEjb.deleteMarcapaso(id);
    }
    
}
