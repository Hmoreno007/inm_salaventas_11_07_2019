/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario.panel.EstadosInmuebles;

import com.bsw.inmobiliario.SalaVentasApp;
import java.util.ArrayList;
import java.util.List;
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
public class EstadosInmueblesGrid  extends Panel{

    private DataTable datatable;
    private List<EstadosInmueblesBean> listaestados;
    private transient EstadosInmModelo estadoobj;
    
    public EstadosInmueblesGrid(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        estadoobj = new EstadosInmModelo();
         List<EstadosInmueble> listaestados = new ArrayList<EstadosInmueble>();
        listaestados = estadoobj.obtenerEstadosInm(SalaVentasApp.url_2_esb_service);
        WebMarkupContainer datacontainer = new WebMarkupContainer("data");
        datacontainer.setOutputMarkupId(true);
        add(datacontainer);
         PageableListView listview = new PageableListView("rows", listaestados, 5) {
            @Override
            protected void populateItem(ListItem li) {
                li.add(new Label("codigo", ((EstadosInmueble) li.getModelObject()).getCodigo()));
                li.add(new Label("descripcion", ((EstadosInmueble) li.getModelObject()).getDescripcion()));
                li.add(new Label("observacion", ((EstadosInmueble) li.getModelObject()).getObservacion()));
                li.add(new Label("color", ((EstadosInmueble) li.getModelObject()).getColor()));
                li.add(new AjaxLink("editar") {
                    @Override
                    public void onClick(AjaxRequestTarget art) {
                        art.prependJavaScript("alert('editar')");
                    }
                });
                 li.add(new AjaxLink("eliminar") {
                    @Override
                    public void onClick(AjaxRequestTarget art) {
                        art.prependJavaScript("alert('eliminar')");
                    }
                });
            }            
        };
        datacontainer.add(listview);
        datacontainer.add(new AjaxPagingNavigator("navigator", listview));
        datacontainer.setVersioned(false);
    }
    
}
