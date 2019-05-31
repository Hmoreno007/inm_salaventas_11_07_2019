package com.bsw.inmobiliario.panel.DetalleUnidades;
import com.bsw.inmobiliario.panel.TipoInmuebles.TipoInmueble;
import com.bsw.inmobiliario.panel.Unidades.Unidades;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DetalleUnidadesBean implements Serializable{

	@NotNull(message="{DetalleUnidadesBean.numeroUnidad.InvalidNotNullNumeroUnidad}")
	//@Size(min=1, max=38, message="{DetalleUnidadesBean.numeroUnidad.InvalidSizeNumeroUnidad}")
	private int numeroUnidad; 

	@NotNull(message="{DetalleUnidadesBean.estado.InvalidNotNullEstado}")
	@Size(min=1, max=1,message="{DetalleUnidadesBean.estado.InvalidSizeEstado}")
	private String estado;

	//@Pattern(regexp="^([012][1-9]|3[01])(\\/)(0[1-9]|1[012])\\2(\\d{4})$", message="{DetalleUnidadesBean.fechaEntrega.InvalidPatternFechaEntrega}")
	private Date fechaEntrega;

	@NotNull(message="{DetalleUnidadesBean.numero.InvalidNotNullNumero}")
	@Size(min=1, max=38, message="{DetalleUnidadesBean.numero.InvalidSizeNumero}")
	private String numero;

	@Valid
	private List<Tarjetas> tarjeta;

	//@Pattern(regexp="^([012][1-9]|3[01])(\\/)(0[1-9]|1[012])\\2(\\d{4})$", message="{DetalleUnidadesBean.fechaSeparacion.InvalidPatternFechaSeparacion}")
	private Date fechaSeparacion;

	@Valid
	private List<TipoInmueble> codigoInmueble;

	//@Size(min=1, max=20, message="{DetalleUnidadesBean.areaPrivada.InvalidSizeAreaPrivada}")
	//@Pattern(regexp="[0-9]+", message="{DetalleUnidadesBean.areaPrivada.InvalidPatternAreaPrivada}")
	private int areaPrivada;

	@Valid
	private List<TipoInmueble> detalleInmueble;

	//@Size(min=1, max=20, message="{DetalleUnidadesBean.areaConstruida.InvalidSizeAreaConstruida}")
	//@Pattern(regexp="[0-9]+", message="{DetalleUnidadesBean.areaConstruida.InvalidPatternAreaConstruida}")
	private int areaConstruida;

	@NotNull(message="{DetalleUnidadesBean.torres.InvalidNotNullTorres}")
	//@Size(min=1, message="{DetalleUnidadesBean.torres.InvalidSizeTorres}")
	//@Pattern(regexp="[0-9]+", message="{DetalleUnidadesBean.torres.InvalidPartternTorres}")
	private int torres;

	/////private Torres torres;

	@NotNull(message="{DetalleUnidadesBean.pisos.InvalidNotNullPisos}")
	//@Size(min=1, message="{DetalleUnidadesBean.pisos.InvalidSizePisos}")
	//@Pattern(regexp="[0-9]+", message="{DetalleUnidadesBean.pisos.InvalidPatternPisos}")
	private int  pisos;

	//@Size(min=1, max=10, message="{DetalleUnidadesBean.interior.InvalidSizeInterior}")
	//@Pattern(regexp="[0-9]+", message="{DetalleUnidadesBean.interior.InvalidPatternInterior}")
	private int interior;

	//@Size(min=1, max=20, message="{DetalleUnidadesBean.manzana.InvalidSizeManzana}")
	//@Pattern(regexp="[0-9]+", message="{DetalleUnidadesBean.manzana.InvalidPatternManzana}")
	private int manzana;

	//@Size(min=1, max=38, message="{DetalleUnidadesBean.alcoba.InvalidSizeAlcoba}")
	//@Pattern(regexp="[0-9]+", message="{DetalleUnidadesBean.alcoba.InvalidPatternAlcoba}")
	private int alcoba;

	//@Size(min=1, max=38, message="{DetalleUnidadesBean.bano.InvalidSizeBano}")
	//@Pattern(regexp="[0-9]+", message="{DetalleUnidadesBean.bano.InvalidPatternBano}")
	private int bano;


	private List<Unidades> cuartosUtiles;

	private List<Unidades> parqueos;

	@Size(min=1, max=500, message="{DetalleUnidadesBean.cocina.InvalidSizeCocina}")
	@Pattern(regexp="[a-zA-Z0-9-]", message="{DetalleUnidadesBean.cocina.InvalidPatternCocina}")
	private String cocina;

	@Size(min=1, max=500, message="{DetalleUnidadesBean.observacion.InvalidSizeObservacion}")
	@Pattern(regexp="[a-zA-Z0-9-]+",message="{DetalleUnidadesBean.observacion.InvalidPatternObservacion}")
	private String observacion;

	@Size(min=1, message="{DetalleUnidadesBean.precioInmueble.InvalidSizePrecioInmueble}")
	@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{DetalleUnidadesBean.precioInmueble.InvalidPatternPrecioInmueble}")
	private String precioInmueble;

	//@Size(min=1, message="{DetalleUnidadesBean.precioSeparacion.InvalidSizePrecioSeparacion}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{DetalleUnidadesBean.precioSeparacion.InvlidPatternPrecioSeparacion}")
	private BigDecimal precioSeparacion;

	//@Size(min=1, message="{DetalleUnidadesBean.precioUnidad.InvalidSizePrecioUnidad}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{DetalleUnidadesBean.precioUnidad.InvalidPatternPrecioUnidad}")
	private BigDecimal precioUnidad;

	//@Size(min=1, message="{DetalleUnidadesBean.cuotaInicial.InvalidSizeCuotaInicial}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{DetalleUnidadesBean.cuotaInicial.InvalidPatternCuotaInicial}")
	private BigDecimal cuotaInicial;

	//@Size(min=1, message="{DetalleUnidadesBean.precioIncrementoUtil.InvalidSizePrecioIncrementoUtil}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{DetalleUnidadesBean.precioIncrementoUtil.InvalidPatternPrecioIncrementoUtil}")
	private BigDecimal precioIncrementoUtil;

	//@Size(min=1, message="{DetalleUnidadesBean.credito.InvalidSizeCredito}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{DetalleUnidadesBean.credito.InvalidPatternCredito}")
	private BigDecimal credito;

	//@Size(min=1, message="{DetalleUnidadesBean.precioIncrementoPiso.InvalidSizePrecioIncrementoPiso}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{DetalleUnidadesBean.precioIncrementoPiso.InvalidPatternPrecioIncrementoPiso}")
	private BigDecimal precioIncrementoPiso;

	//@Size(min=1, message="{DetalleUnidadesBean.total.InvalidSizeTotal}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{DetalleUnidadesBean.total.InvalidPatternTotal}")
	private BigDecimal total;

	//@Size(min=1, message="{DetalleUnidadesBean.precioIncrementoPaqueadero.InvalidSizePrecioIncrementoPaqueadero}")
	//@Pattern(regexp="^(0|[1-9]\\d*)(\\.\\d+)?$", message="{DetalleUnidadesBean.precioIncrementoPaqueadero.InvalidPatternPrecioIncrementoPaqueadero}")
	private BigDecimal precioIncrementoPaqueadero;

}
