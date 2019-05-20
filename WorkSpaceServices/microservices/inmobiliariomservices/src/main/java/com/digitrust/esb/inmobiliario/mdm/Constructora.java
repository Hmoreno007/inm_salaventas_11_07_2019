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
public class Constructora {
    
    private int condigoConstructora;
    
    private String nombreConstructora;
    
    private byte blobArchivo;
    
    private String mimeType;

    public int getCondigoConstructora() {
        return condigoConstructora;
    }

    public void setCondigoConstructora(int condigoConstructora) {
        this.condigoConstructora = condigoConstructora;
    }

    public String getNombreConstructora() {
        return nombreConstructora;
    }

    public void setNombreConstructora(String nombreConstructora) {
        this.nombreConstructora = nombreConstructora;
    }

    public byte getBlobArchivo() {
        return blobArchivo;
    }

    public void setBlobArchivo(byte blobArchivo) {
        this.blobArchivo = blobArchivo;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    
    
}
