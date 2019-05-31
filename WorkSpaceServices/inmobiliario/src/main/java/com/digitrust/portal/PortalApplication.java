package com.digitrust.portal;

import org.apache.wicket.core.request.mapper.CryptoMapper;
import org.apache.wicket.markup.html.IPackageResourceGuard;
import org.apache.wicket.markup.html.SecurePackageResourceGuard;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.lang.Bytes;
 
public abstract class PortalApplication extends WebApplication {

    public static final int SERVICE_RECEIVE_TIMEOUT = 600000;
    public static final int SERVICE_CONNECTION_TIMEOUT = 600000;
    private static final String version = "1.29.26";
    //public static String urltofidservice;
    
    static {
        System.setProperty("java.awt.headless", "true");
    }

    @Override
    protected void init() { 
        setRootRequestMapper(new CryptoMapper(getRootRequestMapper(), this)); 
        getDebugSettings().setDevelopmentUtilitiesEnabled(false);
        getApplicationSettings().setUploadProgressUpdatesEnabled(true);
        getResourceSettings().setThrowExceptionOnMissingResource(false);
        getDebugSettings().setAjaxDebugModeEnabled(false);
        getStoreSettings().setMaxSizePerSession(Bytes.kilobytes(50000));
        
        final IPackageResourceGuard packageResourceGuard = getResourceSettings().getPackageResourceGuard();
        if (packageResourceGuard instanceof SecurePackageResourceGuard) {
            SecurePackageResourceGuard securePackageResourceGuard = (SecurePackageResourceGuard) packageResourceGuard;
            securePackageResourceGuard.addPattern("+*.pdf");
        }
    }

}
