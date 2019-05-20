/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.service;

import com.digitrust.esb.inmobiliario.mdm.Configuracion;
import com.digitrust.esb.inmobiliario.mdm.Configuraciones;
import com.digitrust.esb.inmobiliario.mdm.Constructoras;
import com.digitrust.esb.inmobiliario.mdm.EstadosInmobiliaria;
import com.digitrust.esb.inmobiliario.mdm.EstadosInmobiliarias;
import com.digitrust.esb.inmobiliario.mdm.PerfilUsuarios;
import com.digitrust.esb.inmobiliario.mdm.TipoInmuebles;
import com.digitrust.esb.inmobiliario.mdm.Usuario;
import com.digitrust.esb.inmobiliario.mdm.Usuarios;
import com.digitrust.esb.inmobiliario.service.executor.GestionConfiguracion;
import com.digitrust.esb.inmobiliario.service.executor.GestionConstructoras;
import com.digitrust.esb.inmobiliario.service.executor.GestionUsuarios;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author bswndesim
 */
public class InmobiliarioHandler {

    private DataSource dataSource;
    private static final Logger LOGGER = LoggerFactory.getLogger(InmobiliarioHandler.class);

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void init() {

    }

    public void destroy() throws SQLException {
        dataSource.getConnection().close();
    }

    public Usuarios consultarUsuarios() {
        Usuarios usuarios = new Usuarios();
        GestionUsuarios exec = new GestionUsuarios();
        try (Connection cn = dataSource.getConnection()) {
            usuarios = exec.consultarUsuarios(cn);
            cn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InmobiliarioHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
    
    public PerfilUsuarios consultarPerfilUsuarios(){
        PerfilUsuarios perfiles = new PerfilUsuarios();
        GestionUsuarios exec = new GestionUsuarios();
        try (Connection cn = dataSource.getConnection()) {
            perfiles = exec.consultarPerfiles(cn);
            cn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InmobiliarioHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return perfiles;
    }
    

    public Usuario consultaUsuarioContrasena(Usuario usuario) {
        Usuario result = new Usuario();
        GestionUsuarios exec = new GestionUsuarios();
        try (Connection cn = dataSource.getConnection()) {
            result = exec.consultaUsuarioContrasena(usuario, cn);
            cn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InmobiliarioHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public EstadosInmobiliarias consultaEstados() {
        EstadosInmobiliarias result = new EstadosInmobiliarias();
        GestionUsuarios exec = new GestionUsuarios();
        try (Connection cn = dataSource.getConnection()) {
            result = exec.consultaEstados(cn);
            cn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InmobiliarioHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public EstadosInmobiliaria consultaEstadosById(EstadosInmobiliaria estadosInmobiliaria) {
        EstadosInmobiliaria result = new EstadosInmobiliaria();
        GestionUsuarios exec = new GestionUsuarios();
        try (Connection cn = dataSource.getConnection()) {
            result = exec.consultaEstadosById(estadosInmobiliaria, cn);
            cn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InmobiliarioHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
     public TipoInmuebles consultaTipoInmuebles (){
        TipoInmuebles result = new TipoInmuebles();
        GestionUsuarios exec = new GestionUsuarios();
         try (Connection cn = dataSource.getConnection()) {
            result = exec.consultaTipoInmuebles(cn);
            cn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InmobiliarioHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

        public Constructoras consultaConstructora (){
        Constructoras result = new Constructoras();
        GestionConstructoras exec = new GestionConstructoras();
         try (Connection cn = dataSource.getConnection()) {
            result = exec.consultaConstructora(cn);
            cn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InmobiliarioHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
       public Configuraciones configuracionxfideicomiso(Configuracion configuracion){
       Configuraciones result = new Configuraciones();
       GestionConfiguracion exec = new GestionConfiguracion();
           try (Connection cn = dataSource.getConnection()) {
            result = exec.consultaConfigXfideicomiso(configuracion, cn);
            cn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InmobiliarioHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
           return null;
       }
        
}
