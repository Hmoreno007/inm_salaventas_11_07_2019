package com.bsw.inmobiliario.panel.Unidades;

import com.bsw.inmobiliario.panel.Moneda.Moneda;
import com.bsw.inmobiliario.panel.TipoUnidad.TipoUnidad;
import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UnidadesBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message="{UnidadesBean.cantidadUnidades.InvalidNotNullCantidadUnidades}")
	//@Size(min=1, max=20, message="{UnidadesBean.cantidadUnidades.InvalidSizeCantidadUnidades}")
	//@Pattern(regexp="[0-9]+", message="{UnidadesBean.cantidadUnidades.InvalidPatternCantidadUnidades}")
	private int cantidadUnidades; 

	@Valid
	@NotEmpty(message= "{UnidadesBean.monedas.InvalidEmptyMonedas}")
	private List<Moneda> monedas;

	@Valid
	@NotEmpty(message= "{UnidadesBean.tipos.InvalidEmptyTipo}")
	private List<TipoUnidad> tipos;

	public int getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(int cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}

	public List<Moneda> getMonedas() {
		return monedas;
	}

	public void setMonedas(List<Moneda> monedas) {
		this.monedas = monedas;
	}

	public List<TipoUnidad> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoUnidad> tipos) {
		this.tipos = tipos;
	}

}
