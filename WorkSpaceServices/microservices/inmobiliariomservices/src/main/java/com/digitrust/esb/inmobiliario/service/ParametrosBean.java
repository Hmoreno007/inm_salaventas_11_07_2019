/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.service;

import javax.ws.rs.QueryParam;

/**
 *
 * @author bswndeshm
 */
public class ParametrosBean {
    
     @QueryParam("usuario") String usuario;
     @QueryParam("contrasena") String contrasena;
}
