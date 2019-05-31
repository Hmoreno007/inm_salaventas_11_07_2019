package com.bsw.inmobiliario.panel.Separaciones;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date; 
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class SeparacionesBean implements Serializable{

	@NotNull(message="{SeparacionesBean.codigoUnidad.InvalidNotNullCodigoUnidad}")
	@Size(min=1, max=38, message="{SeparacionesBean.codigoUnidad.InvalidSizeCodigoUnidad}")
	private String codigoUnidad;

	@NotNull(message="{SeparacionesBean.numeroUnidad.InvalidNotNullNumeroUnidad}")
	//@Size(min=1, max=38, message="{SeparacionesBean.numeroUnidad.InvalidSizeNumeroUnidad}")
	private int numeroUnidad;

	@NotNull(message= "{SeparacionesBean.fechaEntrega.InvalidNotNullFechaEntrega}")
	@Future(message= "{SeparacionesBean.fechaEntrega.InvalidFutureFechaEntrega}")
	//@Pattern(regexp="^([012][1-9]|3[01])(\\/)(0[1-9]|1[012])\\2(\\d{4})$", message="{SeparacionesBean.fechaEntrega.InvalidPatternFechaEntrega}")
	private Date fechaEntrega;

	@Valid
	@NotEmpty (message= "{SeparacionesBean.tarjeta.InvalidEmptyTarjeta}")
	private List<Tarjetas> tarjeta;

	@Valid
	@NotEmpty (message= "{SeparacionesBean.teceros.InvalidEmptyTerceros}")
	private List<Terceros> teceros;

	//@Size(min=1, max=38, message= "{SeparacionesBean.valorUnidad.InvalidSizeValorUnidad}")
	//@Pattern(regexp="^[0-9]+(,[0-9]+)?$", message="{SeparacionesBean.valorUnidad.InvalidPatternValorUnidad}")
	private BigDecimal valorUnidad;

	//@Size(min=1, message="{SeparacionesBean.valorOriginal.InvalidSizeValorOriginal}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{SeparacionesBean.valorOriginal.InvalidPatternValorOriginal}")
	private BigDecimal valorOriginal;

	//@Size(min=1, message="{SeparacionesBean.valorOriginal.InvalidPatternValorOriginal}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{SeparacionesBean.cuotaInicial.InvalidPatternCuotaInicial}")
	private BigDecimal cuotaInicial;

	//@Size(min=1, max=100, message="{SeparacionesBean.porcentajeSeparacion.InvalidSizePorcentajeSeparacion}")
	//@Pattern(regexp="/^\\d{1,2}(\\.\\d{1,3})?$/", message="{SeparacionesBean.porcentajeSeparacion.InvalidPatternPorcetajeSeparacion}")
	private BigDecimal porcentajeSeparacion;

	//@Size(min=1, message="{SeparacionesBean.totalUnidad.InvalidSizeTotalUnidad}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{SeparacionesBean.totalUnidad.InvalidPatternTotalUnidad}")
	private BigDecimal totalUnidad;

	//@Size(min=1, max=20, message="{SeparacionesBean.credito.InvalidSizeCredito}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{SeparacionesBean.credito.InvalidPatternCredito}")
	private BigDecimal credito;

	//@Size(min=1, max=1, message="{SeparacionesBean.confirmarSeparacion.InvalidPatternConfirmarSeparcion}")
	private boolean confirmarSeparacion;

	//Getters and Setters

	public String getCodigoUnidad() {
		return codigoUnidad;
	}

	public void setCodigoUnidad(String codigoUnidad) {
		this.codigoUnidad = codigoUnidad;
	}

	public int getNumeroUnidad() {
		return numeroUnidad;
	}

	public void setNumeroUnidad(int numeroUnidad) {
		this.numeroUnidad = numeroUnidad;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public List<Tarjetas> getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(List<Tarjetas> tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<Terceros> getTeceros() {
		return teceros;
	}

	public void setTeceros(List<Terceros> teceros) {
		this.teceros = teceros;
	}

	public BigDecimal getValorUnidad() {
		return valorUnidad;
	}

	public void setValorUnidad(BigDecimal valorUnidad) {
		this.valorUnidad = valorUnidad;
	}

	public BigDecimal getValorOriginal() {
		return valorOriginal;
	}

	public void setValorOriginal(BigDecimal valorOriginal) {
		this.valorOriginal = valorOriginal;
	}

	public BigDecimal getCuotaInicial() {
		return cuotaInicial;
	}

	public void setCuotaInicial(BigDecimal cuotaInicial) {
		this.cuotaInicial = cuotaInicial;
	}

	public BigDecimal getPorcentajeSeparacion() {
		return porcentajeSeparacion;
	}

	public void setPorcentajeSeparacion(BigDecimal porcentajeSeparacion) {
		this.porcentajeSeparacion = porcentajeSeparacion;
	}

	public BigDecimal getTotalUnidad() {
		return totalUnidad;
	}

	public void setTotalUnidad(BigDecimal totalUnidad) {
		this.totalUnidad = totalUnidad;
	}

	public BigDecimal getCredito() {
		return credito;
	}

	public void setCredito(BigDecimal credito) {
		this.credito = credito;
	}

	public boolean isConfirmarSeparacion() {
		return confirmarSeparacion;
	}

	public void setConfirmarSeparacion(boolean confirmarSeparacion) {
		this.confirmarSeparacion = confirmarSeparacion;
	}


}
