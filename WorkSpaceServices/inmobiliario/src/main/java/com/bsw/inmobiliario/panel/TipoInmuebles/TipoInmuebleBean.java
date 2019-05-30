package com.bsw.inmobiliario.panel.TipoInmuebles;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TipoInmuebleBean implements Serializable{
 
	
	@NotNull(message="{TiposInmuebleBean.codigo.InvalidNotNullCodigo}")
	private String codigo;

	@NotNull(message="{TiposInmuebleBean.descripcion.InvalidNotNullDescripcion}")
	@Size(min=1, max=50, message="{TiposInmuebleBean.descripcion.InvalidSizeDescripcion}") 
	private String  descripcion;

	@NotNull(message="{TiposInmuebleBean.prefijo.IvalidNotNullPrefijo}")
	@Size(min=1, max=2, message="{TiposInmuebleBean.prefijo.InvalidSizePrefijo}")
	private String  prefijo;

	@NotNull(message="{TiposInmuebleBean.inmueble.InvalidNotNullInmueble}")
        @Size(min=1, max=1, message="{TiposInmuebleBean.inmueble.InvalidSizeInmueble}")
	private String inmueble;


	@NotNull(message="{TiposInmuebleBean.torres.InvalidNotNullTorres}")
        @Size(min=1, max=1, message="{TiposInmuebleBean.torres.InvalidSizeTorres}")
	private String torres;


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getPrefijo() {
		return prefijo;
	}


	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}


	public String getInmueble() {
		return inmueble;
	}


	public void setInmueble(String inmueble) {
		this.inmueble = inmueble;
	}


	public String getTorres() {
		return torres;
	}


	public void setTorres(String torres) {
		this.torres = torres;
	}

}
