/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.admGlobal;

import com.bsw.inmobiliario.components.AjaxButtonconfigured;
import com.bsw.inmobiliario.panel.EstadosInmuebles.EstadosInmuebles;
import com.bsw.inmobiliario.panel.EstadosInmuebles.EstadosInmueblesGrid;
import com.bsw.inmobiliario.panel.usuario.Usuarios;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 * @author bswndeshm
 */
public class ParametrosGenerales extends Panel {

    private static final String CONTENT_ID = "contentparameters";
    private final AjaxLink closecontentpanels;
    private final AjaxLink openabonos, openestadosinm, opentipoinm;
    private WebMarkupContainer windowparameters, formpanel;
    private Component current, estados;

    public ParametrosGenerales(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);        
        queue((windowparameters = new WebMarkupContainer("windowparameters")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(false));        
        queue((formpanel = new WebMarkupContainer("formpanel")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(true));
        queue(current = new Label(CONTENT_ID));        
        queue(openabonos = new AjaxLink("openabonos") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                art.prependJavaScript("alert('Abonos')");
            }
        });
        queue(openestadosinm = new AjaxLink("openestadosinm") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                art.prependJavaScript("alert('Estados')");
                current.replaceWith(estados = new EstadosInmueblesGrid(CONTENT_ID));
                current = estados;
                art.add(current);
                windowparameters.setVisible(true);
                art.add(windowparameters);
            }
        });
        queue(opentipoinm = new AjaxLink("opentipoinm") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                art.prependJavaScript("alert('Tipos')");
            }
        });       
        queue(closecontentpanels = new AjaxLink("closecontentpanels") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                current.setVisible(false);
                target.add(current);
                windowparameters.setVisible(false);
                target.add(windowparameters);
            }
        });   
        current.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
    }

}
