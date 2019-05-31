package com.bsw.inmobiliario.panel.Cotizaciones;

import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import java.util.Date;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

public class Cotizacion extends Panel {
 	
	private final AjaxEnabledTextField nombre;
	private final AjaxEnabledTextField fechaEntrega;

	private final CotizacionBean cotizacionBean;

    public Cotizacion(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        cotizacionBean = new CotizacionBean();

        nombre = new AjaxEnabledTextField<String>("nombre", new PropertyModel<String>(this,"cotizacionBean.nombre"));
        queue(nombre);

        fechaEntrega = new AjaxEnabledTextField<Date>("fechaEntrega", new PropertyModel<Date>(this, "cotizacionBean.fechaEntrega"));
        queue(fechaEntrega);

    }

}