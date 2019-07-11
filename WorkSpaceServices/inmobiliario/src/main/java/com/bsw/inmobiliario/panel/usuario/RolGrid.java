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
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author bswndeshm
 */
public class RolGrid extends Panel {

    private final AjaxLink grabar;
    private final transient UsuariosModelo usaurioobj;
    private final Rol rols;
    //private CheckBox checkbox1;

    public RolGrid(String id, String usuario) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        usaurioobj = new UsuariosModelo();
        rols = new Rol();
        List<Rol> listaroles = new ArrayList<Rol>();
        listaroles = usaurioobj.obtenerRoles(SalaVentasApp.url_2_esb_service);
        WebMarkupContainer datacontainer = new WebMarkupContainer("data");
        datacontainer.setOutputMarkupId(true);
        add(datacontainer);
        PageableListView listview = new PageableListView("rows", listaroles, 5) {
            @Override
            protected void populateItem(ListItem li) {
                li.add(new Label("rol", ((Rol) li.getModelObject()).getCodigo()));
                li.add(new Label("descripcion", ((Rol) li.getModelObject()).getDescripcion()));
                //final CheckBox chk;
                li.add(new CheckBox("checkboxhtml",new PropertyModel<Boolean>(this, "")));    
                //System.out.println("valor check:" + chk.getModelObject().toString());
                
            }
        };
        datacontainer.add(listview);
        datacontainer.add(new AjaxPagingNavigator("navigator", listview));
        datacontainer.setVersioned(false);
        queue(grabar = new AjaxLink("grabar") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                // art.prependJavaScript("alert('valor check 1: "+ checkbox1.getValue() +" 2: "+ checkbox1.getValue().toString() +" 3: "+  checkbox1.toString() +"')");                            
            }
        });
    }

}
