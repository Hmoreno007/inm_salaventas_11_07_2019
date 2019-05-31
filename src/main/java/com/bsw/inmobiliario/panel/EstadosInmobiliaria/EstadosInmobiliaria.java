package com.bsw.inmobiliario.panel.EstadosInmobiliaria;

import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

public class EstadosInmobiliaria extends Panel {

	private final AjaxEnabledTextField codigo;
	private final AjaxEnabledTextField descripcion; 
	private final AjaxEnabledTextField observacion;
	private final AjaxEnabledTextField color;

	private final EstadosInmobiliariaBean estadoInmobiliariaBean;


    public EstadosInmobiliaria(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        estadoInmobiliariaBean = new EstadosInmobiliariaBean();

        codigo = new AjaxEnabledTextField<String>("codigo",new PropertyModel<String>(this,"estadoInmobiliariaBean.codigo"));
        queue(codigo);

        descripcion = new AjaxEnabledTextField<String>("descripcion",new PropertyModel<String>(this,"estadoInmobiliariaBean.descripcion"));
        queue(descripcion);

        observacion = new AjaxEnabledTextField<String>("observacion",new PropertyModel<String>(this,"estadoInmobiliariaBean.observacion"));
        queue(observacion);

         color = new AjaxEnabledTextField<String>("color",new PropertyModel<String>(this,"estadoInmobiliariaBean.color"));
        queue(color);
    }

}