/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.service.helpers;

/**
 *
 * @author bswndesim
 */
public class SentenceHelper {

    public static final String Query__Usuarios = "SELECT  USERNAME, PASSWORD_RAW, IDENTIFICACION, CLASE_DOCUMENTO, EMAIL, NOMBRE, PERFIL, ESTADO, ULT_CONEXION FROM INM_USUARIOS";

    public static final String Query_Contrasena = "SELECT NOMBRE, PERFIL, ESTADO  FROM inm_usuarios WHERE username= '?'";

    public static final String Query_estados = "SELECT CODIGO_ESTADO_INM, DESCRIPCION_ESTADO_INM, OBSERVACION_ESTADO_INM, COLOR_ESTADO_INM FROM  inm_estados";

    public static final String Query_estadosById = "SELECT DESCRIPCION_ESTADO_INM FROM INM_ESTADOS WHERE CODIGO_ESTADO_INM = '?'";    
    
    public static final String Query_TipoInmueble = "SELECT t.codigo_tipo_inmueble, t.nombre_tipo_inmueble, t.prefijo_inmueble ,t.inm_sn,t.torres_sn  \r\n"
            + "FROM TIPO_INMUEBLE t  ORDER BY  t.codigo_tipo_inmueble";

    public static final String Query_Constructora = "SELECT CODIGO_CONSTRUCTORA, NOMBRE_CONSTRUCTORA, BLOB_ARCHIVO, MIME_TYPE FROM INM_CONSTRUCTORAS";

    public static final String Query_configuracionINM = "SELECT DISTINCT CONF.NUMERO_CONFIG, CONF.CODIGO_TIPO_INMUEBLE, TIIN.NOMBRE_TIPO_INMUEBLE, TIIN.TORRES_SN\n"
            + "FROM  INM_CONFIG_PROYECTO CONF, TIPO_INMUEBLE TIIN\n"
            + "WHERE CONF.CODIGO_TIPO_FIDEICOMISO = ?\n"
            + "AND CONF.CODIGO_SUBTIPO_FIDEICOMISO = ?\n"
            + "AND CONF.CODIGO_FIDEICOMISO = ?\n"
            + "AND CONF.ETAPA_FIDEICOMISO = ?\n"
            + "AND CONF.CODIGO_TIPO_INMUEBLE = TIIN.CODIGO_TIPO_INMUEBLE\n"
            + "ORDER BY CONF.NUMERO_CONFIG, CONF.CODIGO_TIPO_INMUEBLE";

    public static final String Query_perfiles = "select CODIGO_PERFIL, DESCRIPCION_PERFIL,TIPO_USUARIO  from INM_PERFILES_USUARIOS";
}
