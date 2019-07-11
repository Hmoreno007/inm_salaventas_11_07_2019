package com.bsw.inmobiliario.panel.EstadosInmuebles;

import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

public class EstadosInmuebles extends Panel {

	private final AjaxEnabledTextField codigo;
	private final AjaxEnabledTextField descripcion; 
	private final AjaxEnabledTextField observacion;
	private final AjaxEnabledTextField color;
        
	private final EstadosInmueblesBean estadoInmueblesBean;


    public EstadosInmuebles(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        estadoInmueblesBean = new EstadosInmueblesBean();

        codigo = new AjaxEnabledTextField<String>("codigo",new PropertyModel<String>(this,"estadoInmueblesBean.codigo"));
       // queue(codigo);

        descripcion = new AjaxEnabledTextField<String>("descripcion",new PropertyModel<String>(this,"estadoInmueblesBean.descripcion"));
      //  queue(descripcion);

        observacion = new AjaxEnabledTextField<String>("observacion",new PropertyModel<String>(this,"estadoInmueblesBean.observacion"));
      //  queue(observacion);

        color = new AjaxEnabledTextField<String>("color",new PropertyModel<String>(this,"estadoInmueblesBean.color"));
        //queue(color);
    }

}