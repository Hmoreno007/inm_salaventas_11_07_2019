package com.bsw.inmobiliario;

import com.bsw.inmobiliario.components.AjaxButtonconfigured;
import com.bsw.inmobiliario.panel.usuario.Usuarios;
import com.bsw.inmobiliario.panel.AbonosInmueble.AbonosInmueble;
import com.bsw.inmobiliario.panel.Configuracion.Configuracion;
import com.bsw.inmobiliario.panel.Constructora.Constructora;
import com.bsw.inmobiliario.panel.DetalleUnidades.DetalleUnidades;
import com.bsw.inmobiliario.panel.Generalidades.Generalidades;
import com.bsw.inmobiliario.panel.PlanDePagos.PlanDePagos;
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
    private AjaxButtonconfigured openusuariopanel, openusuariogrid, openconfiguracion;
    private Component current;
    private Component usuarios, usuariogrid, configuracion;
    private WebMarkupContainer root, windowpanel;
    private AjaxLink closecontentpanels;

    public MainPanel(String id) {
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
        //queue((mainform = new WebMarkupContainer("mainform")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(true));
        queue(openusuariopanel = new AjaxButtonconfigured("openusuariopanel"));
        queue(openusuariogrid = new AjaxButtonconfigured("openusuariogrid"));
        queue(openconfiguracion = new AjaxButtonconfigured("openconfiguracion"));

        queue(current = new Label(CONTENT_ID));
        queue(closecontentpanels = new AjaxLink("closecontentpanels") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                current.setVisible(false);
                target.add(current);
                windowpanel.setVisible(false);
                target.add(windowpanel);
            }
        });
        current.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        initComponentBehaviors();
    }

    private void initComponentBehaviors() {
        openusuariopanel.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                current.replaceWith(usuarios = new Usuarios(CONTENT_ID));
                current = usuarios;
                target.add(current);                                
                windowpanel.setVisible(true).isVersioned();
                target.add(windowpanel);
                                
            }
        });

        openconfiguracion.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                current.replaceWith(configuracion = new Configuracion(CONTENT_ID));
                current = configuracion;
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
                windowpanel.setVisible(true);
                target.add(windowpanel);
            }
        });

    }
}
