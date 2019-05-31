package com.bsw.inmobiliario.panel.Cotizaciones;
import java.io.Serializable;
import java.sql.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CotizacionBean implements Serializable {

	@NotNull(message = "{CotizacionBean.nombre.InvalidNotNullNombre}")
	@Size(min = 1, max = 100, message = "{CotizacionBean.nombre.InvalidSizeNombre}")
	private String nombre;

	@NotNull(message = "{CotizacionBean.fechaEntrega.InvalidNotNullFechaDeEntrega}")
	//@Pattern(regexp = "^([012][1-9]|3[01])(\\/)(0[1-9]|1[012])\\2(\\d{4})$", message="{CotizacionBean.fechaEntrega.InvalidPatternFechaDeEntrega}")
	private Date fechaEntrega;

	// Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

}
