package com.bsw.inmobiliario;

import com.digitrust.portal.AppPortalConstant;
import org.apache.wicket.portlet.ThreadPortletContext;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class SalaVentas extends SalaVentasTemplate {

    public SalaVentas(PageParameters pageParameters) {
        super(pageParameters);
        setUrltoesbservice(ThreadPortletContext.getServletContext().getInitParameter(AppPortalConstant.URL_TO_ESB_SERVICES));
        SalaVentasApp.setUrl_2_esb_service(getUrltoesbservice());
        getContentPanel().setVisible(true);
    }
}
