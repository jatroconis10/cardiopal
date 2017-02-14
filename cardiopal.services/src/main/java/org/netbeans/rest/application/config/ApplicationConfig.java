/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author sf.munera10
 */
@javax.ws.rs.ApplicationPath("/cardiopal")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.BrazaleteService.class);
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.CitaService.class);
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.ConsejoService.class);
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.EmergenciaService.class);
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.EntradaHistorialService.class);
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.HistorialService.class);
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.MarcapasoService.class);
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.MedicoService.class);
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.PacienteService.class);
        resources.add(co.edu.uniandes.arquisys.cardiopal.services.RegistroBrazaleteService.class);
    }
    
}
