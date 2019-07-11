    package com.bsw.inmobiliario.panel.usuario;

import com.bsw.inmobiliario.SalaVentasApp;
import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import com.bsw.inmobiliario.panel.usuario.modelo.UsuariosModelo;
import java.util.ArrayList;
import java.util.List;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.feedback.ExactLevelFeedbackMessageFilter;
import org.apache.wicket.feedback.FeedbackMessage;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.EmailTextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.bean.validation.PropertyValidator;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.model.PropertyModel;

public class Usuarios extends Panel {

    private final FormComponent usuario;
    private final FormComponent contrasena;
    private final FormComponent confirmarContrasena;
    private final FormComponent correo;
    private final FormComponent numeroIdentificacion;
    private final FormComponent perfil;
    private final FormComponent nombre;
    private final FormComponent estado;
    private final FormComponent tipoIdentificacion;
    private final UsuariosBean usuariosBean;
    private List<PerfilUsuario> listaPerfil;
    private List<EstadoUsuario> listaEstado;
    private List<TipoIdentificacion> listaTipoIdentificacion;
    private transient UsuariosModelo usaurioobj;
    private final AjaxLink roles;
    private static final String CONTENT_ID = "contentRol";
    private Component current;
    private Component rolcom;
    private final AjaxLink closecontentpanels;
    private WebMarkupContainer windowrol, roldiv;
    private final AjaxLink guardar;
    private final AjaxLink editar;

    public Usuarios(String id, String username) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        usuariosBean = new UsuariosBean();
        usaurioobj = new UsuariosModelo();

        add(new FeedbackPanel("feedbackErrors", new ExactLevelFeedbackMessageFilter(FeedbackMessage.ERROR)));
        Form<Void> formmenu = new Form<Void>("form") {
            @Override
            protected void onSubmit() {
                //super.onSubmit();
                info("Enviado!");
            }
        };
        add(formmenu);
        formmenu.add(usuario = new AjaxEnabledTextField<String>("usuario", new PropertyModel<String>(this, "usuariosBean.usuario")).add(new PropertyValidator()));
        //queue(usuario);
        usuario.add(new AjaxFormComponentUpdatingBehavior("change") {
        @Override
        protected void onUpdate(AjaxRequestTarget art) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        });
        add(new FeedbackPanel("feedbackSuccess", new ExactLevelFeedbackMessageFilter(FeedbackMessage.INFO)));

