/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.dto;

import co.edu.uniandes.arquiys.backend.logic.interfaces.IServiciosSensorFreq;
import java.util.List;

/**
 *
 * @author sf.munera10
 */
public class SensorFreqDTO implements IServiciosSensorFreq{
    
    private Long id;
    
    private Long tiempo;
    
    private Long nPulsaciones;
    
    public SensorFreqDTO(){
    
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the tiempo
     */
    public Long getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(Long tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the nPulsaciones
     */
    public Long getnPulsaciones() {
        return nPulsaciones;
    }

    /**
     * @param nPulsaciones the nPulsaciones to set
     */
    public void setnPulsaciones(Long nPulsaciones) {
        this.nPulsaciones = nPulsaciones;
    }

    @Override
    public SensorFreqDTO getSensorFreq(Long idSensorFreq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SensorFreqDTO updateSensorFreq(SensorFreqDTO brazalete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSensorFreq(Long idSensorFreq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SensorFreqDTO createSensorFreq(SensorFreqDTO brazalete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SensorFreqDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
