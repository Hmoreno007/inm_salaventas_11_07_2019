/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author bswndesim
 */
@Path("/inmobiliario/")
public class InmobiliarioService {
    
    @GET
    @Path("/usuarios/v01/")
    @Produces("application/json")
    public Response consultarUsuarios() { return null; }
    
    @GET
    @Path("/usuariosContrasena/v01/")
    @Produces("application/json")
    public Response consultaUsuarioContrasena(@QueryParam("usuario")String usuario,@QueryParam("contrasena")String contrasena) { return null; } 
    
    @GET
    @Path("/estados/v01/")
    @Produces("application/json")
    public Response consultaEstados() { return null; } 
    
    @GET
    @Path("/estadosbyid/v01/{codigo}")
    @Produces("application/json")
    public Response consultaEstadosById(@BeanParam ParamBean codigo) { return null; }
    
    @GET
    @Path("/consultatipoinm/v01/")
    @Produces("application/json")
    public Response consultaTipoInmuebles() { return null; } 
    
    @GET
    @Path("/constructora/v01/")
    @Produces("application/json")
    public Response consultaConstructora() { return null; } 
    
    
    @GET
    @Path("/configuracionxfideicomiso/v01/{codigotipofideicomiso}/{codigosubtipofideicomiso}/{codigofideicomiso}/{etapafideicomiso}")
    @Produces("application/json")
    public Response consultaConfigXfideicomiso() { return null; }    
    
    @GET
    @Path("/consultarperfiles/v01/")
    @Produces("application/json")
    public Response consultarPerfilUsuarios() { return null; }    
    
}


