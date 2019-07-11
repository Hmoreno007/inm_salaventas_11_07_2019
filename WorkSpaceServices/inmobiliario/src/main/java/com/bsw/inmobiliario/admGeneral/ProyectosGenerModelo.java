/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.admGeneral;

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
public class ProyectosGenerModelo {
     public List<ProyectosGeneral> consultarProyectosByUsuario(String urlService, String usuario){
        List<ProyectosGeneral> listresult = new ArrayList<ProyectosGeneral>();
        System.err.println(urlService + "/mservices/inmobiliario/consultaproyectosbyusuario/v01/"+ usuario);
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/consultaproyectosbyusuario/v01/"+ usuario);
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            System.err.println(entity);
            ProyectosGenerales entityresponse = mapper.readValue(entity, ProyectosGenerales.class);
            listresult = entityresponse.getListproyectos();
        } catch (JsonProcessingException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(ProyectosGenerModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(ProyectosGenerModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listresult;
    }
}
