/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.panel.usuario.modelo;

import com.bsw.inmobiliario.panel.usuario.EstadoUsuario;
import com.bsw.inmobiliario.panel.usuario.EstadoUsuarios;
import com.bsw.inmobiliario.panel.usuario.PerfilUsuario;
import com.bsw.inmobiliario.panel.usuario.PerfilUsuarios;
import com.bsw.inmobiliario.panel.usuario.Rol;
import com.bsw.inmobiliario.panel.usuario.Roles;
import com.bsw.inmobiliario.panel.usuario.TipoIdentificacion;
import com.bsw.inmobiliario.panel.usuario.TipoIdentificaciones;
import com.bsw.inmobiliario.panel.usuario.Usuario;
import com.bsw.inmobiliario.panel.usuario.UsuariosBean;
import com.bsw.inmobiliario.panel.usuario.Usuarioslist;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.jetspeed.security.User;

/**
 *
 * @author bswndeshm
 */
public class UsuariosModelo {
    public List<PerfilUsuario> obtener(String urlService) {
        List<PerfilUsuario> listresult = new ArrayList<PerfilUsuario>();
        System.err.println(urlService + "/mservices/inmobiliario/consultarperfiles/v01/");
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/consultarperfiles/v01/");
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            System.err.println(entity);
            PerfilUsuarios entityresponse = mapper.readValue(entity, PerfilUsuarios.class);
            listresult = entityresponse.getPerfiles();
        } catch (JsonProcessingException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listresult;
    }

    public List<EstadoUsuario> obtenerEstado(String urlService) {
        List<EstadoUsuario> listresult = new ArrayList<EstadoUsuario>();
        System.err.println(urlService + "/mservices/inmobiliario/estadosusu/v01/");
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/estadosusu/v01/");
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            EstadoUsuarios entityresponse = mapper.readValue(entity, EstadoUsuarios.class);
            System.err.println(entity);
            listresult = entityresponse.getEstado();
        } catch (JsonProcessingException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listresult;
    }

    public List<TipoIdentificacion> obtenerTipoIdentificacion(String urlService) {
        List<TipoIdentificacion> listresult = new ArrayList<TipoIdentificacion>();
        System.err.println(urlService + "/mservices/inmobiliario/consultatipoid/v01/");
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/consultatipoid/v01/");
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            TipoIdentificaciones entityresponse = mapper.readValue(entity, TipoIdentificaciones.class);
            System.err.println(entity);
            listresult = entityresponse.getTipoIDs();
        } catch (JsonProcessingException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listresult;
    }

