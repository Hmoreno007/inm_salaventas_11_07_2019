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
import org.apache.wicket.extensions.markup.html.repeater.data.table.DataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.HeadersToolbar;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.NavigationToolbar;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.data.EmptyDataProvider;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.Model;

/**
 *
 * @author bswndeshm
 */
public class UsuariosGrid extends Panel {

    private DataTable datatable;
    private List<Usuarios> listausuarios;
    private transient UsuariosModelo usaurioobj;

    public UsuariosGrid(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);

        usaurioobj = new UsuariosModelo();
        LoadableDetachableModel<List<UsuariosBean>> listausuarios = new LoadableDetachableModel<List<UsuariosBean>>() {
            @Override
            protected List<UsuariosBean> load() {
                usaurioobj = new UsuariosModelo();
                return usaurioobj.obtenerUsuarios(SalaVentasApp.url_2_esb_service);
            }
        };

        List<IColumn> columns = new ArrayList<IColumn>();
        columns.add(new PropertyColumn(Model.of("Usuario"), "usuario"));
        columns.add(new PropertyColumn(Model.of("TipoIdentificacion"), "tipoIdentificacion"));
        columns.add(new PropertyColumn(Model.of("NumeroIdentificacion"), "numeroIdentificacion"));
        columns.add(new PropertyColumn(Model.of("Nombre"), "nombre"));
        columns.add(new PropertyColumn(Model.of("Correo"), "correo"));
        columns.add(new PropertyColumn(Model.of("Perfil"), "perfil"));
        columns.add(new PropertyColumn(Model.of("Estado"), "estado"));
        columns.add(new PropertyColumn(Model.of("Ultconexion"), "ultconexion"));

        datatable = new DataTable("datatable", columns, new EmptyDataProvider(), PATH_SEPARATOR);
        datatable.addBottomToolbar(new NavigationToolbar(datatable));
        datatable.addTopToolbar(new HeadersToolbar(datatable, null));
        add(datatable);
    }

}
