/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.mdm;

/**
 *
 * @author bswndeshm
 */
public class TipoInmueble {
    
	private String codigo;

	private String  descripcion;

	private String  prefijo;

	private String inmueble;

	private String torres;

        private String nombre;
        
        private String inm_sn;
        
        private String torres_sn;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getInmueble() {
        return inmueble;
    }

    public void setInmueble(String inmueble) {
        this.inmueble = inmueble;
    }

    public String getTorres() {
        return torres;
    }

    public void setTorres(String torres) {
        this.torres = torres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInm_sn() {
        return inm_sn;
    }

    public void setInm_sn(String inm_sn) {
        this.inm_sn = inm_sn;
    }

    public String getTorres_sn() {
        return torres_sn;
    }

    public void setTorres_sn(String torres_sn) {
        this.torres_sn = torres_sn;
    }
        
    
}
