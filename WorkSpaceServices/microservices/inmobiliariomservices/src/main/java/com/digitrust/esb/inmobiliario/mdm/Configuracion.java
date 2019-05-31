/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.mdm;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author bswndeshm
 */
public class Configuracion {
   
        //private Fideicomiso detFideicomiso;
        
        private int CodigoTipoFideicomiso;
        
        private int codigoSubtipoFideicomiso;
                
        private int codigoFideicomiso;
        
        private int estapaFideicomiso;
        
        private int numero;
        
       private List<TipoInmueble> nombreTipoInm;
       
        private String nombreTipoInmu;
        
        private String codigoTipoInm;
        
        private String codigoDetalleInm;
            
	private String distribuidoSn;

	private Date fechaCreacion;

	private String loginUsuario;

	private BigDecimal numPisos;

	private BigDecimal numTorres;

	private BigDecimal numUnidades;

	private BigDecimal numUnidsPiso;

	private BigDecimal numUnidsUsadas;
        
        private String torresSN;
        
        private String distribuidoSN;

    public int getCodigoTipoFideicomiso() {
        return CodigoTipoFideicomiso;
    }

    public void setCodigoTipoFideicomiso(int CodigoTipoFideicomiso) {
        this.CodigoTipoFideicomiso = CodigoTipoFideicomiso;
    }

    public int getCodigoSubtipoFideicomiso() {
        return codigoSubtipoFideicomiso;
    }

    public void setCodigoSubtipoFideicomiso(int codigoSubtipoFideicomiso) {
        this.codigoSubtipoFideicomiso = codigoSubtipoFideicomiso;
    }

    public int getCodigoFideicomiso() {
        return codigoFideicomiso;
    }

    public void setCodigoFideicomiso(int codigoFideicomiso) {
        this.codigoFideicomiso = codigoFideicomiso;
    }

    public int getEstapaFideicomiso() {
        return estapaFideicomiso;
    }

    public void setEstapaFideicomiso(int estapaFideicomiso) {
        this.estapaFideicomiso = estapaFideicomiso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<TipoInmueble> getNombreTipoInm() {
        return nombreTipoInm;
    }

    public void setNombreTipoInm(List<TipoInmueble> nombreTipoInm) {
        this.nombreTipoInm = nombreTipoInm;
    }

    public String getNombreTipoInmu() {
        return nombreTipoInmu;
    }

    public void setNombreTipoInmu(String nombreTipoInmu) {
        this.nombreTipoInmu = nombreTipoInmu;
    }

    public String getCodigoTipoInm() {
        return codigoTipoInm;
    }

    public void setCodigoTipoInm(String codigoTipoInm) {
        this.codigoTipoInm = codigoTipoInm;
    }

    public String getCodigoDetalleInm() {
        return codigoDetalleInm;
    }

    public void setCodigoDetalleInm(String codigoDetalleInm) {
        this.codigoDetalleInm = codigoDetalleInm;
    }

    public String getDistribuidoSn() {
        return distribuidoSn;
    }

    public void setDistribuidoSn(String distribuidoSn) {
        this.distribuidoSn = distribuidoSn;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public BigDecimal getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(BigDecimal numPisos) {
        this.numPisos = numPisos;
    }

    public BigDecimal getNumTorres() {
        return numTorres;
    }

    public void setNumTorres(BigDecimal numTorres) {
        this.numTorres = numTorres;
    }

    public BigDecimal getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(BigDecimal numUnidades) {
        this.numUnidades = numUnidades;
    }

    public BigDecimal getNumUnidsPiso() {
        return numUnidsPiso;
    }

    public void setNumUnidsPiso(BigDecimal numUnidsPiso) {
        this.numUnidsPiso = numUnidsPiso;
    }

    public BigDecimal getNumUnidsUsadas() {
        return numUnidsUsadas;
    }

    public void setNumUnidsUsadas(BigDecimal numUnidsUsadas) {
        this.numUnidsUsadas = numUnidsUsadas;
    }

    public String getTorresSN() {
        return torresSN;
    }

    public void setTorresSN(String torresSN) {
        this.torresSN = torresSN;
    }

    public String getDistribuidoSN() {
        return distribuidoSN;
    }

    public void setDistribuidoSN(String distribuidoSN) {
        this.distribuidoSN = distribuidoSN;
    }

    
  
}
