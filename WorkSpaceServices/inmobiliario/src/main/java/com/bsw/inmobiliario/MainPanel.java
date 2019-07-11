package com.bsw.inmobiliario;

import com.bsw.inmobiliario.admGeneral.ProyectosGener;
import com.bsw.inmobiliario.admGlobal.AdmGlobal;
import com.bsw.inmobiliario.components.AjaxButtonconfigured;
import com.bsw.inmobiliario.panel.Configuracion.Configuracion;
import com.bsw.inmobiliario.panel.usuario.UsuariosGrid;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.Panel;

public class MainPanel extends Panel {

    private static final String CONTENT_ID = "contentpanels";
    private final AjaxButtonconfigured openadmingeneral, openusuariogrid, openventas, openadminglobal;
    private Component current;
    private Component admGlobal, usuariogrid, admGeneral, ventas, login;
    private WebMarkupContainer root, windowpanel, formpanel;
    private final AjaxLink closecontentpanels;

    public MainPanel(String id, String username) {
        super(id);
        Form<?> formmenu = new Form<Void>("mainform") {
            @Override
            protected void onSubmit() {
                super.onSubmit();
            }
        };
        queue(formmenu);
        queue((root = new WebMarkupContainer("root")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true));
        queue((windowpanel = new WebMarkupContainer("windowpanel")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(false));
        queue((formpanel = new WebMarkupContainer("formpanel")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(true));
        queue(openadmingeneral = new AjaxButtonconfigured("openadmingeneral"));
        queue(openadminglobal = new AjaxButtonconfigured("openadminglobal"));
        queue(openusuariogrid = new AjaxButtonconfigured("openusuariogrid"));
        queue(openventas = new AjaxButtonconfigured("openventas"));
        queue(current = new Label(CONTENT_ID));
        queue(closecontentpanels = new AjaxLink("closecontentpanels") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                current.setVisible(false);
                target.add(current);
                windowpanel.setVisible(false);
                target.add(windowpanel);
                formpanel.setVisible(true);
                target.add(formpanel);
            }
        });
        current.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        initComponentBehaviors(username);
        System.out.println(username);
    }

    private void initComponentBehaviors(final String username) {
        openadmingeneral.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                current.replaceWith(admGeneral = new ProyectosGener(CONTENT_ID, username));
                current = admGeneral;
                target.add(current);
                formpanel.setVisible(false);
                target.add(formpanel);
                windowpanel.setVisible(true);
                target.add(windowpanel);
            }
        });

        openadminglobal.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                current.replaceWith(admGlobal = new AdmGlobal(CONTENT_ID));
                current = admGlobal;
                target.add(current);
                formpanel.setVisible(false);
                target.add(formpanel);
                windowpanel.setVisible(true);
                target.add(windowpanel);
            }
        });
            
        openventas.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                current.replaceWith(ventas = new Configuracion(CONTENT_ID));
                current = ventas;
                target.add(current);
                windowpanel.setVisible(true);
                target.add(windowpanel);
            }
        });

        openusuariogrid.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                current.replaceWith(usuariogrid = new UsuariosGrid(CONTENT_ID));
                current = usuariogrid;
                target.add(current);
                formpanel.setVisible(false);
                target.add(formpanel);
                windowpanel.setVisible(true);
                target.add(windowpanel);
            }
        });                
    }
}
