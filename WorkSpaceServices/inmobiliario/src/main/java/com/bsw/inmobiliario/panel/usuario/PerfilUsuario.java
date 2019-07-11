/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.panel.usuario;

import java.io.Serializable;
import javax.validation.Valid;
import org.hibernate.validator.constraints.NotEmpty;



/**
 *
 * @author bswndeshm
 */
public class PerfilUsuario implements Serializable{
    
    @Valid
    @NotEmpty(message = "{UsuariosBean.perfil.InvalidNotEmptyPerfil}")
    private String codigoPerfil;
    
    @Valid
    @NotEmpty(message = "{UsuariosBean.perfil.InvalidNotEmptyPerfil}")
    private String descripcionPerfil;
    
    @Valid
    @NotEmpty(message = "{UsuariosBean.perfil.InvalidNotEmptyPerfil}")
    private String tipoUsuario;
    
    public String getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(String codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public String getDescripcionPerfil() {
        return descripcionPerfil;
    }

    public void setDescripcionPerfil(String descripcionPerfil) {
        this.descripcionPerfil = descripcionPerfil;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
