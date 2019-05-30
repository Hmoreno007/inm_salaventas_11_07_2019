package com.bsw.inmobiliario.components;

import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;

public class AjaxButtonconfigured extends AjaxButton {

    public AjaxButtonconfigured(String id) {
        super(id);
        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true);
    }

    public AjaxButtonconfigured(String id, IModel<String> model) {
        super(id, model);
        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true);
    }

    public AjaxButtonconfigured(String id, Form<?> form) {
        super(id, form);
        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true);
    }

    public AjaxButtonconfigured(String id, IModel<String> model, Form<?> form) {
        super(id, model, form);
        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true);
    }
}
