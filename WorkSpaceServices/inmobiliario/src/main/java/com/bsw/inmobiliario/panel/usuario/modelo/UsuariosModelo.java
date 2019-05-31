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
import com.bsw.inmobiliario.panel.usuario.TipoIdentificacion;
import com.bsw.inmobiliario.panel.usuario.TipoIdentificaciones;
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
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

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

    public UsuariosBean obtenerUsu(String urlService, String usuario) {
        UsuariosBean user = new UsuariosBean();
        System.err.println(urlService + "/mservices/inmobiliario/usuariosContrasena/v01/" + usuario);
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/usuariosContrasena/v01/" + usuario);
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            System.err.println(entity);
            UsuariosBean entityresponse = mapper.readValue(entity, UsuariosBean.class);
            user = entityresponse;
        } catch (JsonProcessingException ex) {
            //listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //listresult = Collections.EMPTY_LIST;
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public List<UsuariosBean> obtenerUsuarios(String urlService) {
        List<UsuariosBean> listresult = new ArrayList<UsuariosBean>();
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
}
