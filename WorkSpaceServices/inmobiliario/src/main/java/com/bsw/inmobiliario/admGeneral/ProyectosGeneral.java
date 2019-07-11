/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.admGeneral;

/**
 *
 * @author bswndeshm
 */
public class ProyectosGeneral {
       private int codigo_tipo_fideicomiso;
    
   private int  codigo_subtipo_fideicomiso;
   
   private int codigo_fideicomiso;
   
   private int numero_fideicomiso;
   
   private String descripc_fidei_numero;
   
   private String formato_fecha;
   
   private String formato_decimal;
   
   private int codigo_constructora;
   
   private String blob_archivo;
   
   private String mime_type;

    public int getCodigo_tipo_fideicomiso() {
        return codigo_tipo_fideicomiso;
    }

    public void setCodigo_tipo_fideicomiso(int codigo_tipo_fideicomiso) {
        this.codigo_tipo_fideicomiso = codigo_tipo_fideicomiso;
    }

    public int getCodigo_subtipo_fideicomiso() {
        return codigo_subtipo_fideicomiso;
    }

    public void setCodigo_subtipo_fideicomiso(int codigo_subtipo_fideicomiso) {
        this.codigo_subtipo_fideicomiso = codigo_subtipo_fideicomiso;
    }

    public int getCodigo_fideicomiso() {
        return codigo_fideicomiso;
    }

    public void setCodigo_fideicomiso(int codigo_fideicomiso) {
        this.codigo_fideicomiso = codigo_fideicomiso;
    }

    public int getNumero_fideicomiso() {
        return numero_fideicomiso;
    }

    public void setNumero_fideicomiso(int numero_fideicomiso) {
        this.numero_fideicomiso = numero_fideicomiso;
    }

    public String getDescripc_fidei_numero() {
        return descripc_fidei_numero;
    }

    public void setDescripc_fidei_numero(String descripc_fidei_numero) {
        this.descripc_fidei_numero = descripc_fidei_numero;
    }

    public String getFormato_fecha() {
        return formato_fecha;
    }

    public void setFormato_fecha(String formato_fecha) {
        this.formato_fecha = formato_fecha;
    }

    public String getFormato_decimal() {
        return formato_decimal;
    }

    public void setFormato_decimal(String formato_decimal) {
        this.formato_decimal = formato_decimal;
    }

    public int getCodigo_constructora() {
        return codigo_constructora;
    }

    public void setCodigo_constructora(int codigo_constructora) {
        this.codigo_constructora = codigo_constructora;
    }

    public String getBlob_archivo() {
        return blob_archivo;
    }

    public void setBlob_archivo(String blob_archivo) {
        this.blob_archivo = blob_archivo;
    }

    public String getMime_type() {
        return mime_type;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }
   
   
}
