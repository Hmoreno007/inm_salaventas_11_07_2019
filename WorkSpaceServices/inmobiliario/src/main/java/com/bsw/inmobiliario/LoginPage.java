/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsw.inmobiliario;

import com.bsw.inmobiliario.components.AjaxButtonconfigured;
import com.bsw.inmobiliario.panel.usuario.Usuario;
import com.bsw.inmobiliario.panel.usuario.modelo.UsuariosModelo;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author bswndeshm
 */
public class LoginPage extends Panel {

    private static final String CONTENT_ID = "mainpanels";
    private final TextField user;
    private Component current;
    private Component main;
    private AjaxLink submit;
    private final TextField psw;
    private transient UsuariosModelo usaurioobj;
    private WebMarkupContainer windowmain, loginpanel;
    private final AjaxLink closecontentpanels;

    public LoginPage(String id) {
        super(id);        
        final USerModel userModel = new USerModel();
        usaurioobj = new UsuariosModelo();
        Form<?> form = new Form<Void>("formlogin") {
            @Override
            protected void onSubmit() {
                super.onSubmit();
            }
        };
        queue(form);
        queue((windowmain = new WebMarkupContainer("windowmain")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(false));
        queue((loginpanel = new WebMarkupContainer("loginpanel")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(true));
        queue(current = new Label(CONTENT_ID));
        queue(closecontentpanels = new AjaxLink("logout") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                current.setVisible(false);
                target.add(current);
                windowmain.setVisible(false);
                target.add(windowmain);
                loginpanel.setVisible(true);
                target.add(loginpanel);
            }
        });
        current.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        queue(user = new TextField<String>("username", new PropertyModel<String>(userModel, "username")));
        user.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        queue(psw = new TextField("password", new PropertyModel<String>(userModel, "password")));
        psw.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        queue(submit = new AjaxLink("submit") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                Usuario usrbnobj = usaurioobj.obtenerUsu(SalaVentasApp.url_2_esb_service, userModel.getUsername());
                System.out.println("'" + usrbnobj.getUsuario() + "'");
                if (usrbnobj.getUsuario() == null || usrbnobj.getUsuario().isEmpty() || usrbnobj.getUsuario().equalsIgnoreCase("")) {
                    target.prependJavaScript("alert('Ingreso Errado, Usuario: " + userModel.getUsername() + "  No existe')");
                } else {
                    System.out.println("  us:  '" + userModel.getUsername() + "',  to  '" + usrbnobj.getUsuario() + "'   pss:  '" + userModel.getPassword() + "',   to  '" + usrbnobj.getContrasena() + "'");
                    if (userModel.getPassword() == null || userModel.getPassword().isEmpty() || userModel.getPassword().equalsIgnoreCase("")) {
                        target.prependJavaScript("alert('Ingreso Errado, digite su contraseña')");
                    } else {
                        if (userModel.getUsername().equalsIgnoreCase(usrbnobj.getUsuario()) && userModel.getPassword().equalsIgnoreCase(usrbnobj.getContrasena())) {
                            System.out.println("Ingreso Exitoso! Bienvenido:  " + userModel.getUsername());
                            target.prependJavaScript("alert('Ingreso Exitoso! Bienvenido:  " + userModel.getUsername() + "')");                            
                            current.replaceWith(main = new MainPanel(CONTENT_ID, usrbnobj.getUsuario()));
                            current = main;
                            target.add(current);
                            loginpanel.setVisible(false);
                            target.add(loginpanel);
                            windowmain.setVisible(true);
                            target.add(windowmain);
                        } else {
                            System.out.println("Ingreso Errado contraseña incorrecta");
                            target.prependJavaScript("alert('Ingreso Errado. Contraseña incorrecta')");
                        }
                    }
                }
            }
        });
    }
}
