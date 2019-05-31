package com.bsw.inmobiliario.panel.Configuracion;
import com.bsw.inmobiliario.panel.TipoInmuebles.TipoInmueble;
import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class ConfiguracionBean implements Serializable{

	@NotEmpty(message = "{ConfiguracionBean.codigoInmueble.InvalidEmptyCodigoInmueble}")
	private List<TipoInmueble> codigoInmueble;

	@NotEmpty(message= "{ConfiguracionBean.descripcion.InvalidEmptyDescripcion}")
	private List<TipoInmueble> descripcion;

	@Valid
	@NotEmpty(message="{ConfiguracionBean.torresSN.InvalidEmptyTorresSN}")
	private List<TipoInmueble> torresSN;

	@NotNull(message="{ConfiguracionBean.torres.InvalidNotNullTorres}")
	//@Size(min=1, message="{ConfiguracionBean.torres.InvalidSizeTorres}")
	//@Pattern(regexp="[0-9]+", message="{ConfiguracionBean.torres.InvalidPatternTorres}")
	private int torres;

	@NotNull(message="{ConfiguracionBean.pisos.InvalidNotNullPisos}")
	//@Size(min=1, message="{ConfiguracionBean.pisos.InvalidSizePisos}")
	//@Pattern(regexp="[0-9]+", message="{ConfiguracionBean.pisos.InvalidPatternPisos}")
	private int  pisos;

	@NotNull(message="{ConfiguracionBean.unidadPorPiso.InvalidNotNullUnidadPorPiso}")
	//@Size(min=1, message="ConfiguracionBean.unidadPorPiso.InvalidSizeUnidadPorPiso")
	//@Pattern(regexp="[0-9]+", message="{ConfiguracionBean.unidadPorPiso.InvalidPatternUnidadesPorPiso}")
	private int unidadPorPiso;

	@NotNull(message="{ConfiguracionBean.total.InvalidNotNullTotal}")
	//@Size(min=1, max=261, message= "{ConfiguracionBean.total.InvalidSizeTotal}")
	//@Pattern(regexp="[0-9]+", message="{ConfiguracionBean.total.InvalidPatternTotal}")
	private int total;


	//Getters and Setters

	public List<TipoInmueble> getCodigoInmueble() {
		return codigoInmueble;
	}

	public void setCodigoInmueble(List<TipoInmueble> codigoInmueble) {
		this.codigoInmueble = codigoInmueble;
	}

	public List<TipoInmueble> getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(List<TipoInmueble> descripcion) {
		this.descripcion = descripcion;
	}

	public List<TipoInmueble> getTorresSN() {
		return torresSN;
	}

	public void setTorresSN(List<TipoInmueble> torresSN) {
		this.torresSN = torresSN;
	}

	public int getTorres() {
		return torres;
	}

	public void setTorres(int torres) {
		this.torres = torres;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public int getUnidadPorPiso() {
		return unidadPorPiso;
	}

	public void setUnidadPorPiso(int unidadPorPiso) {
		this.unidadPorPiso = unidadPorPiso;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
        
}
