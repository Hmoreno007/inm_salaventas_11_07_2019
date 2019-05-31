package com.bsw.inmobiliario.panel.TipoUnidad;
import com.bsw.inmobiliario.panel.TipoInmuebles.TipoInmueble;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class TipoUnidadBean implements Serializable{

	@Valid
	private List<TipoInmueble> codigoInmueble;

	@Valid
	private List<TipoInmueble> descripcionInmueble;

	@NotNull(message="{TipoUnidadesBean.codigoDetalle.InvalidNotNullCodigoDetalle}")
	//@Size(min=1, max=38, message="{TipoUnidadesBean.codigoDetalle.InvalidSizeCodigoDetalle}")
	private int codigoDetalle;

	@NotNull(message="{TipoUnidadesBean.nombreUnico.InvalidNotNullNombreUnico}")
	@Size(min = 1, max = 100, message = "{TipoUnidadesBean.nombreUnico.InvalidSizeNombreUnico}")
	@Pattern(regexp="[A-Za-z]+", message="{TipoUnidadesBean.nombreUnico.InvalidPatternNombreUnico}")
	private String nombreUnico;

	//@Size(min=1, message="{TipoUnidadesBean.valor.InvalidSizeValor}")
	//@Pattern(regexp="[0-9,.]+", message="{TipoUnidadesBean.valor.InvalidPetternValor}")
	private BigDecimal valor;

	private Boolean	martInmobiliaria;

	//@Size(min=1, message="{TipoUnidadesBean.areaConstruida.InvalidSizeAreaConstruida}")
	//@Pattern(regexp="[0-9,.]+", message="{TipoUnidadesBean.areaConstruida.InvalidPatternAreaConstruida}")
	private BigDecimal areaConstruida;

	//@Size(min=1, message="{TipoUnidadesBean.areaPrivada.InvalidSizeAreaPrivada}")
	//@Pattern(regexp="[0-9,.]+", message="{TipoUnidadesBean.areaPrivada.InvalidPatternAreaPrivada}")
	private BigDecimal areaPrivada;

	//@Size(min=1, message="{TipoUnidadesBean.valorIncrPiso.InvalidSizeValorIncrPiso}")
	//@Pattern(regexp="[0-9,.]+", message="{TipoUnidadesBean.valorIncrPiso.InvalidPatternValorIncrPiso}")
	private BigDecimal valorIncrPiso;

	//@Size(min=1, max=3, message="{TipoUnidadesBean.porcentajeCuotaInicial.InvalidSizePorcentajeCuotaInicial}")
	//@Pattern(regexp="[0-9]+", message="{TipoUnidadesBean.porcentajeCuotaInicial.InvalidPatternPorcentajeCuotaInicial}")
	private int porcentajeCuotaInicial;

	//@Size(min=1, max=3, message="{TipoUnidadesBean.porcentajeSeparacion.InvalidSizePorcentajeSeparacaion}")
	//@Pattern(regexp="[0-9]+", message="{TipoUnidadesBean.porcentajeSeparacion.InvalidPatternPorcentajeSeparacion}")
	private int porcentajeSeparacion;

	//@Size(min=1, message="{TipoUnidadesBean.ingresosFamilia.InvalidSizeIngresosFamilia}")
	//@Pattern(regexp="[0-9,.]+", message="{TipoUnidadesBean.ingresosFamilia.InvalidPatternIngresosFamilia}")
	private BigDecimal ingresosFamilia;

	//@Size(min=1, message="{TipoUnidadesBean.gastosEscr.InvalidSizeGastosEscr}")
	//@Pattern(regexp="[0-9,.]+", message="{TipoUnidadesBean.gastosEscr.InvalidPatternGastosEscr}")
	private BigDecimal gastosEscr;

	private Boolean parqueaderoLineal;

	private Boolean parqueaderoCubierto;
}
