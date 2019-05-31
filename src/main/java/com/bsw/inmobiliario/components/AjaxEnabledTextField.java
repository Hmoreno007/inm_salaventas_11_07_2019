package com.bsw.inmobiliario.components;

import com.bsw.inmobiliario.panel.TipoInmuebles.TipoInmueble;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;

public class AjaxEnabledTextField<T> extends TextField<T> {

    public AjaxEnabledTextField(String id) {
        super(id);
        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true); 
    }

    public AjaxEnabledTextField(String id, Class<T> type) {
        super(id, type);
        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true); 
    }

    public AjaxEnabledTextField(String id, IModel<T> model) {
        super(id, model);
        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true); 
    }

    public AjaxEnabledTextField(String id, IModel<T> model, Class<T> type) {
        super(id, model, type);
        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true); 
    }

   // public AjaxEnabledTextField(String codigoInmueble, PropertyModel<TipoInmueble> propertyModel) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    
}