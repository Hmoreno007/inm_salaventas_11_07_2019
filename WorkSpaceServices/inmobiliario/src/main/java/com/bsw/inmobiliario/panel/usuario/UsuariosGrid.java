/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.panel.usuario;

import com.bsw.inmobiliario.SalaVentasApp;
import com.bsw.inmobiliario.panel.usuario.modelo.UsuariosModelo;
import java.util.ArrayList;
import java.util.List;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DataTable;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 * @author bswndeshm
 */
public class UsuariosGrid extends Panel {

    private DataTable datatable;
    private List<UsuariosBean> listausuarios;
    private transient UsuariosModelo usaurioobj;
    

    private static final String CONTENT_ID = "contentUser";
    private Component current;
    private Component usuarios;
    private WebMarkupContainer root, windowpanel;
    private final AjaxLink closecontentpanels;
    private final AjaxLink newuser;

    public UsuariosGrid(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        queue((windowpanel = new WebMarkupContainer("windowpanel")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(false));         
        queue(current = new Label(CONTENT_ID));
        queue(newuser = new AjaxLink("newuser") {            
            @Override
            public void onClick(AjaxRequestTarget art) {
               current.replaceWith(usuarios = new Usuarios(CONTENT_ID, ""));
                current = usuarios;
                windowpanel.setVisible(true);
                art.add(windowpanel); 
            }
        });
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
        ///////
        usaurioobj = new UsuariosModelo();
        List<Usuario> listausuarios = new ArrayList<Usuario>();
        listausuarios = usaurioobj.obtenerUsuarios(SalaVentasApp.url_2_esb_service);
        WebMarkupContainer datacontainer = new WebMarkupContainer("data");
        datacontainer.setOutputMarkupId(true);
        add(datacontainer);
        
        
        PageableListView listview = new PageableListView("rows", listausuarios, 5) {
            @Override
            protected void populateItem(ListItem item) {
                final Usuario user = (Usuario) item.getModelObject();
                PerfilUsuario perfi = usaurioobj.obtenerPerf(SalaVentasApp.url_2_esb_service, user.getPerfil());
                EstadoUsuario estado = usaurioobj.obtenerEstado(SalaVentasApp.url_2_esb_service, user.getEstado());
                item.add(new Label("usuario", ((Usuario) item.getModelObject()).getUsuario()));
                item.add(new Label("tipoIdentificacion", ((Usuario) item.getModelObject()).getTipoIdentificacion()));
                item.add(new Label("numeroIdentificacion", ((Usuario) item.getModelObject()).getNumeroIdentificacion()));
                item.add(new Label("nombre", ((Usuario) item.getModelObject()).getNombre()));
                item.add(new Label("correo", ((Usuario) item.getModelObject()).getCorreo()));
                item.add(new Label("perfil", perfi.getDescripcionPerfil()));
                item.add(new Label("estado", estado.getDescripcion()));
                item.add(new AjaxLink("editar") {
                    @Override
                    public void onClick(AjaxRequestTarget art) {
                        art.prependJavaScript("alert('Editar?" + user.getUsuario() + "')");
                        current.replaceWith(usuarios = new Usuarios(CONTENT_ID, user.getUsuario()));
                        current = usuarios;
                        art.add(current);
                        windowpanel.setVisible(true);
                        art.add(windowpanel);
                    }
                });
                 item.add(new AjaxLink("eliminar") {
                    @Override
                    public void onClick(AjaxRequestTarget art) {
                         art.prependJavaScript("alert('Elimina:" + user.getUsuario() + "')");
                    }
                });
            }
        };
        
        
        
        
        
        
        datacontainer.add(listview);
        datacontainer.add(new AjaxPagingNavigator("navigator", listview));
        datacontainer.setVersioned(false);
                      
    }

   
}
