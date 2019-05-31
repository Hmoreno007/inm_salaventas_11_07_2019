package com.bsw.inmobiliario.panel.usuario;

import com.bsw.inmobiliario.SalaVentasApp;
import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import com.bsw.inmobiliario.panel.usuario.modelo.UsuariosModelo;
import java.util.ArrayList;
import java.util.List;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;

public class Usuarios extends Panel {

    private final AjaxEnabledTextField usuario;
    private final AjaxEnabledTextField contrasena;
    private final AjaxEnabledTextField confirmarContrasena;
    private final AjaxEnabledTextField correo;
    private final AjaxEnabledTextField numeroIdentificacion;
    private final DropDownChoice perfil;
    private final CheckBox ceo_sn;
    private final CheckBox adm_sn;
    private final CheckBox pro_sn;
    private final CheckBox cli_sn;
    private final AjaxEnabledTextField  nombre;
    private final DropDownChoice estado;
    private final DropDownChoice tipoIdentificacion;
    private final UsuariosBean usuariosBean;
    private List<PerfilUsuario> listaPerfil;
    private List<RolUsuario> listaRol;
    private List<EstadoUsuario> listaEstado;
    private List<TipoIdentificacion> listaTipoIdentificacion;
    private transient UsuariosModelo usaurioobj;
   
    public Usuarios(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        usuariosBean = new UsuariosBean();               
        usaurioobj = new UsuariosModelo();
        //usaurioobj.obtenerUsu(SalaVentasApp.url_2_esb_service, "JASPER");                  
        initVar(); 
                              
        usuario = new AjaxEnabledTextField<String>("usuario", new PropertyModel<String>(this, "usuariosBean.usuario"));
        queue(usuario);        

        contrasena = new AjaxEnabledTextField<String>("contrasena", new PropertyModel<String>(this, "usuariosBean.contrasena"));
        queue(contrasena);

        confirmarContrasena = new AjaxEnabledTextField<String>("confirmarContrasena", new PropertyModel<String>(this, "usuariosBean.confirmarContrasena"));
        queue(confirmarContrasena);

        LoadableDetachableModel<List<PerfilUsuario>> listaPerfil = new LoadableDetachableModel<List<PerfilUsuario>>() {
            @Override
            protected List<PerfilUsuario> load() {
                usaurioobj = new UsuariosModelo();
                return usaurioobj.obtener(SalaVentasApp.url_2_esb_service);
            }
        };
        ChoiceRenderer renderPerfil = new ChoiceRenderer("descripcionPerfil", "codigoPerfil");
        perfil = new DropDownChoice<PerfilUsuario>("perfil", new PropertyModel<PerfilUsuario>(this, "usuariosBean.perfil"), listaPerfil, renderPerfil);
        queue(perfil);

        ceo_sn = new CheckBox("ceo_sn", new PropertyModel<Boolean>(this, "usuariosBean.ceo_sn"));
        queue(ceo_sn);
        

        adm_sn = new CheckBox("adm_sn", new PropertyModel<Boolean>(this, "usuariosBean.adm_sn"));
        queue(adm_sn);

        pro_sn = new CheckBox("pro_sn", new PropertyModel<Boolean>(this, "usuariosBean.pro_sn"));
        queue(pro_sn);

        cli_sn = new CheckBox("cli_sn", new PropertyModel<Boolean>(this, "usuariosBean.cli_sn"));
        queue(cli_sn);
        
        nombre = new AjaxEnabledTextField<String>("nombre", new PropertyModel<String>(this, "usuariosBean.nombre"));
        queue(nombre);

        correo = new AjaxEnabledTextField<String>("correo", new PropertyModel<String>(this, "usuariosBean.correo"));
        queue(correo);

        LoadableDetachableModel<List<EstadoUsuario>> listaEstado = new LoadableDetachableModel<List<EstadoUsuario>>() {
            @Override
            protected List<EstadoUsuario> load() {
                usaurioobj = new UsuariosModelo();
                return usaurioobj.obtenerEstado(SalaVentasApp.url_2_esb_service);
            }   
        };
         ChoiceRenderer renderEstado = new ChoiceRenderer("descripcion", "estado");
        estado = new DropDownChoice<>("estado", new PropertyModel<EstadoUsuario>(this, "usuariosBean.estado"), listaEstado, renderEstado);
        queue(estado);

       
        LoadableDetachableModel<List<TipoIdentificacion>> listaTipoIdentificacion = new LoadableDetachableModel<List<TipoIdentificacion>>() {
            @Override
            protected List<TipoIdentificacion> load() {
                 usaurioobj = new UsuariosModelo();
                return usaurioobj.obtenerTipoIdentificacion(SalaVentasApp.url_2_esb_service);
            }
        };
        ChoiceRenderer renderTipoIdentificacion = new ChoiceRenderer("descripDocumento", "claseDocumento");
        tipoIdentificacion = new DropDownChoice<>("tipoIdentificacion", new PropertyModel<TipoIdentificacion>(this, "usuariosBean.tipoIdentificacion"), listaTipoIdentificacion, renderTipoIdentificacion);
        queue(tipoIdentificacion);

        numeroIdentificacion = new AjaxEnabledTextField<String>("numeroIdentificacion", new PropertyModel<String>(this, "usuariosBean.correo"));
        queue(numeroIdentificacion);

    }

    public void initVar() {
        listaPerfil = new ArrayList<>();
        listaRol = new ArrayList<>();
        listaEstado = new ArrayList<>();
        listaTipoIdentificacion = new ArrayList<>();
    }    
    
}
