
package com.bsw.inmobiliario.panel.AbonosInmueble;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AbonosInmuebleBean implements Serializable{
	
	@NotNull(message="{AbonosInmuebleBean.descripcion.InvalidNotNullDescripcion}")
	@Size(min=1, max=50, message="{AbonosInmuebleBean.descripcion.InvalidSizeDescripcion}")
	private String  descripcion;
	
	@NotNull(message="{AbonosInmuebleBean.multiple.InvalidNotNullMultiple}")
        @Size(min=1, max=50, message="{AbonosInmuebleBean.multiple.InvalidSizeMultiple}")
	private String multiple;
	

	@NotNull(message="{AbonosInmuebleBean.modificable.InvalidNotNullModificable}")
        @Size(min=1, max=1, message="{AbonosInmuebleBean.modificable.InvalidSizeModificable}")
	private String modificable;
	
	
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getMultiple() {
		return multiple;
	}


	public void setMultiple(String multiple) {
		this.multiple = multiple;
	}


	public String getModificable() {
		return modificable;
	}


	public void setModificable(String modificable) {
		this.modificable = modificable;
	}
}