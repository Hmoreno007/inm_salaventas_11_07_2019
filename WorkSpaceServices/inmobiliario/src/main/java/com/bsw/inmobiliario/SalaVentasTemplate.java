package com.bsw.inmobiliario;

import com.digitrust.portal.AppPortalConstant;
import com.digitrust.portal.BasePortalPage;
import org.apache.wicket.Component;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.model.IModel;
import org.apache.wicket.portlet.ThreadPortletContext;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.CssResourceReference;

public class SalaVentasTemplate extends BasePortalPage {

    private static final long serialVersionUID = 1L;
    private Component contentPanel;

    public SalaVentasTemplate(PageParameters parameters) {
        super(parameters);
        queue(contentPanel = new MainPanel("contentPanel"));
    }

    public SalaVentasTemplate(IModel<?> model) {
        super(model);
        setUrltoesbservice(ThreadPortletContext.getServletContext().getInitParameter(AppPortalConstant.URL_TO_ESB_SERVICES));
    }

    public Component getContentPanel() {
        return contentPanel;
    }

    public void setContentPanel(Component contentPanel) {
        this.contentPanel = contentPanel;
    }

    @Override
    public void renderHead(IHeaderResponse response) {
        response.render(CssHeaderItem.forReference(new CssResourceReference(SalaVentasTemplate.class,
                "css/css/all.min.css")));
    }
}
