/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.panel.EstadosInmuebles;

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
class EstadosInmModelo {
    public List<EstadosInmueble> obtenerEstadosInm(String urlService) {
        List<EstadosInmueble> listresult = new ArrayList<EstadosInmueble>();
        System.err.println(urlService + "/mservices/inmobiliario/estadosinm/v01/");
        HttpGet get = new HttpGet(urlService + "/mservices/inmobiliario/estadosinm/v01/");
        get.addHeader("Accept", "application/json");
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(get);
            String entity = EntityUtils.toString(response.getEntity());
            System.err.println(entity);
            EstadosInmList entityresponse = mapper.readValue(entity, EstadosInmList.class);
            listresult = entityresponse.getEstados();
        } catch (JsonProcessingException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(EstadosInmModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            listresult = Collections.EMPTY_LIST;
            Logger.getLogger(EstadosInmModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listresult;
    }
}
