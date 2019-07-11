 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario;

import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

/**
 *
 * @author bswndeshm
 */
public class UserSession extends WebSession{
    
    private USerModel uSerModel;
    
    public UserSession(Request request) {
        super(request);
    }
    
    public static UserSession getInstance(){
        return (UserSession) Session.get();
    }

    public USerModel getuSerModel() {
        return uSerModel;
    }

    public void setuSerModel(USerModel uSerModel) {
        this.uSerModel = uSerModel;
    }
    
    
}
