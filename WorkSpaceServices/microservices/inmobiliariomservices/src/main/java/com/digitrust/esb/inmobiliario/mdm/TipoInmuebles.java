/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitrust.esb.inmobiliario.mdm;

import java.util.ArrayList;

/**
 *
 * @author bswndeshm
 */
public class TipoInmuebles {
   private ArrayList<TipoInmueble> tipo; 

    public ArrayList<TipoInmueble> getTipo() {
        return tipo;
    }

        public void setTipo(ArrayList<TipoInmueble> tipo) {
        this.tipo = tipo;
    }
}
