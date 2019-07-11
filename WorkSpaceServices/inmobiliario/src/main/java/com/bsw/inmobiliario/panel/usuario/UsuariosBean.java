package com.bsw.inmobiliario.panel.usuario;

import java.io.Serializable;
import java.util.List;
import java.util.Properties;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UsuariosBean implements Serializable {

    @NotNull(message = "{UsuariosBean.usuario.InvalidNotNullNombreUsuario}")
    @Size(min = 1, max = 20, message = "{UsuariosBean.usuario.InvalidSizeNombreUsuario}")
    @Pattern(regexp = "[A-Za-z0-9]+", message = "no se admiten los valores digitados")
    private String usuario;

    @Valid
    @NotEmpty(message = "{UsuariosBean.perfil.InvalidNotEmptyPerfil}")
    private List<PerfilUsuario> perfil;

    @NotNull
    @Valid
    private PerfilUsuario perfilUsuarioSeleccionado;

    @NotNull(message = "{UsuariosBean.contrasena.InvalidNotNullContrasena}")
    @Size(min = 1, max = 2048, message = "{UsuariosBean.contrasena.InvalidSizeContrasena}")
    @Pattern(regexp = "[A-Za-z0-9]+", message = "{UsuariosBean.contrasena.InvalidPatternContrasena}")
    private String contrasena;

    @NotNull(message = "{UsuariosBean.confirmarContrasena.InvalidNotNullContrasena}")
    @Size(min = 1, max = 2048, message = "{UsuariosBean.confirmarContrasena.InvalidSizeContrasena}")
    @Pattern(regexp = "[A-Za-z0-9]+", message = "{UsuariosBean.confirmarContrasena.InvalidPatternContrasena}")
    private String confirmarContrasena;

    @Valid
    //@NotEmpty (message= "{UsuariosBean.rol.InvalidEmptyRol}")
    private Boolean ceo_sn;

    @Valid
    //@NotEmpty (message= "{UsuariosBean.rol.InvalidEmptyRol}")
    private Boolean adm_sn;

    @Valid
    //@NotEmpty (message= "{UsuariosBean.rol.InvalidEmptyRol}")
    private Boolean pro_sn;

    @Valid
    //@NotEmpty (message= "{UsuariosBean.rol.InvalidEmptyRol}")
    private Boolean cli_sn;

    @NotNull(message = "{UsuariosBean.nombre.InvalidNotNullNombre}")
    @Size(min = 1, max = 100, message = "{UsuariosBean.nombre.InvalidSizeNombre}")
    @Pattern(regexp = "[A-Za-z]+()", message = "{UsuariosBean.nombre.InvalidPatternNombre}")
    private String nombre;

    @NotNull(message = "{UsuariosBean.nombre.InvalidEmailCorreo}")
    @Email(message = "{UsuariosBean.correo.InvalidEmailCorreo}")
    private String correo;

    @Valid
    @NotNull(message = "{UsuariosBean.estado.InvalidNotNull}")
    private List<EstadoUsuario> estado;

    @NotNull
    @Valid    
    private EstadoUsuario estadoSeleccionado;

    @Valid
    @NotNull(message = "{UsuariosBean.tipoIdentificacion.InvalidNotNullTipoIdentificacion}")
    private List<TipoIdentificacion> tipoIdentificacion;

    @NotNull
    @Valid
    private TipoIdentificacion tipoIdentificacionSeleccionado;

    @NotNull(message = "{UsuariosBean.numeroIdentificacion.InvalidNotNullNumeroIdentificacion}")
    //@Size(min = 1, max = 30, message = "{UsuariosBean.numeroIdentificacion.InvalidSizeNumeroIdentificacion}")
    //@Pattern(regexp = "[A-Za-z0-9]+", message = "{UsuariosBean.numeroIdentificacion.InvalidPatternNumeroIdentificacion}")
    private int numeroIdentificacion;

    private String ultconexion;

    private String rolesselec;

    public String getRolesselec() {
        return rolesselec;
    }

    public void setRolesselec(String rolesselec) {
        this.rolesselec = rolesselec;
    }

    public String getUltconexion() {
        return ultconexion;
    }

    //Getters and Setters
    public void setUltconexion(String ultconexion) {
        this.ultconexion = ultconexion;
    }

    public TipoIdentificacion getTipoIdentificacionSeleccionado() {
        return tipoIdentificacionSeleccionado;
    }

    public void setTipoIdentificacionSeleccionado(TipoIdentificacion tipoIdentificacionSeleccionado) {
        this.tipoIdentificacionSeleccionado = tipoIdentificacionSeleccionado;
    }

    public EstadoUsuario getEstadoSeleccionado() {
        return estadoSeleccionado;
    }

    public void setEstadoSeleccionado(EstadoUsuario estadoSeleccionado) {
        this.estadoSeleccionado = estadoSeleccionado;
    }

    public PerfilUsuario getPerfilUsuarioSeleccionado() {
        return perfilUsuarioSeleccionado;
    }

    public void setPerfilUsuarioSeleccionado(PerfilUsuario perfilUsuarioSeleccionado) {
        this.perfilUsuarioSeleccionado = perfilUsuarioSeleccionado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<PerfilUsuario> getPerfil() {
        return perfil;
    }

    public void setPerfil(List<PerfilUsuario> perfil) {
        this.perfil = perfil;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getConfirmarContrasena() {
        return confirmarContrasena;
    }

    public void setConfirmarContrasena(String confirmarContrasena) {
        this.confirmarContrasena = confirmarContrasena;
    }

    public Boolean getCeo_sn() {
        return ceo_sn;
    }

    public void setCeo_sn(Boolean ceo_sn) {
        this.ceo_sn = ceo_sn;
    }

    public Boolean getAdm_sn() {
        return adm_sn;
    }

    public void setAdm_sn(Boolean adm_sn) {
        this.adm_sn = adm_sn;
    }

    public Boolean getPro_sn() {
        return pro_sn;
    }

    public void setPro_sn(Boolean pro_sn) {
        this.pro_sn = pro_sn;
    }

    public Boolean getCli_sn() {
        return cli_sn;
    }

    public void setCli_sn(Boolean cli_sn) {
        this.cli_sn = cli_sn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<EstadoUsuario> getEstado() {
        return estado;
    }

    public void setEstado(List<EstadoUsuario> estado) {
        this.estado = estado;
    }

    public List<TipoIdentificacion> getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(List<TipoIdentificacion> tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

}
