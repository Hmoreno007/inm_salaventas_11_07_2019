package com.bsw.inmobiliario.panel.PlanDePagos;
import com.bsw.inmobiliario.panel.Unidades.Unidades;
import java.io.Serializable;
import java.util.Date; 
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PlanDePagosBean implements Serializable {
 
	@NotNull(message="{PlanDePagosBean.numeroUnidad.InvalidSizeNumeroUnidad}")
	//@Size(min=1, max=38, message="{PlanDePagosBean.numeroUnidad.InvalidSizeNumeroUnidad}")
	//@Pattern(regexp="[0-9]+", message="{PlanDePagosBean.numeroUnidad.InvalidPatternNumeroUnidad}")
	private String numeroUnidad;

	@NotNull(message="{PlanDePagosBean.estadoUnidad.InvalidNotNullEstadoUnidad}")
	@Size(min=1, max=38, message="{PlanDePagosBean.estadoUnidad.InvalidSizeEstadoUnidad}")
	private String estadoUnidad;

	@NotNull(message="{PlanDePagosBean.tarjeta.InvalidNotNullTarjeta}")
	@Size(min=1, max=38, message="{PlanDePagosBean.tarjeta.InvalidSizeTarjeta}")
	private String  tarjeta;
	
	@NotNull(message="{PlanDePagosBean.principal.InvalidNotNullPrincipal}")
	private List<Unidades> principal;

	//@Size(min=1, max=100, message="{PlanDePagosBean.porcentajeSeparacion.InvalidSizePorcentajeSep}")
	//@Pattern(regexp="/^\\d{1,2}(\\.\\d{1,3})?$/", message="{PlanDePagosBean.porcentajeSeparacion.InvalidPatternPorcentajeSep}")
	private int porcentajeSeparacion;

	@NotNull(message="{PlanDePagosBean.fechaSeparacion.InvalidNotNullFechaSeparacion}")
	//@Pattern(regexp="^([012][1-9]|3[01])(\\/)(0[1-9]|1[012])\\2(\\d{4})$", message="{PlanDePagosBean.fechaSeparacion.InvalidPatternFechaSep}")
	private Date fechaSeparacion;

	//@Size(min=1, max=20, message="{PlanDePagosBean.valorCuotaInicial.InvalidSizeValorCuotaIn}")
	//@Pattern(regexp="^[0-9]+(,[0-9]+)?$", message="{PlanDePagosBean.valorCuotaInicial.InvalidPatternValorCuotaIn}")
	private int valorCuotaInicial;

	//@Size(min=1, max=20,message="{PlanDePagosBean.numeroDeCuotas.InvalidSizeNueroCuotas}")
	//@Pattern(regexp="[0-9]+", message="{PlanDePagosBean.numeroDeCuotas.InvalidPatternNumeroCuotas}")
	private int numeroDeCuotas;

	//@NotNull(message="{PlanDePagosBean.fechaPrimerCuota.InvalidNotNullFechaPrimerCu}")
	//@Pattern(regexp="^([012][1-9]|3[01])(\\/)(0[1-9]|1[012])\\2(\\d{4})$", message="{PlanDePagosBean.fechaPrimerCuota.InavalidPatternFechaPrimerCu}")
	private Date fechaPrimerCuota;

	//@Size(min=1, max=20, message="{PlanDePagosBean.valorCredito.InvalidSizeValorCred}")
	//@Pattern(regexp="^[0-9]+(,[0-9]+)?$", message="{PlanDePagosBean.valorCredito.InvalidPatternValorCred}"
	private int valorCredito;

	//@NotNull(message="{PlanDePagosBean.fechaCredito.InvalidNotNullFechaCred}")
	//@Pattern(regexp="^([012][1-9]|3[01])(\\/)(0[1-9]|1[012])\\2(\\d{4})$", message="{PlanDePagosBean.fechaCredito.InvalidPatternFechaCred}")
	private Date fechaCredito;

	//@Size(min=1, max=20, message="{PlanDePagosBean.totalInmueble.InvalidSizeTotalInm}")
	//@Pattern(regexp="^[0-9]+(,[0-9]+)?$", message="{PlanDePagosBean.totalInmueble.InvalidPatternTotalInm}")
	private int totalInmueble;

	@Size(min=1, max=1, message="{PlanDePagosBean.calculoAutoMan.InvalidSizeCalculoAutoMan}")
	private String calculoAutoMan;

	//Getters and Setters

	public String getNumeroUnidad() {
		return numeroUnidad;
	}

	public void setNumeroUnidad(String numeroUnidad) {
		this.numeroUnidad = numeroUnidad;
	}

	public String getEstadoUnidad() {
		return estadoUnidad;
	}

	public void setEstadoUnidad(String estadoUnidad) {
		this.estadoUnidad = estadoUnidad;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<Unidades> getPrincipal() {
		return principal;
	}

	public void setPrincipal(List<Unidades> principal) {
		this.principal = principal;
	}

	public int getPorcentajeSeparacion() {
		return porcentajeSeparacion;
	}

	public void setPorcentajeSeparacion(int porcentajeSeparacion) {
		this.porcentajeSeparacion = porcentajeSeparacion;
	}

	public Date getFechaSeparacion() {
		return fechaSeparacion;
	}

	public void setFechaSeparacion(Date fechaSeparacion) {
		this.fechaSeparacion = fechaSeparacion;
	}

	public int getValorCuotaInicial() {
		return valorCuotaInicial;
	}

	public void setValorCuotaInicial(int valorCuotaInicial) {
		this.valorCuotaInicial = valorCuotaInicial;
	}

	public int getNumeroDeCuotas() {
		return numeroDeCuotas;
	}

	public void setNumeroDeCuotas(int numeroDeCuotas) {
		this.numeroDeCuotas = numeroDeCuotas;
	}

	public Date getFechaPrimerCuota() {
		return fechaPrimerCuota;
	}

	public void setFechaPrimerCuota(Date fechaPrimerCuota) {
		this.fechaPrimerCuota = fechaPrimerCuota;
	}

	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public Date getFechaCredito() {
		return fechaCredito;
	}

	public void setFechaCredito(Date fechaCredito) {
		this.fechaCredito = fechaCredito;
	}

	public int getTotalInmueble() {
		return totalInmueble;
	}

	public void setTotalInmueble(int totalInmueble) {
		this.totalInmueble = totalInmueble;
	}

	public String getCalculoAutoMan() {
		return calculoAutoMan;
	}

	public void setCalculoAutoMan(String calculoAutoMan) {
		this.calculoAutoMan = calculoAutoMan;
	}

}
