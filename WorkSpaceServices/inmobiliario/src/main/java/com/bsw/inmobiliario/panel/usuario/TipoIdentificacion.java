/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.panel.usuario;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author bswndeshm
 */
public class TipoIdentificacion implements Serializable{
    @NotNull(message = "{UsuariosBean.tipoIdentificacion.InvalidNotNullTipoIdentificacion}")
    private String claseDocumento;
    @NotNull(message = "{UsuariosBean.tipoIdentificacion.InvalidNotNullTipoIdentificacion}")
     private String descripDocumento;
    
     private int cod_Superfinanciera;
     private String cod_Mundosotf;
     private String usuario;
     private String ip;
     private String nombre_maquina;
     private String tipoPersona;
     private String ident_ext;

    public String getClaseDocumento() {
        return claseDocumento;
    }

    public void setClaseDocumento(String claseDocumento) {
        this.claseDocumento = claseDocumento;
    }

    public String getDescripDocumento() {
        return descripDocumento;
    }

    public void setDescripDocumento(String descripDocumento) {
        this.descripDocumento = descripDocumento;
    }

    public int getCod_Superfinanciera() {
        return cod_Superfinanciera;
    }

    public void setCod_Superfinanciera(int cod_Superfinanciera) {
        this.cod_Superfinanciera = cod_Superfinanciera;
    }

    public String getCod_Mundosotf() {
        return cod_Mundosotf;
    }

    public void setCod_Mundosotf(String cod_Mundosotf) {
        this.cod_Mundosotf = cod_Mundosotf;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombre_maquina() {
        return nombre_maquina;
    }

    public void setNombre_maquina(String nombre_maquina) {
        this.nombre_maquina = nombre_maquina;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getIdent_ext() {
        return ident_ext;
    }

    public void setIdent_ext(String ident_ext) {
        this.ident_ext = ident_ext;
    }
     
}
