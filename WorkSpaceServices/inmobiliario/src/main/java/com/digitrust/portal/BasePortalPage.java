package com.digitrust.portal;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.portlet.ThreadPortletContext;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class BasePortalPage extends WebPage {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String urltoesbservice;
    /**
     * Constructor
     */
    public BasePortalPage() {
        this(new PageParameters());
        //PortalApplication.urltofidservice = getString("portal.url.fid.service");
        
    }

    /**
     * Constructor
     *
     * @param pageParameters
     */
    public BasePortalPage(PageParameters pageParameters) {
        super(pageParameters);
        //PortalApplication.urltofidservice = getString("portal.url.fid.service");
        /*final String packageName = getClass().getPackage().getName();
		add(new WicketExampleHeader("mainNavigation", Strings.afterLast(packageName, '.'), this));*/
        explain();
    }

    /**
     * Construct.
     *
     * @param model
     */
    public BasePortalPage(IModel<?> model) {
        super(model);
        urltoesbservice = ThreadPortletContext.getServletContext().getInitParameter(AppPortalConstant.URL_TO_ESB_SERVICES);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX -> "+urltoesbservice);
    }

    /**
     * Override base method to provide an explanation
     */
    protected void explain() {
    }
    
    public String getUrltoesbservice() {
        return urltoesbservice;
    }

    public void setUrltoesbservice(String urltoesbservice) {
        this.urltoesbservice = urltoesbservice;
    }
}
