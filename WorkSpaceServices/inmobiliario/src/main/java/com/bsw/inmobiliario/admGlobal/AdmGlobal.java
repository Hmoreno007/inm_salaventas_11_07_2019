/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.admGlobal;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 * @author bswndeshm
 */
public class AdmGlobal extends Panel {

    private static final String CONTENT_ID = "contentparam";
    private final AjaxLink openconstructoras, closecontentpanels, openparametros;
    private WebMarkupContainer btnparametrosgenerales, btnconstructoras;
    private WebMarkupContainer windowparam, formpanel;
    private Component current, parametros;

    public AdmGlobal(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        queue((windowparam = new WebMarkupContainer("windowparam")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(false));
        queue((btnparametrosgenerales = new WebMarkupContainer("btnparametrosgenerales")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(true));
        queue((btnconstructoras = new WebMarkupContainer("btnconstructoras")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(true));
        queue((formpanel = new WebMarkupContainer("formpanel")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(true));
        queue(current = new Label(CONTENT_ID));
        queue(openconstructoras = new AjaxLink("openconstructoras") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                art.prependJavaScript("alert('Constructoras')");
            }
        });
        queue(openparametros = new AjaxLink("openparametros") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                art.prependJavaScript("alert('Parametros')");
                current.replaceWith(parametros = new ParametrosGenerales(CONTENT_ID));
                current = parametros;
                art.add(current);
                btnconstructoras.setVisible(false);
                art.add(btnconstructoras);
                windowparam.setVisible(true);
                art.add(windowparam);
                art.add(btnparametrosgenerales);
                
            }
        });
        queue(closecontentpanels = new AjaxLink("closecontentpanels") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                current.setVisible(false);
                target.add(current);
                windowparam.setVisible(false);
                target.add(windowparam);
                btnconstructoras.setVisible(true);
                target.add(btnconstructoras);
            }
        });
        current.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
    }

}
