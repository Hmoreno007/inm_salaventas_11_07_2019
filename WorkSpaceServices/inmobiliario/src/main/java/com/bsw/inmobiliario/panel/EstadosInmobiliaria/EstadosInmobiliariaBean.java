package com.bsw.inmobiliario.panel.EstadosInmobiliaria;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

public class EstadosInmobiliariaBean  implements Serializable{

	@NotNull(message="{EstadosInmobiliariaBean.codigo.InvalidNotNullCodigo}")
    //@Size(min=1, max=1, message="{EstadosInmobiliariaBean.codigo.InvalidSizeCodigo}")
	private char codigo;

    @NotNull(message="{EstadosInmobiliariaBean.descripcion.InvalidNotNullDescripcion}")
    @Size(min=1, max=50, message="{EstadosInmobiliariaBean.descripcion.InvalidSizeDescripcion}")
	private String  descripcion;

    @NotNull(message="{EstadosInmobiliariaBean.observacion.InvalidNotNullObservacion}")
    @Size(min=1, max=200, message="{EstadosInmobiliariaBean.observacion.InvalidSizeObservacion}")
	private String observacion;

    @NotNull(message="{EstadosInmobiliariaBean.color.InvalidNotNullColor}")
    @Size(min=1, max=10, message="{EstadosInmobiliariaBean.color.InvalidSizeColor}")
	private String color;


    public char getCodigo() {
		return codigo;
	}
	public void setCodigo(char codigo) {
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
		observacion = observacion;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
