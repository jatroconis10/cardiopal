/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.arquiys.backend.dto;

/**
 *
 * @author Ricardo
 */
public class ConsejoDTO {
    
    private long id;
    private String consejo;

   
    public ConsejoDTO(String consejo ){
        this.consejo = consejo;
    }
    
     public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConsejo() {
        return consejo;
    }

    public void setConsejo(String consejo) {
        this.consejo = consejo;
    }
    
}