    public Usuario obtenerUsu(String urlService, String usuario) {
        Usuario user = new Usuario();
        System.err.println(urlService + "/mservices/inmobiliario/usuariosContrasena/v01/" + usuario);
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/usuariosContrasena/v01/" + usuario);
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            Usuario entityresponse = mapper.readValue(entity, Usuario.class);
            System.err.println(entity);
            user = entityresponse;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public List<Usuario> obtenerUsuarios(String urlService) {
        List<Usuario> listresult = new ArrayList<Usuario>();
        System.err.println(urlService + "/mservices/inmobiliario/usuarios/v01/");
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/usuarios/v01/");
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            Usuarioslist entityresponse = mapper.readValue(entity, Usuarioslist.class);
            System.err.println(entity);
            listresult = entityresponse.getUsuarios();
        } catch (JsonProcessingException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listresult;
    }

    public PerfilUsuario obtenerPerf(String urlService, String codigo) {
        PerfilUsuario perf = new PerfilUsuario();
        System.err.println(urlService + "/mservices/inmobiliario/perfilusuario/v01/" + codigo);
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/perfilusuario/v01/" + codigo);
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            PerfilUsuario entityresponse = mapper.readValue(entity, PerfilUsuario.class);
            System.err.println(entity);
            perf = entityresponse;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return perf;
    }

    public EstadoUsuario obtenerEstado(String urlService, String estadoUsuario) {
        EstadoUsuario estado = new EstadoUsuario();
        System.err.println(urlService + "/mservices/inmobiliario/consultaestadoxusuario/v01/" + estadoUsuario);
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/consultaestadoxusuario/v01/" + estadoUsuario);
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            EstadoUsuario entityresponse = mapper.readValue(entity, EstadoUsuario.class);
            System.err.println(entity);
            estado = entityresponse;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estado;
    }

    public TipoIdentificacion obntenerTipoIdentificacion(String urlService, String tipoid) {
        TipoIdentificacion estado = new TipoIdentificacion();
        System.err.println(urlService + "/mservices/inmobiliario/consultatipoidbycodigo/v01/" + tipoid);
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/consultatipoidbycodigo/v01/" + tipoid);
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            TipoIdentificacion entityresponse = mapper.readValue(entity, TipoIdentificacion.class);
            System.err.println(entity);
            estado = entityresponse;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estado;
    }

    public List<Rol> obtenerRoles(String urlService) {
        List<Rol> listresult = new ArrayList<Rol>();
        System.err.println(urlService + "/mservices/inmobiliario/consultaroles/v01/");
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/consultaroles/v01/");
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            Roles entityresponse = mapper.readValue(entity, Roles.class);
            System.err.println(entity);
            listresult = entityresponse.getTipo_rol();
        } catch (JsonProcessingException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listresult;
    }

    public String insertarUsuario(String urlService, UsuariosBean usuariobean) {
        String msj = new String();
        System.err.println(urlService + "/mservices/inmobiliario/insertarusuario/v01/");
        HttpPost post = new HttpPost(urlService + "/mservices/inmobiliario/insertarusuario/v01/");
        post.addHeader("Accept", "application/json");        
        try {
            Usuario usuarios = new Usuario();
            usuarios.setUsuario(usuariobean.getUsuario());
            usuarios.setContrasena(usuariobean.getContrasena());
            usuarios.setNumeroIdentificacion(usuariobean.getNumeroIdentificacion());
            usuarios.setTipoIdentificacion(usuariobean.getTipoIdentificacionSeleccionado().getClaseDocumento());
            usuarios.setCorreo(usuariobean.getCorreo());
            usuarios.setNombre(usuariobean.getNombre());
            usuarios.setPerfil(usuariobean.getPerfilUsuarioSeleccionado().getCodigoPerfil());
            usuarios.setEstado(usuariobean.getEstadoSeleccionado().getEstado());

            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            String entityinjson = mapper.writeValueAsString(usuarios);
            System.err.println(entityinjson);
            post.setEntity(new StringEntity(entityinjson, ContentType.APPLICATION_JSON));
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(post);            
            String entity = EntityUtils.toString(response.getEntity());                               
            msj = mapper.readValue(entity, String.class);
        } catch (JsonProcessingException ex) {           
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {           
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msj;
    }
    public String actualizaUsuario(String urlService, UsuariosBean usuariobean) {
        String msj = new String();
        System.err.println(urlService + "/mservices/inmobiliario/actualizausuario/v01/");
        HttpPost post = new HttpPost(urlService + "/mservices/inmobiliario/actualizausuario/v01/");
        post.addHeader("Accept", "application/json");
        try {
            Usuario usuarios = new Usuario();
            usuarios.setUsuario(usuariobean.getUsuario());
            usuarios.setContrasena(usuariobean.getContrasena());
            usuarios.setNumeroIdentificacion(usuariobean.getNumeroIdentificacion());
            usuarios.setTipoIdentificacion(usuariobean.getTipoIdentificacionSeleccionado().getClaseDocumento());
            usuarios.setCorreo(usuariobean.getCorreo());
            usuarios.setNombre(usuariobean.getNombre());
            usuarios.setPerfil(usuariobean.getPerfilUsuarioSeleccionado().getCodigoPerfil());
            usuarios.setEstado(usuariobean.getEstadoSeleccionado().getEstado());
            
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            String entityinjson = mapper.writeValueAsString(usuarios);
            System.err.println(entityinjson);
            post.setEntity(new StringEntity(entityinjson, ContentType.APPLICATION_JSON));
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(post);            
            String entity = EntityUtils.toString(response.getEntity());                               
            //msj = mapper.readValue(entity, String.class);           
            msj = entity;
        } catch (JsonProcessingException ex) {           
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {           
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msj;
    }
}