        queue((windowrol = new WebMarkupContainer("windowrol")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(false));
        queue((roldiv = new WebMarkupContainer("roldiv")).setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true).setVisible(false));
        queue(current = new Label(CONTENT_ID));        
        queue(closecontentpanels = new AjaxLink("closecontentpanels") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                current.setVisible(false);
                target.add(current);
                windowrol.setVisible(false);
                target.add(windowrol);
            }
        });
        queue(guardar = new AjaxLink("guardar") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                String msj = usaurioobj.insertarUsuario(SalaVentasApp.url_2_esb_service, usuariosBean);
                art.prependJavaScript("alert('" + msj + "')");
                //art.prependJavaScript("location.reload()");
            }
        });
        queue(editar = new AjaxLink("editar") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                String msj = usaurioobj.actualizaUsuario(SalaVentasApp.url_2_esb_service, usuariosBean);
                art.prependJavaScript("alert('" + msj + "')");
            }
        });      
       
        //EDITAR
        editar.setVisible(false);
        usuariosBean.setPerfilUsuarioSeleccionado(new PerfilUsuario());
        usuariosBean.setEstadoSeleccionado(new EstadoUsuario());
        usuariosBean.setTipoIdentificacionSeleccionado(new TipoIdentificacion());
        Usuario usrbnobj = usaurioobj.obtenerUsu(SalaVentasApp.url_2_esb_service, username);
        if (usrbnobj != null && !username.isEmpty() && !username.equalsIgnoreCase("")) {
            usuariosBean.setUsuario(usrbnobj.getUsuario());
            usuariosBean.setContrasena(usrbnobj.getContrasena());
            usuariosBean.setConfirmarContrasena(usrbnobj.getContrasena());
            usuariosBean.setNombre(usrbnobj.getNombre());
            usuariosBean.setCorreo(usrbnobj.getCorreo());
            usuariosBean.setNumeroIdentificacion(usrbnobj.getNumeroIdentificacion());
            PerfilUsuario perf = usaurioobj.obtenerPerf(SalaVentasApp.url_2_esb_service, usrbnobj.getPerfil());
            usuariosBean.getPerfilUsuarioSeleccionado().setCodigoPerfil(perf.getCodigoPerfil());
            usuariosBean.getPerfilUsuarioSeleccionado().setDescripcionPerfil(perf.getDescripcionPerfil());
            usuariosBean.getPerfilUsuarioSeleccionado().setTipoUsuario(perf.getTipoUsuario());
            EstadoUsuario est = usaurioobj.obtenerEstado(SalaVentasApp.url_2_esb_service, usrbnobj.getEstado());
            usuariosBean.getEstadoSeleccionado().setEstado(est.getEstado());
            usuariosBean.getEstadoSeleccionado().setDescripcion(est.getDescripcion());
            usuariosBean.getEstadoSeleccionado().setIngresoSN(est.getIngresoSN());
            TipoIdentificacion tipoId = usaurioobj.obntenerTipoIdentificacion(SalaVentasApp.url_2_esb_service, usrbnobj.getTipoIdentificacion());
            usuariosBean.getTipoIdentificacionSeleccionado().setClaseDocumento(tipoId.getClaseDocumento());
            usuariosBean.getTipoIdentificacionSeleccionado().setDescripDocumento(tipoId.getDescripDocumento());
            usuariosBean.getTipoIdentificacionSeleccionado().setCod_Superfinanciera(tipoId.getCod_Superfinanciera());
            guardar.setVisible(false);
            editar.setVisible(true);
            usuario.setEnabled(false);
            roldiv.setVisible(true);            
        } else {
            initVar();
        }
        //FIN EDITAR
        queue(roles = new AjaxLink("roles") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                art.prependJavaScript("alert('roles')");
                current.replaceWith(rolcom = new RolGrid(CONTENT_ID, ""));
                current = rolcom;
                windowrol.setVisible(true);
                art.add(windowrol);
            }
        });
        
            
        formmenu.add(contrasena = new AjaxEnabledTextField<String>("contrasena", new PropertyModel<String>(this, "usuariosBean.contrasena")).add(new PropertyValidator()));
        //queue(contrasena);
        contrasena.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                ////To change body of generated methods, choose Tools | Templates.
            }
        });

        formmenu.add(confirmarContrasena = new AjaxEnabledTextField<String>("confirmarContrasena", new PropertyModel<String>(this, "usuariosBean.confirmarContrasena")).add(new PropertyValidator()));
        //queue(confirmarContrasena);
        confirmarContrasena.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        LoadableDetachableModel<List<PerfilUsuario>> listaPerfil = new LoadableDetachableModel<List<PerfilUsuario>>() {
            @Override
            protected List<PerfilUsuario> load() {
                usaurioobj = new UsuariosModelo();
                return usaurioobj.obtener(SalaVentasApp.url_2_esb_service);
            }
        };
        ChoiceRenderer renderPerfil = new ChoiceRenderer("descripcionPerfil", "codigoPerfil");
        formmenu.add(perfil = new DropDownChoice<PerfilUsuario>("perfil", new PropertyModel<PerfilUsuario>(this, "usuariosBean.perfilUsuarioSeleccionado"), listaPerfil, renderPerfil).add(new PropertyValidator()));
        //queue(perfil);
        perfil.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                //throw
            }
        });

        formmenu.add(nombre = new AjaxEnabledTextField<String>("nombre", new PropertyModel<String>(this, "usuariosBean.nombre")).add(new PropertyValidator()));
        //queue(nombre);
        nombre.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        formmenu.add(correo = new EmailTextField("correo", new PropertyModel<String>(this, "usuariosBean.correo")).add(new PropertyValidator()));
        //queue(correo);
        correo.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        LoadableDetachableModel<List<EstadoUsuario>> listaEstado = new LoadableDetachableModel<List<EstadoUsuario>>() {
            @Override
            protected List<EstadoUsuario> load() {
                usaurioobj = new UsuariosModelo();
                return usaurioobj.obtenerEstado(SalaVentasApp.url_2_esb_service);
            }
        };
        ChoiceRenderer renderEstado = new ChoiceRenderer("descripcion", "estado");
        formmenu.add(estado = new DropDownChoice<EstadoUsuario>("estado", new PropertyModel<EstadoUsuario>(this, "usuariosBean.estadoSeleccionado"), listaEstado, renderEstado).add(new PropertyValidator()));
        //queue(estado);
        estado.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        LoadableDetachableModel<List<TipoIdentificacion>> listaTipoIdentificacion = new LoadableDetachableModel<List<TipoIdentificacion>>() {
            @Override
            protected List<TipoIdentificacion> load() {
                usaurioobj = new UsuariosModelo();
                return usaurioobj.obtenerTipoIdentificacion(SalaVentasApp.url_2_esb_service);
            }
        };
        ChoiceRenderer renderTipoIdentificacion = new ChoiceRenderer("descripDocumento", "claseDocumento");
        formmenu.add(tipoIdentificacion = new DropDownChoice<>("tipoIdentificacion", new PropertyModel<TipoIdentificacion>(this, "usuariosBean.tipoIdentificacionSeleccionado"), listaTipoIdentificacion, renderTipoIdentificacion).add(new PropertyValidator()));
        //queue(tipoIdentificacion);
        tipoIdentificacion.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        formmenu.add(numeroIdentificacion = new AjaxEnabledTextField<String>("numeroIdentificacion", new PropertyModel<String>(this, "usuariosBean.numeroIdentificacion")).add(new PropertyValidator()));
        //queue(numeroIdentificacion);
        numeroIdentificacion.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget art) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public void initVar() {
        listaPerfil = new ArrayList<>();
        listaEstado = new ArrayList<>();
        listaTipoIdentificacion = new ArrayList<>();
    }

}
