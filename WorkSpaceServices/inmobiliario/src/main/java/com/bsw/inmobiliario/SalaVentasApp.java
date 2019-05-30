package com.bsw.inmobiliario;

import com.digitrust.portal.PortalApplication;
import org.apache.wicket.Page;
import org.apache.wicket.bean.validation.BeanValidationConfiguration;
import org.apache.wicket.core.request.mapper.CryptoMapper;
import org.apache.wicket.response.filter.AjaxServerAndClientTimeFilter;
import org.apache.wicket.util.lang.Bytes;

public class SalaVentasApp extends PortalApplication {

    public static String url_2_esb_service;

    public SalaVentasApp() {
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return SalaVentas.class;
    }

    @Override
    protected void init() {
        super.init();

        getStoreSettings().setMaxSizePerSession(Bytes.kilobytes(50000));
        setRootRequestMapper(new CryptoMapper(getRootRequestMapper(), this));

        getDebugSettings().setDevelopmentUtilitiesEnabled(true); // must be false
        getApplicationSettings().setUploadProgressUpdatesEnabled(true);
        getResourceSettings().setThrowExceptionOnMissingResource(true); //must be false
        getDebugSettings().setAjaxDebugModeEnabled(true); // must be false

        getRequestCycleSettings().addResponseFilter(new AjaxServerAndClientTimeFilter());

        getApplicationSettings().setPageExpiredErrorPage(SalaVentas.class); //(LoginPage.class);
        //getApplicationSettings().setAccessDeniedPage(ConsultarSaldos.class);
        getApplicationSettings().setInternalErrorPage(SalaVentas.class);

        //getDebugSettings().setAjaxDebugModeEnabled(true);
        mountPage("/inmobiliarioapp", SalaVentas.class);
        new BeanValidationConfiguration().configure(this);
    }

    public static String getUrl_2_esb_service() {
        return url_2_esb_service;
    }

    public static void setUrl_2_esb_service(String url_2_esb_service) {
        SalaVentasApp.url_2_esb_service = url_2_esb_service;
    }

}
