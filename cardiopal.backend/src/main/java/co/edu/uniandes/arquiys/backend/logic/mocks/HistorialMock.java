/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.logic.mocks;

import co.edu.uniandes.arquiys.backend.dto.HistorialDTO;
import co.edu.uniandes.arquiys.backend.dto.SensorEstresDTO;
import co.edu.uniandes.arquiys.backend.dto.SensorFreqDTO;
import co.edu.uniandes.arquiys.backend.dto.SensorPresionDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author ce.gonzalez13
 */
public class HistorialMock {

private List<HistorialDTO> historials;
    public HistorialMock()
            {
                historials = new ArrayList<HistorialDTO>();
                historials.add(new HistorialDTO(1L));
            }
    public HistorialDTO getHistorial(Long idHistorial) {
        for(int i = 0; i<historials.size(); i++)
        {
            HistorialDTO historial = historials.get(i);
            if(historial.getId().equals(idHistorial))
            {
                return historial;
            }
        }
        return null;
    }

    public HistorialDTO updateHistorial(HistorialDTO historial) {
        HistorialDTO historialViejo = historials.get( historial.getId().intValue());
        
        historialViejo.setEntradas(historial.getEntradas());
        return historialViejo;
        
    }

    public void deleteHistorial(Long idHistorial) {
        
        historials.remove( idHistorial.intValue());
    }

    public HistorialDTO createHistorial(HistorialDTO historial) {
        
        if(historial.getId() == null)
        {
            Long idNuevo = new Long(historials.size());
            historial.setId(idNuevo);
        }
        historials.add(historial);
        return historial;
        
    }

    public List<HistorialDTO> getAll() {

       return historials;

    }
    
    public void agregarSensorEstres(Long idHistorial, SensorEstresDTO sensor)
    {
        HistorialDTO historial = getHistorial(idHistorial);
        historial.getMedicionesEstres().add(sensor);
        
    }
    
     public void agregarSensorFreq(Long idHistorial, SensorFreqDTO sensor)
    {
        HistorialDTO historial = getHistorial(idHistorial);
        List<SensorFreqDTO> lista = historial.getMedicionesFreq();
        lista.add(sensor);
        
    }
     public void agregarSensorPresion(Long idHistorial, SensorPresionDTO sensor)
    {
        HistorialDTO historial = getHistorial(idHistorial);
        historial.getMedicionesPres().add(sensor);
    }
    
    public HistorialDTO getRegistroSensores(Long idHistorial, Date from, Date to)
            {
                HistorialDTO retorno = new HistorialDTO();
                ArrayList<SensorEstresDTO> estres = new ArrayList<>();
                ArrayList<SensorFreqDTO> freq = new ArrayList<>();
                ArrayList<SensorPresionDTO> pres = new ArrayList<>();
                
                HistorialDTO historial = getHistorial(idHistorial);
                List<SensorEstresDTO> listaEstres = historial.getMedicionesEstres();
                List<SensorFreqDTO> listaFreq = historial.getMedicionesFreq();
                List<SensorPresionDTO> listaPres = historial.getMedicionesPres();
                for(int i = 0; i < listaEstres.size();i++)
                {
                    SensorEstresDTO sensorActual = listaEstres.get(i);
                    if(!sensorActual.getFecha().before(from)||!sensorActual.getFecha().after(to))
                    {
                        estres.add(sensorActual);
                    }
                }
                for(int i = 0; i < listaFreq.size();i++)
                {
                    SensorFreqDTO sensorActual = listaFreq.get(i);
                    if(!sensorActual.getFecha().before(from)||!sensorActual.getFecha().after(to))
                    {
                        freq.add(sensorActual);
                    }
                }
                for(int i = 0; i < listaPres.size();i++)
                {
                    SensorPresionDTO sensorActual = listaPres.get(i);
                    if(!sensorActual.getFecha().before(from)||!sensorActual.getFecha().after(to))
                    {
                        pres.add(sensorActual);
                    }
                }
                
                retorno.setMedicionesEstres(estres);
                retorno.setMedicionesFreq(freq);
                retorno.setMedicionesPres(pres);
                return retorno;
            }
    
}
