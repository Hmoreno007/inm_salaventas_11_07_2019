/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.service.executor;

import com.digitrust.esb.inmobiliario.mdm.EstadosInmobiliaria;
import com.digitrust.esb.inmobiliario.mdm.EstadosInmobiliarias;
import com.digitrust.esb.inmobiliario.mdm.PerfilUsuario;
import com.digitrust.esb.inmobiliario.mdm.PerfilUsuarios;
import com.digitrust.esb.inmobiliario.mdm.TipoInmueble;
import com.digitrust.esb.inmobiliario.mdm.TipoInmuebles;
import com.digitrust.esb.inmobiliario.mdm.Usuario;
import com.digitrust.esb.inmobiliario.mdm.Usuarios;
import com.digitrust.esb.inmobiliario.service.helpers.SentenceHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bswndesim
 */
public class GestionUsuarios {
    public Usuarios consultarUsuarios(Connection cn) throws SQLException {
        Usuarios result = new Usuarios();
        PreparedStatement sta;
        sta = cn.prepareStatement(SentenceHelper.Query__Usuarios);
        ResultSet rst;
        rst = sta.executeQuery();
        result.setUsuarios(new ArrayList<Usuario>());
        while (rst.next()) {
            Usuario usr = new Usuario();
            usr.setUsuario(rst.getString("USERNAME"));
            usr.setContrasena(rst.getString("PASSWORD_RAW"));
            usr.setNumeroIdentificacion(rst.getInt("IDENTIFICACION"));
            usr.setTipoIdentificacion(rst.getString("CLASE_DOCUMENTO"));
            usr.setCorreo(rst.getString("EMAIL"));
            usr.setNombre(rst.getString("NOMBRE"));
            usr.setPerfil(rst.getString("PERFIL"));
            usr.setEstado(rst.getString("ESTADO"));
            usr.setFechaUltiConex(rst.getDate("ULT_CONEXION"));
            result.getUsuarios().add(usr);
        }
        rst.close();
        sta.close();
        cn.close();
        return result;
    }
   
    
    public Usuario consultaUsuarioContrasena(Usuario usuario, Connection cn) throws SQLException {
        Usuario result = new Usuario();
        PreparedStatement sta;
        sta = cn.prepareStatement(SentenceHelper.Query_Contrasena);
        sta.setString(1, usuario.getUsuario());
        ResultSet rst;
        rst = sta.executeQuery();
        while (rst.next()) {
            result.setNombre(rst.getString("NOMBRE"));
            result.setPerfil(rst.getString("PERFIL"));
            result.setEstado(rst.getString("ESTADO"));
        }
        rst.close();
        sta.close();
        cn.close();
        return result;
    }
    public EstadosInmobiliarias consultaEstados(Connection cn) throws SQLException {
        EstadosInmobiliarias result = new EstadosInmobiliarias();
        PreparedStatement sta;
        sta = cn.prepareStatement(SentenceHelper.Query_estados);
        ResultSet rst = sta.executeQuery();
        result.setEstados(new ArrayList<EstadosInmobiliaria>());
        while (rst.next()) {
            EstadosInmobiliaria est = new EstadosInmobiliaria();
            est.setCodigo(rst.getString("CODIGO_ESTADO_INM"));
            est.setDescripcion(rst.getString("DESCRIPCION_ESTADO_INM"));
            est.setObservacion(rst.getString("OBSERVACION_ESTADO_INM"));
            est.setColor(rst.getString("COLOR_ESTADO_INM"));
            result.getEstados().add(est);
        }
        rst.close();
        sta.close();
        cn.close();
        return result;
    }
    
    public EstadosInmobiliaria consultaEstadosById(EstadosInmobiliaria estadosInmobiliaria,Connection cn) throws SQLException {
        EstadosInmobiliaria result = new EstadosInmobiliaria();
        PreparedStatement sta;
        sta = cn.prepareStatement(SentenceHelper.Query_estadosById);
        sta.setString(1, estadosInmobiliaria.getCodigo());
        ResultSet rst;
        rst = sta.executeQuery();
        while (rst.next()) {
            result.setCodigo(rst.getString("CODIGO_ESTADO_INM"));
            result.setDescripcion(rst.getString("DESCRIPCION_ESTADO_INM"));
            result.setObservacion(rst.getString("OBSERVACION_ESTADO_INM"));
            result.setColor(rst.getString("COLOR_ESTADO_INM"));
        }
        rst.close();
        sta.close();
        cn.close();
        return result;
    }
    public PerfilUsuarios consultarPerfiles(Connection cn) throws SQLException {
        PerfilUsuarios result = new PerfilUsuarios();
        PreparedStatement sta;
        sta = cn.prepareStatement(SentenceHelper.Query_perfiles);
        ResultSet rst = sta.executeQuery();
        result.setPerfiles(new ArrayList<PerfilUsuario>());
        while (rst.next()) {
            PerfilUsuario perf = new PerfilUsuario();
            perf.setCodigoPerfil(rst.getString("CODIGO_PERFIL"));
            perf.setDescripcionPerfil(rst.getString("DESCRIPCION_PERFIL"));
            perf.setTipoUsuario(rst.getString("TIPO_USUARIO"));
            result.getPerfiles().add(perf);
        }
        rst.close();
        sta.close();
        cn.close();
        return result;
    }
    
    public TipoInmuebles consultaTipoInmuebles(Connection cn) throws SQLException {
        TipoInmuebles result = new TipoInmuebles();
        PreparedStatement sta;
        sta = cn.prepareStatement(SentenceHelper.Query_TipoInmueble);
        ResultSet rst;
        rst = sta.executeQuery();
        result.setTipo(new ArrayList<TipoInmueble>());
        while (rst.next()) {
            TipoInmueble tipo = new TipoInmueble();
            tipo.setCodigo(rst.getString("codigo_tipo_inmueble"));
            tipo.setNombre(rst.getString("nombre_tipo_inmueble"));
            tipo.setPrefijo(rst.getString("prefijo_inmueble"));
            tipo.setInm_sn(rst.getString("inm_sn"));
            tipo.setTorres_sn(rst.getString("torres_sn"));   
            result.getTipo().add(tipo);
        }
        rst.close();
        sta.close();
        cn.close();
        return result;
    }
}
