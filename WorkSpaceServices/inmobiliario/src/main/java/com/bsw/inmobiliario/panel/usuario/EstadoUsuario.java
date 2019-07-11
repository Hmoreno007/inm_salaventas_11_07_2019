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
public class EstadoUsuario implements Serializable{
    @NotNull(message = "{UsuariosBean.estado.InvalidNotNull}")
    private String estado;
    
    @NotNull(message = "{UsuariosBean.estado.InvalidNotNull}")
    private String descripcion;
    
    @NotNull(message = "{UsuariosBean.estado.InvalidNotNull}")
    private String ingresoSN;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIngresoSN() {
        return ingresoSN;
    }

    public void setIngresoSN(String ingresoSN) {
        this.ingresoSN = ingresoSN;
    }
    
    
}
