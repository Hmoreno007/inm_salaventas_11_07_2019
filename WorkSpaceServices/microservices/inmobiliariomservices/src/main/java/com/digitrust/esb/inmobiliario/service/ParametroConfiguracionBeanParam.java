/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.service;

import javax.ws.rs.PathParam;

/**
 *
 * @author bswndeshm
 */
class ParametroConfiguracionBeanParam {
    @PathParam("codigotipofideicomiso")
    private Integer codigotipofideicomiso;
    
    @PathParam("codigosubtipofideicomiso")
     private Integer codigosubtipofideicomiso;
    
    @PathParam("codigofideicomiso")
     private Integer codigofideicomiso; 
    
    @PathParam("etapafideicomiso")
     private Integer etapafideicomiso;
}
