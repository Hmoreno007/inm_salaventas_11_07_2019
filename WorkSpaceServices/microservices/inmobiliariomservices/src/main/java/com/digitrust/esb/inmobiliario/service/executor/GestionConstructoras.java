/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.service.executor;

import com.digitrust.esb.inmobiliario.mdm.Constructora;
import com.digitrust.esb.inmobiliario.mdm.Constructoras;
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
public class GestionConstructoras {
    public Constructoras consultaConstructora(Connection cn) throws SQLException {
        Constructoras result = new Constructoras();
        PreparedStatement sta;
        sta = cn.prepareStatement(SentenceHelper.Query_Constructora);
        ResultSet rst;
        rst = sta.executeQuery();
        result.setConstructoras(new ArrayList<Constructora>());
        while (rst.next()) {
            Constructora cons = new Constructora();
            cons.setCondigoConstructora(rst.getInt("CODIGO_CONSTRUCTORA"));
            cons.setNombreConstructora(rst.getString("NOMBRE_CONSTRUCTORA"));
            cons.setBlobArchivo(rst.getByte("BLOB_ARCHIVO"));
            cons.setMimeType(rst.getString("MIME_TYPE"));
            result.getConstructoras().add(cons);
        }
        rst.close();
        sta.close();
        cn.close();
        return result;
    }
    
}
