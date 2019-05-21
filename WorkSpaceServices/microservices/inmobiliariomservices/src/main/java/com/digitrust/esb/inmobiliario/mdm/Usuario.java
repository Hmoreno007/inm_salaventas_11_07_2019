/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.mdm;

import java.sql.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bswndesim
 */
@XmlRootElement(name = "usuario")
public class Usuario {
        
    private String usuario;

    private String perfil;

    private String contrasena;

    private String confirmarContrasena;

    private String ceo_sn;
    
    private String adm_sn;
    
    private String pro_sn;
    
    private String cli_sn;

    private String nombre;

    private String correo;

    private String estado;

    private String tipoIdentificacion;
    
    private String descripcion;

    private int numeroIdentificacion;
    
    private Date fechaUltiConex;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getConfirmarContrasena() {
        return confirmarContrasena;
    }

    public void setConfirmarContrasena(String confirmarContrasena) {
        this.confirmarContrasena = confirmarContrasena;
    }

    public String getCeo_sn() {
        return ceo_sn;
    }

    public void setCeo_sn(String ceo_sn) {
        this.ceo_sn = ceo_sn;
    }

    public String getAdm_sn() {
        return adm_sn;
    }

    public void setAdm_sn(String adm_sn) {
        this.adm_sn = adm_sn;
    }

    public String getPro_sn() {
        return pro_sn;
    }

    public void setPro_sn(String pro_sn) {
        this.pro_sn = pro_sn;
    }

    public String getCli_sn() {
        return cli_sn;
    }

    public void setCli_sn(String cli_sn) {
        this.cli_sn = cli_sn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Date getFechaUltiConex() {
        return fechaUltiConex;
    }

    public void setFechaUltiConex(Date fechaUltiConex) {
        this.fechaUltiConex = fechaUltiConex;
    }

    
   
}
