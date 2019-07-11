/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario;

import java.io.Serializable;

/**
 *
 * @author bswndeshm
 */
public class USerModel implements Serializable{
    private String username;
    private String password;

    public USerModel(){
    }
    
    public USerModel(String username){
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
