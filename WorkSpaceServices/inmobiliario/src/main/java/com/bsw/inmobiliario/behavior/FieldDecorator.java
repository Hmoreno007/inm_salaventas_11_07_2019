package com.bsw.inmobiliario.behavior;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.IAjaxRegionMarkupIdProvider;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.request.Response;

public class FieldDecorator extends Behavior implements IAjaxRegionMarkupIdProvider {

    @Override
    public void onConfigure(Component component) {
        FormComponent<?> fc = (FormComponent<?>) component;
        if (((FormComponent<?>) component).isValid() == false
                && fc.isRequired()) {
            fc.add(new AttributeModifier("style", "border: 1px solid red !important; border-left: 5px solid #4247a9 !important;"
                    + " background-color: #ffdddd !important;"));
        } else if (fc.isRequired()) {
            fc.add(new AttributeModifier("style", "border-left: 5px solid #4247a9 !important;"));
        } else if (((FormComponent<?>) component).isValid() == false) {
            fc.add(new AttributeModifier("style", "border: 1px solid red !important; background-color: #ffdddd !important;"));
        } else {
            fc.add(new AttributeModifier("style", "border: 1px solid #dfdfdf;"));
        }
        if (!fc.isEnabled() && fc.isRequired() && fc.isValid() == true) {
            fc.add(new AttributeModifier("style", "border-left: 5px solid #4160e3 !important; background-image: linear-gradient(180deg,#fcfcfc,#d0d0d0);"));
        }
    }

    @Override
    public void onComponentTag(Component component, ComponentTag tag) {
        if (((FormComponent<?>) component).isValid() == false) {
            FormComponent fc = (FormComponent) component;
            Response r = component.getResponse();
            String error;
            if (fc.hasFeedbackMessage()) {
                error = fc.getFeedbackMessages().first().getMessage().toString();
            } else {
                error = "La entrada no es válida.";
            }
            r.write("<div class=\"validationMsg\">" + error + "</div>");

            tag.put("style", "border: 1px solid red; background-color: #ffdddd !important;");
        } else {
            tag.put("style", "border: 1px solid #dfdfdf;");
        }
    }

    @Override
    public void bind(Component component) {
        if (!(component instanceof FormComponent)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String getAjaxRegionMarkupId(Component component) {
        return component.getMarkupId() + "_fd";
    }

    @Override
    public void beforeRender(Component component) {
        Response r = component.getResponse();
        r.write("<div id=\"");
        r.write(getAjaxRegionMarkupId(component));
        r.write("\">");
    }

    @Override
    public void afterRender(Component component) {
        Response r = component.getResponse();
        r.write("</div>");
    }

}
