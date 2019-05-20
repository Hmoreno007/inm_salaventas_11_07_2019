/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.service.executor;


import com.digitrust.esb.inmobiliario.mdm.Configuracion;
import com.digitrust.esb.inmobiliario.mdm.Configuraciones;
import com.digitrust.esb.inmobiliario.mdm.TipoInmueble;
import com.digitrust.esb.inmobiliario.service.helpers.SentenceHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bswndeshm
 */
public class GestionConfiguracion {
     public Configuraciones consultaConfigXfideicomiso(Configuracion configuracion,Connection cn) throws SQLException {
        Configuraciones result = new Configuraciones();
        PreparedStatement sta;
        sta = cn.prepareStatement(SentenceHelper.Query_Constructora);
        sta.setInt(1, configuracion.getCodigoTipoFideicomiso());
        sta.setInt(2, configuracion.getCodigoSubtipoFideicomiso());
        sta.setInt(3, configuracion.getCodigoFideicomiso());
        sta.setInt(4, configuracion.getEstapaFideicomiso());
        ResultSet rst;
        rst = sta.executeQuery();
        result.setConfiguraciones(new ArrayList<Configuracion>());
        while (rst.next()) {
            Configuracion conf = new Configuracion();
            TipoInmueble tipo = new TipoInmueble();
            
            conf.setNumero(rst.getInt("NUMERO_CONFIG"));
            conf.setCodigoTipoInm(rst.getString("CODIGO_TIPO_INMUEBLE"));
            conf.setNombreTipoInmu(rst.getString("NOMBRE_TIPO_INMUEBLE"));
            conf.setTorresSN(rst.getString("TORRES_SN"));
            result.getConfiguraciones().add(conf);
        }
        rst.close();
        sta.close();
        cn.close();
        return result;
    }
    
}
