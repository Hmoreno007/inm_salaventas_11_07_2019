package com.bsw.inmobiliario.panel.Generalidades;

import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import java.util.List;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

public class Generalidades extends Panel {


    private final AjaxEnabledTextField constructoras;
    private final AjaxEnabledTextField numeroUnidades;
    private final AjaxEnabledTextField numeroParqueos;
    private final AjaxEnabledTextField numeroCuartosUtiles;
    private final AjaxEnabledTextField direccion;
    private final AjaxEnabledTextField telefonoFijo;
    private final AjaxEnabledTextField telefonoMovil;
    private final AjaxEnabledTextField email;
    private final AjaxEnabledTextField ciudad;
    private final AjaxEnabledTextField descripcion;
    private final AjaxEnabledTextField zonasEntradas;
    private final AjaxEnabledTextField zonasCercanas;
    private final GeneralidadesBean generalidadesBean;

    public Generalidades(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        generalidadesBean = new GeneralidadesBean();

        constructoras = new AjaxEnabledTextField<List>("constructoras",new PropertyModel<List>(this,"generalidadesBean.constructoras"));
        queue(constructoras);

        numeroUnidades = new AjaxEnabledTextField<Integer>("numeroUnidades",new PropertyModel<Integer>(this,"generalidadesBean.numeroUnidades"));
        queue(numeroUnidades);

         numeroParqueos = new AjaxEnabledTextField<Integer>("numeroParqueos",new PropertyModel<Integer>(this,"generalidadesBean.numeroParqueos"));
        queue(numeroParqueos);

         numeroCuartosUtiles = new AjaxEnabledTextField<Integer>("numeroCuartosUtiles",new PropertyModel<Integer>(this,"generalidadesBean.numeroCuartosUtiles"));
        queue(numeroCuartosUtiles);

        direccion = new AjaxEnabledTextField<String>("direccion",new PropertyModel<String>(this,"generalidadesBean.direccion"));
        queue(direccion);

        telefonoFijo = new AjaxEnabledTextField<Integer>("telefonoFijo",new PropertyModel<Integer>(this,"generalidadesBean.telefonoFijo"));
        queue(telefonoFijo);

        telefonoMovil = new AjaxEnabledTextField<Integer>("telefonoMovil",new PropertyModel<Integer>(this,"generalidadesBean.telefonoMovil"));
        queue(telefonoMovil);

        email = new AjaxEnabledTextField<String>("email",new PropertyModel<String>(this,"generalidadesBean.email"));
        queue(email);

        ciudad = new AjaxEnabledTextField<List>("ciudad",new PropertyModel<List>(this,"generalidadesBean.ciudad"));
        queue(ciudad);

         descripcion = new AjaxEnabledTextField<String>("descripcion",new PropertyModel<String>(this,"generalidadesBean.descripcion"));
        queue(descripcion);

         zonasEntradas = new AjaxEnabledTextField<String>("zonasEntradas",new PropertyModel<String>(this,"generalidadesBean.zonasEntradas"));
        queue(zonasEntradas);

         zonasCercanas = new AjaxEnabledTextField<String>("zonasCercanas",new PropertyModel<String>(this,"generalidadesBean.zonasCercanas"));
        queue(zonasCercanas);
    }

}