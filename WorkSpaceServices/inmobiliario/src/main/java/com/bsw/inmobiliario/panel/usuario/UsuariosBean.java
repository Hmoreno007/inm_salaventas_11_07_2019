package com.bsw.inmobiliario.panel.usuario;

import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UsuariosBean implements Serializable{

	@NotNull(message = "{UsuariosBean.usuarios.InvalidNotNullNombreUsuario}")
        @Size(min = 1, max = 20, message = "{UsuariosBean.usuarios.InvalidSizeNombreUsuario}")
	@Pattern(regexp="[A-Za-z0-9]+", message = "{UsuariosBean.usuarios.InvalidPatternNombreUsuario}")
	private String usuario;

	@Valid
	@NotEmpty(message= "{UsuariosBean.perfil.InvalidNotEmptyPerfil}")
	private List<PerfilUsuario> perfil;

	@NotNull(message="{UsuariosBean.contrasena.InvalidNotNullContrasena}")
	@Size(min = 1, max = 2048, message="{UsuariosBean.contrasena.InvalidSizeContrasena}")
	@Pattern(regexp="[A-Za-z0-9]+", message="{UsuariosBean.contrasena.InvalidPatternContrasena}")
	private String contrasena;

	@NotNull(message="{UsuariosBean.confirmarContrasena.InvalidNotNullContrasena}")
	@Size(min = 1, max = 2048, message="{UsuariosBean.confirmarContrasena.InvalidSizeContrasena}")
	@Pattern(regexp="[A-Za-z0-9]+", message="{UsuariosBean.confirmarContrasena.InvalidPatternContrasena}")
	private String confirmarContrasena;

	@Valid
	@NotEmpty (message= "{UsuariosBean.rol.InvalidEmptyRol}")
	private String ceo_sn;
        
        @Valid
	@NotEmpty (message= "{UsuariosBean.rol.InvalidEmptyRol}")
	private String adm_sn;
        
        @Valid
	@NotEmpty (message= "{UsuariosBean.rol.InvalidEmptyRol}")
	private String pro_sn;
        
        @Valid
	@NotEmpty (message= "{UsuariosBean.rol.InvalidEmptyRol}")
	private String cli_sn;

	@NotNull(message="{UsuariosBean.nombre.InvalidNotNullNombre}")
	@Size(min = 1, max = 100, message = "{UsuariosBean.nombre.InvalidSizeNombre}")
	@Pattern(regexp="[A-Za-z]+", message="{UsuariosBean.nombre.InvalidPatternNombre}")
	private String nombre;

	@Email(message = "{UsuariosBean.correo.InvalidEmailCorreo}")
	private String correo;

	@Valid
	@NotNull(message= "{UsuariosBean.estado.InvalidNotNull}")
	private List<EstadoUsuario> estado;

	@Valid
	@NotNull(message= "{UsuariosBean.tipoIdentificacion.InvalidNotNullTipoIdentificacion}")
	private List<TipoIdentificacion> tipoIdentificacion;

	@NotNull(message = "{UsuariosBean.numeroIdentificacion.InvalidNotNullNumeroIdentificacion}")
	@Size(min = 1, max = 30, message="{UsuariosBean.numeroIdentificacion.InvalidSizeNumeroIdentificacion}")
	@Pattern(regexp="[A-Za-z0-9]+", message="{UsuariosBean.numeroIdentificacion.InvalidPatternNumeroIdentificacion}")
	private String numeroIdentificacion;
        
        private String ultconexion;

    public String getUltconexion() {
        return ultconexion;
    }

    public void setUltconexion(String ultconexion) {
        this.ultconexion = ultconexion;
    }
        

	//Getters and Setters

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

    public String getCeo_sn() {
        return ceo_sn;
    }

    public void setCeo_sn(String ceo_sn) {
        this.ceo_sn = ceo_sn;
    }

    public String getAdm_sn() {
        return adm_sn;
    }

    public void setAdm_sn(String adm_sn) {
        this.adm_sn = adm_sn;
    }

    public String getPro_sn() {
        return pro_sn;
    }

    public void setPro_sn(String pro_sn) {
        this.pro_sn = pro_sn;
    }

    public String getCli_sn() {
        return cli_sn;
    }

    public void setCli_sn(String cli_sn) {
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

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


	

}
