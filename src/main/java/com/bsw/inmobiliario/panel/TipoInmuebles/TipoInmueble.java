package com.bsw.inmobiliario.panel.TipoInmuebles;
import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

public class TipoInmueble extends Panel {

    private final AjaxEnabledTextField codigo;
	private final AjaxEnabledTextField descripcion; 
	private final AjaxEnabledTextField prefijo;
	private final AjaxEnabledTextField inmueble;
	private final AjaxEnabledTextField torres;

	private final TipoInmuebleBean tipoInmuebleBean;
 
    public TipoInmueble(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        tipoInmuebleBean = new TipoInmuebleBean();
        initVar();

         codigo = new AjaxEnabledTextField<String>("codigo",new PropertyModel<String>(this,"tipoInmueble.codigo"));
        queue(codigo);

          descripcion = new AjaxEnabledTextField<String>("descripcion",new PropertyModel<String>(this,"tipoInmueble.descripcion"));
        queue(descripcion);

          prefijo = new AjaxEnabledTextField<String>("prefijo",new PropertyModel<String>(this,"tipoInmueble.prefijo"));
        queue(prefijo);

          inmueble = new AjaxEnabledTextField<String>("inmueble",new PropertyModel<String>(this,"tipoInmueble.inmueble"));
        queue(inmueble);

        torres = new AjaxEnabledTextField<String>("torres",new PropertyModel<String>(this,"tipoInmueble.torres"));
        queue(torres);
    }
    public void initVar(){
        
    }
}