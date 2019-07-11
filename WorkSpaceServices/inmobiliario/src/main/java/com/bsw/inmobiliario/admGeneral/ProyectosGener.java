/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.admGeneral;

import com.bsw.inmobiliario.SalaVentasApp;
import java.util.ArrayList;
import java.util.List;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 * @author bswndeshm
 */
public class ProyectosGener extends Panel {
        
    private final transient ProyectosGenerModelo proyecobj;
    
    public ProyectosGener(String id, String usuario) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true); 
        proyecobj = new ProyectosGenerModelo();
        List<ProyectosGeneral> listaproyect = new ArrayList<ProyectosGeneral>();
        listaproyect = proyecobj.consultarProyectosByUsuario(SalaVentasApp.url_2_esb_service, usuario);
        WebMarkupContainer datacontainer = new WebMarkupContainer("formpanel");
        datacontainer.setOutputMarkupId(true);
        add(datacontainer);                
        PageableListView listview = new PageableListView("rows", listaproyect, listaproyect.size()) {
            @Override
            protected void populateItem(ListItem item) {                
                item.add(new Label("descripcionFideicomiso", ((ProyectosGeneral) item.getModelObject()).getDescripc_fidei_numero()));  
                item.add(new AjaxLink("btn") {
                    @Override
                    public void onClick(AjaxRequestTarget art) {
                        art.prependJavaScript("alert('btn')");
                    }
                });
            }
        };        
        datacontainer.add(listview);       
        datacontainer.setVersioned(false);
    }
    
}
