package com.bsw.inmobiliario.panel.EstadosInmuebles;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EstadosInmueblesBean  implements Serializable{

    //@NotNull(message="{EstadosInmobiliariaBean.codigo.InvalidNotNullCodigo}")
    @Size(min=1, max=1, message="{EstadosInmobiliariaBean.codigo.InvalidSizeCodigo}")
	private String codigo;

    //@NotNull(message="{EstadosInmobiliariaBean.descripcion.InvalidNotNullDescripcion}")
    @Size(min=1, max=50, message="{EstadosInmobiliariaBean.descripcion.InvalidSizeDescripcion}")
	private String  descripcion;

    //@NotNull(message="{EstadosInmobiliariaBean.observacion.InvalidNotNullObservacion}")
    @Size(min=1, max=200, message="{EstadosInmobiliariaBean.observacion.InvalidSizeObservacion}")
	private String observacion;

    //@NotNull(message="{EstadosInmobiliariaBean.color.InvalidNotNullColor}")
    @Size(min=1, max=10, message="{EstadosInmobiliariaBean.color.InvalidSizeColor}")
	private String color;


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
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
