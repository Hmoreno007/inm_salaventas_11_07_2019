package com.bsw.inmobiliario.panel.Configuracion;
import com.bsw.inmobiliario.panel.TipoInmuebles.TipoInmueble;
import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

public class Configuracion extends Panel {

	private final AjaxEnabledTextField codigoInmueble;
	private final AjaxEnabledTextField descripcion;
	private final AjaxEnabledTextField torres;
	private final AjaxEnabledTextField pisos;
	private final AjaxEnabledTextField unidadPorPiso;
	private final AjaxEnabledTextField total;
	private final AjaxEnabledTextField torresSN;

	private final ConfiguracionBean configuracionBean;

    public Configuracion(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);

        configuracionBean = new ConfiguracionBean();

        codigoInmueble = new AjaxEnabledTextField<>("codigoInmueble",new PropertyModel<TipoInmueble>(this,"configuracionBean.codigoInmueble"));
        queue(codigoInmueble);

        descripcion = new AjaxEnabledTextField<>("descripcion", new PropertyModel<TipoInmueble>(this, "configuracionBean.descripcion"));
        queue(descripcion);

        torres = new AjaxEnabledTextField<Integer>("torres", new PropertyModel<Integer>(this, "configuracionBean.torres"));
        queue(torres);

        pisos = new AjaxEnabledTextField<Integer>("pisos", new PropertyModel<Integer>(this, "configuracionBean.pisos"));
        queue(pisos);

        unidadPorPiso = new AjaxEnabledTextField<Integer>("unidadPorPiso",new PropertyModel<Integer>(this, "configuracionBean.unidadPorPiso"));
        queue(unidadPorPiso);

        total = new AjaxEnabledTextField<Integer>("total", new PropertyModel<Integer>(this, "configuracionBean.total"));
        queue(total);

        torresSN = new AjaxEnabledTextField<>("torresSN", new PropertyModel<TipoInmueble>(this, "configuracionBean.torresSN"));
        queue(torresSN);

    }

}