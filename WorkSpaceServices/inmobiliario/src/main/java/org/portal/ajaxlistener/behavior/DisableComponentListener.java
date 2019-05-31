package org.portal.ajaxlistener.behavior;

//<editor-fold defaultstate="collapsed" desc="import">
import org.apache.wicket.Application;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.attributes.AjaxCallListener;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.resource.PackageResourceReference;
import org.apache.wicket.request.resource.ResourceReference;
//</editor-fold>

public class DisableComponentListener extends AjaxCallListener {

    private static PackageResourceReference customScriptReference
            = new PackageResourceReference(DisableComponentListener.class, "moveHiderAndIndicator.js");
    
    private static PackageResourceReference jqueryUiPositionRef
            = new PackageResourceReference(DisableComponentListener.class, "jquery-ui-position.min.js");
    
    private static PackageResourceReference indicatorReference
            = new PackageResourceReference(DisableComponentListener.class, "ajax-loader.gif");
    
    private Component targetComponent;
    
    public DisableComponentListener(Component targetComponent) {
        this.targetComponent = targetComponent;
    }
    
    @Override
    public CharSequence getBeforeHandler(Component component) {        
        CharSequence indicatorUrl = getIndicatorUrl(component);
        return ";DisableComponentListener.disableElement('" + targetComponent.getMarkupId() + "',"
                + "'" + indicatorUrl + "');";
    }
    
    @Override
    public CharSequence getCompleteHandler(Component component) {
        return ";DisableComponentListener.hideComponent('" + targetComponent.getMarkupId() + "');";
    }
    
    protected CharSequence getIndicatorUrl(Component component) {
        return component.urlFor(indicatorReference, null);
    }
    
    @Override
    public void renderHead(Component component, IHeaderResponse response) {        
        ResourceReference jqueryReference
                = Application.get().getJavaScriptLibrarySettings().getJQueryReference();
        
        response.render(JavaScriptHeaderItem.forReference(jqueryReference));
        response.render(JavaScriptHeaderItem.forReference(jqueryUiPositionRef));
        response.render(JavaScriptHeaderItem.forReference(customScriptReference));
    }
}
